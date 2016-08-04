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

import la.netco.despachos_judiciales.entities.model.Trabajador;

/**
 * The persistence interface for the trabajador service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see TrabajadorPersistenceImpl
 * @see TrabajadorUtil
 * @generated
 */
public interface TrabajadorPersistence extends BasePersistence<Trabajador> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TrabajadorUtil} to access the trabajador persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the trabajador in the entity cache if it is enabled.
	*
	* @param trabajador the trabajador
	*/
	public void cacheResult(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador);

	/**
	* Caches the trabajadors in the entity cache if it is enabled.
	*
	* @param trabajadors the trabajadors
	*/
	public void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> trabajadors);

	/**
	* Creates a new trabajador with the primary key. Does not add the trabajador to the database.
	*
	* @param cedula the primary key for the new trabajador
	* @return the new trabajador
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador create(
		java.lang.String cedula);

	/**
	* Removes the trabajador with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchTrabajadorException if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador remove(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchTrabajadorException;

	public la.netco.despachos_judiciales.entities.model.Trabajador updateImpl(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the trabajador with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchTrabajadorException} if it could not be found.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador
	* @throws la.netco.despachos_judiciales.entities.NoSuchTrabajadorException if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador findByPrimaryKey(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchTrabajadorException;

	/**
	* Returns the trabajador with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador, or <code>null</code> if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador fetchByPrimaryKey(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the trabajadors.
	*
	* @return the trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the trabajadors from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of trabajadors.
	*
	* @return the number of trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}