package la.netco.despachos_judiciales.entities.service.persistence;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.impl.DespachoImpl;

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

public class DespachoFinderImpl extends BasePersistenceImpl<Despacho> implements DespachoFinder {

	public static final String FINDBYFIELDS = DespachoFinder.class.getName() + ".findByFields";
	public static final String COUNTBYFIELDS = DespachoFinder.class.getName() + ".countbyFields";
	public static final String FINDDESPACHO = DespachoFinder.class.getName() + ".findDespacho";
	public static final String COUNTDESACHO = DespachoFinder.class.getName() + ".countDespacho";

	private static Log _log = LogFactoryUtil.getLog(DespachoFinderImpl.class);

	public List<Despacho> findByFields(Integer idConsejo, String idDespacho, Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad,
			String consecutivo, String nombre, String direccion, String telefonos, String correo_electronico, String acuerdo, Integer estado,
			String fax, String horario_atencion, Date fechaInicial, Date fechaFinal, int start, int end) throws SystemException {

		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDBYFIELDS);
			
			System.out.println("--> Sql Base" + sql);
			
			if(idConsejo == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CONSEJO_SEC_DIS = ? AND ", "");
			
			if (idDespacho == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_CODIGO = ? AND ", "");

			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_DEPARTAMENTO = ? AND ", "");

			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_MUNICIPIO = ? AND ", "");

			if (idEntidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ENTIDAD = ? AND ", "");

			if (idEspecialidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ESPECIALIDAD = ? AND ", "");

			if (consecutivo == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_CONSECUTIVO = ? AND ", "");

			if (nombre == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_NOMBRE = ? AND ", "");

			if (direccion == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_DIRECCION = ? AND ", "");

			if (telefonos == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_TELEFONOS = ? AND ", "");

			if (correo_electronico == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_CORREO_ELECTRONICO = ? AND ", "");

			if (acuerdo == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ACUERDO = ? AND ", "");

			if (estado == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ESTADO = ? AND ", "");

			if (fax == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_FAX = ? AND ", "");

			if (horario_atencion == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_HORARIO_ATENCION = ? AND ", "");

			if (fechaInicial == null || fechaFinal == null )
				sql = StringUtil.replace(sql, "DESPACHO.DES_FECHA_ACT BETWEEN ? AND ? AND ", "");

			session = openSession();

			System.out.println("--> Sql Editada" + sql);

			SQLQuery query = session.createSQLQuery(sql);

			query.addEntity("DESPACHO", DespachoImpl.class);

			QueryPos queryPos = QueryPos.getInstance(query);

			if (idConsejo != null)
				queryPos.add(idConsejo);
			
			if (idDespacho != null)
				queryPos.add(idDespacho);

			if (idDepartamento != null)
				queryPos.add(idDepartamento);

			if (idMunicipio != null)
				queryPos.add(idMunicipio);

			if (idEntidad != null)
				queryPos.add(idEntidad);

			if (idEspecialidad != null)
				queryPos.add(idEspecialidad);

			if (consecutivo != null)
				queryPos.add(consecutivo);

			if (nombre != null)
				queryPos.add(nombre);

			if (direccion != null)
				queryPos.add(direccion);

			if (telefonos != null)
				queryPos.add(telefonos);

			if (correo_electronico != null)
				queryPos.add(correo_electronico);

			if (acuerdo != null)
				queryPos.add(acuerdo);

			if (estado != null)
				queryPos.add(estado);

			if (fax != null)
				queryPos.add(fax);

			if (horario_atencion != null)
				queryPos.add(horario_atencion);

			if (fechaInicial != null && fechaFinal != null ){
				queryPos.add(fechaInicial);
				queryPos.add(fechaFinal);
			}
				

			return (List<Despacho>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	public Integer countbyFields(Integer idConsejo,String idDespacho, Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad,
			String consecutivo, String nombre, String direccion, String telefonos, String correo_electronico, String acuerdo, Integer estado,
			String fax, String horario_atencion,  Date fechaInicial, Date fechaFinal) throws SystemException {

		Session session = null;
		try {

			String sql = CustomSQLUtil.get(COUNTBYFIELDS);
			
			if(idConsejo == null)
				sql = StringUtil.replace(sql, "MUNICIPIO.MUN_CONSEJO_SEC_DIS = ? AND ", "");
			
			if (idDespacho == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_CODIGO = ? AND ", "");

			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_DEPARTAMENTO = ? AND ", "");

			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_MUNICIPIO = ? AND ", "");

			if (idEntidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ENTIDAD = ? AND ", "");

			if (idEspecialidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ESPECIALIDAD = ? AND ", "");

			if (consecutivo == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_CONSECUTIVO = ? AND ", "");

			if (nombre == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_NOMBRE = ? AND ", "");

			if (direccion == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_DIRECCION = ? AND ", "");

			if (telefonos == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_TELEFONOS = ? AND ", "");

			if (correo_electronico == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_CORREO_ELECTRONICO = ? AND ", "");

			if (acuerdo == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ACUERDO = ? AND ", "");

			if (estado == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ESTADO = ? AND ", "");

			if (fax == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_FAX = ? AND ", "");

			if (horario_atencion == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_HORARIO_ATENCION = ? AND ", "");

			if (fechaInicial == null || fechaFinal == null )
				sql = StringUtil.replace(sql, "DESPACHO.DES_FECHA_ACT BETWEEN ? AND ? AND ", "");

			System.out.println("--> Sql Base" + sql);

			session = openSession();

			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos queryPos = QueryPos.getInstance(query);

			if (idConsejo != null)
				queryPos.add(idConsejo);
			
			if (idDespacho != null)
				queryPos.add(idDespacho);

			if (idDepartamento != null)
				queryPos.add(idDepartamento);

			if (idMunicipio != null)
				queryPos.add(idMunicipio);

			if (idEntidad != null)
				queryPos.add(idEntidad);

			if (idEspecialidad != null)
				queryPos.add(idEspecialidad);

			if (consecutivo != null)
				queryPos.add(consecutivo);

			if (nombre != null)
				queryPos.add(nombre);

			if (direccion != null)
				queryPos.add(direccion);

			if (telefonos != null)
				queryPos.add(telefonos);

			if (correo_electronico != null)
				queryPos.add(correo_electronico);

			if (acuerdo != null)
				queryPos.add(acuerdo);

			if (estado != null)
				queryPos.add(estado);

			if (fax != null)
				queryPos.add(fax);

			if (horario_atencion != null)
				queryPos.add(horario_atencion);

			if (fechaInicial != null && fechaFinal != null ){
				queryPos.add(fechaInicial);
				queryPos.add(fechaFinal);
			}

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
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}

	public List<Despacho> findDespacho(Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad, Integer idDistrito,
			Integer idCosenjoSec, Integer idCircuito, int start, int end) throws SystemException {

		Session session = null;

		try {

			String sql = CustomSQLUtil.get(FINDDESPACHO);

			System.out.println("--> Sql Base" + sql);

			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_DEPARTAMENTO = ? AND ", "");

			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_MUNICIPIO = ?  AND", "");

			if (idEntidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ENTIDAD = ? AND ", "");

			if (idEspecialidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ESPECIALIDAD = ? AND ", "");

			if (idDistrito == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CODIGO = ? AND ", "");

			if (idCircuito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_CODIGO = ? AND ", "");

			if (idCosenjoSec == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CODIGO = ? AND ", "");

			session = openSession();

			System.out.println("--> Sql Editada" + sql);

			SQLQuery query = session.createSQLQuery(sql);

			query.addEntity("DESPACHO", DespachoImpl.class);

			QueryPos queryPos = QueryPos.getInstance(query);

			if (idDepartamento != null)
				queryPos.add(idDepartamento);

			if (idMunicipio != null)
				queryPos.add(idMunicipio);

			if (idEntidad != null)
				queryPos.add(idEntidad);

			if (idEspecialidad != null)
				queryPos.add(idEspecialidad);

			if (idDistrito != null)
				queryPos.add(idDistrito);

			if (idCircuito != null)
				queryPos.add(idCircuito);

			if (idCosenjoSec != null)
				queryPos.add(idCosenjoSec);

			return (List<Despacho>) QueryUtil.list(query, getDialect(), start, end);
		} catch (Exception e) {
			_log.error("Error findByFields", e);
			throw new SystemException(e);

		} finally {
			closeSession(session);
		}
	}

	public Integer countDespacho(Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad, Integer idDistrito,
			Integer idCosenjoSec, Integer idCircuito) throws SystemException {

		Session session = null;
		try {

			String sql = CustomSQLUtil.get(COUNTDESACHO);

			if (idDepartamento == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_DEPARTAMENTO = ? AND ", "");

			if (idMunicipio == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_MUNICIPIO = ?  AND", "");

			if (idEntidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ENTIDAD = ? AND ", "");

			if (idEspecialidad == null)
				sql = StringUtil.replace(sql, "DESPACHO.DES_ESPECIALIDAD = ? AND ", "");

			if (idDistrito == null)
				sql = StringUtil.replace(sql, "DISTRITO.DIS_CODIGO = ? AND ", "");

			if (idCircuito == null)
				sql = StringUtil.replace(sql, "CIRCUITO.CIR_CODIGO = ? AND ", "");

			if (idCosenjoSec == null)
				sql = StringUtil.replace(sql, "CONSEJO.CON_CODIGO = ? AND ", "");

			System.out.println("--> Sql Base" + sql);

			session = openSession();

			SQLQuery query = session.createSQLQuery(sql);
			query.addScalar(COUNT_COLUMN_NAME, Type.LONG);

			QueryPos queryPos = QueryPos.getInstance(query);

			if (idDepartamento != null)
				queryPos.add(idDepartamento);

			if (idMunicipio != null)
				queryPos.add(idMunicipio);

			if (idEntidad != null)
				queryPos.add(idEntidad);

			if (idEspecialidad != null)
				queryPos.add(idEspecialidad);

			if (idDistrito != null)
				queryPos.add(idDistrito);

			if (idCircuito != null)
				queryPos.add(idCircuito);

			if (idCosenjoSec != null)
				queryPos.add(idCosenjoSec);

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
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

}
