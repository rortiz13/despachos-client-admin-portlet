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

import la.netco.despachos_judiciales.entities.NoSuchMunicipioException;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.model.impl.MunicipioImpl;
import la.netco.despachos_judiciales.entities.model.impl.MunicipioModelImpl;
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
 * The persistence implementation for the municipio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see MunicipioPersistence
 * @see MunicipioUtil
 * @generated
 */
public class MunicipioPersistenceImpl extends BasePersistenceImpl<Municipio>
	implements MunicipioPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MunicipioUtil} to access the municipio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MunicipioImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioModelImpl.FINDER_CACHE_ENABLED, MunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioModelImpl.FINDER_CACHE_ENABLED, MunicipioImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the municipio in the entity cache if it is enabled.
	 *
	 * @param municipio the municipio
	 */
	public void cacheResult(Municipio municipio) {
		EntityCacheUtil.putResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioImpl.class, municipio.getPrimaryKey(), municipio);

		municipio.resetOriginalValues();
	}

	/**
	 * Caches the municipios in the entity cache if it is enabled.
	 *
	 * @param municipios the municipios
	 */
	public void cacheResult(List<Municipio> municipios) {
		for (Municipio municipio : municipios) {
			if (EntityCacheUtil.getResult(
						MunicipioModelImpl.ENTITY_CACHE_ENABLED,
						MunicipioImpl.class, municipio.getPrimaryKey()) == null) {
				cacheResult(municipio);
			}
			else {
				municipio.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all municipios.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MunicipioImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MunicipioImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the municipio.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Municipio municipio) {
		EntityCacheUtil.removeResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioImpl.class, municipio.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Municipio> municipios) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Municipio municipio : municipios) {
			EntityCacheUtil.removeResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
				MunicipioImpl.class, municipio.getPrimaryKey());
		}
	}

	/**
	 * Creates a new municipio with the primary key. Does not add the municipio to the database.
	 *
	 * @param municipioPK the primary key for the new municipio
	 * @return the new municipio
	 */
	public Municipio create(MunicipioPK municipioPK) {
		Municipio municipio = new MunicipioImpl();

		municipio.setNew(true);
		municipio.setPrimaryKey(municipioPK);

		return municipio;
	}

	/**
	 * Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param municipioPK the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Municipio remove(MunicipioPK municipioPK)
		throws NoSuchMunicipioException, SystemException {
		return remove((Serializable)municipioPK);
	}

	/**
	 * Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the municipio
	 * @return the municipio that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio remove(Serializable primaryKey)
		throws NoSuchMunicipioException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Municipio municipio = (Municipio)session.get(MunicipioImpl.class,
					primaryKey);

			if (municipio == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMunicipioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(municipio);
		}
		catch (NoSuchMunicipioException nsee) {
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
	protected Municipio removeImpl(Municipio municipio)
		throws SystemException {
		municipio = toUnwrappedModel(municipio);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, municipio);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(municipio);

		return municipio;
	}

	@Override
	public Municipio updateImpl(
		la.netco.despachos_judiciales.entities.model.Municipio municipio,
		boolean merge) throws SystemException {
		municipio = toUnwrappedModel(municipio);

		boolean isNew = municipio.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, municipio, merge);

			municipio.setNew(false);
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

		EntityCacheUtil.putResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
			MunicipioImpl.class, municipio.getPrimaryKey(), municipio);

		return municipio;
	}

	protected Municipio toUnwrappedModel(Municipio municipio) {
		if (municipio instanceof MunicipioImpl) {
			return municipio;
		}

		MunicipioImpl municipioImpl = new MunicipioImpl();

		municipioImpl.setNew(municipio.isNew());
		municipioImpl.setPrimaryKey(municipio.getPrimaryKey());

		municipioImpl.setIdDepartamento(municipio.getIdDepartamento());
		municipioImpl.setCodigo(municipio.getCodigo());
		municipioImpl.setNombre(municipio.getNombre());
		municipioImpl.setIndicativo(municipio.getIndicativo());
		municipioImpl.setIdCircuito(municipio.getIdCircuito());
		municipioImpl.setIdCircuitoAdministrativo(municipio.getIdCircuitoAdministrativo());
		municipioImpl.setIdConsejoSeccional(municipio.getIdConsejoSeccional());
		municipioImpl.setIdCircuitoDisciplinario(municipio.getIdCircuitoDisciplinario());

		return municipioImpl;
	}

	/**
	 * Returns the municipio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the municipio
	 * @return the municipio
	 * @throws com.liferay.portal.NoSuchModelException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((MunicipioPK)primaryKey);
	}

	/**
	 * Returns the municipio with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchMunicipioException} if it could not be found.
	 *
	 * @param municipioPK the primary key of the municipio
	 * @return the municipio
	 * @throws la.netco.despachos_judiciales.entities.NoSuchMunicipioException if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Municipio findByPrimaryKey(MunicipioPK municipioPK)
		throws NoSuchMunicipioException, SystemException {
		Municipio municipio = fetchByPrimaryKey(municipioPK);

		if (municipio == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + municipioPK);
			}

			throw new NoSuchMunicipioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				municipioPK);
		}

		return municipio;
	}

	/**
	 * Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the municipio
	 * @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Municipio fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((MunicipioPK)primaryKey);
	}

	/**
	 * Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param municipioPK the primary key of the municipio
	 * @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Municipio fetchByPrimaryKey(MunicipioPK municipioPK)
		throws SystemException {
		Municipio municipio = (Municipio)EntityCacheUtil.getResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
				MunicipioImpl.class, municipioPK);

		if (municipio == _nullMunicipio) {
			return null;
		}

		if (municipio == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				municipio = (Municipio)session.get(MunicipioImpl.class,
						municipioPK);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (municipio != null) {
					cacheResult(municipio);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(MunicipioModelImpl.ENTITY_CACHE_ENABLED,
						MunicipioImpl.class, municipioPK, _nullMunicipio);
				}

				closeSession(session);
			}
		}

		return municipio;
	}

	/**
	 * Returns all the municipios.
	 *
	 * @return the municipios
	 * @throws SystemException if a system exception occurred
	 */
	public List<Municipio> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @return the range of municipios
	 * @throws SystemException if a system exception occurred
	 */
	public List<Municipio> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the municipios.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of municipios
	 * @param end the upper bound of the range of municipios (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of municipios
	 * @throws SystemException if a system exception occurred
	 */
	public List<Municipio> findAll(int start, int end,
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

		List<Municipio> list = (List<Municipio>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MUNICIPIO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MUNICIPIO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Municipio>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Municipio>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the municipios from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Municipio municipio : findAll()) {
			remove(municipio);
		}
	}

	/**
	 * Returns the number of municipios.
	 *
	 * @return the number of municipios
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MUNICIPIO);

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
	 * Initializes the municipio persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.Municipio")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Municipio>> listenersList = new ArrayList<ModelListener<Municipio>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Municipio>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(MunicipioImpl.class.getName());
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
	private static final String _SQL_SELECT_MUNICIPIO = "SELECT municipio FROM Municipio municipio";
	private static final String _SQL_COUNT_MUNICIPIO = "SELECT COUNT(municipio) FROM Municipio municipio";
	private static final String _ORDER_BY_ENTITY_ALIAS = "municipio.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Municipio exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MunicipioPersistenceImpl.class);
	private static Municipio _nullMunicipio = new MunicipioImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Municipio> toCacheModel() {
				return _nullMunicipioCacheModel;
			}
		};

	private static CacheModel<Municipio> _nullMunicipioCacheModel = new CacheModel<Municipio>() {
			public Municipio toEntityModel() {
				return _nullMunicipio;
			}
		};
}