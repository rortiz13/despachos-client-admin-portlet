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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class UsuariosDataModel extends LazyDataModel<User> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(UsuariosDataModel.class);

	private Class<User> entityClass;
	private List<User> data;
	private Integer rowCount = null;

	private Map<String, Object> filtros;

	public UsuariosDataModel() {
		super();
	}

	@Override
	public List<User> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {
		try {

			if (filtros != null && filtros.get(ConstantsUtility.FIELD_USER_LOGIN) != null) {
				DynamicQuery dq = DynamicQueryFactoryUtil.forClass(User.class).add(
						RestrictionsFactoryUtil.like("emailAddress", "%" + (String) filtros.get(ConstantsUtility.FIELD_USER_LOGIN) + "%"));
				rowCount = (int) UserLocalServiceUtil.dynamicQueryCount(dq);
				DynamicQuery dq2 = DynamicQueryFactoryUtil.forClass(User.class).add(
						RestrictionsFactoryUtil.like("emailAddress", "%" + (String) filtros.get(ConstantsUtility.FIELD_USER_LOGIN) + "%"));
				data = UserLocalServiceUtil.dynamicQuery(dq2, first, first + pageSize);
			} else {
				rowCount = UserLocalServiceUtil.getUsersCount();
				data = UserLocalServiceUtil.getUsers(first, first + pageSize);
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
				if (filtros.get(ConstantsUtility.FIELD_USER_LOGIN) != null) {
					DynamicQuery dq = DynamicQueryFactoryUtil.forClass(User.class).add(
							PropertyFactoryUtil.forName("login").like(filtros.get(ConstantsUtility.FIELD_USER_LOGIN)));
					rowCount = (int) UserLocalServiceUtil.dynamicQueryCount(dq);
				} else {
					rowCount = UserLocalServiceUtil.getUsersCount();
				}

			} else {
				count = rowCount.intValue();
			}
		} catch (Exception e) {
			_log.error("Error getRowCount ", e);
		}
		return count;
	}

	private Object getId(User t) {
		return t.getUserId();
	}

	@Override
	public Object getRowKey(User object) {
		return getId(object);
	}

	@Override
	public User getRowData(String rowKey) {
		for (User object : data) {
			if (getId(object).equals(rowKey))
				return object;
		}
		return null;
	}

	public Class<User> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<User> entityClass) {
		this.entityClass = entityClass;
	}

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
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
