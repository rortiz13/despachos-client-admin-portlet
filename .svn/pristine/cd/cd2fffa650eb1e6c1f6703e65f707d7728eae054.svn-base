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

import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;

import java.util.List;

/**
 * The persistence utility for the relacion trabajador despacho service. This utility wraps {@link RelacionTrabajadorDespachoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see RelacionTrabajadorDespachoPersistence
 * @see RelacionTrabajadorDespachoPersistenceImpl
 * @generated
 */
public class RelacionTrabajadorDespachoUtil {
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
	public static void clearCache(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho) {
		getPersistence().clearCache(relacionTrabajadorDespacho);
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
	public static List<RelacionTrabajadorDespacho> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RelacionTrabajadorDespacho> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RelacionTrabajadorDespacho> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static RelacionTrabajadorDespacho update(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho, boolean merge)
		throws SystemException {
		return getPersistence().update(relacionTrabajadorDespacho, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static RelacionTrabajadorDespacho update(
		RelacionTrabajadorDespacho relacionTrabajadorDespacho, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(relacionTrabajadorDespacho, merge, serviceContext);
	}

	/**
	* Caches the relacion trabajador despacho in the entity cache if it is enabled.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	*/
	public static void cacheResult(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho) {
		getPersistence().cacheResult(relacionTrabajadorDespacho);
	}

	/**
	* Caches the relacion trabajador despachos in the entity cache if it is enabled.
	*
	* @param relacionTrabajadorDespachos the relacion trabajador despachos
	*/
	public static void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> relacionTrabajadorDespachos) {
		getPersistence().cacheResult(relacionTrabajadorDespachos);
	}

	/**
	* Creates a new relacion trabajador despacho with the primary key. Does not add the relacion trabajador despacho to the database.
	*
	* @param relacionTrabajadorDespachoPK the primary key for the new relacion trabajador despacho
	* @return the new relacion trabajador despacho
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho create(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK) {
		return getPersistence().create(relacionTrabajadorDespachoPK);
	}

	/**
	* Removes the relacion trabajador despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho remove(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException {
		return getPersistence().remove(relacionTrabajadorDespachoPK);
	}

	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho updateImpl(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(relacionTrabajadorDespacho, merge);
	}

	/**
	* Returns the relacion trabajador despacho with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException} if it could not be found.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho findByPrimaryKey(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException {
		return getPersistence().findByPrimaryKey(relacionTrabajadorDespachoPK);
	}

	/**
	* Returns the relacion trabajador despacho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho, or <code>null</code> if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho fetchByPrimaryKey(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(relacionTrabajadorDespachoPK);
	}

	/**
	* Returns all the relacion trabajador despachos.
	*
	* @return the relacion trabajador despachos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the relacion trabajador despachos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of relacion trabajador despachos.
	*
	* @return the number of relacion trabajador despachos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RelacionTrabajadorDespachoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RelacionTrabajadorDespachoPersistence)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					RelacionTrabajadorDespachoPersistence.class.getName());

			ReferenceRegistry.registerReference(RelacionTrabajadorDespachoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(
		RelacionTrabajadorDespachoPersistence persistence) {
	}

	private static RelacionTrabajadorDespachoPersistence _persistence;
}