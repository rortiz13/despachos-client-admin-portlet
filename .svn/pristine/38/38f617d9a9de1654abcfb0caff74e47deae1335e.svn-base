package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.model.impl.MunicipioImpl;

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

@SuppressWarnings("unchecked")
public class MunicipioFinderImpl extends BasePersistenceImpl<Municipio> implements MunicipioFinder {

	private static Log _log = LogFactoryUtil.getLog(MunicipioFinderImpl.class);
	
	public static final String FINDBYESTADODESPACHO = MunicipioFinder.class.getName() + ".findByEstadoDescpacho";
	public static final String FINDBYCOMPOSITEKEY = MunicipioFinder.class.getName() + ".findByCompositeKey";
	public static final String FINDBYFIELDS = MunicipioFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = MunicipioFinder.class.getName() + ".countByFields";

	public List<Municipio> findByEstadoDescpacho(Integer idDepartamento) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(FINDBYESTADODESPACHO);
			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DEPARTAMENTO.DEP_CODIGO = ? and ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("MUNICIPIO", MunicipioImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			return (List<Municipio>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<Municipio> findByCompositeKey(Integer idDepartamento, Integer idMunicipio) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(FINDBYCOMPOSITEKEY);
			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? AND ", "");
			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CODIGO = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("MUNICIPIO", MunicipioImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idMunicipio != null)
				queryPos.add(idMunicipio);
			return (List<Municipio>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<Municipio> findByFields(Integer idDepartamento, Integer idMunicipio, String nombre, String indicativo, Integer idCircuito,
			Integer idCircuitoAdministrativo, Integer idConsejoSeccional, Integer idCircuitoDisciplinario, int start, int end) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? AND ", "");
			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_NOMBRE = ? AND ", "");
			if (indicativo == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_INDICATIVO = ? AND ", "");
			if (idCircuito == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CIRCUITO = ? AND ", "");
			if (idCircuitoAdministrativo == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CIRCUITO_ADM = ? AND ", "");
			if (idConsejoSeccional == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CONSEJO_SEC_DIS = ? AND ", "");
			if (idCircuitoDisciplinario == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CIRCUITO_DIS = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("MUNICIPIO", MunicipioImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idMunicipio != null)
				queryPos.add(idMunicipio);
			if (nombre != null)
				queryPos.add(nombre);
			if (indicativo != null)
				queryPos.add(indicativo);
			if (idCircuito != null)
				queryPos.add(idCircuito);
			if (idCircuitoAdministrativo != null)
				queryPos.add(idCircuitoAdministrativo);
			if (idConsejoSeccional != null)
				queryPos.add(idConsejoSeccional);
			if (idCircuitoDisciplinario != null)
				queryPos.add(idCircuitoDisciplinario);
			return (List<Municipio>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public Integer countByFields(Integer idDepartamento, Integer idMunicipio, String nombre, String indicativo, Integer idCircuito,
			Integer idCircuitoAdministrativo, Integer idConsejoSeccional, Integer idCircuitoDisciplinario) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_DEPARTAMENTO = ? AND ", "");
			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CODIGO = ? AND ", "");
			if (nombre == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_NOMBRE = ? AND ", "");
			if (indicativo == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_INDICATIVO = ? AND ", "");
			if (idCircuito == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CIRCUITO = ? AND ", "");
			if (idCircuitoAdministrativo == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CIRCUITO_ADM = ? AND ", "");
			if (idConsejoSeccional == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CONSEJO_SEC_DIS = ? AND ", "");
			if (idCircuitoDisciplinario == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CIRCUITO_DIS = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDepartamento != null)
				queryPos.add(idDepartamento);
			if (idMunicipio != null)
				queryPos.add(idMunicipio);
			if (nombre != null)
				queryPos.add(nombre);
			if (indicativo != null)
				queryPos.add(indicativo);
			if (idCircuito != null)
				queryPos.add(idCircuito);
			if (idCircuitoAdministrativo != null)
				queryPos.add(idCircuitoAdministrativo);
			if (idConsejoSeccional != null)
				queryPos.add(idConsejoSeccional);
			if (idCircuitoDisciplinario != null)
				queryPos.add(idCircuitoDisciplinario);
			Iterator<Long> itr = query.iterate();
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
