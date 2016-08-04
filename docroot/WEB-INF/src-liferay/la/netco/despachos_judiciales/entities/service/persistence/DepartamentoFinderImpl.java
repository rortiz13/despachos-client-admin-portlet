package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.model.impl.DepartamentoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class DepartamentoFinderImpl extends BasePersistenceImpl<Departamento> implements DepartamentoFinder {

	private static Log _log = LogFactoryUtil.getLog(DepartamentoFinderImpl.class);
	
	public static final String FINDBYFIELDS = DepartamentoFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = DepartamentoFinder.class.getName() + ".countByFields";

	@Override
	public List<Departamento> findByFields(Integer idDepartamento, String nombre, int start, int end) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DEPARTAMENTO.DEP_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "DEPARTAMENTO.DEP_NOMBRE = ? AND ", "");	
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("DEPARTAMENTO", DepartamentoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (nombre != null)
				queryPos.add(nombre);
			return (List<Departamento>) QueryUtil.list(query, getDialect(), start, end);

		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	@Override
	public Integer countByFields(Integer idDepartamento, String nombre) throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(COUNTBYFIELDS);

			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DEPARTAMENTO.DEP_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "DEPARTAMENTO.DEP_NOMBRE = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);

			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (nombre != null)
				queryPos.add(nombre);
			
			Iterator<Long> itr = query.iterate();
			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			_log.error("Error countByFields", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
}
