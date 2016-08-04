package la.netco.despachos_judiciales.business.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import la.netco.despachos_judiciales.business.datamodels.CircuitosDataModel;
import la.netco.despachos_judiciales.business.datamodels.ConsejosSeccioanlesDataModel;
import la.netco.despachos_judiciales.business.datamodels.DepartamentosDataModel;
import la.netco.despachos_judiciales.business.datamodels.MunicipiosDataModel;
import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.utilitys.MunicipioWrapper;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminMunicipioBean")
@ViewScoped
public class AdminMunicipioBean {

	private static Log _log = LogFactoryUtil.getLog(AdminMunicipioBean.class);

	private MunicipiosDataModel municipios;
	private Integer codigoMunicipio;
	private Integer codigoDepartamento;
	private Municipio municipioSelected;
	private CircuitosDataModel circuitos;
	private ConsejosSeccioanlesDataModel consejos;
	private DepartamentosDataModel departamentos;
	private Integer codigoCircuito;
	private Integer codigoConsejoSeccional;

	private Departamento departamentoSelected;
	private Circuito circuitoSelected;
	private Circuito circuitoAdmiSelected;
	private Circuito circuitoDiscSelected;
	private ConsejoSeccional consejoSeccSelected;

	private boolean circuitoAdminFlag;
	private boolean circuitoDiscFlag;
	private boolean circuitoFlag;

	public AdminMunicipioBean() {

	}

	public void preRenderViewListado() {
		cargaFiltrosDataModel();
	}

	public void preRenderViewAdd() {
		if (municipioSelected == null) {
			try {
				List<Municipio> tempMunicipios = MunicipioLocalServiceUtil.findByCompositeKey(11, 1);
				municipioSelected = tempMunicipios.get(0);
				municipioSelected.setCodigo(0);
				municipioSelected.setIdDepartamento(0);
				municipioSelected.setIdCircuito(0);
				municipioSelected.setIdCircuitoAdministrativo(0);
				municipioSelected.setIdCircuitoDisciplinario(0);
				municipioSelected.setIdConsejoSeccional(0);
				municipioSelected.setIndicativo(0);
				municipioSelected.setNombre(null);
			} catch (Exception e) {
				_log.error("Errror preRenderViewAdd", e);
			}
			loadCircuitos();
			loadConsejos();
			loadDepartamentos();
		}
	}

