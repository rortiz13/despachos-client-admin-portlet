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

import la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException;
import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;
import la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoImpl;
import la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoModelImpl;
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
 * The persistence implementation for the relacion trabajador despacho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see RelacionTrabajadorDespachoPersistence
 * @see RelacionTrabajadorDespachoUtil
 * @generated
 */
public class RelacionTrabajadorDespachoPersistenceImpl
	extends BasePersistenceImpl<RelacionTrabajadorDespacho>
	implements RelacionTrabajadorDespachoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RelacionTrabajadorDespachoUtil} to access the relacion trabajador despacho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RelacionTrabajadorDespachoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionTrabajadorDespachoModelImpl.FINDER_CACHE_ENABLED,
			RelacionTrabajadorDespachoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionTrabajadorDespachoModelImpl.FINDER_CACHE_ENABLED,
			RelacionTrabajadorDespachoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionTrabajadorDespachoModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	/**
	 * Caches the relacion trabajador despacho in the entity cache if it is enabled.
	 *
	 * @param relacionTrabajadorDespacho the relacion trabajador despacho
	 */
	public void cacheResult(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho) {
		EntityCacheUtil.putResult(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionTrabajadorDespachoImpl.class,
			relacionTrabajadorDespacho.getPrimaryKey(),
			relacionTrabajadorDespacho);

		relacionTrabajadorDespacho.resetOriginalValues();
	}

	/**
	 * Caches the relacion trabajador despachos in the entity cache if it is enabled.
	 *
	 * @param relacionTrabajadorDespachos the relacion trabajador despachos
	 */
	public void cacheResult(
		List<RelacionTrabajadorDespacho> relacionTrabajadorDespachos) {
		for (RelacionTrabajadorDespacho relacionTrabajadorDespacho : relacionTrabajadorDespachos) {
			if (EntityCacheUtil.getResult(
						RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
						RelacionTrabajadorDespachoImpl.class,
						relacionTrabajadorDespacho.getPrimaryKey()) == null) {
				cacheResult(relacionTrabajadorDespacho);
			}
			else {
				relacionTrabajadorDespacho.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all relacion trabajador despachos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RelacionTrabajadorDespachoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RelacionTrabajadorDespachoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the relacion trabajador despacho.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho) {
		EntityCacheUtil.removeResult(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionTrabajadorDespachoImpl.class,
			relacionTrabajadorDespacho.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<RelacionTrabajadorDespacho> relacionTrabajadorDespachos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RelacionTrabajadorDespacho relacionTrabajadorDespacho : relacionTrabajadorDespachos) {
			EntityCacheUtil.removeResult(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
				RelacionTrabajadorDespachoImpl.class,
				relacionTrabajadorDespacho.getPrimaryKey());
		}
	}

	/**
	 * Creates a new relacion trabajador despacho with the primary key. Does not add the relacion trabajador despacho to the database.
	 *
	 * @param relacionTrabajadorDespachoPK the primary key for the new relacion trabajador despacho
	 * @return the new relacion trabajador despacho
	 */
	public RelacionTrabajadorDespacho create(
		RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK) {
		RelacionTrabajadorDespacho relacionTrabajadorDespacho = new RelacionTrabajadorDespachoImpl();

		relacionTrabajadorDespacho.setNew(true);
		relacionTrabajadorDespacho.setPrimaryKey(relacionTrabajadorDespachoPK);

		return relacionTrabajadorDespacho;
	}

	/**
	 * Removes the relacion trabajador despacho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	 * @return the relacion trabajador despacho that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RelacionTrabajadorDespacho remove(
		RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws NoSuchRelacionTrabajadorDespachoException, SystemException {
		return remove((Serializable)relacionTrabajadorDespachoPK);
	}

	/**
	 * Removes the relacion trabajador despacho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the relacion trabajador despacho
	 * @return the relacion trabajador despacho that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RelacionTrabajadorDespacho remove(Serializable primaryKey)
		throws NoSuchRelacionTrabajadorDespachoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RelacionTrabajadorDespacho relacionTrabajadorDespacho = (RelacionTrabajadorDespacho)session.get(RelacionTrabajadorDespachoImpl.class,
					primaryKey);

			if (relacionTrabajadorDespacho == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRelacionTrabajadorDespachoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(relacionTrabajadorDespacho);
		}
		catch (NoSuchRelacionTrabajadorDespachoException nsee) {
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
	protected RelacionTrabajadorDespacho removeImpl(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws SystemException {
		relacionTrabajadorDespacho = toUnwrappedModel(relacionTrabajadorDespacho);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, relacionTrabajadorDespacho);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(relacionTrabajadorDespacho);

		return relacionTrabajadorDespacho;
	}

	@Override
	public RelacionTrabajadorDespacho updateImpl(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho,
		boolean merge) throws SystemException {
		relacionTrabajadorDespacho = toUnwrappedModel(relacionTrabajadorDespacho);

		boolean isNew = relacionTrabajadorDespacho.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, relacionTrabajadorDespacho, merge);

			relacionTrabajadorDespacho.setNew(false);
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

		EntityCacheUtil.putResult(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
			RelacionTrabajadorDespachoImpl.class,
			relacionTrabajadorDespacho.getPrimaryKey(),
			relacionTrabajadorDespacho);

		return relacionTrabajadorDespacho;
	}

	protected RelacionTrabajadorDespacho toUnwrappedModel(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho) {
		if (relacionTrabajadorDespacho instanceof RelacionTrabajadorDespachoImpl) {
			return relacionTrabajadorDespacho;
		}

		RelacionTrabajadorDespachoImpl relacionTrabajadorDespachoImpl = new RelacionTrabajadorDespachoImpl();

		relacionTrabajadorDespachoImpl.setNew(relacionTrabajadorDespacho.isNew());
		relacionTrabajadorDespachoImpl.setPrimaryKey(relacionTrabajadorDespacho.getPrimaryKey());

		relacionTrabajadorDespachoImpl.setIdDespacho(relacionTrabajadorDespacho.getIdDespacho());
		relacionTrabajadorDespachoImpl.setIdTrabajador(relacionTrabajadorDespacho.getIdTrabajador());
		relacionTrabajadorDespachoImpl.setCargo(relacionTrabajadorDespacho.getCargo());
		relacionTrabajadorDespachoImpl.setAcuerdo(relacionTrabajadorDespacho.getAcuerdo());
		relacionTrabajadorDespachoImpl.setActivo(relacionTrabajadorDespacho.getActivo());
		relacionTrabajadorDespachoImpl.setFecha_ini(relacionTrabajadorDespacho.getFecha_ini());
		relacionTrabajadorDespachoImpl.setFecha_fin(relacionTrabajadorDespacho.getFecha_fin());
		relacionTrabajadorDespachoImpl.setSecuencia(relacionTrabajadorDespacho.getSecuencia());

		return relacionTrabajadorDespachoImpl;
	}

	/**
	 * Returns the relacion trabajador despacho with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the relacion trabajador despacho
	 * @return the relacion trabajador despacho
	 * @throws com.liferay.portal.NoSuchModelException if a relacion trabajador despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RelacionTrabajadorDespacho findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((RelacionTrabajadorDespachoPK)primaryKey);
	}

	/**
	 * Returns the relacion trabajador despacho with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException} if it could not be found.
	 *
	 * @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	 * @return the relacion trabajador despacho
	 * @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RelacionTrabajadorDespacho findByPrimaryKey(
		RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws NoSuchRelacionTrabajadorDespachoException, SystemException {
		RelacionTrabajadorDespacho relacionTrabajadorDespacho = fetchByPrimaryKey(relacionTrabajadorDespachoPK);

		if (relacionTrabajadorDespacho == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					relacionTrabajadorDespachoPK);
			}

			throw new NoSuchRelacionTrabajadorDespachoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				relacionTrabajadorDespachoPK);
		}

		return relacionTrabajadorDespacho;
	}

	/**
	 * Returns the relacion trabajador despacho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the relacion trabajador despacho
	 * @return the relacion trabajador despacho, or <code>null</code> if a relacion trabajador despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RelacionTrabajadorDespacho fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((RelacionTrabajadorDespachoPK)primaryKey);
	}

	/**
	 * Returns the relacion trabajador despacho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	 * @return the relacion trabajador despacho, or <code>null</code> if a relacion trabajador despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RelacionTrabajadorDespacho fetchByPrimaryKey(
		RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws SystemException {
		RelacionTrabajadorDespacho relacionTrabajadorDespacho = (RelacionTrabajadorDespacho)EntityCacheUtil.getResult(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
				RelacionTrabajadorDespachoImpl.class,
				relacionTrabajadorDespachoPK);

		if (relacionTrabajadorDespacho == _nullRelacionTrabajadorDespacho) {
			return null;
		}

		if (relacionTrabajadorDespacho == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				relacionTrabajadorDespacho = (RelacionTrabajadorDespacho)session.get(RelacionTrabajadorDespachoImpl.class,
						relacionTrabajadorDespachoPK);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (relacionTrabajadorDespacho != null) {
					cacheResult(relacionTrabajadorDespacho);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(RelacionTrabajadorDespachoModelImpl.ENTITY_CACHE_ENABLED,
						RelacionTrabajadorDespachoImpl.class,
						relacionTrabajadorDespachoPK,
						_nullRelacionTrabajadorDespacho);
				}

				closeSession(session);
			}
		}

		return relacionTrabajadorDespacho;
	}

	/**
	 * Returns all the relacion trabajador despachos.
	 *
	 * @return the relacion trabajador despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<RelacionTrabajadorDespacho> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the relacion trabajador despachos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacion trabajador despachos
	 * @param end the upper bound of the range of relacion trabajador despachos (not inclusive)
	 * @return the range of relacion trabajador despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<RelacionTrabajadorDespacho> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the relacion trabajador despachos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of relacion trabajador despachos
	 * @param end the upper bound of the range of relacion trabajador despachos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of relacion trabajador despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<RelacionTrabajadorDespacho> findAll(int start, int end,
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

		List<RelacionTrabajadorDespacho> list = (List<RelacionTrabajadorDespacho>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_RELACIONTRABAJADORDESPACHO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RELACIONTRABAJADORDESPACHO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<RelacionTrabajadorDespacho>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<RelacionTrabajadorDespacho>)QueryUtil.list(q,
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
	 * Removes all the relacion trabajador despachos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (RelacionTrabajadorDespacho relacionTrabajadorDespacho : findAll()) {
			remove(relacionTrabajadorDespacho);
		}
	}

	/**
	 * Returns the number of relacion trabajador despachos.
	 *
	 * @return the number of relacion trabajador despachos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RELACIONTRABAJADORDESPACHO);

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
	 * Initializes the relacion trabajador despacho persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RelacionTrabajadorDespacho>> listenersList = new ArrayList<ModelListener<RelacionTrabajadorDespacho>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RelacionTrabajadorDespacho>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RelacionTrabajadorDespachoImpl.class.getName());
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
	private static final String _SQL_SELECT_RELACIONTRABAJADORDESPACHO = "SELECT relacionTrabajadorDespacho FROM RelacionTrabajadorDespacho relacionTrabajadorDespacho";
	private static final String _SQL_COUNT_RELACIONTRABAJADORDESPACHO = "SELECT COUNT(relacionTrabajadorDespacho) FROM RelacionTrabajadorDespacho relacionTrabajadorDespacho";
	private static final String _ORDER_BY_ENTITY_ALIAS = "relacionTrabajadorDespacho.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RelacionTrabajadorDespacho exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RelacionTrabajadorDespachoPersistenceImpl.class);
	private static RelacionTrabajadorDespacho _nullRelacionTrabajadorDespacho = new RelacionTrabajadorDespachoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RelacionTrabajadorDespacho> toCacheModel() {
				return _nullRelacionTrabajadorDespachoCacheModel;
			}
		};

	private static CacheModel<RelacionTrabajadorDespacho> _nullRelacionTrabajadorDespachoCacheModel =
		new CacheModel<RelacionTrabajadorDespacho>() {
			public RelacionTrabajadorDespacho toEntityModel() {
				return _nullRelacionTrabajadorDespacho;
			}
		};
}