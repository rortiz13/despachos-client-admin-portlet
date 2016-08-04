package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.impl.EntidadImpl;

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

public class EntidadFinderImpl extends BasePersistenceImpl<Entidad> implements EntidadFinder {

	private static Log _log = LogFactoryUtil.getLog(EntidadFinderImpl.class);

	public static final String FINDBYESTADODESPACHO = EntidadFinder.class.getName() + ".findByEstadoDescpacho";
	public static final String FINDBYFIELDS = EntidadFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = EntidadFinder.class.getName() + ".countByFields";

	@Override
	public List<Entidad> findByEstadoDescpacho(Integer idDepartamento, Integer idMunicipio) throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(FINDBYESTADODESPACHO);

			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CODIGO = ? and ", "");

			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? and ", "");

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("ENTIDAD", EntidadImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);

			if (idDepartamento != null)
				queryPos.add(idMunicipio);

			if (idDepartamento != null)
				queryPos.add(idDepartamento);

			return (List<Entidad>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			_log.error("Error findByEstadoDescpacho", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	@Override
	public List<Entidad> findByFields(Integer idEntidad, String nombre, String mascara, String jurisdiccion, int start, int end)
			throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idEntidad == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_NOMBRE = ? AND ", "");
			if (mascara == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_MASCARA = ? AND ", "");
			if (jurisdiccion == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_JURISDICCION = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("ENTIDAD", EntidadImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idEntidad != null)
				queryPos.add(idEntidad);
			if (nombre != null)
				queryPos.add(nombre);
			if (mascara != null)
				queryPos.add(mascara);
			if (jurisdiccion != null)
				queryPos.add(jurisdiccion);
			return (List<Entidad>) QueryUtil.list(query, getDialect(), start, end);

		} catch (Exception e) {
			_log.error("Error findByEstadoDescpacho", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	@Override
	public Integer countByFields(Integer idEntidad, String nombre, String mascara, String jurisdiccion) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(COUNTBYFIELDS);

			if (idEntidad == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_NOMBRE = ? AND ", "");
			if (mascara == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_MASCARA = ? AND ", "");
			if (jurisdiccion == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_JURISDICCION = ? AND ", "");

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idEntidad != null)
				queryPos.add(idEntidad);
			if (nombre != null)
				queryPos.add(nombre);
			if (mascara != null)
				queryPos.add(mascara);
			if (jurisdiccion != null)
				queryPos.add(jurisdiccion);

			Iterator<Long> itr = query.iterate();
			System.out.println(" count ");
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
