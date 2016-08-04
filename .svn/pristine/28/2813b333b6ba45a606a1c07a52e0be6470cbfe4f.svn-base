package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ConsejosSeccioanlesDataModel extends LazyDataModel<ConsejoSeccional> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(ConsejosSeccioanlesDataModel.class);

	private Class<ConsejoSeccional> entityClass;
	private List<ConsejoSeccional> data;
	private Integer rowCount = null;

	private Order orderBy;

	private Map<String, Object> filtros;

	public ConsejosSeccioanlesDataModel() {
		super();

	}

	@Override
	public List<ConsejoSeccional> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

		try {
			rowCount = ConsejoSeccionalLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
					(String) filtros.get(ConstantsUtility.FIELD_CON_NOMBRE), (String) filtros.get(ConstantsUtility.FIELD_CON_DIRECCION),
					(String) filtros.get(ConstantsUtility.FIELD_CON_TELEFONOS), (String) filtros.get(ConstantsUtility.FIELD_CON_CORREO_ELECTRONICO));

			List<ConsejoSeccional> consejos = (List<ConsejoSeccional>) ConsejoSeccionalLocalServiceUtil.findByFields(
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC), (String) filtros.get(ConstantsUtility.FIELD_CON_NOMBRE),
					(String) filtros.get(ConstantsUtility.FIELD_CON_DIRECCION), (String) filtros.get(ConstantsUtility.FIELD_CON_TELEFONOS),
					(String) filtros.get(ConstantsUtility.FIELD_CON_CORREO_ELECTRONICO), first, first + pageSize);

			data = new ArrayList<ConsejoSeccional>();

			for (ConsejoSeccional consejoSeccional : consejos) {
				data.add(consejoSeccional);
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
				rowCount = ConsejoSeccionalLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
						(String) filtros.get(ConstantsUtility.FIELD_CON_NOMBRE), (String) filtros.get(ConstantsUtility.FIELD_CON_DIRECCION),
						(String) filtros.get(ConstantsUtility.FIELD_CON_TELEFONOS),
						(String) filtros.get(ConstantsUtility.FIELD_CON_CORREO_ELECTRONICO));

			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	@Override
	public Object getRowKey(ConsejoSeccional object) {
		return getId(object);
	}

	@Override
	public ConsejoSeccional getRowData(String rowKey) {
		for (ConsejoSeccional object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	private Object getId(ConsejoSeccional t) {
		return t.getCodigo();
	}

	public Class<ConsejoSeccional> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<ConsejoSeccional> entityClass) {
		this.entityClass = entityClass;
	}

	public List<ConsejoSeccional> getData() {
		return data;
	}

	public void setData(List<ConsejoSeccional> data) {
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
