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

import la.netco.despachos_judiciales.entities.NoSuchDespachoException;
import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.impl.DespachoImpl;
import la.netco.despachos_judiciales.entities.model.impl.DespachoModelImpl;
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
 * The persistence implementation for the despacho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see DespachoPersistence
 * @see DespachoUtil
 * @generated
 */
public class DespachoPersistenceImpl extends BasePersistenceImpl<Despacho>
	implements DespachoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DespachoUtil} to access the despacho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DespachoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DespachoModelImpl.ENTITY_CACHE_ENABLED,
			DespachoModelImpl.FINDER_CACHE_ENABLED, DespachoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DespachoModelImpl.ENTITY_CACHE_ENABLED,
			DespachoModelImpl.FINDER_CACHE_ENABLED, DespachoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DespachoModelImpl.ENTITY_CACHE_ENABLED,
			DespachoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the despacho in the entity cache if it is enabled.
	 *
	 * @param despacho the despacho
	 */
	public void cacheResult(Despacho despacho) {
		EntityCacheUtil.putResult(DespachoModelImpl.ENTITY_CACHE_ENABLED,
			DespachoImpl.class, despacho.getPrimaryKey(), despacho);

		despacho.resetOriginalValues();
	}

	/**
	 * Caches the despachos in the entity cache if it is enabled.
	 *
	 * @param despachos the despachos
	 */
	public void cacheResult(List<Despacho> despachos) {
		for (Despacho despacho : despachos) {
			if (EntityCacheUtil.getResult(
						DespachoModelImpl.ENTITY_CACHE_ENABLED,
						DespachoImpl.class, despacho.getPrimaryKey()) == null) {
				cacheResult(despacho);
			}
			else {
				despacho.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all despachos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DespachoImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DespachoImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the despacho.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Despacho despacho) {
		EntityCacheUtil.removeResult(DespachoModelImpl.ENTITY_CACHE_ENABLED,
			DespachoImpl.class, despacho.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Despacho> despachos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Despacho despacho : despachos) {
			EntityCacheUtil.removeResult(DespachoModelImpl.ENTITY_CACHE_ENABLED,
				DespachoImpl.class, despacho.getPrimaryKey());
		}
	}

	/**
	 * Creates a new despacho with the primary key. Does not add the despacho to the database.
	 *
	 * @param codigo the primary key for the new despacho
	 * @return the new despacho
	 */
	public Despacho create(String codigo) {
		Despacho despacho = new DespachoImpl();

		despacho.setNew(true);
		despacho.setPrimaryKey(codigo);

		return despacho;
	}

	/**
	 * Removes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigo the primary key of the despacho
	 * @return the despacho that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchDespachoException if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Despacho remove(String codigo)
		throws NoSuchDespachoException, SystemException {
		return remove((Serializable)codigo);
	}

	/**
	 * Removes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the despacho
	 * @return the despacho that was removed
	 * @throws la.netco.despachos_judiciales.entities.NoSuchDespachoException if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Despacho remove(Serializable primaryKey)
		throws NoSuchDespachoException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Despacho despacho = (Despacho)session.get(DespachoImpl.class,
					primaryKey);

			if (despacho == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDespachoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(despacho);
		}
		catch (NoSuchDespachoException nsee) {
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
	protected Despacho removeImpl(Despacho despacho) throws SystemException {
		despacho = toUnwrappedModel(despacho);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, despacho);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(despacho);

		return despacho;
	}

	@Override
	public Despacho updateImpl(
		la.netco.despachos_judiciales.entities.model.Despacho despacho,
		boolean merge) throws SystemException {
		despacho = toUnwrappedModel(despacho);

		boolean isNew = despacho.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, despacho, merge);

			despacho.setNew(false);
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

		EntityCacheUtil.putResult(DespachoModelImpl.ENTITY_CACHE_ENABLED,
			DespachoImpl.class, despacho.getPrimaryKey(), despacho);

		return despacho;
	}

	protected Despacho toUnwrappedModel(Despacho despacho) {
		if (despacho instanceof DespachoImpl) {
			return despacho;
		}

		DespachoImpl despachoImpl = new DespachoImpl();

		despachoImpl.setNew(despacho.isNew());
		despachoImpl.setPrimaryKey(despacho.getPrimaryKey());

		despachoImpl.setCodigo(despacho.getCodigo());
		despachoImpl.setIdDepartamento(despacho.getIdDepartamento());
		despachoImpl.setIdMunicipio(despacho.getIdMunicipio());
		despachoImpl.setIdEntidad(despacho.getIdEntidad());
		despachoImpl.setIdEspecialidad(despacho.getIdEspecialidad());
		despachoImpl.setConsecutivo(despacho.getConsecutivo());
		despachoImpl.setNombre(despacho.getNombre());
		despachoImpl.setDireccion(despacho.getDireccion());
		despachoImpl.setTelefonos(despacho.getTelefonos());
		despachoImpl.setCorreo_electronico(despacho.getCorreo_electronico());
		despachoImpl.setAcuerdo(despacho.getAcuerdo());
		despachoImpl.setEstado(despacho.getEstado());
		despachoImpl.setFax(despacho.getFax());
		despachoImpl.setHorario_atencion(despacho.getHorario_atencion());
		despachoImpl.setFecha_act(despacho.getFecha_act());

		return despachoImpl;
	}

	/**
	 * Returns the despacho with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the despacho
	 * @return the despacho
	 * @throws com.liferay.portal.NoSuchModelException if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Despacho findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the despacho with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchDespachoException} if it could not be found.
	 *
	 * @param codigo the primary key of the despacho
	 * @return the despacho
	 * @throws la.netco.despachos_judiciales.entities.NoSuchDespachoException if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Despacho findByPrimaryKey(String codigo)
		throws NoSuchDespachoException, SystemException {
		Despacho despacho = fetchByPrimaryKey(codigo);

		if (despacho == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + codigo);
			}

			throw new NoSuchDespachoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				codigo);
		}

		return despacho;
	}

	/**
	 * Returns the despacho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the despacho
	 * @return the despacho, or <code>null</code> if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Despacho fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey((String)primaryKey);
	}

	/**
	 * Returns the despacho with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param codigo the primary key of the despacho
	 * @return the despacho, or <code>null</code> if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Despacho fetchByPrimaryKey(String codigo) throws SystemException {
		Despacho despacho = (Despacho)EntityCacheUtil.getResult(DespachoModelImpl.ENTITY_CACHE_ENABLED,
				DespachoImpl.class, codigo);

		if (despacho == _nullDespacho) {
			return null;
		}

		if (despacho == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				despacho = (Despacho)session.get(DespachoImpl.class, codigo);
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (despacho != null) {
					cacheResult(despacho);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(DespachoModelImpl.ENTITY_CACHE_ENABLED,
						DespachoImpl.class, codigo, _nullDespacho);
				}

				closeSession(session);
			}
		}

		return despacho;
	}

	/**
	 * Returns all the despachos.
	 *
	 * @return the despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Despacho> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the despachos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of despachos
	 * @param end the upper bound of the range of despachos (not inclusive)
	 * @return the range of despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Despacho> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the despachos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of despachos
	 * @param end the upper bound of the range of despachos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Despacho> findAll(int start, int end,
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

		List<Despacho> list = (List<Despacho>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DESPACHO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DESPACHO;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Despacho>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Despacho>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the despachos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Despacho despacho : findAll()) {
			remove(despacho);
		}
	}

	/**
	 * Returns the number of despachos.
	 *
	 * @return the number of despachos
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DESPACHO);

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
	 * Initializes the despacho persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.la.netco.despachos_judiciales.entities.model.Despacho")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Despacho>> listenersList = new ArrayList<ModelListener<Despacho>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Despacho>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(DespachoImpl.class.getName());
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
	private static final String _SQL_SELECT_DESPACHO = "SELECT despacho FROM Despacho despacho";
	private static final String _SQL_COUNT_DESPACHO = "SELECT COUNT(despacho) FROM Despacho despacho";
	private static final String _ORDER_BY_ENTITY_ALIAS = "despacho.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Despacho exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DespachoPersistenceImpl.class);
	private static Despacho _nullDespacho = new DespachoImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Despacho> toCacheModel() {
				return _nullDespachoCacheModel;
			}
		};

	private static CacheModel<Despacho> _nullDespachoCacheModel = new CacheModel<Despacho>() {
			public Despacho toEntityModel() {
				return _nullDespacho;
			}
		};
}