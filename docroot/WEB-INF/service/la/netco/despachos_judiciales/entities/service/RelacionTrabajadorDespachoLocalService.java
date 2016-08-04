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

package la.netco.despachos_judiciales.entities.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the relacion trabajador despacho local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see RelacionTrabajadorDespachoLocalServiceUtil
 * @see la.netco.despachos_judiciales.entities.service.base.RelacionTrabajadorDespachoLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.RelacionTrabajadorDespachoLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RelacionTrabajadorDespachoLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RelacionTrabajadorDespachoLocalServiceUtil} to access the relacion trabajador despacho local service. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.RelacionTrabajadorDespachoLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the relacion trabajador despacho to the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @return the relacion trabajador despacho that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho addRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new relacion trabajador despacho with the primary key. Does not add the relacion trabajador despacho to the database.
	*
	* @param relacionTrabajadorDespachoPK the primary key for the new relacion trabajador despacho
	* @return the new relacion trabajador despacho
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho createRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK);

	/**
	* Deletes the relacion trabajador despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho that was removed
	* @throws PortalException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho deleteRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the relacion trabajador despacho from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @return the relacion trabajador despacho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho deleteRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho fetchRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the relacion trabajador despacho with the primary key.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho
	* @throws PortalException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho getRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> getRelacionTrabajadorDespachos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of relacion trabajador despachos.
	*
	* @return the number of relacion trabajador despachos
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRelacionTrabajadorDespachosCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the relacion trabajador despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @return the relacion trabajador despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho updateRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the relacion trabajador despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @param merge whether to merge the relacion trabajador despacho with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the relacion trabajador despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho updateRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findByFields(
		java.lang.String idDespacho, java.lang.String idTrabajador,
		java.lang.String cargo, java.lang.String acuerdo,
		java.lang.String activo, java.lang.String fecha_ini,
		java.lang.String fecha_fin, java.lang.String secuencia, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.lang.Integer countByFields(java.lang.String idDespacho,
		java.lang.String idTrabajador, java.lang.String cargo,
		java.lang.String acuerdo, java.lang.String activo,
		java.lang.String fecha_ini, java.lang.String fecha_fin,
		java.lang.String secuencia)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> createMold()
		throws com.liferay.portal.kernel.exception.SystemException;
}