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

import la.netco.despachos_judiciales.entities.NoSuchEspecialidadException;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.impl.EspecialidadImpl;
import la.netco.despachos_judiciales.entities.model.impl.EspecialidadModelImpl;
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
 * The persistence implementation for the especialidad service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see EspecialidadPersistence
 * @see EspecialidadUtil
 * @generated
 */
public class EspecialidadPersistenceImpl extends BasePersistenceImpl<Especialidad>
	implements EspecialidadPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EspecialidadUtil} to access the especialidad persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EspecialidadImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
			EspecialidadModelImpl.FINDER_CACHE_ENABLED, EspecialidadImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
			EspecialidadModelImpl.FINDER_CACHE_ENABLED, EspecialidadImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
			EspecialidadModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the especialidad in the entity cache if it is enabled.
	 *
	 * @param especialidad the especialidad
	 */
	public void cacheResult(Especialidad especialidad) {
		EntityCacheUtil.putResult(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
			EspecialidadImpl.class, especialidad.getPrimaryKey(), especialidad);

		especialidad.resetOriginalValues();
	}

	/**
	 * Caches the especialidads in the entity cache if it is enabled.
	 *
	 * @param especialidads the especialidads
	 */
	public void cacheResult(List<Especialidad> especialidads) {
		for (Especialidad especialidad : especialidads) {
			if (EntityCacheUtil.getResult(
						EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
						EspecialidadImpl.class, especialidad.getPrimaryKey()) == null) {
				cacheResult(especialidad);
			}
			else {
				especialidad.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all especialidads.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EspecialidadImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EspecialidadImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the especialidad.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Especialidad especialidad) {
		EntityCacheUtil.removeResult(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
			EspecialidadImpl.class, especialidad.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Especialidad> especialidads) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Especialidad especialidad : especialidads) {
			EntityCacheUtil.removeResult(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
				EspecialidadImpl.class, especialidad.getPrimaryKey());
		}
	}

	/**
	 * Creates a new especialidad with the primary key. Does not add the especialidad to the database.
	 *
	 * @param codigo the primary key for the new especialidad
	 * @return the new especialidad
	 */
	public Especialidad create(int codigo) {
		Especialidad especialidad = new EspecialidadImpl();

		especialidad.setNew(true);
		especialidad.setPrimaryKey(codigo);

		return especialidad;
	}

	/**
	 * Removes the especialidad with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigo the primary key of the especialidad
	 * @return the especialidad that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchEspecialidadException if a especialidad with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Especialidad remove(int codigo)
		throws NoSuchEspecialidadException, SystemException {
		return remove(Integer.valueOf(codigo));
	}

	/**
	 * Removes the especialidad with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the especialidad
	 * @return the especialidad that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchEspecialidadException if a especialidad with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Especialidad remove(Serializable primaryKey)
		throws NoSuchEspecialidadException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Especialidad especialidad = (Especialidad)session.get(EspecialidadImpl.class,
					primaryKey);

			if (especialidad == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEspecialidadException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(especialidad);
		}
		catch (NoSuchEspecialidadException nsee) {
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
	protected Especialidad removeImpl(Especialidad especialidad)
		throws SystemException {
		especialidad = toUnwrappedModel(especialidad);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, especialidad);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(especialidad);

		return especialidad;
	}

	@Override
	public Especialidad updateImpl(
		la.netco.despachos_judiciales.entities.model.Especialidad especialidad,
		boolean merge) throws SystemException {
		especialidad = toUnwrappedModel(especialidad);

		boolean isNew = especialidad.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, especialidad, merge);

			especialidad.setNew(false);
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

		EntityCacheUtil.putResult(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
			EspecialidadImpl.class, especialidad.getPrimaryKey(), especialidad);

		return especialidad;
	}

	protected Especialidad toUnwrappedModel(Especialidad especialidad) {
		if (especialidad instanceof EspecialidadImpl) {
			return especialidad;
		}

		EspecialidadImpl especialidadImpl = new EspecialidadImpl();

		especialidadImpl.setNew(especialidad.isNew());
		especialidadImpl.setPrimaryKey(especialidad.getPrimaryKey());

		especialidadImpl.setCodigo(especialidad.getCodigo());
		especialidadImpl.setNombre(especialidad.getNombre());

		return especialidadImpl;
	}

	/**
	 * Returns the especialidad with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the especialidad
	 * @return the especialidad
	 * @throws com.liferay.portal.NoSuchModelException if a especialidad with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Especialidad findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the especialidad with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchEspecialidadException} if it could not be found.
	 *
	 * @param codigo the primary key of the especialidad
	 * @return the especialidad
	 * @throws la.netco.despachos_judiciales.entities.NoSuchEspecialidadException if a especialidad with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Especialidad findByPrimaryKey(int codigo)
		throws NoSuchEspecialidadException, SystemException {
		Especialidad especialidad = fetchByPrimaryKey(codigo);

		if (especialidad == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + codigo);
			}

			throw new NoSuchEspecialidadException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				codigo);
		}

		return especialidad;
	}

	/**
	 * Returns the especialidad with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the especialidad
	 * @return the especialidad, or <code>null</code> if a especialidad with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Especialidad fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the especialidad with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param codigo the primary key of the especialidad
	 * @return the especialidad, or <code>null</code> if a especialidad with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Especialidad fetchByPrimaryKey(int codigo) throws SystemException {
		Especialidad especialidad = (Especialidad)EntityCacheUtil.getResult(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
				EspecialidadImpl.class, codigo);

		if (especialidad == _nullEspecialidad) {
			return null;
		}

		if (especialidad == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				especialidad = (Especialidad)session.get(EspecialidadImpl.class,
						Integer.valueOf(codigo));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (especialidad != null) {
					cacheResult(especialidad);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(EspecialidadModelImpl.ENTITY_CACHE_ENABLED,
						EspecialidadImpl.class, codigo, _nullEspecialidad);
				}

				closeSession(session);
			}
		}

		return especialidad;
	}

	/**
	 * Returns all the especialidads.
	 *
	 * @return the especialidads
	 * @throws SystemException if a system exception occurred
	 */
	public List<Especialidad> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the especialidads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of especialidads
	 * @param end the upper bound of the range of especialidads (not inclusive)
	 * @return the range of especialidads
	 * @throws SystemException if a system exception occurred
	 */
	public List<Especialidad> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the especialidads.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of especialidads
	 * @param end the upper bound of the range of especialidads (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of especialidads
	 * @throws SystemException if a system exception occurred
	 */
	public List<Especialidad> findAll(int start, int end,
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

		List<Especialidad> list = (List<Especialidad>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ESPECIALIDAD);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ESPECIALIDAD;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Especialidad>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Especialidad>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the especialidads from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Especialidad especialidad : findAll()) {
			remove(especialidad);
		}
	}

	/**
	 * Returns the number of especialidads.
	 *
	 * @return the number of especialidads
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ESPECIALIDAD);

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
	 * Initializes the especialidad persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.Especialidad")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Especialidad>> listenersList = new ArrayList<ModelListener<Especialidad>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Especialidad>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(EspecialidadImpl.class.getName());
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
	private static final String _SQL_SELECT_ESPECIALIDAD = "SELECT especialidad FROM Especialidad especialidad";
	private static final String _SQL_COUNT_ESPECIALIDAD = "SELECT COUNT(especialidad) FROM Especialidad especialidad";
	private static final String _ORDER_BY_ENTITY_ALIAS = "especialidad.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Especialidad exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EspecialidadPersistenceImpl.class);
	private static Especialidad _nullEspecialidad = new EspecialidadImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Especialidad> toCacheModel() {
				return _nullEspecialidadCacheModel;
			}
		};

	private static CacheModel<Especialidad> _nullEspecialidadCacheModel = new CacheModel<Especialidad>() {
			public Especialidad toEntityModel() {
				return _nullEspecialidad;
			}
		};
}