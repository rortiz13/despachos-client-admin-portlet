package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.impl.CircuitoImpl;

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

public class CircuitoFinderImpl extends BasePersistenceImpl<Circuito> implements CircuitoFinder {

	private static Log _log = LogFactoryUtil.getLog(CircuitoFinderImpl.class);

	public static final String FINDBYESTADODESPACHO = CircuitoFinder.class.getName() + ".findByDespacho";
	public static final String FINDBYFIELDS = CircuitoFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = CircuitoFinder.class.getName() + ".countByFields";

	@Override
	public List<Circuito> findByDespacho(Integer idConsejo, Integer idDistrito, Integer idDepartamento, Integer idMunicipio) throws SystemException {
		Session session = null;

		try {
			String sql = CustomSQLUtil.get(FINDBYESTADODESPACHO);
			if (idConsejo == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CODIGO = ? AND ", "");
			if (idDistrito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_DISTRITO =  ?  AND ", "");
			if (idDepartamento == null || idMunicipio == null) {
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? AND MUNICIPIO.MUN_CODIGO = ? AND ", "");
			}

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("CIRCUITO", CircuitoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idConsejo != null)
				queryPos.add(idConsejo);
			if (idDistrito != null)
				queryPos.add(idDistrito);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idMunicipio != null)
				queryPos.add(idMunicipio);
			return (List<Circuito>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	public List<Circuito> findByFields(Integer idCircuito, String nombre, Integer idDistrito, String jurisdiccion, String codigoDane, int start,
			int end) throws SystemException {
		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);

			System.out.println("--> Sql Base Circuito" + sql);

			if (idCircuito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_NOMBRE = ? AND ", "");
			if (idDistrito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_DISTRITO = ? AND ", "");
			if (jurisdiccion == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_JURISDICCION = ? AND ", "");
			if (codigoDane == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_CODIGO_DANE = ? AND ", "");

			session = openSession();

			System.out.println("--> Sql Editada Circuito" + sql);

			SQLQuery query = session.createSQLQuery(sql);

			query.addEntity("CIRCUITO", CircuitoImpl.class);

			QueryPos queryPos = QueryPos.getInstance(query);

			if (idCircuito != null)
				queryPos.add(idCircuito);
			if (nombre != null)
				queryPos.add(nombre);
			if (idDistrito != null)
				queryPos.add(idDistrito);
			if (jurisdiccion != null)
				queryPos.add(jurisdiccion);
			if (codigoDane != null)
				queryPos.add(codigoDane);

			return (List<Circuito>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	public Integer countByFields(Integer idCircuito, String nombre, Integer idDistrito, String jurisdiccion, String codigoDane)
			throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(COUNTBYFIELDS);

			System.out.println("--> Sql Base" + sql);

			if (idCircuito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_NOMBRE = ? AND ", "");
			if (idDistrito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_DISTRITO = ? AND ", "");
			if (jurisdiccion == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_JURISDICCION = ? AND ", "");
			if (codigoDane == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_CODIGO_DANE = ? AND ", "");

			session = openSession();

			System.out.println("--> Sql Editada" + sql);

			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos queryPos = QueryPos.getInstance(query);

			if (idCircuito != null)
				queryPos.add(idCircuito);
			if (nombre != null)
				queryPos.add(nombre);
			if (idDistrito != null)
				queryPos.add(idDistrito);
			if (jurisdiccion != null)
				queryPos.add(jurisdiccion);
			if (codigoDane != null)
				queryPos.add(codigoDane);

			Iterator<Long> itr = query.iterate();
			System.out.println(" count ");
			if (itr.hasNext()) {
				Long count = itr.next();
				System.out.println(" count " + count);
				if (count != null) {
					System.out.println(" return " + count.intValue());
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
