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

import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;

import java.util.List;

/**
 * The persistence utility for the relacion usuario consejo service. This utility wraps {@link RelacionUsuarioConsejoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see RelacionUsuarioConsejoPersistence
 * @see RelacionUsuarioConsejoPersistenceImpl
 * @generated
 */
public class RelacionUsuarioConsejoUtil {
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
	public static void clearCache(RelacionUsuarioConsejo relacionUsuarioConsejo) {
		getPersistence().clearCache(relacionUsuarioConsejo);
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
	public static List<RelacionUsuarioConsejo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RelacionUsuarioConsejo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RelacionUsuarioConsejo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static RelacionUsuarioConsejo update(
		RelacionUsuarioConsejo relacionUsuarioConsejo, boolean merge)
		throws SystemException {
		return getPersistence().update(relacionUsuarioConsejo, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static RelacionUsuarioConsejo update(
		RelacionUsuarioConsejo relacionUsuarioConsejo, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(relacionUsuarioConsejo, merge, serviceContext);
	}

	/**
	* Caches the relacion usuario consejo in the entity cache if it is enabled.
	*
	* @param relacionUsuarioConsejo the relacion usuario consejo
	*/
	public static void cacheResult(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo) {
		getPersistence().cacheResult(relacionUsuarioConsejo);
	}

	/**
	* Caches the relacion usuario consejos in the entity cache if it is enabled.
	*
	* @param relacionUsuarioConsejos the relacion usuario consejos
	*/
	public static void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> relacionUsuarioConsejos) {
		getPersistence().cacheResult(relacionUsuarioConsejos);
	}

	/**
	* Creates a new relacion usuario consejo with the primary key. Does not add the relacion usuario consejo to the database.
	*
	* @param idConsejoSec the primary key for the new relacion usuario consejo
	* @return the new relacion usuario consejo
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo create(
		int idConsejoSec) {
		return getPersistence().create(idConsejoSec);
	}

	/**
	* Removes the relacion usuario consejo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo remove(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException {
		return getPersistence().remove(idConsejoSec);
	}

	public static la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo updateImpl(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(relacionUsuarioConsejo, merge);
	}

	/**
	* Returns the relacion usuario consejo with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException} if it could not be found.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo findByPrimaryKey(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException {
		return getPersistence().findByPrimaryKey(idConsejoSec);
	}

	/**
	* Returns the relacion usuario consejo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo, or <code>null</code> if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo fetchByPrimaryKey(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(idConsejoSec);
	}

	/**
	* Returns all the relacion usuario consejos.
	*
	* @return the relacion usuario consejos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the relacion usuario consejos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of relacion usuario consejos.
	*
	* @return the number of relacion usuario consejos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RelacionUsuarioConsejoPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RelacionUsuarioConsejoPersistence)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					RelacionUsuarioConsejoPersistence.class.getName());

			ReferenceRegistry.registerReference(RelacionUsuarioConsejoUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(RelacionUsuarioConsejoPersistence persistence) {
	}

	private static RelacionUsuarioConsejoPersistence _persistence;
}