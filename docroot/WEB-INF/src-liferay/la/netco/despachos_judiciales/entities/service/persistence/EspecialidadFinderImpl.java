package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.impl.EspecialidadImpl;

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

public class EspecialidadFinderImpl extends BasePersistenceImpl<Especialidad> implements EspecialidadFinder {

	private static Log _log = LogFactoryUtil.getLog(EspecialidadFinderImpl.class);

	public static final String FINDBYESTADODESPACHO = EspecialidadFinder.class.getName() + ".findByEstadoDescpacho";
	public static final String FINDBYFIELDS = EspecialidadFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = EspecialidadFinder.class.getName() + ".countByFields";

	public List<Especialidad> findByEstadoDescpacho(Integer idDepartamento, Integer idMunicipio, Integer idEntidad) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(FINDBYESTADODESPACHO);
			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CODIGO = ? and ", "");
			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? and ", "");
			if (idEntidad == null)
				sql = StringUtil.replace(sql, "ENTIDAD.ENT_CODIGO = ? and ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("ESPECIALIDAD", EspecialidadImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idMunicipio);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idEntidad != null)
				queryPos.add(idEntidad);
			return (List<Especialidad>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			_log.error("Error findByEstadoDescpacho", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<Especialidad> findByFields(Integer idEspecialidad, String nombre, int start, int end) throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idEspecialidad == null)
				sql = StringUtil.replace(sql, "ESPECIALIDAD.ESP_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "ESPECIALIDAD.ESP_NOMBRE = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("ESPECIALIDAD", EspecialidadImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idEspecialidad != null)
				queryPos.add(idEspecialidad);
			if (nombre != null)
				queryPos.add(nombre);
			return (List<Especialidad>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByEstadoDescpacho", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public Integer countByFields(Integer idEspecialidad, String nombre) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			if (idEspecialidad == null)
				sql = StringUtil.replace(sql, "ESPECIALIDAD.ESP_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "ESPECIALIDAD.ESP_NOMBRE = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idEspecialidad != null)
				queryPos.add(idEspecialidad);
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
