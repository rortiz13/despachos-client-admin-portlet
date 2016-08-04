package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DistritosDataModel extends LazyDataModel<Distrito> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(DistritosDataModel.class);

	private Class<Distrito> entityClass;
	private List<Distrito> data;
	private Integer rowCount = null;

	private Order orderBy;

	private Map<String, Object> filtros;

	public DistritosDataModel() {
		super();

	}

	@Override
	public List<Distrito> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

		try {
			rowCount = DistritoLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO),
					(String) filtros.get(ConstantsUtility.FIELD_DIS_NOMBRE), (Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC),
					(String) filtros.get(ConstantsUtility.FIELD_DIS_JURISDICCION), (String) filtros.get(ConstantsUtility.FIELD_DIS_CODIGO_DANE));

			List<Distrito> distritos = (List<Distrito>) DistritoLocalServiceUtil.findByFields(
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO), (String) filtros.get(ConstantsUtility.FIELD_DIS_NOMBRE),
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_CONSEJOSEC), (String) filtros.get(ConstantsUtility.FIELD_DIS_JURISDICCION),
					(String) filtros.get(ConstantsUtility.FIELD_DIS_CODIGO_DANE), first, first + pageSize);

			data = new ArrayList<Distrito>();
			for (Distrito distrito : distritos) {
				data.add(distrito);
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
				rowCount = DistritoLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO),
						(String) filtros.get(ConstantsUtility.FIELD_DIS_NOMBRE), (Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO),
						(String) filtros.get(ConstantsUtility.FIELD_DIS_JURISDICCION), (String) filtros.get(ConstantsUtility.FIELD_DIS_CODIGO_DANE));
			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount DistritosDataModel ", e);
		}
		return count;
	}

	@Override
	public Object getRowKey(Distrito object) {
		return getId(object);
	}

	@Override
	public Distrito getRowData(String rowKey) {
		for (Distrito object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	private Object getId(Distrito t) {
		return t.getCodigo();
	}

	public Class<Distrito> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Distrito> entityClass) {
		this.entityClass = entityClass;
	}

	public List<Distrito> getData() {
		return data;
	}

	public void setData(List<Distrito> data) {
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
