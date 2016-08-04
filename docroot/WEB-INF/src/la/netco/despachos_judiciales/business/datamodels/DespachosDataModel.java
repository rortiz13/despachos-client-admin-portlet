package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.model.Trabajador;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.utilitys.DespachoWrapper;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DespachosDataModel extends LazyDataModel<DespachoWrapper> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Log _log = LogFactoryUtil.getLog(DespachosDataModel.class);

	private Class<DespachoWrapper> entityClass;
	private List<DespachoWrapper> data;
	private Integer rowCount = null;

	private Order orderBy;

	private Map<String, Object> filtros;

	public DespachosDataModel() {
		super();

	}

	@Override
	public List<DespachoWrapper> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

		try {
			rowCount = DespachoLocalServiceUtil.countbyFields((Integer)filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),(String) filtros.get(ConstantsUtility.FIELD_ID_DESPACHO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_MUNICIPIO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_ENTIDAD), (Integer) filtros.get(ConstantsUtility.FIELD_ID_ESPECIALIDAD),
					(String) filtros.get(ConstantsUtility.FIELD_DES_CONSECUTIVO), (String) filtros.get(ConstantsUtility.FIELD_DES_NOMBRE),
					(String) filtros.get(ConstantsUtility.FIELD_DES_DIRECCION), (String) filtros.get(ConstantsUtility.FIELD_DES_TELEFONOS),
					(String) filtros.get(ConstantsUtility.FIELD_DES_CORREO_ELECTRONICO), (String) filtros.get(ConstantsUtility.FIELD_DES_ACUERDO),
					(Integer) filtros.get(ConstantsUtility.FIELD_DES_ESTADO), (String) filtros.get(ConstantsUtility.FIELD_DES_FAX),
					(String) filtros.get(ConstantsUtility.FIELD_DES_HORARIO_ATENCION),
					(Date) filtros.get(ConstantsUtility.FIELD_DES_FECHA_ACT + "_INI"),
					(Date) filtros.get(ConstantsUtility.FIELD_DES_FECHA_ACT + "_FIN"));

			List<Despacho> despachos = (List<Despacho>) DespachoLocalServiceUtil.findByFields( (Integer)filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
					(String) filtros.get(ConstantsUtility.FIELD_ID_DESPACHO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_MUNICIPIO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_ENTIDAD),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_ESPECIALIDAD), (String) filtros.get(ConstantsUtility.FIELD_DES_CONSECUTIVO),
					(String) filtros.get(ConstantsUtility.FIELD_DES_NOMBRE), (String) filtros.get(ConstantsUtility.FIELD_DES_DIRECCION),
					(String) filtros.get(ConstantsUtility.FIELD_DES_TELEFONOS), (String) filtros.get(ConstantsUtility.FIELD_DES_CORREO_ELECTRONICO),
					(String) filtros.get(ConstantsUtility.FIELD_DES_ACUERDO), (Integer) filtros.get(ConstantsUtility.FIELD_DES_ESTADO),
					(String) filtros.get(ConstantsUtility.FIELD_DES_FAX), (String) filtros.get(ConstantsUtility.FIELD_DES_HORARIO_ATENCION),
					(Date) filtros.get(ConstantsUtility.FIELD_DES_FECHA_ACT + "_INI"),
					(Date) filtros.get(ConstantsUtility.FIELD_DES_FECHA_ACT + "_FIN"), first, pageSize + first);

			data = new ArrayList<DespachoWrapper>();

			for (Despacho despacho : despachos) {
				Entidad entidad = EntidadLocalServiceUtil.getEntidad(despacho.getIdEntidad());
				Especialidad especialiadad = EspecialidadLocalServiceUtil.getEspecialidad(despacho.getIdEspecialidad());
				Circuito circuito = null;
				Distrito distrito = null;
				Municipio municipio = null;
				List<Municipio> municipios = MunicipioLocalServiceUtil.findByCompositeKey(despacho.getIdDepartamento(), despacho.getIdMunicipio());
				if (municipios != null && !municipios.isEmpty()) {
					municipio = municipios.get(0);
					circuito = CircuitoLocalServiceUtil.getCircuito(municipios.get(0).getIdCircuito());
					distrito = DistritoLocalServiceUtil.getDistrito(circuito.getIdDistrito());
				}

				Departamento departamento = DepartamentoLocalServiceUtil.getDepartamento(despacho.getIdDepartamento());
				Trabajador trabajador = null;
				List<Trabajador> trabajadores = TrabajadorLocalServiceUtil.findByDespachoRelacion(despacho.getCodigo());
				if (trabajadores != null && !trabajadores.isEmpty())
					trabajador = trabajadores.get(0);
				DespachoWrapper despachoWrapper = new DespachoWrapper(despacho, municipio, departamento, entidad, especialiadad, circuito, distrito,
						trabajador);
				data.add(despachoWrapper);
			}

		} catch (Exception e) {
			_log.error("Error load DespachosDataModel ", e);
		}

		setPageSize(pageSize);
		return data;
	}

	@Override
	public int getRowCount() {
		int count = 0;
		try {
			if (rowCount == null) {
				rowCount = DespachoLocalServiceUtil.countbyFields((Integer)filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),(String) filtros.get(ConstantsUtility.FIELD_ID_DESPACHO),
						(Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO), (Integer) filtros.get(ConstantsUtility.FIELD_ID_MUNICIPIO),
						(Integer) filtros.get(ConstantsUtility.FIELD_ID_ENTIDAD), (Integer) filtros.get(ConstantsUtility.FIELD_ID_ESPECIALIDAD),
						(String) filtros.get(ConstantsUtility.FIELD_DES_CONSECUTIVO), (String) filtros.get(ConstantsUtility.FIELD_DES_NOMBRE),
						(String) filtros.get(ConstantsUtility.FIELD_DES_DIRECCION), (String) filtros.get(ConstantsUtility.FIELD_DES_TELEFONOS),
						(String) filtros.get(ConstantsUtility.FIELD_DES_CORREO_ELECTRONICO),
						(String) filtros.get(ConstantsUtility.FIELD_DES_ACUERDO), (Integer) filtros.get(ConstantsUtility.FIELD_DES_ESTADO),
						(String) filtros.get(ConstantsUtility.FIELD_DES_FAX), (String) filtros.get(ConstantsUtility.FIELD_DES_HORARIO_ATENCION),
						(Date) filtros.get(ConstantsUtility.FIELD_DES_FECHA_ACT + "_INI"),
						(Date) filtros.get(ConstantsUtility.FIELD_DES_FECHA_ACT + "_FIN"));

				count = rowCount.intValue();
			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount DespachosDataModel ", e);
		}
		return count;
	}

	@Override
	public Object getRowKey(DespachoWrapper object) {
		return getId(object);
	}

	@Override
	public DespachoWrapper getRowData(String rowKey) {
		for (DespachoWrapper object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	private Object getId(DespachoWrapper t) {
		return t.getCodigo();
	}

	public Class<DespachoWrapper> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<DespachoWrapper> entityClass) {
		this.entityClass = entityClass;
	}

	public List<DespachoWrapper> getData() {
		return data;
	}

	public void setData(List<DespachoWrapper> data) {
		this.data = data;
	}

	public Order getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Order orderBy) {
		this.orderBy = orderBy;
	}

	public Map<String, Object> getFiltros() {
		return filtros;
	}

	public void setFiltros(Map<String, Object> filtros) {
		this.filtros = filtros;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

}
