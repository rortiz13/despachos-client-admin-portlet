package la.netco.despachos_judiciales.business.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import la.netco.despachos_judiciales.business.datamodels.DespachosDataModel;
import la.netco.despachos_judiciales.business.datamodels.EntidadesDataModel;
import la.netco.despachos_judiciales.business.datamodels.EspecialidadDataModel;
import la.netco.despachos_judiciales.business.datamodels.FuncionariosDataModel;
import la.netco.despachos_judiciales.entities.NoSuchDespachoException;
import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;
import la.netco.despachos_judiciales.entities.model.Trabajador;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.utilitys.DespachoWrapper;
import la.netco.despachos_judiciales.utilitys.LiferayUtiliy;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.jsf.common.FacesMessageUtil;

@ManagedBean(name = "adminDespachosBean")
@ViewScoped
public class AdminDespachosBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(AdminDespachosBean.class);

	private DespachosDataModel despachos;
	private EntidadesDataModel entidades;
	private EspecialidadDataModel especialidades;
	private FuncionariosDataModel trabajadores;
	private List<SelectItem> listDepartametos;
	private List<SelectItem> listMunicipios;

	private DespachoWrapper despachoWrapper;
	private Despacho despachoSelected;
	private Entidad entidadSelected;
	private Especialidad especialidadSelected;
	private Trabajador trabajadorSelected;
	private Municipio municipioSelected;

	private String codigo = null;
	private Integer codigoEntidad;
	private Integer codigoEspecialidad;
	private Integer codigoTrabajador;
	private Integer idConsejo;
	private String cedula;
	private java.util.Date fechaInicial;
	private java.util.Date fechaFinal;

	private String stgDepartamento;
	private String stgMunicipio;
	private String stgEntidad;
	private String stgEspecialidad;
	private String stgConsecutivo;

	private boolean admin = false;

	public AdminDespachosBean() {

	}

	@PostConstruct
	private void init() {
		idConsejo = (Integer) LiferayUtiliy.getSessionObject(ConstantsUtility.SESSION_ID_CONSEJO);
		if (idConsejo == null)
			admin = true;
		if (despachoSelected == null)
			despachoSelected = DespachoLocalServiceUtil.createDespacho(null);
	}

	public void preRenderViewAdd() {
		despachoSelected.setEstado(1);
		despachoSelected.setHorario_atencion("8:00 a.m. - 1:00pm y 2:00 p.m a 5:00 pm");
		despachoSelected.setIdMunicipio(-1);
		loadMunicipios();
		loadDepartamentos();
		loadEntidades();
		loadEspecialidades();
		loadFuncionarios();

	}

	public void loadDatamodel() {
		cargaFiltrosDataModel();
		loadEntidades();
		loadEspecialidades();
	}

	public void loadObject() {

		try {
			if (despachoSelected.getCodigo() != null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				String idRegSeleccionado = facesContext.getExternalContext().getRequestParameterMap().get("idRegSeleccionado");
				if (idRegSeleccionado != null)
					this.codigo = idRegSeleccionado;

				if (codigo != null) {
					despachoSelected = DespachoLocalServiceUtil.getDespacho(codigo);
					buildDespacho(despachoSelected);
				}
				loadDepartamentos();
				loadMunicipios();
				loadEntidades();
				loadEspecialidades();
				loadFuncionarios();
			}
		} catch (Exception e) {
			_log.error("Error al recuperar Despacho", e);
		}

	}

	public String updateObject() {
		try {
			DespachoLocalServiceUtil.updateDespacho(despachoSelected);
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.UPDATE_EXITOSO);
			return "despachos";
		} catch (Exception e) {
			FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error actualizar Objeto", e);
		}
		return "";
	}

	public String addObject() {
		try {
			Despacho tempDespacho = null;
			despachoSelected.setCodigo(buildCodigoDespacho(despachoSelected.getIdDepartamento(), despachoSelected.getIdMunicipio(),
					despachoSelected.getIdEntidad(), despachoSelected.getIdEspecialidad(), despachoSelected.getConsecutivo()));
			despachoSelected.setNombre(buildNombreDespacho(entidadSelected.getNombre(), despachoSelected.getConsecutivo(),
					especialidadSelected.getNombre(), municipioSelected.getNombre()));
			despachoSelected.setFecha_act(new java.sql.Date(Calendar.getInstance().getTime().getTime()));

			try {
				tempDespacho = DespachoLocalServiceUtil.getDespacho(despachoSelected.getCodigo());
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_ID_REPETIDO);
				return "";
			} catch (NoSuchDespachoException e) {
				_log.error("Error", e);
			}
			if (tempDespacho == null) {
				tempDespacho = DespachoLocalServiceUtil.addDespacho(despachoSelected);
				RelacionTrabajadorDespacho rel = RelacionTrabajadorDespachoLocalServiceUtil
						.createRelacionTrabajadorDespacho(new RelacionTrabajadorDespachoPK(null, null));
				rel.setIdDespacho(tempDespacho.getCodigo());
				rel.setIdTrabajador(trabajadorSelected.getCedula());
				rel = RelacionTrabajadorDespachoLocalServiceUtil.addRelacionTrabajadorDespacho(rel);
				FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ADD_EXITOSO);
			}
			return "despachos";
		} catch (Exception e) {
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
			_log.error("Error AddObject", e);
			return "";
		}

	}

	public void selectObject(DespachoWrapper despacho) {
		despachoWrapper = despacho;
		despachoSelected = despachoWrapper.getWrapped();
	}

	public void deleteObject() {
		try {
			if (despachoSelected != null) {
				List<RelacionTrabajadorDespacho> listRel = RelacionTrabajadorDespachoLocalServiceUtil.findByFields(despachoSelected.getCodigo(),
						null, null, null, null, null, null, null, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				if (listRel.size() <= 1) {
					RelacionTrabajadorDespachoLocalServiceUtil.deleteRelacionTrabajadorDespacho(listRel.get(0));
					DespachoLocalServiceUtil.deleteDespacho(despachoSelected);
					codigo = null;
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.DELETE_EXITOSO);
				} else {
					FacesMessageUtil.info(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
				}
			}
		} catch (Exception e) {
			_log.error("Error eliminar Especialidad", e);
			FacesMessageUtil.error(FacesContext.getCurrentInstance(), ConstantsUtility.ERROR_GENERAL);
		}
	}

	public String cargaFiltrosDataModel() {
		if (despachos == null)
			despachos = new DespachosDataModel();
		Date fechaSqlInicial = null;
		Date fechaSqlFinal = null;
		if (fechaInicial != null)
			fechaSqlInicial = new Date(fechaInicial.getTime());
		if (fechaFinal != null)
			fechaSqlFinal = new Date(fechaFinal.getTime());
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_DESPACHO, null);
		if (codigo != null && !codigo.equals(""))
			filtros.put(ConstantsUtility.FIELD_ID_DESPACHO, codigo);
		filtros.put(ConstantsUtility.FIELD_ID_DEPARTAMENTO, null);
		if (idConsejo != null) {
			filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, idConsejo);
		} else {
			filtros.put(ConstantsUtility.FIELD_ID_CONSEJOSEC, null);
		}
		filtros.put(ConstantsUtility.FIELD_ID_ENTIDAD, null);
		if (entidadSelected != null)
			filtros.put(ConstantsUtility.FIELD_ID_ENTIDAD, entidadSelected.getCodigo());
		filtros.put(ConstantsUtility.FIELD_ID_ESPECIALIDAD, null);
		if (especialidadSelected != null)
			filtros.put(ConstantsUtility.FIELD_ID_ESPECIALIDAD, especialidadSelected.getCodigo());
		filtros.put(ConstantsUtility.FIELD_DES_CONSECUTIVO, null);
		filtros.put(ConstantsUtility.FIELD_DES_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_DES_DIRECCION, null);
		filtros.put(ConstantsUtility.FIELD_DES_TELEFONOS, null);
		filtros.put(ConstantsUtility.FIELD_DES_CORREO_ELECTRONICO, null);
		filtros.put(ConstantsUtility.FIELD_DES_ACUERDO, null);
		filtros.put(ConstantsUtility.FIELD_DES_ESTADO, null);
		filtros.put(ConstantsUtility.FIELD_DES_FAX, null);
		filtros.put(ConstantsUtility.FIELD_DES_HORARIO_ATENCION, null);
		filtros.put(ConstantsUtility.FIELD_DES_FECHA_ACT + "_INI", fechaSqlInicial);
		filtros.put(ConstantsUtility.FIELD_DES_FECHA_ACT + "_FIN", fechaSqlFinal);
		despachos.setFiltros(filtros);
		return "";
	}

	public Despacho builtDespacho(DespachoWrapper despachoWrapper) {
		Despacho despacho = despachoWrapper.getWrapped();
		despacho.setIdDepartamento(despachoWrapper.getDepartamento().getCodigo());
		despacho.setIdMunicipio(despachoWrapper.getMunicipio().getCodigo());
		despacho.setIdEntidad(despachoWrapper.getEntidad().getCodigo());
		despacho.setIdEspecialidad(despachoWrapper.getEspecialidad().getCodigo());
		return despacho;
	}

	private void buildDespacho(Despacho despacho) {
		if (despacho != null) {
			try {
				if (despacho.getIdEntidad() != 0)
					entidadSelected = EntidadLocalServiceUtil.getEntidad(despacho.getIdEntidad());
				if (despacho.getIdEspecialidad() != 0)
					especialidadSelected = EspecialidadLocalServiceUtil.getEspecialidad(despacho.getIdEspecialidad());
				List<RelacionTrabajadorDespacho> listRel = RelacionTrabajadorDespachoLocalServiceUtil.findByFields(despacho.getCodigo(), null, null,
						null, null, null, null, null, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				if (listRel.size() > 0)
					trabajadorSelected = TrabajadorLocalServiceUtil.getTrabajador(listRel.get(0).getIdTrabajador());
				stgConsecutivo = fillZeros(despachoSelected.getConsecutivo(), 3);
				stgEntidad = fillZeros(String.valueOf(entidadSelected.getCodigo()), 2);
				stgEspecialidad = fillZeros(String.valueOf(especialidadSelected.getCodigo()), 2);
				stgMunicipio = fillZeros(String.valueOf(despachoSelected.getIdMunicipio()), 2);
				stgDepartamento = fillZeros(String.valueOf(despachoSelected.getIdDepartamento()), 2);
				municipioSelected = MunicipioLocalServiceUtil.getMunicipio(new MunicipioPK(despachoSelected.getIdDepartamento(), despachoSelected
						.getIdMunicipio()));
			} catch (PortalException e) {
				_log.error("Error Built Despacho", e);
			} catch (SystemException e) {
				_log.error("Error Built Despacho", e);
			}
		}
	}

	public void loadDepartamentos() {
		try {
			listDepartametos = new ArrayList<SelectItem>();
			List<Departamento> departamentos = DepartamentoLocalServiceUtil.findByFields(null, null, -1, -1);
			for (Departamento departamento : departamentos) {
				listDepartametos.add(new SelectItem(departamento.getCodigo(), departamento.getNombre()));
			}
		} catch (SystemException e) {
			_log.error("Error Lista departamentos", e);
		}
	}

	public void loadMunicipios() {
		try {
			listMunicipios = new ArrayList<SelectItem>();
			if (despachoSelected != null && despachoSelected.getIdDepartamento() != 0) {
				List<Municipio> municipios = MunicipioLocalServiceUtil.findByFields(despachoSelected.getIdDepartamento(), null, null, null, null,
						null, null, null, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
				for (Municipio municipio : municipios) {
					listMunicipios.add(new SelectItem(municipio.getCodigo(), municipio.getNombre()));
				}
				stgDepartamento = String.valueOf(despachoSelected.getIdDepartamento());
			}

		} catch (SystemException e) {
			_log.error("Error Lista municipios", e);
		}
	}

	public void loadEntidades() {
		if (entidades == null)
			entidades = new EntidadesDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_ENTIDAD, codigoEntidad);
		filtros.put(ConstantsUtility.FIELD_ENT_NOMBRE, null);
		filtros.put(ConstantsUtility.FIELD_ENT_MASCARA, null);
		filtros.put(ConstantsUtility.FIELD_ENT_JURISDICCION, null);
		entidades.setFiltros(filtros);
	}

	public void loadEspecialidades() {
		if (especialidades == null)
			especialidades = new EspecialidadDataModel();
		Map<String, Object> filtros = new HashMap<String, Object>();
		filtros.put(ConstantsUtility.FIELD_ID_ESPECIALIDAD, codigoEspecialidad);
		filtros.put(ConstantsUtility.FIELD_ESP_NOMBRE, null);
		especialidades.setFiltros(filtros);
	}

	public void loadFuncionarios() {
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

	public void addEntidad(Entidad entidad) {
		entidadSelected = entidad;
		despachoSelected.setIdEntidad(entidadSelected.getCodigo());
		stgEntidad = String.valueOf(entidadSelected.getCodigo());
	}

	public void addEspecialidad(Especialidad especialidad) {
		especialidadSelected = especialidad;
		despachoSelected.setIdEspecialidad(especialidadSelected.getCodigo());
		stgEspecialidad = String.valueOf(especialidadSelected.getCodigo());
	}

	public void addTrabajador(Trabajador trabajador) {
		trabajadorSelected = trabajador;
	}

	public void addConsecutivo() {
		stgConsecutivo = despachoSelected.getConsecutivo();
	}

	public void addMunicipio() {
		try {
			if (despachoSelected != null) {
				stgMunicipio = String.valueOf(despachoSelected.getIdMunicipio());
				List<Municipio> list = MunicipioLocalServiceUtil.findByCompositeKey(despachoSelected.getIdDepartamento(),
						despachoSelected.getIdMunicipio());
				municipioSelected = list.get(0);
			}
		} catch (SystemException e) {
			_log.error("Recuperando Municipio", e);
		}
	}

	private String buildCodigoDespacho(int idDepartamento, int idMunicipio, int idEntidad, int idEspecialidad, String consecutivo) {
		StringBuilder sb = new StringBuilder();
		sb.append(fillZeros(String.valueOf(idDepartamento), 2));
		sb.append(fillZeros(String.valueOf(idMunicipio), 3));
		sb.append(fillZeros(String.valueOf(idEntidad), 2));
		sb.append(fillZeros(String.valueOf(idEspecialidad), 2));
		sb.append(fillZeros(consecutivo, 3));
		return sb.toString();
	}

	private String buildNombreDespacho(String nomEntidad, String consecutivo, String nomEspecialidad, String nomMunicipio) {
		StringBuilder sb = new StringBuilder();
		sb.append(nomEntidad + " ");
		sb.append(consecutivo + " ");
		sb.append(nomEspecialidad + " ");
		sb.append("de " + nomMunicipio);
		return sb.toString();
	}

	private String fillZeros(String value, int length) {
		if (value != null && value.length() < length) {
			StringBuilder strb = new StringBuilder();
			int zeros = length - value.length();
			for (int i = 0; i < zeros; i++) {
				strb.append("0");
			}
			strb.append(value);
			return strb.toString();
		}
		return value;
	}

	public DespachosDataModel getDespachos() {
		return despachos;
	}

	public void setDespachos(DespachosDataModel despachos) {
		this.despachos = despachos;
	}

	public EntidadesDataModel getEntidades() {
		return entidades;
	}

	public void setEntidades(EntidadesDataModel entidades) {
		this.entidades = entidades;
	}

	public EspecialidadDataModel getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(EspecialidadDataModel especialidades) {
		this.especialidades = especialidades;
	}

	public FuncionariosDataModel getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(FuncionariosDataModel trabajadores) {
		this.trabajadores = trabajadores;
	}

	public List<SelectItem> getListDepartametos() {
		return listDepartametos;
	}

	public void setListDepartametos(List<SelectItem> listDepartametos) {
		this.listDepartametos = listDepartametos;
	}

	public List<SelectItem> getListMunicipios() {
		return listMunicipios;
	}

	public void setListMunicipios(List<SelectItem> listMunicipios) {
		this.listMunicipios = listMunicipios;
	}

	public DespachoWrapper getDespachoWrapper() {
		return despachoWrapper;
	}

	public void setDespachoWrapper(DespachoWrapper despachoWrapper) {
		this.despachoWrapper = despachoWrapper;
	}

	public Despacho getDespachoSelected() {
		return despachoSelected;
	}

	public void setDespachoSelected(Despacho despachoSelected) {
		this.despachoSelected = despachoSelected;
	}

	public Entidad getEntidadSelected() {
		return entidadSelected;
	}

	public void setEntidadSelected(Entidad entidadSelected) {
		this.entidadSelected = entidadSelected;
	}

	public Especialidad getEspecialidadSelected() {
		return especialidadSelected;
	}

	public void setEspecialidadSelected(Especialidad especialidadSelected) {
		this.especialidadSelected = especialidadSelected;
	}

	public Trabajador getTrabajadorSelected() {
		return trabajadorSelected;
	}

	public void setTrabajadorSelected(Trabajador trabajadorSelected) {
		this.trabajadorSelected = trabajadorSelected;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigoEntidad() {
		return codigoEntidad;
	}

	public void setCodigoEntidad(Integer codigoEntidad) {
		this.codigoEntidad = codigoEntidad;
	}

	public Integer getCodigoEspecialidad() {
		return codigoEspecialidad;
	}

	public void setCodigoEspecialidad(Integer codigoEspecialidad) {
		this.codigoEspecialidad = codigoEspecialidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public java.util.Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(java.util.Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public java.util.Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(java.util.Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Integer getCodigoTrabajador() {
		return codigoTrabajador;
	}

	public void setCodigoTrabajador(Integer codigoTrabajador) {
		this.codigoTrabajador = codigoTrabajador;
	}

	public String getStgDepartamento() {
		return fillZeros(stgDepartamento, 2);
	}

	public void setStgDepartamento(String stgDepartamento) {
		this.stgDepartamento = stgDepartamento;
	}

	public String getStgMunicipio() {
		return fillZeros(stgMunicipio, 3);
	}

	public void setStgMunicipio(String stgMunicipio) {
		this.stgMunicipio = stgMunicipio;
	}

	public String getStgEntidad() {
		return fillZeros(stgEntidad, 2);
	}

	public void setStgEntidad(String stgEntidad) {
		this.stgEntidad = stgEntidad;
	}

	public String getStgEspecialidad() {
		return fillZeros(stgEspecialidad, 2);
	}

	public void setStgEspecialidad(String stgEspecialidad) {
		this.stgEspecialidad = stgEspecialidad;
	}

	public String getStgConsecutivo() {
		return fillZeros(stgConsecutivo, 3);
	}

	public void setStgConsecutivo(String stgConsecutivo) {
		this.stgConsecutivo = stgConsecutivo;
	}

	public Municipio getMunicipioSelected() {
		return municipioSelected;
	}

	public void setMunicipioSelected(Municipio municipioSelected) {
		this.municipioSelected = municipioSelected;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
