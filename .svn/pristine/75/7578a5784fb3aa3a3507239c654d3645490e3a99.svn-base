package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;
import la.netco.despachos_judiciales.entities.model.impl.ConsejoSeccionalImpl;
import la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoImpl;

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

public class RelacionTrabajadorDespachoFinderImpl extends BasePersistenceImpl<RelacionTrabajadorDespacho> implements RelacionTrabajadorDespachoFinder {

	private static Log _log = LogFactoryUtil.getLog(RelacionTrabajadorDespachoFinderImpl.class);

	public static final String FINDBYFIELDS = RelacionTrabajadorDespachoFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = RelacionTrabajadorDespachoFinder.class.getName() + ".countByFields";
	public static final String UNIQUERESULT = RelacionTrabajadorDespachoFinder.class.getName() + ".uniqueResult";

	@Override
	public List<RelacionTrabajadorDespacho> findByFields(String idDespacho, String idTrabajador, String cargo, String acuerdo, String activo,
			String fecha_ini, String fecha_fin, String secuencia, int start, int end) throws SystemException {
		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idDespacho == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_DESPACHO = ? AND ", "");
			if (idTrabajador == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_TRABAJADOR = ? AND ", "");
			if (cargo == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_CARGO = ? AND ", "");
			if (acuerdo == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_ACUERDO = ? AND ", "");
			if (activo == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_ACTIVO = ? AND ", "");
			if (fecha_ini == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_FECHA_INI = ? AND ", "");
			if (fecha_fin == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_FECHA_FIN = ? AND ", "");
			if (secuencia == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_SECUENCIA = ? AND ", "");

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("RELACION_TRA_DES", RelacionTrabajadorDespachoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDespacho != null)
				queryPos.add(idDespacho);
			if (idTrabajador != null)
				queryPos.add(idTrabajador);
			if (cargo != null)
				queryPos.add(cargo);
			if (acuerdo != null)
				queryPos.add(acuerdo);
			if (activo != null)
				queryPos.add(activo);
			if (fecha_ini != null)
				queryPos.add(fecha_ini);
			if (fecha_fin != null)
				queryPos.add(fecha_fin);
			if (secuencia != null)
				queryPos.add(secuencia);
			return (List<RelacionTrabajadorDespacho>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	@Override
	public Integer countByFields(String idDespacho, String idTrabajador, String cargo, String acuerdo, String activo, String fecha_ini,
			String fecha_fin, String secuencia) throws SystemException {
		Session session = null;
		try {

			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			if (idDespacho == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_DESPACHO = ? AND ", "");
			if (idTrabajador == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_TRABAJADOR = ? AND ", "");
			if (cargo == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_CARGO = ? AND ", "");
			if (acuerdo == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_ACUERDO = ? AND ", "");
			if (activo == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_ACTIVO = ? AND ", "");
			if (fecha_ini == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_FECHA_INI = ? AND ", "");
			if (fecha_fin == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_FECHA_FIN = ? AND ", "");
			if (secuencia == null)
				sql = StringUtil.replace(sql, "RELACION_TRA_DES.TDE_SECUENCIA = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idDespacho != null)
				queryPos.add(idDespacho);
			if (idTrabajador != null)
				queryPos.add(idTrabajador);
			if (cargo != null)
				queryPos.add(cargo);
			if (acuerdo != null)
				queryPos.add(acuerdo);
			if (activo != null)
				queryPos.add(activo);
			if (fecha_ini != null)
				queryPos.add(fecha_ini);
			if (fecha_fin != null)
				queryPos.add(fecha_fin);
			if (secuencia != null)
				queryPos.add(secuencia);
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

	public List<RelacionTrabajadorDespacho> createMold() throws SystemException {
		Session session = null;

		try {
			String sql = CustomSQLUtil.get(UNIQUERESULT);
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("RELACION_TRA_DES", RelacionTrabajadorDespachoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			return (List<RelacionTrabajadorDespacho>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			_log.error("Error createMold", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
