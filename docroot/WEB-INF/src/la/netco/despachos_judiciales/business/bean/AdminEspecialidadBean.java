package la.netco.despachos_judiciales.business.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import la.netco.despachos_judiciales.business.datamodels.EspecialidadDataModel;
import la.netco.despachos_judiciales.entities.NoSuchEspecialidadException;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminEspecialidaBean")
@ViewScoped
public class AdminEspecialidadBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(AdminEspecialidadBean.class);

	private EspecialidadDataModel especialidades;
	private Especialidad especialidadSelected;
	private Integer codigo;
	private Integer idEspecialidadSelected;

	public AdminEspecialidadBean() {

	}

	public void preRenderViewAdd() {
		if (especialidadSelected == null)
			especialidadSelected = EspecialidadLocalServiceUtil.createEspecialidad(0);
	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
	}

	public void loadObject() {
		try {
			if (idEspecialidadSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.idEspecialidadSelected = Integer.parseInt(idRegSeleccionado);
				if ((especialidadSelected == null || especialidadSelected.getCodigo() == 0) && (idEspecialidadSelected != null)) {
					especialidadSelected = EspecialidadLocalServiceUtil.getEspecialidad(idEspecialidadSelected);
				}
			}
		} catch (Exception e) {
			_log.error("Error al recuperar Distrito", e);
		}

	}

	public String updateObject() {
		try {
			EspecialidadLocalServiceUtil.updateEspecialidad(especialidadSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "especialidades";
		} catch (Exception e) {
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public String addObject() {
		try {
			Especialidad tempEspecialiadad = null;
			try {
				tempEspecialiadad = EspecialidadLocalServiceUtil.getEspecialidad(especialidadSelected.getCodigo());
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchEspecialidadException e) {
				_log.error("No exixte Especialidad: " + tempEspecialiadad.getCodigo());
			}

			if (tempEspecialiadad == null) {
				tempEspecialiadad = EspecialidadLocalServiceUtil.addEspecialidad(especialidadSelected);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "distritos";
		} catch (Exception e) {
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error AddObject", e);
			return "";
		}

	}

	public void selectObject(Especialidad especialidad) {
		especialidadSelected = especialidad;
	}

	public void deleteObject() {
		try {
			if (especialidadSelected != null) {
				int cantidad = 0;
				if ((cantidad = DespachoLocalServiceUtil.countbyFields(null, null, null, null, null, especialidadSelected.getCodigo(), null, null,
						null, null, null, null, null, null, null, null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					EspecialidadLocalServiceUtil.deleteEspecialidad(especialidadSelected);
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
		if (especialidades == null)
			especialidades = new EspecialidadDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_ESPECIALIDAD, codigo);
		filtros.put(ConstantsUtility.FIELD_ESP_NOMBRE, null);
		especialidades.setFiltros(filtros);
		return "";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public EspecialidadDataModel getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(EspecialidadDataModel especialidades) {
		this.especialidades = especialidades;
	}

	public Especialidad getEspecialidadSelected() {
		return especialidadSelected;
	}

	public void setEspecialidadSelected(Especialidad especialidadSelected) {
		this.especialidadSelected = especialidadSelected;
	}

	public Integer getIdEspecialidadSelected() {
		return idEspecialidadSelected;
	}

	public void setIdEspecialidadSelected(Integer idEspecialidadSelected) {
		this.idEspecialidadSelected = idEspecialidadSelected;
	}
}
