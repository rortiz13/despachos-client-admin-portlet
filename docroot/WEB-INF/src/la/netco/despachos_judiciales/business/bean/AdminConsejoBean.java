package la.netco.despachos_judiciales.business.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import la.netco.despachos_judiciales.business.datamodels.ConsejosSeccioanlesDataModel;
import la.netco.despachos_judiciales.business.datamodels.EspecialidadDataModel;
import la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException;
import la.netco.despachos_judiciales.entities.NoSuchEspecialidadException;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminConsejoBean")
@ViewScoped
public class AdminConsejoBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(AdminConsejoBean.class);

	private ConsejosSeccioanlesDataModel consejos;
	private ConsejoSeccional consejoSelected;
	private Integer codigo;
	private Integer idConsejoSelected;

	public AdminConsejoBean() {

	}

	public void preRenderViewAdd() {
		if (consejoSelected == null)
			consejoSelected = ConsejoSeccionalLocalServiceUtil.createConsejoSeccional(0);
	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
	}

	public void loadObject() {
		try {
			if (idConsejoSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.idConsejoSelected = Integer.parseInt(idRegSeleccionado);

				if ((consejoSelected == null || consejoSelected.getCodigo() == 0) && (idConsejoSelected != null)) {
					consejoSelected = ConsejoSeccionalLocalServiceUtil.getConsejoSeccional(idConsejoSelected);
				}
			}
		} catch (Exception e) {
			_log.error("Error al recuperar Distrito", e);
		}

	}

	public String updateObject() {
		try {
			ConsejoSeccionalLocalServiceUtil.updateConsejoSeccional(consejoSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "consejos";
		} catch (Exception e) {
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public String addObject() {
		System.out.println(">>> Entro addObject");
		try {
			ConsejoSeccional tempConsejoSeccional = null;
			try {
				tempConsejoSeccional = ConsejoSeccionalLocalServiceUtil.getConsejoSeccional(consejoSelected.getCodigo());
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchConsejoSeccionalException e) {
				_log.info("--> No exixte Especialidad");
			}
			if (tempConsejoSeccional == null) {
				tempConsejoSeccional = ConsejoSeccionalLocalServiceUtil.addConsejoSeccional(consejoSelected);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "consejos";
		} catch (Exception e) {
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error AddObject", e);
			return "";
		}

	}

	public void selectObject(ConsejoSeccional consejo) {
		consejoSelected = consejo;
	}

	public void deleteObject() {
		try {
			if (consejoSelected != null) {
				int cantidad = 0;
				if ((cantidad = DistritoLocalServiceUtil.countByFields(null, null, consejoSelected.getCodigo(), null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else if ((cantidad = MunicipioLocalServiceUtil.countByFields(null, null, null, null, null, null, consejoSelected.getCodigo(), null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					ConsejoSeccionalLocalServiceUtil.deleteConsejoSeccional(consejoSelected);
					codigo = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				}
			}

		} catch (Exception e) {
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error eliminar Especialidad", e);
		}
	}

	public String cargaFiltrosDataModel() {
		if (consejos == null)
			consejos = new ConsejosSeccioanlesDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, codigo);
		filtros.put(ConstantsUtility.FIELD_CON_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_CON_DIRECCION, null);
		filtros.put(ConstantsUtility.FIELD_CON_TELEFONOS, null);
		filtros.put(ConstantsUtility.FIELD_CON_CORREO_ELECTRONICO, null);
		consejos.setFiltros(filtros);
		return "";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public ConsejosSeccioanlesDataModel getConsejos() {
		return consejos;
	}

	public void setConsejos(ConsejosSeccioanlesDataModel consejos) {
		this.consejos = consejos;
	}

	public Integer getIdConsejoSelected() {
		return idConsejoSelected;
	}

	public void setIdConsejoSelected(Integer idConsejoSelected) {
		this.idConsejoSelected = idConsejoSelected;
	}

	public ConsejoSeccional getConsejoSelected() {
		return consejoSelected;
	}

	public void setConsejoSelected(ConsejoSeccional consejoSelected) {
		this.consejoSelected = consejoSelected;
	}

}
