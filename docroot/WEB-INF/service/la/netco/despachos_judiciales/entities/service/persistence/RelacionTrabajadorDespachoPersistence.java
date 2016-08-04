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

import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;

/**
 * The persistence interface for the relacion trabajador despacho service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author mariza
 * @see RelacionTrabajadorDespachoPersistenceImpl
 * @see RelacionTrabajadorDespachoUtil
 * @generated
 */
public interface RelacionTrabajadorDespachoPersistence extends BasePersistence<RelacionTrabajadorDespacho> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RelacionTrabajadorDespachoUtil} to access the relacion trabajador despacho persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the relacion trabajador despacho in the entity cache if it is enabled.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	*/
	public void cacheResult(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho);

	/**
	* Caches the relacion trabajador despachos in the entity cache if it is enabled.
	*
	* @param relacionTrabajadorDespachos the relacion trabajador despachos
	*/
	public void cacheResult(
		java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> relacionTrabajadorDespachos);

	/**
	* Creates a new relacion trabajador despacho with the primary key. Does not add the relacion trabajador despacho to the database.
	*
	* @param relacionTrabajadorDespachoPK the primary key for the new relacion trabajador despacho
	* @return the new relacion trabajador despacho
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho create(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK);

	/**
	* Removes the relacion trabajador despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho that was removed
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho remove(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException;

	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho updateImpl(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the relacion trabajador despacho with the primary key or throws a {@link la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException} if it could not be found.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho
	* @throws la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho findByPrimaryKey(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException,
			la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException;

	/**
	* Returns the relacion trabajador despacho with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho, or <code>null</code> if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho fetchByPrimaryKey(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the relacion trabajador despachos.
	*
	* @return the relacion trabajador despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the relacion trabajador despachos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of relacion trabajador despachos.
	*
	* @return the number of relacion trabajador despachos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}