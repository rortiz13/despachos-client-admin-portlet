package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class CircuitosDataModel extends LazyDataModel<Circuito> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(CircuitosDataModel.class);

	private Class<Circuito> entityClass;
	private List<Circuito> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public CircuitosDataModel() {
		super();
	}

	@Override
	public List<Circuito> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {

			rowCount = CircuitoLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO),
					(String) filtros.get(ConstantsUtility.FIELD_CIR_NOMBRE), (Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO),
					(String) filtros.get(ConstantsUtility.FIELD_CIR_JURISDICCION), (String) filtros.get(ConstantsUtility.FIELD_CIR_CODIGO_DANE));
			
			List<Circuito> listCircuitos = CircuitoLocalServiceUtil.findByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO),
					(String) filtros.get(ConstantsUtility.FIELD_CIR_NOMBRE), (Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO),
					(String) filtros.get(ConstantsUtility.FIELD_CIR_JURISDICCION), (String) filtros.get(ConstantsUtility.FIELD_CIR_CODIGO_DANE), first, first+pageSize);
			
			data = new ArrayList<Circuito>();
			
			for (Circuito circuito : listCircuitos) {
				data.add(circuito);
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
				System.out.println("--> Valor getRow " + (Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO));
				rowCount = CircuitoLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_CIRCUITO),
						(String) filtros.get(ConstantsUtility.FIELD_CIR_NOMBRE), (Integer) filtros.get(ConstantsUtility.FIELD_ID_DISTRTO),
						(String) filtros.get(ConstantsUtility.FIELD_CIR_JURISDICCION), (String) filtros.get(ConstantsUtility.FIELD_CIR_CODIGO_DANE));

			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}
	
	
	private Object getId(Circuito t) {
		return t.getCodigo();
	}
	
	@Override
	public Object getRowKey(Circuito object) {
		return getId(object);
	}

	@Override
	public Circuito getRowData(String rowKey) {
		for (Circuito object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<Circuito> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Circuito> entityClass) {
		this.entityClass = entityClass;
	}

	public List<Circuito> getData() {
		return data;
	}

	public void setData(List<Circuito> data) {
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
