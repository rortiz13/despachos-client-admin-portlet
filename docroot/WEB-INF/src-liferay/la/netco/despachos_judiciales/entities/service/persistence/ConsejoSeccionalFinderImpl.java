package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.impl.ConsejoSeccionalImpl;

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

public class ConsejoSeccionalFinderImpl extends BasePersistenceImpl<ConsejoSeccional> implements ConsejoSeccionalFinder {

	private static Log _log = LogFactoryUtil.getLog(ConsejoSeccionalFinderImpl.class);
	
	public static final String FINDBYESTADODESPACHO = ConsejoSeccionalFinder.class.getName() + ".findByDespacho";
	public static final String FINDBYFIELDS = ConsejoSeccionalFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = ConsejoSeccionalFinder.class.getName() + ".countByFields";
	
	@Override
	public List<ConsejoSeccional> findByDespacho(Integer idDepartamento, Integer idMunicipio) throws SystemException {
		Session session = null;

		try {
			String sql = CustomSQLUtil.get(FINDBYESTADODESPACHO);
			if (idDepartamento == null || idMunicipio == null) {
				sql = StringUtil.replace(sql, "WHERE MUNICIPIO.MUN_DEPARTAMENTO = ? AND MUNICIPIO.MUN_CODIGO = ?", "");
			}
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("CONSEJO", ConsejoSeccionalImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idMunicipio != null)
				queryPos.add(idMunicipio);
			return (List<ConsejoSeccional>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}
	
	
	@Override
	public List<ConsejoSeccional> findByFields(Integer idConsejoSec, String nombre, String direccion, String telefonos, String correo_electronico,int start, int end)
			throws SystemException {
		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idConsejoSec == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_NOMBRE = ? AND ", "");
			if (direccion == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_DIRECCION = ? AND ", "");
			if (telefonos == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_TELEFONOS = ? AND ", "");
			if (correo_electronico == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CORREO_ELECTRONICO = ? AND ", "");

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("CONSEJO", ConsejoSeccionalImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idConsejoSec != null)
				queryPos.add(idConsejoSec);
			if (nombre != null)
				queryPos.add(nombre);
			if (direccion != null)
				queryPos.add(direccion);
			if (telefonos != null)
				queryPos.add(telefonos);
			if (correo_electronico != null)
				queryPos.add(correo_electronico);

			return (List<ConsejoSeccional>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	@Override
	public Integer countByFields(Integer idConsejoSec, String nombre, String direccion, String telefonos, String correo_electronico)
			throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			if (idConsejoSec == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_NOMBRE = ? AND ", "");
			if (direccion == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_DIRECCION = ? AND ", "");
			if (telefonos == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_TELEFONOS = ? AND ", "");
			if (correo_electronico == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CORREO_ELECTRONICO = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idConsejoSec != null)
				queryPos.add(idConsejoSec);
			if (nombre != null)
				queryPos.add(nombre);
			if (direccion != null)
				queryPos.add(direccion);
			if (telefonos != null)
				queryPos.add(telefonos);
			if (correo_electronico != null)
				queryPos.add(correo_electronico);

			Iterator<Long> itr = query.iterate();
			System.out.println(" count ");
			if (itr.hasNext()) {
				Long count = itr.next();;
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
