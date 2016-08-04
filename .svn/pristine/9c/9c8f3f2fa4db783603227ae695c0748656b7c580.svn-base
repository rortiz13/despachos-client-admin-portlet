package la.netco.despachos_judiciales.business.bean;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;
import com.liferay.util.format.USAPhoneNumberFormat;

import la.netco.despachos_judiciales.business.datamodels.ConsejosSeccioanlesDataModel;
import la.netco.despachos_judiciales.business.datamodels.RelacionUsuarioConsejoDataModel;
import la.netco.despachos_judiciales.business.datamodels.UsuariosDataModel;
import la.netco.despachos_judiciales.entities.NoSuchEspecialidadException;
import la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalService;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.RelacionUsuarioConsejoLocalServiceUtil;

import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

@ManagedBean(name = "adminRelacionUsuario")
@ViewScoped
public class AdminRelacionUsuario {

	private static Log _log = LogFactoryUtil.getLog(AdminFuncionarioBean.class);

	private RelacionUsuarioConsejo relacionUsuarioConsejo;
	private ConsejoSeccional consejoSecSelected;
	private RelacionUsuarioConsejoDataModel dataModel;
	private ConsejosSeccioanlesDataModel consejos;
	private UsuariosDataModel usuarios;
	private User usuarioSelected;
	private Integer codigoConsejoSec;
	private String userLogin;
	private String userLoginSelected;
	private Integer idRelacionSelected;

	public AdminRelacionUsuario() {

	}

	public void preRenderViewAdd() {
		if (relacionUsuarioConsejo == null)
			relacionUsuarioConsejo = RelacionUsuarioConsejoLocalServiceUtil.createRelacionUsuarioConsejo(0);
		loadConsejos();
		loadUsuarios();
	}

	public void loadObject() {
		try {
			if (idRelacionSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				_log.error("--> Registro Seleccionado Texto" + idRegSeleccionado);
				if (idRegSeleccionado != null)
					this.idRelacionSelected = Integer.parseInt(idRegSeleccionado);
				if ((relacionUsuarioConsejo == null || relacionUsuarioConsejo.getIdConsejoSec() == 0) && (idRelacionSelected != null)) {
					relacionUsuarioConsejo = RelacionUsuarioConsejoLocalServiceUtil.getRelacionUsuarioConsejo(idRelacionSelected);
					consejoSecSelected = ConsejoSeccionalLocalServiceUtil.getConsejoSeccional(relacionUsuarioConsejo.getIdConsejoSec());
					userLoginSelected = relacionUsuarioConsejo.getUsuarioPortal();
				}
			}
			loadConsejos();
			loadUsuarios();
		} catch (Exception e) {
			_log.error("Error loadObject ", e);
			e.printStackTrace();
		}
	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
	}

	public String loadConsejos() {
		_log.debug("Entro loadConsejos");
		if (consejos == null)
			consejos = new ConsejosSeccioanlesDataModel();

		Map<String, Object> filtros = new HashMap<String, Object>();

		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, codigoConsejoSec);
		filtros.put(ConstantsUtility.FIELD_CON_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_CON_DIRECCION, null);
		filtros.put(ConstantsUtility.FIELD_CON_TELEFONOS, null);
		filtros.put(ConstantsUtility.FIELD_CON_CORREO_ELECTRONICO, null);

		consejos.setFiltros(filtros);

