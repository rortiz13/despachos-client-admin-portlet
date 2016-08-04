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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import la.netco.despachos_judiciales.entities.model.Trabajador;

import java.util.List;

/**
 * The persistence utility for the trabajador service. This utility wraps {@link TrabajadorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see TrabajadorPersistence
 * @see TrabajadorPersistenceImpl
 * @generated
 */
public class TrabajadorUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Trabajador trabajador) {
		getPersistence().clearCache(trabajador);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Trabajador> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Trabajador> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Trabajador> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Trabajador update(Trabajador trabajador, boolean merge)
		throws SystemException {
		return getPersistence().update(trabajador, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Trabajador update(Trabajador trabajador, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(trabajador, merge, serviceContext);
	}

	/**
	* Caches the trabajador in the entity cache if it is enabled.
	*
	* @param trabajador the trabajador
	*/
	public static void cacheResult(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador) {
		getPersistence().cacheResult(trabajador);
	}

	/**
	* Caches the trabajadors in the entity cache if it is enabled.
	*
	* @param trabajadors the trabajadors
	*/
	public static void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> trabajadors) {
		getPersistence().cacheResult(trabajadors);
	}

	/**
	* Creates a new trabajador with the primary key. Does not add the trabajador to the database.
	*
	* @param cedula the primary key for the new trabajador
	* @return the new trabajador
	*/
	public static la.netco.despachos_judiciales.entities.model.Trabajador create(
		java.lang.String cedula) {
		return getPersistence().create(cedula);
	}

	/**
	* Removes the trabajador with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchTrabajadorException if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Trabajador remove(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchTrabajadorException {
		return getPersistence().remove(cedula);
	}

	public static la.netco.despachos_judiciales.entities.model.Trabajador updateImpl(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(trabajador, merge);
	}

	/**
	* Returns the trabajador with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchTrabajadorException} if it could not be found.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador
	* @throws la.netco.despachos_judiciales.entities.NoSuchTrabajadorException if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Trabajador findByPrimaryKey(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchTrabajadorException {
		return getPersistence().findByPrimaryKey(cedula);
	}

	/**
	* Returns the trabajador with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador, or <code>null</code> if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Trabajador fetchByPrimaryKey(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(cedula);
	}

	/**
	* Returns all the trabajadors.
	*
	* @return the trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the trabajadors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of trabajadors
	* @param end the upper bound of the range of trabajadors (not inclusive)
	* @return the range of trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the trabajadors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of trabajadors
	* @param end the upper bound of the range of trabajadors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the trabajadors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of trabajadors.
	*
	* @return the number of trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TrabajadorPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TrabajadorPersistence)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					TrabajadorPersistence.class.getName());

			ReferenceRegistry.registerReference(TrabajadorUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TrabajadorPersistence persistence) {
	}

	private static TrabajadorPersistence _persistence;
}