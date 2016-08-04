package la.netco.despachos_judiciales.business.datamodels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespachoWrapper;
import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.RelacionUsuarioConsejoLocalServiceUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.utilitys.RelacionUsuarioConsejoWrapper;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class RelacionUsuarioConsejoDataModel extends LazyDataModel<RelacionUsuarioConsejoWrapper> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(RelacionUsuarioConsejoDataModel.class);

	private Class<RelacionUsuarioConsejoWrapper> entityClass;
	private List<RelacionUsuarioConsejoWrapper> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public RelacionUsuarioConsejoDataModel() {
		super();
	}

	@Override
	public List<RelacionUsuarioConsejoWrapper> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {

			if (filtros.get(ConstantsUtility.FIELD_RELSUARIO_CODIGO) != null) {
				DynamicQuery dq = DynamicQueryFactoryUtil.forClass(RelacionUsuarioConsejo.class);
				dq.add(RestrictionsFactoryUtil.eq("idConsejoSec", (Integer) filtros.get(ConstantsUtility.FIELD_RELSUARIO_CODIGO)));
				rowCount = (int) RelacionUsuarioConsejoLocalServiceUtil.dynamicQueryCount(dq);
				dq = DynamicQueryFactoryUtil.forClass(RelacionUsuarioConsejo.class);
				dq.add(RestrictionsFactoryUtil.eq("idConsejoSec", (Integer) filtros.get(ConstantsUtility.FIELD_RELSUARIO_CODIGO)));
				List<RelacionUsuarioConsejo> listRelaciones = RelacionUsuarioConsejoLocalServiceUtil.dynamicQuery(dq);
				data = new ArrayList<RelacionUsuarioConsejoWrapper>();
				for (RelacionUsuarioConsejo relacionUsuarioConsejo : listRelaciones) {
					RelacionUsuarioConsejoWrapper tempRelacion = new RelacionUsuarioConsejoWrapper(relacionUsuarioConsejo);
					ConsejoSeccional consejoSeccional = ConsejoSeccionalLocalServiceUtil
							.getConsejoSeccional(relacionUsuarioConsejo.getIdConsejoSec());
					tempRelacion.setConsejoSeccional(consejoSeccional);
					data.add(tempRelacion);
				}
			} else {
				rowCount = RelacionUsuarioConsejoLocalServiceUtil.getRelacionUsuarioConsejosCount();
				List<RelacionUsuarioConsejo> listRelaciones = RelacionUsuarioConsejoLocalServiceUtil.getRelacionUsuarioConsejos(first, first
						+ pageSize);
				data = new ArrayList<RelacionUsuarioConsejoWrapper>();
				for (RelacionUsuarioConsejo relacionUsuarioConsejo : listRelaciones) {
					RelacionUsuarioConsejoWrapper tempRelacion = new RelacionUsuarioConsejoWrapper(relacionUsuarioConsejo);
					ConsejoSeccional consejoSeccional = ConsejoSeccionalLocalServiceUtil
							.getConsejoSeccional(relacionUsuarioConsejo.getIdConsejoSec());
					tempRelacion.setConsejoSeccional(consejoSeccional);
					data.add(tempRelacion);
				}
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
				rowCount = RelacionUsuarioConsejoLocalServiceUtil.getRelacionUsuarioConsejosCount();
			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(RelacionUsuarioConsejoWrapper t) {
		return t.getIdConsejoSec();
	}

	@Override
	public Object getRowKey(RelacionUsuarioConsejoWrapper object) {
		return getId(object);
	}

	@Override
	public RelacionUsuarioConsejoWrapper getRowData(String rowKey) {
		for (RelacionUsuarioConsejoWrapper object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<RelacionUsuarioConsejoWrapper> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<RelacionUsuarioConsejoWrapper> entityClass) {
		this.entityClass = entityClass;
	}

	public List<RelacionUsuarioConsejoWrapper> getData() {
		return data;
	}

	public void setData(List<RelacionUsuarioConsejoWrapper> data) {
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