		return "";
	}

	public String loadUsuarios() {
		if (usuarios == null)
			usuarios = new UsuariosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_USER_LOGIN, userLogin);
		usuarios.setFiltros(filtros);
		return "";
	}

	public String addObject() {
		_log.info("Entro AddObject");
		try {
			if ((relacionUsuarioConsejo.getIdConsejoSec() != 0) && (relacionUsuarioConsejo.getUsuarioPortal() != null)
					&& (!relacionUsuarioConsejo.getUsuarioPortal().equals(""))) {
				RelacionUsuarioConsejo relTemp = null;
				try {
					relTemp = RelacionUsuarioConsejoLocalServiceUtil.getRelacionUsuarioConsejo(relacionUsuarioConsejo.getIdConsejoSec());
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
					return "";
				} catch (NoSuchRelacionUsuarioConsejoException e) {
					_log.error("No exixte RelUsuarioConsejo: " + relacionUsuarioConsejo.getIdConsejoSec());
				}
				if (relTemp == null) {
					relTemp = RelacionUsuarioConsejoLocalServiceUtil.addRelacionUsuarioConsejo(relacionUsuarioConsejo);
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
				}
			}
			return "relUsuario";
		} catch (PortalException e) {
			_log.error("Error addObject", e);
			return "";
		} catch (SystemException e) {
			_log.error("Error addObject", e);
			return "";
		}

	}

	public String updateObject() {
		System.out.println(">>> Entro updateObject");
		try {
			RelacionUsuarioConsejoLocalServiceUtil.updateRelacionUsuarioConsejo(relacionUsuarioConsejo);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "relUsuario";
		} catch (Exception e) {
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public void deleteObject() {
		try {
			if (relacionUsuarioConsejo != null) {
				RelacionUsuarioConsejoLocalServiceUtil.deleteRelacionUsuarioConsejo(relacionUsuarioConsejo);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
			}

		} catch (Exception e) {
			_log.error("Error deleteObject", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public void addConsejoSec(ConsejoSeccional consejoSeccional) {
		consejoSecSelected = consejoSeccional;
		relacionUsuarioConsejo.setIdConsejoSec(consejoSecSelected.getCodigo());
	}

	public void addUsuario(User usuarioPortal) {
		try {
			userLoginSelected = usuarioPortal.getLogin().split("@")[0];
			relacionUsuarioConsejo.setUsuarioPortal(userLoginSelected);
		} catch (PortalException e) {
			_log.error("Error addUsuario", e);
		} catch (SystemException e) {
			_log.error("Error addUsuario", e);
		}
	}
	
	public void selectObject(RelacionUsuarioConsejo relUsuario) {
		relacionUsuarioConsejo = relUsuario;
	}

	public void cargaFiltrosDataModel() {
		if (dataModel == null)
			dataModel = new RelacionUsuarioConsejoDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_RELSUARIO_CODIGO, idRelacionSelected);
		dataModel.setFiltros(filtros);
	}

	public RelacionUsuarioConsejo getRelacionUsuarioConsejo() {
		return relacionUsuarioConsejo;
	}

	public void setRelacionUsuarioConsejo(RelacionUsuarioConsejo relacionUsuarioConsejo) {
		this.relacionUsuarioConsejo = relacionUsuarioConsejo;
	}

	public RelacionUsuarioConsejoDataModel getDataModel() {
		return dataModel;
	}

	public void setDataModel(RelacionUsuarioConsejoDataModel dataModel) {
		this.dataModel = dataModel;
	}

	public ConsejosSeccioanlesDataModel getConsejos() {
		return consejos;
	}

	public void setConsejos(ConsejosSeccioanlesDataModel consejos) {
		this.consejos = consejos;
	}

	public UsuariosDataModel getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(UsuariosDataModel usuarios) {
		this.usuarios = usuarios;
	}

	public User getUsuarioSelected() {
		return usuarioSelected;
	}

	public void setUsuarioSelected(User usuarioSelected) {
		this.usuarioSelected = usuarioSelected;
	}

	public Integer getCodigoConsejoSec() {
		return codigoConsejoSec;
	}

	public void setCodigoConsejoSec(Integer codigoConsejoSec) {
		this.codigoConsejoSec = codigoConsejoSec;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public ConsejoSeccional getConsejoSecSelected() {
		return consejoSecSelected;
	}

	public void setConsejoSecSelected(ConsejoSeccional consejoSecSelected) {
		this.consejoSecSelected = consejoSecSelected;
	}

	public String getUserLoginSelected() {
		return userLoginSelected;
	}

	public void setUserLoginSelected(String userLoginSelected) {
		this.userLoginSelected = userLoginSelected;
	}

	public Integer getIdRelacionSelected() {
		return idRelacionSelected;
	}

	public void setIdRelacionSelected(Integer idRelacionSelected) {
		this.idRelacionSelected = idRelacionSelected;
	}

}
