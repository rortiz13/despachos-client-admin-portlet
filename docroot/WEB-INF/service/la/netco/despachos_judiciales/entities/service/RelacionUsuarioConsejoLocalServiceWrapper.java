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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link RelacionUsuarioConsejoLocalService}.
 * </p>
 *
 * @author    mariza
 * @see       RelacionUsuarioConsejoLocalService
 * @generated
 */
public class RelacionUsuarioConsejoLocalServiceWrapper
	implements RelacionUsuarioConsejoLocalService,
		ServiceWrapper<RelacionUsuarioConsejoLocalService> {
	public RelacionUsuarioConsejoLocalServiceWrapper(
		RelacionUsuarioConsejoLocalService relacionUsuarioConsejoLocalService) {
		_relacionUsuarioConsejoLocalService = relacionUsuarioConsejoLocalService;
	}

	/**
	* Adds the relacion usuario consejo to the database. Also notifies the appropriate model listeners.
	*
	* @param relacionUsuarioConsejo the relacion usuario consejo
	* @return the relacion usuario consejo that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo addRelacionUsuarioConsejo(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.addRelacionUsuarioConsejo(relacionUsuarioConsejo);
	}

	/**
	* Creates a new relacion usuario consejo with the primary key. Does not add the relacion usuario consejo to the database.
	*
	* @param idConsejoSec the primary key for the new relacion usuario consejo
	* @return the new relacion usuario consejo
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo createRelacionUsuarioConsejo(
		int idConsejoSec) {
		return _relacionUsuarioConsejoLocalService.createRelacionUsuarioConsejo(idConsejoSec);
	}

	/**
	* Deletes the relacion usuario consejo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo that was removed
	* @throws PortalException if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo deleteRelacionUsuarioConsejo(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.deleteRelacionUsuarioConsejo(idConsejoSec);
	}

	/**
	* Deletes the relacion usuario consejo from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionUsuarioConsejo the relacion usuario consejo
	* @return the relacion usuario consejo that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo deleteRelacionUsuarioConsejo(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.deleteRelacionUsuarioConsejo(relacionUsuarioConsejo);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _relacionUsuarioConsejoLocalService.dynamicQuery();
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.dynamicQuery(dynamicQuery);
	}

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
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

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
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo fetchRelacionUsuarioConsejo(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.fetchRelacionUsuarioConsejo(idConsejoSec);
	}

	/**
	* Returns the relacion usuario consejo with the primary key.
	*
	* @param idConsejoSec the primary key of the relacion usuario consejo
	* @return the relacion usuario consejo
	* @throws PortalException if a relacion usuario consejo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo getRelacionUsuarioConsejo(
		int idConsejoSec)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.getRelacionUsuarioConsejo(idConsejoSec);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> getRelacionUsuarioConsejos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.getRelacionUsuarioConsejos(start,
			end);
	}

	/**
	* Returns the number of relacion usuario consejos.
	*
	* @return the number of relacion usuario consejos
	* @throws SystemException if a system exception occurred
	*/
	public int getRelacionUsuarioConsejosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.getRelacionUsuarioConsejosCount();
	}

	/**
	* Updates the relacion usuario consejo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relacionUsuarioConsejo the relacion usuario consejo
	* @return the relacion usuario consejo that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo updateRelacionUsuarioConsejo(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.updateRelacionUsuarioConsejo(relacionUsuarioConsejo);
	}

	/**
	* Updates the relacion usuario consejo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relacionUsuarioConsejo the relacion usuario consejo
	* @param merge whether to merge the relacion usuario consejo with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the relacion usuario consejo that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo updateRelacionUsuarioConsejo(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.updateRelacionUsuarioConsejo(relacionUsuarioConsejo,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _relacionUsuarioConsejoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_relacionUsuarioConsejoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _relacionUsuarioConsejoLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo findByUsuario(
		java.lang.String usuario)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _relacionUsuarioConsejoLocalService.findByUsuario(usuario);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RelacionUsuarioConsejoLocalService getWrappedRelacionUsuarioConsejoLocalService() {
		return _relacionUsuarioConsejoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRelacionUsuarioConsejoLocalService(
		RelacionUsuarioConsejoLocalService relacionUsuarioConsejoLocalService) {
		_relacionUsuarioConsejoLocalService = relacionUsuarioConsejoLocalService;
	}

	public RelacionUsuarioConsejoLocalService getWrappedService() {
		return _relacionUsuarioConsejoLocalService;
	}

	public void setWrappedService(
		RelacionUsuarioConsejoLocalService relacionUsuarioConsejoLocalService) {
		_relacionUsuarioConsejoLocalService = relacionUsuarioConsejoLocalService;
	}

	private RelacionUsuarioConsejoLocalService _relacionUsuarioConsejoLocalService;
}