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

import la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException;
import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;
import la.netco.despachos_judiciales.entities.model.impl.RelacionUsuarioConsejoImpl;
import la.netco.despachos_judiciales.entities.model.impl.RelacionUsuarioConsejoModelImpl;
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
 * The persistence implementation for the relacion usuario consejo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see RelacionUsuarioConsejoPersistence
 * @see RelacionUsuarioConsejoUtil
 * @generated
 */
public class RelacionUsuarioConsejoPersistenceImpl extends BasePersistenceImpl<RelacionUsuarioConsejo>
	implements RelacionUsuarioConsejoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RelacionUsuarioConsejoUtil} to access the relacion usuario consejo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RelacionUsuarioConsejoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionUsuarioConsejoModelImpl.FINDER_CACHE_ENABLED,
			RelacionUsuarioConsejoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionUsuarioConsejoModelImpl.FINDER_CACHE_ENABLED,
			RelacionUsuarioConsejoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionUsuarioConsejoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the relacion usuario consejo in the entity cache if it is enabled.
	 *
	 * @param relacionUsuarioConsejo the relacion usuario consejo
	 */
	public void cacheResult(RelacionUsuarioConsejo relacionUsuarioConsejo) {
		EntityCacheUtil.putResult(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionUsuarioConsejoImpl.class,
			relacionUsuarioConsejo.getPrimaryKey(), relacionUsuarioConsejo);

		relacionUsuarioConsejo.resetOriginalValues();
	}

	/**
	 * Caches the relacion usuario consejos in the entity cache if it is enabled.
	 *
	 * @param relacionUsuarioConsejos the relacion usuario consejos
	 */
	public void cacheResult(
		List<RelacionUsuarioConsejo> relacionUsuarioConsejos) {
		for (RelacionUsuarioConsejo relacionUsuarioConsejo : relacionUsuarioConsejos) {
			if (EntityCacheUtil.getResult(
						RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
						RelacionUsuarioConsejoImpl.class,
						relacionUsuarioConsejo.getPrimaryKey()) == null) {
				cacheResult(relacionUsuarioConsejo);
			}
			else {
				relacionUsuarioConsejo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all relacion usuario consejos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RelacionUsuarioConsejoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RelacionUsuarioConsejoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the relacion usuario consejo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RelacionUsuarioConsejo relacionUsuarioConsejo) {
		EntityCacheUtil.removeResult(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionUsuarioConsejoImpl.class,
			relacionUsuarioConsejo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RelacionUsuarioConsejo> relacionUsuarioConsejos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RelacionUsuarioConsejo relacionUsuarioConsejo : relacionUsuarioConsejos) {
			EntityCacheUtil.removeResult(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
				RelacionUsuarioConsejoImpl.class,
				relacionUsuarioConsejo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new relacion usuario consejo with the primary key. Does not add the relacion usuario consejo to the database.
	 *
	 * @param idConsejoSec the primary key for the new relacion usuario consejo
	 * @return the new relacion usuario consejo
	 */
	public RelacionUsuarioConsejo create(int idConsejoSec) {
		RelacionUsuarioConsejo relacionUsuarioConsejo = new RelacionUsuarioConsejoImpl();

		relacionUsuarioConsejo.setNew(true);
		relacionUsuarioConsejo.setPrimaryKey(idConsejoSec);

		return relacionUsuarioConsejo;
	}

	/**
	 * Removes the relacion usuario consejo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idConsejoSec the primary key of the relacion usuario consejo
	 * @return the relacion usuario consejo that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RelacionUsuarioConsejo remove(int idConsejoSec)
		throws NoSuchRelacionUsuarioConsejoException, SystemException {
		return remove(Integer.valueOf(idConsejoSec));
	}

	/**
	 * Removes the relacion usuario consejo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the relacion usuario consejo
	 * @return the relacion usuario consejo that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RelacionUsuarioConsejo remove(Serializable primaryKey)
		throws NoSuchRelacionUsuarioConsejoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RelacionUsuarioConsejo relacionUsuarioConsejo = (RelacionUsuarioConsejo)session.get(RelacionUsuarioConsejoImpl.class,
					primaryKey);

			if (relacionUsuarioConsejo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRelacionUsuarioConsejoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(relacionUsuarioConsejo);
		}
		catch (NoSuchRelacionUsuarioConsejoException nsee) {
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
	protected RelacionUsuarioConsejo removeImpl(
		RelacionUsuarioConsejo relacionUsuarioConsejo)
		throws SystemException {
		relacionUsuarioConsejo = toUnwrappedModel(relacionUsuarioConsejo);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, relacionUsuarioConsejo);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(relacionUsuarioConsejo);

		return relacionUsuarioConsejo;
	}

	@Override
	public RelacionUsuarioConsejo updateImpl(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo,
		boolean merge) throws SystemException {
		relacionUsuarioConsejo = toUnwrappedModel(relacionUsuarioConsejo);

		boolean isNew = relacionUsuarioConsejo.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, relacionUsuarioConsejo, merge);

			relacionUsuarioConsejo.setNew(false);
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

		EntityCacheUtil.putResult(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionUsuarioConsejoImpl.class,
			relacionUsuarioConsejo.getPrimaryKey(), relacionUsuarioConsejo);

		return relacionUsuarioConsejo;
	}

	protected RelacionUsuarioConsejo toUnwrappedModel(
		RelacionUsuarioConsejo relacionUsuarioConsejo) {
		if (relacionUsuarioConsejo instanceof RelacionUsuarioConsejoImpl) {
			return relacionUsuarioConsejo;
		}

		RelacionUsuarioConsejoImpl relacionUsuarioConsejoImpl = new RelacionUsuarioConsejoImpl();

		relacionUsuarioConsejoImpl.setNew(relacionUsuarioConsejo.isNew());
		relacionUsuarioConsejoImpl.setPrimaryKey(relacionUsuarioConsejo.getPrimaryKey());

		relacionUsuarioConsejoImpl.setIdConsejoSec(relacionUsuarioConsejo.getIdConsejoSec());
		relacionUsuarioConsejoImpl.setUsuarioPortal(relacionUsuarioConsejo.getUsuarioPortal());

		return relacionUsuarioConsejoImpl;
	}

	/**
	 * Returns the relacion usuario consejo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the relacion usuario consejo
	 * @return the relacion usuario consejo
	 * @throws com.liferay.portal.NoSuchModelException if a relacion usuario consejo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RelacionUsuarioConsejo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the relacion usuario consejo with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException} if it could not be found.
	 *
	 * @param idConsejoSec the primary key of the relacion usuario consejo
	 * @return the relacion usuario consejo
	 * @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RelacionUsuarioConsejo findByPrimaryKey(int idConsejoSec)
		throws NoSuchRelacionUsuarioConsejoException, SystemException {
		RelacionUsuarioConsejo relacionUsuarioConsejo = fetchByPrimaryKey(idConsejoSec);

		if (relacionUsuarioConsejo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + idConsejoSec);
			}

			throw new NoSuchRelacionUsuarioConsejoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				idConsejoSec);
		}

		return relacionUsuarioConsejo;
	}

	/**
	 * Returns the relacion usuario consejo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the relacion usuario consejo
	 * @return the relacion usuario consejo, or <code>null</code> if a relacion usuario consejo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RelacionUsuarioConsejo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the relacion usuario consejo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idConsejoSec the primary key of the relacion usuario consejo
	 * @return the relacion usuario consejo, or <code>null</code> if a relacion usuario consejo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RelacionUsuarioConsejo fetchByPrimaryKey(int idConsejoSec)
		throws SystemException {
		RelacionUsuarioConsejo relacionUsuarioConsejo = (RelacionUsuarioConsejo)EntityCacheUtil.getResult(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
				RelacionUsuarioConsejoImpl.class, idConsejoSec);

		if (relacionUsuarioConsejo == _nullRelacionUsuarioConsejo) {
			return null;
		}

		if (relacionUsuarioConsejo == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				relacionUsuarioConsejo = (RelacionUsuarioConsejo)session.get(RelacionUsuarioConsejoImpl.class,
						Integer.valueOf(idConsejoSec));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (relacionUsuarioConsejo != null) {
					cacheResult(relacionUsuarioConsejo);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(RelacionUsuarioConsejoModelImpl.ENTITY_CACHE_ENABLED,
						RelacionUsuarioConsejoImpl.class, idConsejoSec,
						_nullRelacionUsuarioConsejo);
				}

				closeSession(session);
			}
		}

		return relacionUsuarioConsejo;
	}

	/**
	 * Returns all the relacion usuario consejos.
	 *
	 * @return the relacion usuario consejos
	 * @throws SystemException if a system exception occurred
	 */
	public List<RelacionUsuarioConsejo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the relacion usuario consejos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacion usuario consejos
	 * @param end the upper bound of the range of relacion usuario consejos (not inclusive)
	 * @return the range of relacion usuario consejos
	 * @throws SystemException if a system exception occurred
	 */
	public List<RelacionUsuarioConsejo> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the relacion usuario consejos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacion usuario consejos
	 * @param end the upper bound of the range of relacion usuario consejos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of relacion usuario consejos
	 * @throws SystemException if a system exception occurred
	 */
	public List<RelacionUsuarioConsejo> findAll(int start, int end,
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

		List<RelacionUsuarioConsejo> list = (List<RelacionUsuarioConsejo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RELACIONUSUARIOCONSEJO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RELACIONUSUARIOCONSEJO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<RelacionUsuarioConsejo>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<RelacionUsuarioConsejo>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the relacion usuario consejos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (RelacionUsuarioConsejo relacionUsuarioConsejo : findAll()) {
			remove(relacionUsuarioConsejo);
		}
	}

	/**
	 * Returns the number of relacion usuario consejos.
	 *
	 * @return the number of relacion usuario consejos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RELACIONUSUARIOCONSEJO);

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
	 * Initializes the relacion usuario consejo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RelacionUsuarioConsejo>> listenersList = new ArrayList<ModelListener<RelacionUsuarioConsejo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RelacionUsuarioConsejo>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RelacionUsuarioConsejoImpl.class.getName());
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
	private static final String _SQL_SELECT_RELACIONUSUARIOCONSEJO = "SELECT relacionUsuarioConsejo FROM RelacionUsuarioConsejo relacionUsuarioConsejo";
	private static final String _SQL_COUNT_RELACIONUSUARIOCONSEJO = "SELECT COUNT(relacionUsuarioConsejo) FROM RelacionUsuarioConsejo relacionUsuarioConsejo";
	private static final String _ORDER_BY_ENTITY_ALIAS = "relacionUsuarioConsejo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RelacionUsuarioConsejo exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RelacionUsuarioConsejoPersistenceImpl.class);
	private static RelacionUsuarioConsejo _nullRelacionUsuarioConsejo = new RelacionUsuarioConsejoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RelacionUsuarioConsejo> toCacheModel() {
				return _nullRelacionUsuarioConsejoCacheModel;
			}
		};

	private static CacheModel<RelacionUsuarioConsejo> _nullRelacionUsuarioConsejoCacheModel =
		new CacheModel<RelacionUsuarioConsejo>() {
			public RelacionUsuarioConsejo toEntityModel() {
				return _nullRelacionUsuarioConsejo;
			}
		};
}