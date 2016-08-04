package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class EntidadesDataModel extends LazyDataModel<Entidad> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(EntidadesDataModel.class);

	private Class<Entidad> entityClass;
	private List<Entidad> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public EntidadesDataModel() {
		super();
	}

	@Override
	public List<Entidad> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {
			rowCount = EntidadLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_ENTIDAD),
					(String) filtros.get(ConstantsUtility.FIELD_ENT_NOMBRE), (String) filtros.get(ConstantsUtility.FIELD_ENT_MASCARA),
					(String) filtros.get(ConstantsUtility.FIELD_ENT_JURISDICCION));

			List<Entidad> listEntidades = EntidadLocalServiceUtil.findByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_ENTIDAD),
					(String) filtros.get(ConstantsUtility.FIELD_ENT_NOMBRE), (String) filtros.get(ConstantsUtility.FIELD_ENT_MASCARA),
					(String) filtros.get(ConstantsUtility.FIELD_ENT_JURISDICCION), first, first + pageSize);

			data = new ArrayList<Entidad>();

			for (Entidad entidad : listEntidades) {
				data.add(entidad);
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
				rowCount = EntidadLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_ENTIDAD),
						(String) filtros.get(ConstantsUtility.FIELD_ENT_NOMBRE), (String) filtros.get(ConstantsUtility.FIELD_ENT_MASCARA),
						(String) filtros.get(ConstantsUtility.FIELD_ENT_JURISDICCION));
			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(Entidad t) {
		return t.getCodigo();
	}

	@Override
	public Object getRowKey(Entidad object) {
		return getId(object);
	}

	@Override
	public Entidad getRowData(String rowKey) {
		for (Entidad object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<Entidad> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Entidad> entityClass) {
		this.entityClass = entityClass;
	}

	public List<Entidad> getData() {
		return data;
	}

	public void setData(List<Entidad> data) {
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
