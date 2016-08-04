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

import la.netco.despachos_judiciales.entities.model.Municipio;

import java.util.List;

/**
 * The persistence utility for the municipio service. This utility wraps {@link MunicipioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see MunicipioPersistence
 * @see MunicipioPersistenceImpl
 * @generated
 */
public class MunicipioUtil {
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
	public static void clearCache(Municipio municipio) {
		getPersistence().clearCache(municipio);
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
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Municipio> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Municipio update(Municipio municipio, boolean merge)
		throws SystemException {
		return getPersistence().update(municipio, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Municipio update(Municipio municipio, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(municipio, merge, serviceContext);
	}

	/**
	* Caches the municipio in the entity cache if it is enabled.
	*
	* @param municipio the municipio
	*/
	public static void cacheResult(
		la.netco.despachos_judiciales.entities.model.Municipio municipio) {
		getPersistence().cacheResult(municipio);
	}

	/**
	* Caches the municipios in the entity cache if it is enabled.
	*
	* @param municipios the municipios
	*/
	public static void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> municipios) {
		getPersistence().cacheResult(municipios);
	}

	/**
	* Creates a new municipio with the primary key. Does not add the municipio to the database.
	*
	* @param municipioPK the primary key for the new municipio
	* @return the new municipio
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio create(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK) {
		return getPersistence().create(municipioPK);
	}

	/**
	* Removes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param municipioPK the primary key of the municipio
	* @return the municipio that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchMunicipioException if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio remove(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchMunicipioException {
		return getPersistence().remove(municipioPK);
	}

	public static la.netco.despachos_judiciales.entities.model.Municipio updateImpl(
		la.netco.despachos_judiciales.entities.model.Municipio municipio,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(municipio, merge);
	}

	/**
	* Returns the municipio with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchMunicipioException} if it could not be found.
	*
	* @param municipioPK the primary key of the municipio
	* @return the municipio
	* @throws la.netco.despachos_judiciales.entities.NoSuchMunicipioException if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio findByPrimaryKey(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchMunicipioException {
		return getPersistence().findByPrimaryKey(municipioPK);
	}

	/**
	* Returns the municipio with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param municipioPK the primary key of the municipio
	* @return the municipio, or <code>null</code> if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio fetchByPrimaryKey(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(municipioPK);
	}

	/**
	* Returns all the municipios.
	*
	* @return the municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the municipios from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of municipios.
	*
	* @return the number of municipios
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MunicipioPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MunicipioPersistence)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					MunicipioPersistence.class.getName());

			ReferenceRegistry.registerReference(MunicipioUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(MunicipioPersistence persistence) {
	}

	private static MunicipioPersistence _persistence;
}