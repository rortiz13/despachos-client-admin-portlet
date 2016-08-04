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

import la.netco.despachos_judiciales.entities.NoSuchCircuitoException;
import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.impl.CircuitoImpl;
import la.netco.despachos_judiciales.entities.model.impl.CircuitoModelImpl;
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
 * The persistence implementation for the circuito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see CircuitoPersistence
 * @see CircuitoUtil
 * @generated
 */
public class CircuitoPersistenceImpl extends BasePersistenceImpl<Circuito>
	implements CircuitoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CircuitoUtil} to access the circuito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CircuitoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
			CircuitoModelImpl.FINDER_CACHE_ENABLED, CircuitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
			CircuitoModelImpl.FINDER_CACHE_ENABLED, CircuitoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
			CircuitoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the circuito in the entity cache if it is enabled.
	 *
	 * @param circuito the circuito
	 */
	public void cacheResult(Circuito circuito) {
		EntityCacheUtil.putResult(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
			CircuitoImpl.class, circuito.getPrimaryKey(), circuito);

		circuito.resetOriginalValues();
	}

	/**
	 * Caches the circuitos in the entity cache if it is enabled.
	 *
	 * @param circuitos the circuitos
	 */
	public void cacheResult(List<Circuito> circuitos) {
		for (Circuito circuito : circuitos) {
			if (EntityCacheUtil.getResult(
						CircuitoModelImpl.ENTITY_CACHE_ENABLED,
						CircuitoImpl.class, circuito.getPrimaryKey()) == null) {
				cacheResult(circuito);
			}
			else {
				circuito.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all circuitos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CircuitoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CircuitoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the circuito.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Circuito circuito) {
		EntityCacheUtil.removeResult(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
			CircuitoImpl.class, circuito.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Circuito> circuitos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Circuito circuito : circuitos) {
			EntityCacheUtil.removeResult(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
				CircuitoImpl.class, circuito.getPrimaryKey());
		}
	}

	/**
	 * Creates a new circuito with the primary key. Does not add the circuito to the database.
	 *
	 * @param codigo the primary key for the new circuito
	 * @return the new circuito
	 */
	public Circuito create(int codigo) {
		Circuito circuito = new CircuitoImpl();

		circuito.setNew(true);
		circuito.setPrimaryKey(codigo);

		return circuito;
	}

	/**
	 * Removes the circuito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigo the primary key of the circuito
	 * @return the circuito that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Circuito remove(int codigo)
		throws NoSuchCircuitoException, SystemException {
		return remove(Integer.valueOf(codigo));
	}

	/**
	 * Removes the circuito with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the circuito
	 * @return the circuito that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Circuito remove(Serializable primaryKey)
		throws NoSuchCircuitoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Circuito circuito = (Circuito)session.get(CircuitoImpl.class,
					primaryKey);

			if (circuito == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCircuitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(circuito);
		}
		catch (NoSuchCircuitoException nsee) {
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
	protected Circuito removeImpl(Circuito circuito) throws SystemException {
		circuito = toUnwrappedModel(circuito);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, circuito);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(circuito);

		return circuito;
	}

	@Override
	public Circuito updateImpl(
		la.netco.despachos_judiciales.entities.model.Circuito circuito,
		boolean merge) throws SystemException {
		circuito = toUnwrappedModel(circuito);

		boolean isNew = circuito.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, circuito, merge);

			circuito.setNew(false);
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

		EntityCacheUtil.putResult(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
			CircuitoImpl.class, circuito.getPrimaryKey(), circuito);

		return circuito;
	}

	protected Circuito toUnwrappedModel(Circuito circuito) {
		if (circuito instanceof CircuitoImpl) {
			return circuito;
		}

		CircuitoImpl circuitoImpl = new CircuitoImpl();

		circuitoImpl.setNew(circuito.isNew());
		circuitoImpl.setPrimaryKey(circuito.getPrimaryKey());

		circuitoImpl.setCodigo(circuito.getCodigo());
		circuitoImpl.setNombre(circuito.getNombre());
		circuitoImpl.setIdDistrito(circuito.getIdDistrito());
		circuitoImpl.setJurisdiccion(circuito.getJurisdiccion());
		circuitoImpl.setCodigo_dane(circuito.getCodigo_dane());

		return circuitoImpl;
	}

	/**
	 * Returns the circuito with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the circuito
	 * @return the circuito
	 * @throws com.liferay.portal.NoSuchModelException if a circuito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Circuito findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the circuito with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchCircuitoException} if it could not be found.
	 *
	 * @param codigo the primary key of the circuito
	 * @return the circuito
	 * @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Circuito findByPrimaryKey(int codigo)
		throws NoSuchCircuitoException, SystemException {
		Circuito circuito = fetchByPrimaryKey(codigo);

		if (circuito == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + codigo);
			}

			throw new NoSuchCircuitoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				codigo);
		}

		return circuito;
	}

	/**
	 * Returns the circuito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the circuito
	 * @return the circuito, or <code>null</code> if a circuito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Circuito fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the circuito with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param codigo the primary key of the circuito
	 * @return the circuito, or <code>null</code> if a circuito with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Circuito fetchByPrimaryKey(int codigo) throws SystemException {
		Circuito circuito = (Circuito)EntityCacheUtil.getResult(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
				CircuitoImpl.class, codigo);

		if (circuito == _nullCircuito) {
			return null;
		}

		if (circuito == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				circuito = (Circuito)session.get(CircuitoImpl.class,
						Integer.valueOf(codigo));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (circuito != null) {
					cacheResult(circuito);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(CircuitoModelImpl.ENTITY_CACHE_ENABLED,
						CircuitoImpl.class, codigo, _nullCircuito);
				}

				closeSession(session);
			}
		}

		return circuito;
	}

	/**
	 * Returns all the circuitos.
	 *
	 * @return the circuitos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Circuito> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the circuitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of circuitos
	 * @param end the upper bound of the range of circuitos (not inclusive)
	 * @return the range of circuitos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Circuito> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the circuitos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of circuitos
	 * @param end the upper bound of the range of circuitos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of circuitos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Circuito> findAll(int start, int end,
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

		List<Circuito> list = (List<Circuito>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CIRCUITO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CIRCUITO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Circuito>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Circuito>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the circuitos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Circuito circuito : findAll()) {
			remove(circuito);
		}
	}

	/**
	 * Returns the number of circuitos.
	 *
	 * @return the number of circuitos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CIRCUITO);

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
	 * Initializes the circuito persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.Circuito")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Circuito>> listenersList = new ArrayList<ModelListener<Circuito>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Circuito>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(CircuitoImpl.class.getName());
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
	private static final String _SQL_SELECT_CIRCUITO = "SELECT circuito FROM Circuito circuito";
	private static final String _SQL_COUNT_CIRCUITO = "SELECT COUNT(circuito) FROM Circuito circuito";
	private static final String _ORDER_BY_ENTITY_ALIAS = "circuito.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Circuito exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CircuitoPersistenceImpl.class);
	private static Circuito _nullCircuito = new CircuitoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Circuito> toCacheModel() {
				return _nullCircuitoCacheModel;
			}
		};

	private static CacheModel<Circuito> _nullCircuitoCacheModel = new CacheModel<Circuito>() {
			public Circuito toEntityModel() {
				return _nullCircuito;
			}
		};
}