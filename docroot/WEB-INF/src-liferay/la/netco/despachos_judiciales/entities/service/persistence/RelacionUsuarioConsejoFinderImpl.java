package la.netco.despachos_judiciales.entities.service.persistence;

import java.util.List;

import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;
import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;
import la.netco.despachos_judiciales.entities.model.impl.DespachoImpl;
import la.netco.despachos_judiciales.entities.model.impl.RelacionUsuarioConsejoImpl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class RelacionUsuarioConsejoFinderImpl extends BasePersistenceImpl<RelacionUsuarioConsejo> implements RelacionUsuarioConsejoFinder {

	private static Log _log = LogFactoryUtil.getLog(RelacionUsuarioConsejoFinderImpl.class);

	public static final String FINDBYUSUARIO = RelacionUsuarioConsejoFinder.class.getName() + ".findByUsuario";

	public RelacionUsuarioConsejo findByUsuario(String usuario) throws SystemException {
		Session session = null;
		RelacionUsuarioConsejo rel = null;
		try {
			rel = RelacionUsuarioConsejoUtil.create(0);
			String sql = CustomSQLUtil.get(FINDBYUSUARIO);
			if (usuario == null || usuario.trim().equals(""))
				return rel;

			session = openSession();
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity("USUARIOCONSEJO", RelacionUsuarioConsejoImpl.class);
			QueryPos queryPos = QueryPos.getInstance(query);
			queryPos.add(usuario);
			List<RelacionUsuarioConsejo> list = (List<RelacionUsuarioConsejo>) QueryUtil.list(query, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if(list.size() > 0)
				return list.get(0);
			return rel;
			
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}

	}


}
