package la.netco.despachos_judiciales.business.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import la.netco.despachos_judiciales.business.datamodels.CircuitosDataModel;
import la.netco.despachos_judiciales.business.datamodels.DistritosDataModel;
import la.netco.despachos_judiciales.entities.NoSuchCircuitoException;
import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminCircuitosBean")
@ViewScoped
public class AdminCircuitosBean {

	private static Log _log = LogFactoryUtil.getLog(AdminCircuitosBean.class);

	private Circuito circuitoSelected;
	private Distrito distritoSelected;
	private List<SelectItem> jurisdiccionItems;
	private DistritosDataModel distritos;
	private CircuitosDataModel circuitos;
	private Integer idDistritoSelected;
	private Integer idCircuitoSelected;
	private Integer codigo;

	public AdminCircuitosBean() {

	}

	public void preRenderViewAdd() {
		if (circuitoSelected == null)
			circuitoSelected = CircuitoLocalServiceUtil.createCircuito(0);
		loadJurisdiccionItems();
		loadDistritos();
	}

	public void preRenderViewListado() {
		cargaFiltrosDataModel();
	}

	public String addObject() {
		try {
			Circuito tempCircuito = null;
			try {
				tempCircuito = CircuitoLocalServiceUtil.getCircuito(circuitoSelected.getCodigo());
				FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchCircuitoException e) {
				_log.info("--> No exixte Distro");
			}

			if (tempCircuito == null) {
				tempCircuito = CircuitoLocalServiceUtil.addCircuito(circuitoSelected);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "circuitos";
		} catch (Exception e) {
			_log.error("Error AddObject", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			return "";
		}
	}

	public void addDistrito(Distrito distrito) {
		distritoSelected = distrito;
		circuitoSelected.setIdDistrito(distritoSelected.getCodigo());
	}

	public void selectObject(Circuito circuito) {
		circuitoSelected = circuito;
	}

	public void deleteObject() {
		try {
			if (circuitoSelected != null) {
				int cantidad = 0;
				if ((cantidad = MunicipioLocalServiceUtil.countByFields(null, null, null, null, circuitoSelected.getCodigo(), null, null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else if ((cantidad = MunicipioLocalServiceUtil
						.countByFields(null, null, null, null, null, circuitoSelected.getCodigo(), null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else if ((cantidad = MunicipioLocalServiceUtil
						.countByFields(null, null, null, null, null, null, null, circuitoSelected.getCodigo())) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					CircuitoLocalServiceUtil.deleteCircuito(circuitoSelected);
					codigo = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				}
			}

		} catch (Exception e) {
			_log.error("Error eliminar distrito", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public void loadObject() {
		try {
			loadJurisdiccionItems();
			if (idCircuitoSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.idCircuitoSelected = Integer.parseInt(idRegSeleccionado);
				if ((circuitoSelected == null || circuitoSelected.getCodigo() == 0) && (idCircuitoSelected != null)) {
					circuitoSelected = CircuitoLocalServiceUtil.getCircuito(idCircuitoSelected);
					if (circuitoSelected != null && circuitoSelected.getCodigo() != 0) {
						distritoSelected = DistritoLocalServiceUtil.getDistrito(circuitoSelected.getIdDistrito());
					}
				}
			}
			loadDistritos();
		} catch (Exception e) {
			_log.error("Error al recuperar Circuito", e);
		}

	}

	private void loadJurisdiccionItems() {
		if (jurisdiccionItems == null) {
			jurisdiccionItems = new ArrayList<SelectItem>();
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_ADMINSTRATIVA, ConstantsUtility.JURISDICION_DES_ADMINSTRATIVA));
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_DICIPLINARIA, ConstantsUtility.JURISDICION_DES_DICIPLINARIA));
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_ORDINARIA, ConstantsUtility.JURISDICION_DES_ORDINARIA));
		}
	}

	public void loadDistritos() {
		if (distritos == null)
			distritos = new DistritosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_DISTRTO, idDistritoSelected);
		filtros.put(ConstantsUtility.FIELD_DIS_CODIGO_DANE, null);
		filtros.put(ConstantsUtility.FIELD_DIS_JURISDICCION, null);
		filtros.put(ConstantsUtility.FIELD_DIS_CODIGO_DANE, null);
		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, null);
		distritos.setFiltros(filtros);
	}

	public String updateObject() {
		try {

			distritoSelected.setIdConsejo_sec(circuitoSelected.getCodigo());
			CircuitoLocalServiceUtil.updateCircuito(circuitoSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "circuitos";
		} catch (Exception e) {
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public String cargaFiltrosDataModel() {
		if (circuitos == null)
			circuitos = new CircuitosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_CIRCUITO, codigo);
		filtros.put(ConstantsUtility.FIELD_CIR_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_CIR_CODIGO_DANE, null);
		filtros.put(ConstantsUtility.FIELD_ID_DISTRTO, null);
		filtros.put(ConstantsUtility.FIELD_CIR_JURISDICCION, null);
		circuitos.setFiltros(filtros);
		return "";
	}

	public Circuito getCircuitoSelected() {
		return circuitoSelected;
	}

	public void setCircuitoSelected(Circuito circuitoSelected) {
		this.circuitoSelected = circuitoSelected;
	}

	public Distrito getDistritoSelected() {
		return distritoSelected;
	}

	public void setDistritoSelected(Distrito distritoSelected) {
		this.distritoSelected = distritoSelected;
	}

	public List<SelectItem> getJurisdiccionItems() {
		return jurisdiccionItems;
	}

	public void setJurisdiccionItems(List<SelectItem> jurisdiccionItems) {
		this.jurisdiccionItems = jurisdiccionItems;
	}

	public DistritosDataModel getDistritos() {
		return distritos;
	}

	public void setDistritos(DistritosDataModel distritos) {
		this.distritos = distritos;
	}

	public Integer getIdDistritoSelected() {
		return idDistritoSelected;
	}

	public void setIdDistritoSelected(Integer idDistritoSelected) {
		this.idDistritoSelected = idDistritoSelected;
	}

	public CircuitosDataModel getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(CircuitosDataModel circuitos) {
		this.circuitos = circuitos;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getIdCircuitoSelected() {
		return idCircuitoSelected;
	}

	public void setIdCircuitoSelected(Integer idCircuitoSelected) {
		this.idCircuitoSelected = idCircuitoSelected;
	}

}
