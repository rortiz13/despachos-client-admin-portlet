package la.netco.despachos_judiciales.business.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import la.netco.despachos_judiciales.business.datamodels.EntidadesDataModel;
import la.netco.despachos_judiciales.business.datamodels.FuncionariosDataModel;
import la.netco.despachos_judiciales.entities.NoSuchEntidadException;
import la.netco.despachos_judiciales.entities.NoSuchTrabajadorException;
import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.Trabajador;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminFuncionarioBean")
@ViewScoped
public class AdminFuncionarioBean {

	private static Log _log = LogFactoryUtil.getLog(AdminFuncionarioBean.class);

	private Trabajador trabajadorSelected;
	private FuncionariosDataModel trabajadores;
	private String cedula;
	private List<SelectItem> sexoItems;

	public AdminFuncionarioBean() {

	}

	public void preRenderViewAdd() {
		if (trabajadorSelected == null)
			trabajadorSelected = TrabajadorLocalServiceUtil.createTrabajador(null);
		loadSexos();
	}

	public void cargaFiltrosDataModel() {
		if (trabajadores == null)
			trabajadores = new FuncionariosDataModel();
		if (cedula != null && cedula.equals(""))
			cedula = null;
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_TRA_CEDULA, cedula);
		filtros.put(ConstantsUtility.FIELD_TRA_NOMBRES, null);
		filtros.put(ConstantsUtility.FIELD_TRA_APELLIDOS, null);
		filtros.put(ConstantsUtility.FIELD_TRA_CONTRATO, null);
		filtros.put(ConstantsUtility.FIELD_TRA_CORREO_ELECTRONICO, null);
		filtros.put(ConstantsUtility.FIELD_TRA_ESPECIALIDAD, null);
		filtros.put(ConstantsUtility.FIELD_TRA_ESPECIALIDAD, null);
		filtros.put(ConstantsUtility.FIELD_TRA_FECHA_NACIMIENTO, null);
		filtros.put(ConstantsUtility.FIELD_TRA_SEXO, null);
		filtros.put(ConstantsUtility.FIELD_TRA_TELEFONOS_OFICINA, null);
		filtros.put(ConstantsUtility.FIELD_TRA_TIPO_CONTRATO, null);
		filtros.put(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR, null);
		trabajadores.setFiltros(filtros);
	}

	public String addObject() {
		try {
			Trabajador tempTrabajador = null;
			try {
				tempTrabajador = TrabajadorLocalServiceUtil.getTrabajador(trabajadorSelected.getCedula());
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchTrabajadorException e) {
			_log.info("--> No exixte Trabjador");
			}

			if (tempTrabajador == null) {
				tempTrabajador = TrabajadorLocalServiceUtil.addTrabajador(trabajadorSelected);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "funcionarios";
		} catch (Exception e) {
			_log.error("Error AddObject", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			return "";
		}

	}

	public void selectObject(Trabajador trabajador) {
		trabajadorSelected = trabajador;
	}

	public void deleteObject() {
		try {
			if (trabajadorSelected != null) {
				int cantidad = 0;
				if ((cantidad = RelacionTrabajadorDespachoLocalServiceUtil.countByFields(null, trabajadorSelected.getCedula(), null, null, null,
						null, null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					TrabajadorLocalServiceUtil.deleteTrabajador(trabajadorSelected);
					cedula = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				}
			} else {
				FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			}

		} catch (Exception e) {
			_log.error("Error eliminar entidad", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public String updateObject() {
		try {
			TrabajadorLocalServiceUtil.updateTrabajador(trabajadorSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "funcionarios";
		} catch (Exception e) {
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public void loadObject() {
		try {
			loadSexos();
			if (trabajadorSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.cedula = idRegSeleccionado;
				if (trabajadorSelected == null && this.cedula != null) {
					trabajadorSelected = TrabajadorLocalServiceUtil.getTrabajador(cedula);
				}
			}

		} catch (Exception e) {
			_log.error("Error al recuperar Entidad", e);
		}

	}

	public void loadSexos() {
		if (sexoItems == null) {
			sexoItems = new ArrayList<SelectItem>();
			sexoItems.add(new SelectItem("M", "Masculinio"));
			sexoItems.add(new SelectItem("F", "Femenino"));
		}
	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
	}

	public Trabajador getTrabajadorSelected() {
		return trabajadorSelected;
	}

	public void setTrabajadorSelected(Trabajador trabajadorSelected) {
		this.trabajadorSelected = trabajadorSelected;
	}

	public FuncionariosDataModel getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(FuncionariosDataModel trabajadores) {
		this.trabajadores = trabajadores;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<SelectItem> getSexoItems() {
		return sexoItems;
	}

	public void setSexoItems(List<SelectItem> sexoItems) {
		this.sexoItems = sexoItems;
	}
}
