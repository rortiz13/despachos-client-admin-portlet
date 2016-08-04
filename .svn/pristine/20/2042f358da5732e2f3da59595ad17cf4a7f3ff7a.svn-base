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

import la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.impl.ConsejoSeccionalImpl;
import la.netco.despachos_judiciales.entities.model.impl.ConsejoSeccionalModelImpl;
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
 * The persistence implementation for the consejo seccional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see ConsejoSeccionalPersistence
 * @see ConsejoSeccionalUtil
 * @generated
 */
public class ConsejoSeccionalPersistenceImpl extends BasePersistenceImpl<ConsejoSeccional>
	implements ConsejoSeccionalPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ConsejoSeccionalUtil} to access the consejo seccional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ConsejoSeccionalImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
			ConsejoSeccionalModelImpl.FINDER_CACHE_ENABLED,
			ConsejoSeccionalImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
			ConsejoSeccionalModelImpl.FINDER_CACHE_ENABLED,
			ConsejoSeccionalImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
			ConsejoSeccionalModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the consejo seccional in the entity cache if it is enabled.
	 *
	 * @param consejoSeccional the consejo seccional
	 */
	public void cacheResult(ConsejoSeccional consejoSeccional) {
		EntityCacheUtil.putResult(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
			ConsejoSeccionalImpl.class, consejoSeccional.getPrimaryKey(),
			consejoSeccional);

		consejoSeccional.resetOriginalValues();
	}

	/**
	 * Caches the consejo seccionals in the entity cache if it is enabled.
	 *
	 * @param consejoSeccionals the consejo seccionals
	 */
	public void cacheResult(List<ConsejoSeccional> consejoSeccionals) {
		for (ConsejoSeccional consejoSeccional : consejoSeccionals) {
			if (EntityCacheUtil.getResult(
						ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
						ConsejoSeccionalImpl.class,
						consejoSeccional.getPrimaryKey()) == null) {
				cacheResult(consejoSeccional);
			}
			else {
				consejoSeccional.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all consejo seccionals.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ConsejoSeccionalImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ConsejoSeccionalImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the consejo seccional.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ConsejoSeccional consejoSeccional) {
		EntityCacheUtil.removeResult(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
			ConsejoSeccionalImpl.class, consejoSeccional.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ConsejoSeccional> consejoSeccionals) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ConsejoSeccional consejoSeccional : consejoSeccionals) {
			EntityCacheUtil.removeResult(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
				ConsejoSeccionalImpl.class, consejoSeccional.getPrimaryKey());
		}
	}

	/**
	 * Creates a new consejo seccional with the primary key. Does not add the consejo seccional to the database.
	 *
	 * @param codigo the primary key for the new consejo seccional
	 * @return the new consejo seccional
	 */
	public ConsejoSeccional create(int codigo) {
		ConsejoSeccional consejoSeccional = new ConsejoSeccionalImpl();

		consejoSeccional.setNew(true);
		consejoSeccional.setPrimaryKey(codigo);

		return consejoSeccional;
	}

	/**
	 * Removes the consejo seccional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigo the primary key of the consejo seccional
	 * @return the consejo seccional that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException if a consejo seccional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ConsejoSeccional remove(int codigo)
		throws NoSuchConsejoSeccionalException, SystemException {
		return remove(Integer.valueOf(codigo));
	}

	/**
	 * Removes the consejo seccional with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the consejo seccional
	 * @return the consejo seccional that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException if a consejo seccional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConsejoSeccional remove(Serializable primaryKey)
		throws NoSuchConsejoSeccionalException, SystemException {
		Session session = null;

		try {
			session = openSession();

			ConsejoSeccional consejoSeccional = (ConsejoSeccional)session.get(ConsejoSeccionalImpl.class,
					primaryKey);

			if (consejoSeccional == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchConsejoSeccionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(consejoSeccional);
		}
		catch (NoSuchConsejoSeccionalException nsee) {
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
	protected ConsejoSeccional removeImpl(ConsejoSeccional consejoSeccional)
		throws SystemException {
		consejoSeccional = toUnwrappedModel(consejoSeccional);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, consejoSeccional);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(consejoSeccional);

		return consejoSeccional;
	}

	@Override
	public ConsejoSeccional updateImpl(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional,
		boolean merge) throws SystemException {
		consejoSeccional = toUnwrappedModel(consejoSeccional);

		boolean isNew = consejoSeccional.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, consejoSeccional, merge);

			consejoSeccional.setNew(false);
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

		EntityCacheUtil.putResult(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
			ConsejoSeccionalImpl.class, consejoSeccional.getPrimaryKey(),
			consejoSeccional);

		return consejoSeccional;
	}

	protected ConsejoSeccional toUnwrappedModel(
		ConsejoSeccional consejoSeccional) {
		if (consejoSeccional instanceof ConsejoSeccionalImpl) {
			return consejoSeccional;
		}

		ConsejoSeccionalImpl consejoSeccionalImpl = new ConsejoSeccionalImpl();

		consejoSeccionalImpl.setNew(consejoSeccional.isNew());
		consejoSeccionalImpl.setPrimaryKey(consejoSeccional.getPrimaryKey());

		consejoSeccionalImpl.setCodigo(consejoSeccional.getCodigo());
		consejoSeccionalImpl.setNombre(consejoSeccional.getNombre());
		consejoSeccionalImpl.setDireccion(consejoSeccional.getDireccion());
		consejoSeccionalImpl.setTelefonos(consejoSeccional.getTelefonos());
		consejoSeccionalImpl.setCorreo_electronico(consejoSeccional.getCorreo_electronico());

		return consejoSeccionalImpl;
	}

	/**
	 * Returns the consejo seccional with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the consejo seccional
	 * @return the consejo seccional
	 * @throws com.liferay.portal.NoSuchModelException if a consejo seccional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConsejoSeccional findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the consejo seccional with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException} if it could not be found.
	 *
	 * @param codigo the primary key of the consejo seccional
	 * @return the consejo seccional
	 * @throws la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException if a consejo seccional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ConsejoSeccional findByPrimaryKey(int codigo)
		throws NoSuchConsejoSeccionalException, SystemException {
		ConsejoSeccional consejoSeccional = fetchByPrimaryKey(codigo);

		if (consejoSeccional == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + codigo);
			}

			throw new NoSuchConsejoSeccionalException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				codigo);
		}

		return consejoSeccional;
	}

	/**
	 * Returns the consejo seccional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the consejo seccional
	 * @return the consejo seccional, or <code>null</code> if a consejo seccional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public ConsejoSeccional fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the consejo seccional with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param codigo the primary key of the consejo seccional
	 * @return the consejo seccional, or <code>null</code> if a consejo seccional with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public ConsejoSeccional fetchByPrimaryKey(int codigo)
		throws SystemException {
		ConsejoSeccional consejoSeccional = (ConsejoSeccional)EntityCacheUtil.getResult(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
				ConsejoSeccionalImpl.class, codigo);

		if (consejoSeccional == _nullConsejoSeccional) {
			return null;
		}

		if (consejoSeccional == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				consejoSeccional = (ConsejoSeccional)session.get(ConsejoSeccionalImpl.class,
						Integer.valueOf(codigo));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (consejoSeccional != null) {
					cacheResult(consejoSeccional);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ConsejoSeccionalModelImpl.ENTITY_CACHE_ENABLED,
						ConsejoSeccionalImpl.class, codigo,
						_nullConsejoSeccional);
				}

				closeSession(session);
			}
		}

		return consejoSeccional;
	}

	/**
	 * Returns all the consejo seccionals.
	 *
	 * @return the consejo seccionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<ConsejoSeccional> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the consejo seccionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of consejo seccionals
	 * @param end the upper bound of the range of consejo seccionals (not inclusive)
	 * @return the range of consejo seccionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<ConsejoSeccional> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the consejo seccionals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of consejo seccionals
	 * @param end the upper bound of the range of consejo seccionals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of consejo seccionals
	 * @throws SystemException if a system exception occurred
	 */
	public List<ConsejoSeccional> findAll(int start, int end,
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

		List<ConsejoSeccional> list = (List<ConsejoSeccional>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CONSEJOSECCIONAL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CONSEJOSECCIONAL;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<ConsejoSeccional>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<ConsejoSeccional>)QueryUtil.list(q,
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
	 * Removes all the consejo seccionals from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (ConsejoSeccional consejoSeccional : findAll()) {
			remove(consejoSeccional);
		}
	}

	/**
	 * Returns the number of consejo seccionals.
	 *
	 * @return the number of consejo seccionals
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CONSEJOSECCIONAL);

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
	 * Initializes the consejo seccional persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.ConsejoSeccional")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<ConsejoSeccional>> listenersList = new ArrayList<ModelListener<ConsejoSeccional>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<ConsejoSeccional>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ConsejoSeccionalImpl.class.getName());
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
	private static final String _SQL_SELECT_CONSEJOSECCIONAL = "SELECT consejoSeccional FROM ConsejoSeccional consejoSeccional";
	private static final String _SQL_COUNT_CONSEJOSECCIONAL = "SELECT COUNT(consejoSeccional) FROM ConsejoSeccional consejoSeccional";
	private static final String _ORDER_BY_ENTITY_ALIAS = "consejoSeccional.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ConsejoSeccional exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ConsejoSeccionalPersistenceImpl.class);
	private static ConsejoSeccional _nullConsejoSeccional = new ConsejoSeccionalImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<ConsejoSeccional> toCacheModel() {
				return _nullConsejoSeccionalCacheModel;
			}
		};

	private static CacheModel<ConsejoSeccional> _nullConsejoSeccionalCacheModel = new CacheModel<ConsejoSeccional>() {
			public ConsejoSeccional toEntityModel() {
				return _nullConsejoSeccional;
			}
		};
}