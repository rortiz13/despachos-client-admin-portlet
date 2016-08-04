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

import la.netco.despachos_judiciales.entities.model.Circuito;

/**
 * The persistence interface for the circuito service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see CircuitoPersistenceImpl
 * @see CircuitoUtil
 * @generated
 */
public interface CircuitoPersistence extends BasePersistence<Circuito> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CircuitoUtil} to access the circuito persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the circuito in the entity cache if it is enabled.
	*
	* @param circuito the circuito
	*/
	public void cacheResult(
		la.netco.despachos_judiciales.entities.model.Circuito circuito);

	/**
	* Caches the circuitos in the entity cache if it is enabled.
	*
	* @param circuitos the circuitos
	*/
	public void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> circuitos);

	/**
	* Creates a new circuito with the primary key. Does not add the circuito to the database.
	*
	* @param codigo the primary key for the new circuito
	* @return the new circuito
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito create(
		int codigo);

	/**
	* Removes the circuito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito remove(
		int codigo)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchCircuitoException;

	public la.netco.despachos_judiciales.entities.model.Circuito updateImpl(
		la.netco.despachos_judiciales.entities.model.Circuito circuito,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the circuito with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchCircuitoException} if it could not be found.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito
	* @throws la.netco.despachos_judiciales.entities.NoSuchCircuitoException if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito findByPrimaryKey(
		int codigo)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchCircuitoException;

	/**
	* Returns the circuito with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito, or <code>null</code> if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito fetchByPrimaryKey(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the circuitos.
	*
	* @return the circuitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the circuitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of circuitos
	* @param end the upper bound of the range of circuitos (not inclusive)
	* @return the range of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the circuitos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of circuitos
	* @param end the upper bound of the range of circuitos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the circuitos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of circuitos.
	*
	* @return the number of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}