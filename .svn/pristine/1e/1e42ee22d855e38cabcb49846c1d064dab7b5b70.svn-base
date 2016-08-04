package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class EspecialidadDataModel extends LazyDataModel<Especialidad> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(EspecialidadDataModel.class);

	private Class<Especialidad> entityClass;
	private List<Especialidad> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public EspecialidadDataModel() {
		super();
	}

	@Override
	public List<Especialidad> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {
			rowCount = EspecialidadLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_ESPECIALIDAD),
					(String) filtros.get(ConstantsUtility.FIELD_ESP_NOMBRE));
			List<Especialidad> listEspecialidad = EspecialidadLocalServiceUtil.findByFields(
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_ESPECIALIDAD), (String) filtros.get(ConstantsUtility.FIELD_ESP_NOMBRE), first,
					first + pageSize);
			data = new ArrayList<Especialidad>();
			for (Especialidad especialidad : listEspecialidad) {
				data.add(especialidad);
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
				rowCount = EspecialidadLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_ESPECIALIDAD),
						(String) filtros.get(ConstantsUtility.FIELD_ESP_NOMBRE));
			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(Especialidad t) {
		return t.getCodigo();
	}

	@Override
	public Object getRowKey(Especialidad object) {
		return getId(object);
	}

	@Override
	public Especialidad getRowData(String rowKey) {
		for (Especialidad object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<Especialidad> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Especialidad> entityClass) {
		this.entityClass = entityClass;
	}

	public List<Especialidad> getData() {
		return data;
	}

	public void setData(List<Especialidad> data) {
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
