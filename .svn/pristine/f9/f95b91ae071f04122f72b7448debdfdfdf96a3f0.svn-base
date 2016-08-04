/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package la.netco.despachos_judiciales.entities.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import la.netco.despachos_judiciales.entities.NoSuchDistritoException;
import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.model.impl.DistritoImpl;
import la.netco.despachos_judiciales.entities.model.impl.DistritoModelImpl;
import la.netco.despachos_judiciales.entities.service.persistence.CircuitoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.ConsejoSeccionalPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.DepartamentoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.DespachoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.DistritoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.EntidadPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.EspecialidadPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionUsuarioConsejoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.TrabajadorPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the distrito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see DistritoPersistence
 * @see DistritoUtil
 * @generated
 */
public class DistritoPersistenceImpl extends BasePersistenceImpl<Distrito>
	implements DistritoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DistritoUtil} to access the distrito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DistritoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DistritoModelImpl.ENTITY_CACHE_ENABLED,
			DistritoModelImpl.FINDER_CACHE_ENABLED, DistritoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DistritoModelImpl.ENTITY_CACHE_ENABLED,
			DistritoModelImpl.FINDER_CACHE_ENABLED, DistritoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DistritoModelImpl.ENTITY_CACHE_ENABLED,
			DistritoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the distrito in the entity cache if it is enabled.
	 *
	 * @param distrito the distrito
	 */
	public void cacheResult(Distrito distrito) {
		EntityCacheUtil.putResult(DistritoModelImpl.ENTITY_CACHE_ENABLED,
			DistritoImpl.class, distrito.getPrimaryKey(), distrito);

		distrito.resetOriginalValues();
	}

	/**
	 * Caches the distritos in the entity cache if it is enabled.
	 *
	 * @param distritos the distritos
	 */
	public void cacheResult(List<Distrito> distritos) {
		for (Distrito distrito : distritos) {
			if (EntityCacheUtil.getResult(
						DistritoModelImpl.ENTITY_CACHE_ENABLED,
						DistritoImpl.class, distrito.getPrimaryKey()) == null) {
				cacheResult(distrito);
			}
			else {
				distrito.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all distritos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DistritoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DistritoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the distrito.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Distrito distrito) {
		EntityCacheUtil.removeResult(DistritoModelImpl.ENTITY_CACHE_ENABLED,
			DistritoImpl.class, distrito.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Distrito> distritos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Distrito distrito : distritos) {
			EntityCacheUtil.removeResult(DistritoModelImpl.ENTITY_CACHE_ENABLED,
				DistritoImpl.class, distrito.getPrimaryKey());
		}
	}

	/**
	 * Creates a new distrito with the primary key. Does not add the distrito to the database.
	 *
	 * @param codigo the primary key for the new distrito
	 * @return the new distrito
	 */
	public Distrito create(int codigo) {
		Distrito distrito = new DistritoImpl();

		distrito.setNew(true);
		distrito.setPrimaryKey(codigo);

		return distrito;
	}

	/**
	 * Removes the distrito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigo the primary key of the distrito
	 * @return the distrito that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchDistritoException if a distrito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Distrito remove(int codigo)
		throws NoSuchDistritoException, SystemException {
		return remove(Integer.valueOf(codigo));
	}

	/**
	 * Removes the distrito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the distrito
	 * @return the distrito that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchDistritoException if a distrito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Distrito remove(Serializable primaryKey)
		throws NoSuchDistritoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Distrito distrito = (Distrito)session.get(DistritoImpl.class,
					primaryKey);

			if (distrito == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDistritoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(distrito);
		}
		catch (NoSuchDistritoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Distrito removeImpl(Distrito distrito) throws SystemException {
		distrito = toUnwrappedModel(distrito);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, distrito);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(distrito);

		return distrito;
	}

	@Override
	public Distrito updateImpl(
		la.netco.despachos_judiciales.entities.model.Distrito distrito,
		boolean merge) throws SystemException {
		distrito = toUnwrappedModel(distrito);

		boolean isNew = distrito.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, distrito, merge);

			distrito.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DistritoModelImpl.ENTITY_CACHE_ENABLED,
			DistritoImpl.class, distrito.getPrimaryKey(), distrito);

		return distrito;
	}

	protected Distrito toUnwrappedModel(Distrito distrito) {
		if (distrito instanceof DistritoImpl) {
			return distrito;
		}

		DistritoImpl distritoImpl = new DistritoImpl();

		distritoImpl.setNew(distrito.isNew());
		distritoImpl.setPrimaryKey(distrito.getPrimaryKey());

		distritoImpl.setCodigo(distrito.getCodigo());
		distritoImpl.setNombre(distrito.getNombre());
		distritoImpl.setIdConsejo_sec(distrito.getIdConsejo_sec());
		distritoImpl.setJurisdiccion(distrito.getJurisdiccion());
		distritoImpl.setCodigo_dane(distrito.getCodigo_dane());

		return distritoImpl;
	}

	/**
	 * Returns the distrito with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the distrito
	 * @return the distrito
	 * @throws com.liferay.portal.NoSuchModelException if a distrito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Distrito findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the distrito with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchDistritoException} if it could not be found.
	 *
	 * @param codigo the primary key of the distrito
	 * @return the distrito
	 * @throws la.netco.despachos_judiciales.entities.NoSuchDistritoException if a distrito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Distrito findByPrimaryKey(int codigo)
		throws NoSuchDistritoException, SystemException {
		Distrito distrito = fetchByPrimaryKey(codigo);

		if (distrito == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + codigo);
			}

			throw new NoSuchDistritoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				codigo);
		}

		return distrito;
	}

	/**
	 * Returns the distrito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the distrito
	 * @return the distrito, or <code>null</code> if a distrito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Distrito fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the distrito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param codigo the primary key of the distrito
	 * @return the distrito, or <code>null</code> if a distrito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Distrito fetchByPrimaryKey(int codigo) throws SystemException {
		Distrito distrito = (Distrito)EntityCacheUtil.getResult(DistritoModelImpl.ENTITY_CACHE_ENABLED,
				DistritoImpl.class, codigo);

		if (distrito == _nullDistrito) {
			return null;
		}

		if (distrito == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				distrito = (Distrito)session.get(DistritoImpl.class,
						Integer.valueOf(codigo));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (distrito != null) {
					cacheResult(distrito);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DistritoModelImpl.ENTITY_CACHE_ENABLED,
						DistritoImpl.class, codigo, _nullDistrito);
				}

				closeSession(session);
			}
		}

		return distrito;
	}

	/**
	 * Returns all the distritos.
	 *
	 * @return the distritos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Distrito> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the distritos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of distritos
	 * @param end the upper bound of the range of distritos (not inclusive)
	 * @return the range of distritos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Distrito> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the distritos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of distritos
	 * @param end the upper bound of the range of distritos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of distritos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Distrito> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Distrito> list = (List<Distrito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DISTRITO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DISTRITO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Distrito>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Distrito>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the distritos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Distrito distrito : findAll()) {
			remove(distrito);
		}
	}

	/**
	 * Returns the number of distritos.
	 *
	 * @return the number of distritos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DISTRITO);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the distrito persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.Distrito")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Distrito>> listenersList = new ArrayList<ModelListener<Distrito>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Distrito>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DistritoImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CircuitoPersistence.class)
	protected CircuitoPersistence circuitoPersistence;
	@BeanReference(type = ConsejoSeccionalPersistence.class)
	protected ConsejoSeccionalPersistence consejoSeccionalPersistence;
	@BeanReference(type = DepartamentoPersistence.class)
	protected DepartamentoPersistence departamentoPersistence;
	@BeanReference(type = DespachoPersistence.class)
	protected DespachoPersistence despachoPersistence;
	@BeanReference(type = DistritoPersistence.class)
	protected DistritoPersistence distritoPersistence;
	@BeanReference(type = EntidadPersistence.class)
	protected EntidadPersistence entidadPersistence;
	@BeanReference(type = EspecialidadPersistence.class)
	protected EspecialidadPersistence especialidadPersistence;
	@BeanReference(type = MunicipioPersistence.class)
	protected MunicipioPersistence municipioPersistence;
	@BeanReference(type = RelacionTrabajadorDespachoPersistence.class)
	protected RelacionTrabajadorDespachoPersistence relacionTrabajadorDespachoPersistence;
	@BeanReference(type = RelacionUsuarioConsejoPersistence.class)
	protected RelacionUsuarioConsejoPersistence relacionUsuarioConsejoPersistence;
	@BeanReference(type = TrabajadorPersistence.class)
	protected TrabajadorPersistence trabajadorPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DISTRITO = "SELECT distrito FROM Distrito distrito";
	private static final String _SQL_COUNT_DISTRITO = "SELECT COUNT(distrito) FROM Distrito distrito";
	private static final String _ORDER_BY_ENTITY_ALIAS = "distrito.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Distrito exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DistritoPersistenceImpl.class);
	private static Distrito _nullDistrito = new DistritoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Distrito> toCacheModel() {
				return _nullDistritoCacheModel;
			}
		};

	private static CacheModel<Distrito> _nullDistritoCacheModel = new CacheModel<Distrito>() {
			public Distrito toEntityModel() {
				return _nullDistrito;
			}
		};
}