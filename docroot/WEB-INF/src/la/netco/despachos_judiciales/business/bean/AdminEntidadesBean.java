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
import la.netco.despachos_judiciales.entities.NoSuchEntidadException;
import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminEntidadesBean")
@ViewScoped
public class AdminEntidadesBean {

	private static Log _log = LogFactoryUtil.getLog(AdminEntidadesBean.class);

	private Entidad entidadSelected;
	private EntidadesDataModel entidades;
	private List<SelectItem> jurisdiccionItems;

	private Integer codigoEntidad;

	public AdminEntidadesBean() {

	}

	public void preRenderViewAdd() {
		if (entidadSelected == null)
			entidadSelected = EntidadLocalServiceUtil.createEntidad(0);
		loadJurisdiccionItems();
	}

	public void cargaFiltrosDataModel() {
		if (entidades == null)
			entidades = new EntidadesDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_ENTIDAD, codigoEntidad);
		filtros.put(ConstantsUtility.FIELD_ENT_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_ENT_MASCARA, null);
		filtros.put(ConstantsUtility.FIELD_ENT_JURISDICCION, null);
		entidades.setFiltros(filtros);
	}

	public String addObject() {
		try {
			Entidad tempEntidad = null;
			try {
				tempEntidad = EntidadLocalServiceUtil.getEntidad(entidadSelected.getCodigo());
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchEntidadException e) {
				_log.info("--> No exixte Distro");
			}

			if (tempEntidad == null) {
				tempEntidad = EntidadLocalServiceUtil.addEntidad(entidadSelected);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "entidades";
		} catch (Exception e) {
			_log.error("Error AddObject", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			return "";
		}

	}

	public void selectObject(Entidad entidad) {
		entidadSelected = entidad;
	}

	public void deleteObject() {
		try {

			if (entidadSelected != null) {
				int cantidad = 0;
				if ((cantidad = DespachoLocalServiceUtil.countbyFields(null, null, null, null, entidadSelected.getCodigo(), null, null, null, null,
						null, null, null, null, null, null, null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					EntidadLocalServiceUtil.deleteEntidad(entidadSelected);
					codigoEntidad = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				}
			}

		} catch (Exception e) {
			_log.error("Error eliminar entidad", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public String updateObject() {
		try {
			EntidadLocalServiceUtil.updateEntidad(entidadSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "entidades";
		} catch (Exception e) {
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public void loadObject() {
		try {
			loadJurisdiccionItems();
			if (entidadSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.codigoEntidad = Integer.parseInt(idRegSeleccionado);
				if (entidadSelected == null && this.codigoEntidad != null) {
					entidadSelected = EntidadLocalServiceUtil.getEntidad(this.codigoEntidad);
				}
			}
		} catch (Exception e) {
			_log.error("Error al recuperar Entidad", e);
		}
	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
	}

	private void loadJurisdiccionItems() {
		if (jurisdiccionItems == null) {
			jurisdiccionItems = new ArrayList<SelectItem>();
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_ADMINSTRATIVA, ConstantsUtility.JURISDICION_DES_ADMINSTRATIVA));
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_DICIPLINARIA, ConstantsUtility.JURISDICION_DES_DICIPLINARIA));
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_ORDINARIA, ConstantsUtility.JURISDICION_DES_ORDINARIA));
		}
	}

	public Entidad getEntidadSelected() {
		return entidadSelected;
	}

	public void setEntidadSelected(Entidad entidadSelected) {
		this.entidadSelected = entidadSelected;
	}

	public EntidadesDataModel getEntidades() {
		return entidades;
	}

	public void setEntidades(EntidadesDataModel entidades) {
		this.entidades = entidades;
	}

	public Integer getCodigoEntidad() {
		return codigoEntidad;
	}

	public void setCodigoEntidad(Integer codigoEntidad) {
		this.codigoEntidad = codigoEntidad;
	}

	public List<SelectItem> getJurisdiccionItems() {
		return jurisdiccionItems;
	}

	public void setJurisdiccionItems(List<SelectItem> jurisdiccionItems) {
		this.jurisdiccionItems = jurisdiccionItems;
	}

}
