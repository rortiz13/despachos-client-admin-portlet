package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class DepartamentosDataModel extends LazyDataModel<Departamento> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(DepartamentosDataModel.class);

	private Class<Departamento> entityClass;
	private List<Departamento> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public DepartamentosDataModel() {
		super();
	}

	@Override
	public List<Departamento> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {

			rowCount = DepartamentoLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO),
					(String) filtros.get(ConstantsUtility.FIELD_DEP_NOMBRE));
			List<Departamento> listDepartamentos = DepartamentoLocalServiceUtil.findByFields(
					(Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO), (String) filtros.get(ConstantsUtility.FIELD_DEP_NOMBRE), first,
					first + pageSize);
			data = new ArrayList<Departamento>();

			for (Departamento departamento : listDepartamentos) {
				data.add(departamento);
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
				System.out.println("--> Valor load " + (Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO));
				rowCount = DepartamentoLocalServiceUtil.countByFields((Integer) filtros.get(ConstantsUtility.FIELD_ID_DEPARTAMENTO),
						(String) filtros.get(ConstantsUtility.FIELD_DEP_NOMBRE));

			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(Departamento t) {
		return t.getCodigo();
	}

	@Override
	public Object getRowKey(Departamento object) {
		return getId(object);
	}

	@Override
	public Departamento getRowData(String rowKey) {
		for (Departamento object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<Departamento> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<Departamento> entityClass) {
		this.entityClass = entityClass;
	}

	public List<Departamento> getData() {
		return data;
	}

	public void setData(List<Departamento> data) {
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
