package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Trabajador;
import la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class FuncionariosDataModel extends LazyDataModel<Trabajador> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(FuncionariosDataModel.class);

	private Class<Trabajador> entityClass;
	private List<Trabajador> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public FuncionariosDataModel() {
		super();
	}

	@Override
	public List<Trabajador> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {
			rowCount = TrabajadorLocalServiceUtil.countByFields((String) filtros.get(ConstantsUtility.FIELD_TRA_CEDULA),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_NOMBRES), (String) filtros.get(ConstantsUtility.FIELD_TRA_APELLIDOS),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_ESPECIALIDAD),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_CORREO_ELECTRONICO),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_TELEFONOS_OFICINA), (Integer) filtros.get(ConstantsUtility.FIELD_TRA_CARRERA),
					(Integer) filtros.get(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR), (Integer) filtros.get(ConstantsUtility.FIELD_TRA_CONTRATO),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_SEXO), (Date) filtros.get(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR));

			List<Trabajador> listTrabajadores = TrabajadorLocalServiceUtil.findByFields((String) filtros.get(ConstantsUtility.FIELD_TRA_CEDULA),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_NOMBRES), (String) filtros.get(ConstantsUtility.FIELD_TRA_APELLIDOS),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_ESPECIALIDAD),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_CORREO_ELECTRONICO),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_TELEFONOS_OFICINA), (Integer) filtros.get(ConstantsUtility.FIELD_TRA_CARRERA),
					(Integer) filtros.get(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR), (Integer) filtros.get(ConstantsUtility.FIELD_TRA_CONTRATO),
					(String) filtros.get(ConstantsUtility.FIELD_TRA_SEXO), (Date) filtros.get(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR), first,
					first + pageSize);

			data = new ArrayList<Trabajador>();

			for (Trabajador Trabajador : listTrabajadores) {
				data.add(Trabajador);
			}

		} catch (Exception e) {
			_log.error("Error load Datamodel", e);
		}
		setPageSize(pageSize);
		return data;
	}

	@Override
	public int getRowCount() {
		int count = 0;
		try {
			if (rowCount == null) {
				rowCount = TrabajadorLocalServiceUtil.countByFields((String) filtros.get(ConstantsUtility.FIELD_TRA_CEDULA),
						(String) filtros.get(ConstantsUtility.FIELD_TRA_NOMBRES), (String) filtros.get(ConstantsUtility.FIELD_TRA_APELLIDOS),
						(String) filtros.get(ConstantsUtility.FIELD_TRA_ESPECIALIDAD),
						(String) filtros.get(ConstantsUtility.FIELD_TRA_CORREO_ELECTRONICO),
						(String) filtros.get(ConstantsUtility.FIELD_TRA_TELEFONOS_OFICINA), (Integer) filtros.get(ConstantsUtility.FIELD_TRA_CARRERA),
						(Integer) filtros.get(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR), (Integer) filtros.get(ConstantsUtility.FIELD_TRA_CONTRATO),
						(String) filtros.get(ConstantsUtility.FIELD_TRA_SEXO), (Date) filtros.get(ConstantsUtility.FIELD_TRA_TIPO_TRABAJADOR));
			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(Trabajador t) {
		return t.getCedula();
	}

	@Override
	public Object getRowKey(Trabajador object) {
		return getId(object);
	}

	@Override
	public Trabajador getRowData(String rowKey) {
		for (Trabajador object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<Trabajador> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Trabajador> entityClass) {
		this.entityClass = entityClass;
	}

	public List<Trabajador> getData() {
		return data;
	}

	public void setData(List<Trabajador> data) {
		this.data = data;
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