	public String addObject() {
		try {
			Integer cantMunicipios = MunicipioLocalServiceUtil.countByFields(municipioSelected.getIdDepartamento(), municipioSelected.getCodigo(),
					null, null, null, null, null, null);
			if (cantMunicipios != null && cantMunicipios == 0) {
				Municipio tempMunicipio = MunicipioLocalServiceUtil.addMunicipio(municipioSelected);
				FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
				return "municipios";
			} else {
				FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			}
		} catch (Exception e) {
			_log.error("Error AddObject", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			return "";
		}

	}

	public void addDepartamento(Departamento departamento) {
		departamentoSelected = departamento;
		municipioSelected.setIdDepartamento(departamentoSelected.getCodigo());
	}

	public void addConsejoSec(ConsejoSeccional consejoSeccional) {
		consejoSeccSelected = consejoSeccional;
		municipioSelected.setIdConsejoSeccional(consejoSeccSelected.getCodigo());
	}

	public void addCircuito(Circuito circuito) {
		if (circuitoFlag) {
			circuitoSelected = circuito;
			municipioSelected.setIdCircuito(circuitoSelected.getCodigo());
		}
		if (circuitoAdminFlag) {
			circuitoAdmiSelected = circuito;
			municipioSelected.setIdCircuitoAdministrativo(circuitoAdmiSelected.getCodigo());
		}
		if (circuitoDiscFlag) {
			circuitoDiscSelected = circuito;
			municipioSelected.setIdCircuitoDisciplinario(circuitoDiscSelected.getCodigo());
		}

	}

	public void deleteObject() {
		try {
			if (municipioSelected != null) {
				int cantidad = 0;
				if ((cantidad = DespachoLocalServiceUtil.countbyFields(null,null, municipioSelected.getIdDepartamento(), municipioSelected.getCodigo(),
						null, null, null, null, null, null, null, null, null, null, null, null, null)) > 0) {
					FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_DELETE);
				} else {
					MunicipioLocalServiceUtil.deleteMunicipio(municipioSelected);
					codigoDepartamento = null;
					codigoMunicipio = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				}
			} else {
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), "municipio Null");
			}

		} catch (Exception e) {
			_log.error("Error eliminar Municipio", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public String updateObject() {
		try {
			MunicipioLocalServiceUtil.updateMunicipio(municipioSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "municipios";
		} catch (Exception e) {
			_log.error("Error actualizar Objeto", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
		return "";
	}

	public void selectCircuito() {
		circuitoFlag = true;
		circuitoAdminFlag = false;
		circuitoDiscFlag = false;
	}

	public void selectCircuitoAdmin() {
		circuitoFlag = false;
		circuitoAdminFlag = true;
		circuitoDiscFlag = false;
	}

	public void selectCircuitoDisc() {
		circuitoFlag = false;
		circuitoAdminFlag = false;
		circuitoDiscFlag = true;
	}

	public void selectObject(MunicipioWrapper municipio) {
		municipioSelected = municipio.getWrapped();
	}

	public String cargaFiltrosDataModel() {
		if (municipios == null)
			municipios = new MunicipiosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_DEPARTAMENTO, codigoDepartamento);
		filtros.put(ConstantsUtility.FIELD_ID_MUNICIPIO, codigoMunicipio);
		filtros.put(ConstantsUtility.FIELD_MUN_INDICATIVO, null);
		filtros.put(ConstantsUtility.FIELD_MUN_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_ID_CIRCUITO, null);
		filtros.put(ConstantsUtility.FIELD_ID_CIRCUITO + "_ADM", null);
		filtros.put(ConstantsUtility.FIELD_ID_CIRCUITO + "_DISC", null);
		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, null);
		municipios.setFiltros(filtros);
		return "";
	}

	public void loadObject() {
		try {
			if (municipioSelected == null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idDepatamentoSelected = facesContext.getExternalContext().getRequestParameterMap().get("idDepartamento");
				String idMunicipioSelected = facesContext.getExternalContext().getRequestParameterMap().get("idMunicipio");
				System.out.println("--> Registro Seleccionado " + idDepatamentoSelected);
				System.out.println("--> Registro Seleccionado " + idMunicipioSelected);
				if (idDepatamentoSelected != null && idMunicipioSelected != null) {
					codigoMunicipio = Integer.parseInt(idMunicipioSelected);
					codigoDepartamento = Integer.parseInt(idDepatamentoSelected);
				}
				if (codigoMunicipio != null && codigoDepartamento != null) {
					List<Municipio> listMunicipios = MunicipioLocalServiceUtil.findByCompositeKey(codigoDepartamento, codigoMunicipio);
					municipioSelected = listMunicipios.get(0);
					if (municipioSelected != null && municipioSelected.getIdConsejoSeccional() != 0) {
						consejoSeccSelected = ConsejoSeccionalLocalServiceUtil.getConsejoSeccional(municipioSelected.getIdConsejoSeccional());
					}
					if (municipioSelected != null && municipioSelected.getIdCircuito() != 0) {
						circuitoSelected = CircuitoLocalServiceUtil.getCircuito(municipioSelected.getIdCircuito());
					}
					if (municipioSelected != null && municipioSelected.getIdCircuitoAdministrativo() != 0) {
						circuitoAdmiSelected = CircuitoLocalServiceUtil.getCircuito(municipioSelected.getIdCircuitoAdministrativo());
					}
					if (municipioSelected != null && municipioSelected.getIdCircuitoDisciplinario() != 0) {
						circuitoDiscSelected = CircuitoLocalServiceUtil.getCircuito(municipioSelected.getIdCircuitoDisciplinario());
					}
					if (municipioSelected != null && municipioSelected.getIdDepartamento() != 0) {
						departamentoSelected = DepartamentoLocalServiceUtil.getDepartamento(municipioSelected.getIdDepartamento());
					}
				}
			}
			loadDepartamentos();
			loadCircuitos();
			loadConsejos();

		} catch (Exception e) {
			_log.error("Error al recuperar Municipio", e);
		}

	}

	public void loadDepartamentos() {
		if (departamentos == null)
			departamentos = new DepartamentosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_DEPARTAMENTO, codigoDepartamento);
		filtros.put(ConstantsUtility.FIELD_DEP_NOMBRE, null);
		departamentos.setFiltros(filtros);
	}

	public void loadCircuitos() {
		if (circuitos == null)
			circuitos = new CircuitosDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_CIRCUITO, codigoCircuito);
		filtros.put(ConstantsUtility.FIELD_CIR_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_CIR_CODIGO_DANE, null);
		filtros.put(ConstantsUtility.FIELD_ID_DISTRTO, null);
		filtros.put(ConstantsUtility.FIELD_CIR_JURISDICCION, null);
		circuitos.setFiltros(filtros);
	}

	public void loadConsejos() {
		System.out.println(">>> Entro loadConsejos");
		if (consejos == null)
			consejos = new ConsejosSeccioanlesDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, codigoConsejoSeccional);
		filtros.put(ConstantsUtility.FIELD_CON_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_CON_DIRECCION, null);
		filtros.put(ConstantsUtility.FIELD_CON_TELEFONOS, null);
		filtros.put(ConstantsUtility.FIELD_CON_CORREO_ELECTRONICO, null);
		consejos.setFiltros(filtros);
	}

	public MunicipiosDataModel getMunicipios() {
		return municipios;
	}

	public void setMunicipios(MunicipiosDataModel municipios) {
		this.municipios = municipios;
	}

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Integer getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(Integer codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public Municipio getMunicipioSelected() {
		return municipioSelected;
	}

	public void setMunicipioSelected(Municipio municipioSelected) {
		this.municipioSelected = municipioSelected;
	}

	public CircuitosDataModel getCircuitos() {
		return circuitos;
	}

	public void setCircuitos(CircuitosDataModel circuitos) {
		this.circuitos = circuitos;
	}

	public ConsejosSeccioanlesDataModel getConsejos() {
		return consejos;
	}

	public void setConsejos(ConsejosSeccioanlesDataModel consejos) {
		this.consejos = consejos;
	}

	public Integer getCodigoCircuito() {
		return codigoCircuito;
	}

	public void setCodigoCircuito(Integer codigoCircuito) {
		this.codigoCircuito = codigoCircuito;
	}

	public Integer getCodigoConsejoSeccional() {
		return codigoConsejoSeccional;
	}

	public void setCodigoConsejoSeccional(Integer codigoConsejoSeccional) {
		this.codigoConsejoSeccional = codigoConsejoSeccional;
	}

	public Departamento getDepartamentoSelected() {
		return departamentoSelected;
	}

	public void setDepartamentoSelected(Departamento departamentoSelected) {
		this.departamentoSelected = departamentoSelected;
	}

	public Circuito getCircuitoSelected() {
		return circuitoSelected;
	}

	public void setCircuitoSelected(Circuito circuitoSelected) {
		this.circuitoSelected = circuitoSelected;
	}

	public Circuito getCircuitoAdmiSelected() {
		return circuitoAdmiSelected;
	}

	public void setCircuitoAdmiSelected(Circuito circuitoAdmiSelected) {
		this.circuitoAdmiSelected = circuitoAdmiSelected;
	}

	public Circuito getCircuitoDiscSelected() {
		return circuitoDiscSelected;
	}

	public void setCircuitoDiscSelected(Circuito circuitoDiscSelected) {
		this.circuitoDiscSelected = circuitoDiscSelected;
	}

	public DepartamentosDataModel getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(DepartamentosDataModel departamentos) {
		this.departamentos = departamentos;
	}

	public ConsejoSeccional getConsejoSeccSelected() {
		return consejoSeccSelected;
	}

	public void setConsejoSeccSelected(ConsejoSeccional consejoSeccSelected) {
		this.consejoSeccSelected = consejoSeccSelected;
	}

	public boolean isCircuitoAdminFlag() {
		return circuitoAdminFlag;
	}

	public void setCircuitoAdminFlag(boolean circuitoAdminFlag) {
		this.circuitoAdminFlag = circuitoAdminFlag;
	}

	public boolean isCircuitoDiscFlag() {
		return circuitoDiscFlag;
	}

	public void setCircuitoDiscFlag(boolean circuitoDiscFlag) {
		this.circuitoDiscFlag = circuitoDiscFlag;
	}

	public boolean isCircuitoFlag() {
		return circuitoFlag;
	}

	public void setCircuitoFlag(boolean circuitoFlag) {
		this.circuitoFlag = circuitoFlag;
	}

}
