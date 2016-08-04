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

import com.liferay.portal.service.persistence.BasePersistence;

import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;

/**
 * The persistence interface for the relacion usuario consejo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see RelacionUsuarioConsejoPersistenceImpl
 * @see RelacionUsuarioConsejoUtil
 * @generated
 */
public interface RelacionUsuarioConsejoPersistence extends BasePersistence<RelacionUsuarioConsejo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RelacionUsuarioConsejoUtil} to access the relacion usuario consejo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the relacion usuario consejo in the entity cache if it is enabled.
	*
	* @param relacionUsuarioConsejo the relacion usuario consejo
	*/
	public void cacheResult(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo);

	/**
	* Caches the relacion usuario consejos in the entity cache if it is enabled.
	*
	* @param relacionUsuarioConsejos the relacion usuario consejos
	*/
	public void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> relacionUsuarioConsejos);

	/**
	* Creates a new relacion usuario consejo with the primary key. Does not add the relacion usuario consejo to the database.
	*
	* @param idConsejoSec the primary key for the new relacion usuario consejo
	* @return the new relacion usuario consejo
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo create(
		int idConsejoSec);

	/**
	* Removes the relacion usuario consejo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo remove(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException;

	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo updateImpl(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the relacion usuario consejo with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException} if it could not be found.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo findByPrimaryKey(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException;

	/**
	* Returns the relacion usuario consejo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo, or <code>null</code> if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo fetchByPrimaryKey(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the relacion usuario consejos.
	*
	* @return the relacion usuario consejos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the relacion usuario consejos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of relacion usuario consejos.
	*
	* @return the number of relacion usuario consejos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}