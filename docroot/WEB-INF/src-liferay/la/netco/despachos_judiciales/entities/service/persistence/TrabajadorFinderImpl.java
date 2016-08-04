package la.netco.despachos_judiciales.entities.service.persistence;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Trabajador;
import la.netco.despachos_judiciales.entities.model.impl.TrabajadorImpl;

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

public class TrabajadorFinderImpl extends BasePersistenceImpl<Trabajador> implements TrabajadorFinder {

	private static Log _log = LogFactoryUtil.getLog(TrabajadorFinderImpl.class);

	public static final String FINDBYDESPACHORELACION = TrabajadorFinder.class.getName() + ".findByDespachoRelacion";
	public static final String FINDBYFIELDS = TrabajadorFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = TrabajadorFinder.class.getName() + ".countByFields";

	public List<Trabajador> findByDespachoRelacion(String idDespacho) throws SystemException {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FINDBYDESPACHORELACION);
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("TRABAJADOR", TrabajadorImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			queryPos.add(idDespacho);
			queryPos.add(idDespacho);
			return (List<Trabajador>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		} catch (Exception e) {
			_log.error("Error findByDespachoRelacion", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public List<Trabajador> findByFields(String idTrabajador, String nombres, String apellidos, String especialidad, String correo, String telefonos,
			Integer carrera, Integer tipoTrabajador, Integer tipoContrato, String sexo, Date fechaNacimiento, int start, int end)
			throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			if (idTrabajador == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_CEDULA = ? AND ", "");
			if (nombres == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_NOMBRES = ? AND ", "");
			if (apellidos == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_APELLIDOS = ? AND ", "");
			if (especialidad == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_ESPECIALIDAD = ? AND ", "");
			if (correo == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_CORREO_ELECTRONICO = ? AND ", "");
			if (telefonos == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_TELEFONOS_OFICINA = ? AND ", "");
			if (carrera == null)
				sql = StringUtil.replace(sql, "TRABAJADOR. TRA_CARRERA = ? AND ", "");
			if (tipoTrabajador == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_TIPO_TRABAJADOR = ? AND ", "");
			if (tipoContrato == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_TIPO_CONTRATO = ? AND ", "");
			if (sexo == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_SEXO = ? AND ", "");
			if (fechaNacimiento == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_FECHA_NACIMIENTO = ? AND ", "");		
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("TRABAJADOR", TrabajadorImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idTrabajador != null)
				queryPos.add(idTrabajador);
			if (nombres != null)
				queryPos.add(nombres);
			if (apellidos != null)
				queryPos.add(apellidos);
			if (especialidad != null)
				queryPos.add(especialidad);
			if (correo != null)
				queryPos.add(correo);
			if (telefonos != null)
				queryPos.add(telefonos);
			if (carrera != null)
				queryPos.add(carrera);
			if (tipoTrabajador != null)
				queryPos.add(tipoTrabajador);
			if (tipoContrato != null)
				queryPos.add(tipoContrato);
			if (fechaNacimiento != null)
				queryPos.add(fechaNacimiento);
			return (List<Trabajador>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public Integer countByFields(String idTrabajador, String nombres, String apellidos, String especialidad, String correo, String telefonos,
			Integer carrera, Integer tipoTrabajador, Integer tipoContrato, String sexo, Date fechaNacimiento) throws SystemException {
		Session session = null;
		try {
			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			if (idTrabajador == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_CEDULA = ? AND ", "");
			if (nombres == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_NOMBRES = ? AND ", "");
			if (apellidos == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_APELLIDOS = ? AND ", "");
			if (especialidad == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_ESPECIALIDAD = ? AND ", "");
			if (correo == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_CORREO_ELECTRONICO = ? AND ", "");
			if (telefonos == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_TELEFONOS_OFICINA = ? AND ", "");
			if (carrera == null)
				sql = StringUtil.replace(sql, "TRABAJADOR. TRA_CARRERA = ? AND ", "");
			if (tipoTrabajador == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_TIPO_TRABAJADOR = ? AND ", "");
			if (tipoContrato == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_TIPO_CONTRATO = ? AND ", "");
			if (sexo == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_SEXO = ? AND ", "");
			if (fechaNacimiento == null)
				sql = StringUtil.replace(sql, "TRABAJADOR.TRA_FECHA_NACIMIENTO = ? AND ", "");
			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);
			QueryPos queryPos = QueryPos.getInstance(query);
			if (idTrabajador != null)
				queryPos.add(idTrabajador);
			if (nombres != null)
				queryPos.add(nombres);
			if (apellidos != null)
				queryPos.add(apellidos);
			if (especialidad != null)
				queryPos.add(especialidad);
			if (correo != null)
				queryPos.add(correo);
			if (telefonos != null)
				queryPos.add(telefonos);
			if (carrera != null)
				queryPos.add(carrera);
			if (tipoTrabajador != null)
				queryPos.add(tipoTrabajador);
			if (tipoContrato != null)
				queryPos.add(tipoContrato);
			if (fechaNacimiento != null)
				queryPos.add(fechaNacimiento);
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
