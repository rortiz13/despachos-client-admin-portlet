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

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;

/**
 * The persistence interface for the consejo seccional service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see ConsejoSeccionalPersistenceImpl
 * @see ConsejoSeccionalUtil
 * @generated
 */
public interface ConsejoSeccionalPersistence extends BasePersistence<ConsejoSeccional> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ConsejoSeccionalUtil} to access the consejo seccional persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the consejo seccional in the entity cache if it is enabled.
	*
	* @param consejoSeccional the consejo seccional
	*/
	public void cacheResult(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional);

	/**
	* Caches the consejo seccionals in the entity cache if it is enabled.
	*
	* @param consejoSeccionals the consejo seccionals
	*/
	public void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> consejoSeccionals);

	/**
	* Creates a new consejo seccional with the primary key. Does not add the consejo seccional to the database.
	*
	* @param codigo the primary key for the new consejo seccional
	* @return the new consejo seccional
	*/
	public la.netco.despachos_judiciales.entities.model.ConsejoSeccional create(
		int codigo);

	/**
	* Removes the consejo seccional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the consejo seccional
	* @return the consejo seccional that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException if a consejo seccional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.ConsejoSeccional remove(
		int codigo)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException;

	public la.netco.despachos_judiciales.entities.model.ConsejoSeccional updateImpl(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the consejo seccional with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException} if it could not be found.
	*
	* @param codigo the primary key of the consejo seccional
	* @return the consejo seccional
	* @throws la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException if a consejo seccional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.ConsejoSeccional findByPrimaryKey(
		int codigo)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException;

	/**
	* Returns the consejo seccional with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param codigo the primary key of the consejo seccional
	* @return the consejo seccional, or <code>null</code> if a consejo seccional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.ConsejoSeccional fetchByPrimaryKey(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the consejo seccionals.
	*
	* @return the consejo seccionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the consejo seccionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of consejo seccionals
	* @param end the upper bound of the range of consejo seccionals (not inclusive)
	* @return the range of consejo seccionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the consejo seccionals.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of consejo seccionals
	* @param end the upper bound of the range of consejo seccionals (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of consejo seccionals
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the consejo seccionals from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of consejo seccionals.
	*
	* @return the number of consejo seccionals
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}