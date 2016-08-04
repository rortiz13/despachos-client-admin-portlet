package la.netco.despachos_judiciales.business.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import la.netco.despachos_judiciales.business.datamodels.ConsejosSeccioanlesDataModel;
import la.netco.despachos_judiciales.business.datamodels.DistritosDataModel;
import la.netco.despachos_judiciales.entities.NoSuchDistritoException;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminDistritoBean")
@ViewScoped
public class AdminDistritoBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(AdminDistritoBean.class);

	private Distrito distritoSelected;
	private DistritosDataModel distritos;
	private ConsejosSeccioanlesDataModel consejos;
	private Integer codigo;
	private Integer codigoConsejoSec;
	private Integer idDistritoSelected;
	private ConsejoSeccional consesjoSeccional;
	private List<SelectItem> jurisdiccionItems;

	public AdminDistritoBean() {

	}

	public void preRenderViewAdd() {
		if (distritoSelected == null)
			distritoSelected = DistritoLocalServiceUtil.createDistrito(0);
		loadConsejos();
		loadJurisdiccionItems();
	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
	}

	public void loadObject() {
		try {
			loadJurisdiccionItems();
			if (idDistritoSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.idDistritoSelected = Integer.parseInt(idRegSeleccionado);
				if ((distritoSelected == null || distritoSelected.getCodigo() == 0) && (idDistritoSelected != null)) {
					distritoSelected = DistritoLocalServiceUtil.getDistrito(idDistritoSelected);
					if (distritoSelected != null && distritoSelected.getCodigo() != 0) {
						consesjoSeccional = ConsejoSeccionalLocalServiceUtil.getConsejoSeccional(distritoSelected.getIdConsejo_sec());
					}
				}
			}
			loadConsejos();

		} catch (Exception e) {
			_log.error("Error al recuperar Distrito", e);
		}

	}

	public String updateObject() {
		try {
			distritoSelected.setIdConsejo_sec(consesjoSeccional.getCodigo());
			DistritoLocalServiceUtil.updateDistrito(distritoSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "distritos";
		} catch (Exception e) {
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public String addObject() {
		try {
			Distrito tempDistrito = null;
			try {
				tempDistrito = DistritoLocalServiceUtil.getDistrito(distritoSelected.getCodigo());
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchDistritoException e) {
				_log.info("--> No exixte Distro");	
			}

			if (tempDistrito == null) {
				tempDistrito = DistritoLocalServiceUtil.addDistrito(distritoSelected);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "distritos";
		} catch (Exception e) {
			_log.error("Error AddObject", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			return "";
		}

	}

	public void selectObject(Distrito distrito) {
		distritoSelected = distrito;
	}
	
	public void deleteObject() {
		try {
			if (distritoSelected != null) {
				int cantidad = 0;
				if ((cantidad = CircuitoLocalServiceUtil.countByFields(null, null, distritoSelected.getCodigo(), null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					DistritoLocalServiceUtil.deleteDistrito(distritoSelected);
					codigo = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				}
			}

		} catch (Exception e) {
			_log.error("Error eliminar distrito", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public String loadConsejos() {
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

	private void loadJurisdiccionItems() {
		if (jurisdiccionItems == null) {
			jurisdiccionItems = new ArrayList<SelectItem>();
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_ADMINSTRATIVA, ConstantsUtility.JURISDICION_DES_ADMINSTRATIVA));
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_DICIPLINARIA, ConstantsUtility.JURISDICION_DES_DICIPLINARIA));
			jurisdiccionItems.add(new SelectItem(ConstantsUtility.JURISDICION_COD_ORDINARIA, ConstantsUtility.JURISDICION_DES_ORDINARIA));
		}
	}

	public String cargaFiltrosDataModel() {
		if (distritos == null)
			distritos = new DistritosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_DISTRTO, codigo);
		filtros.put(ConstantsUtility.FIELD_DIS_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_DIS_CODIGO_DANE, null);
		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, null);
		filtros.put(ConstantsUtility.FIELD_DIS_JURISDICCION, null);
		distritos.setFiltros(filtros);
		return "";
	}

	public void addConsejoSec(ConsejoSeccional consejo) {
		consesjoSeccional = consejo;
		distritoSelected.setIdConsejo_sec(consesjoSeccional.getCodigo());
	}

	public DistritosDataModel getDistritos() {
		return distritos;
	}

	public void setDistritos(DistritosDataModel distritos) {
		this.distritos = distritos;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Distrito getDistritoSelected() {
		return distritoSelected;
	}

	public void setDistritoSelected(Distrito distritoSelected) {
		this.distritoSelected = distritoSelected;
	}

	public Integer getIdDistritoSelected() {
		return idDistritoSelected;
	}

	public void setIdDistritoSelected(Integer idDistritoSelected) {
		this.idDistritoSelected = idDistritoSelected;
	}

	public ConsejoSeccional getConsesjoSeccional() {
		return consesjoSeccional;
	}

	public void setConsesjoSeccional(ConsejoSeccional consesjoSeccional) {
		this.consesjoSeccional = consesjoSeccional;
	}

	public ConsejosSeccioanlesDataModel getConsejos() {
		return consejos;
	}

	public void setConsejos(ConsejosSeccioanlesDataModel consejos) {
		this.consejos = consejos;
	}

	public Integer getCodigoConsejoSec() {
		return codigoConsejoSec;
	}

	public void setCodigoConsejoSec(Integer codigoConsejoSec) {
		this.codigoConsejoSec = codigoConsejoSec;
	}

	public List<SelectItem> getJurisdiccionItems() {
		return jurisdiccionItems;
	}

	public void setJurisdiccionItems(List<SelectItem> jurisdiccionItems) {
		this.jurisdiccionItems = jurisdiccionItems;
	}

}
