package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.model.impl.DistritoImpl;

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

public class DistritoFinderImpl extends BasePersistenceImpl<Distrito> implements DistritoFinder  {

	private static Log _log = LogFactoryUtil.getLog(DistritoFinderImpl.class);
	public static final String FINDBYESTADODESPACHO = DistritoFinder.class.getName() + ".findByDespacho";
	public static final String FINDBYFIELDS = DistritoFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = DistritoFinder.class.getName() + ".countByFields";

	@Override
	public List<Distrito> findByDespacho(Integer idConsejo, Integer idDepartamento, Integer idMunicipio) throws SystemException {
		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDBYESTADODESPACHO);
			if (idConsejo == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CODIGO =  ? AND ", "");

			if (idDepartamento == null || idMunicipio == null) {
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? AND MUNICIPIO.MUN_CODIGO = ? AND ", "");
			}

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("DISTRITO", DistritoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idConsejo != null)
				queryPos.add(idConsejo);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idMunicipio != null)
				queryPos.add(idMunicipio);

			return (List<Distrito>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	@Override
	public List<Distrito> findByFields(Integer idDistrito, String nombre, Integer idConsejoSec, String jurisdiccion, String codigoDane,int start, int end)
			throws SystemException {
		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idDistrito == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_NOMBRE  = ? AND ", "");
			if (idConsejoSec == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CONSEJO_SEC  = ? AND ", "");
			if (jurisdiccion == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_JURISDICCION  = ? AND ", "");
			if (codigoDane == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CODIGO_DANE  = ? AND ", "");

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("DISTRITO", DistritoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDistrito != null)
				queryPos.add(idDistrito);
			if (nombre != null)
				queryPos.add(nombre);
			if (idConsejoSec != null)
				queryPos.add(idConsejoSec);
			if (jurisdiccion != null)
				queryPos.add(jurisdiccion);
			if (codigoDane != null)
				queryPos.add(codigoDane);

			return (List<Distrito>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	@Override
	public Integer countByFields(Integer idDistrito, String nombre, Integer idConsejoSec, String jurisdiccion, String codigoDane)
			throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			if (idDistrito == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_NOMBRE  = ? AND ", "");
			if (idConsejoSec == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CONSEJO_SEC  = ? AND ", "");
			if (jurisdiccion == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_JURISDICCION  = ? AND ", "");
			if (codigoDane == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CODIGO_DANE  = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDistrito != null)
				queryPos.add(idDistrito);
			if (nombre != null)
				queryPos.add(nombre);
			if (idConsejoSec != null)
				queryPos.add(idConsejoSec);
			if (jurisdiccion != null)
				queryPos.add(jurisdiccion);
			if (codigoDane != null)
				queryPos.add(codigoDane);
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
