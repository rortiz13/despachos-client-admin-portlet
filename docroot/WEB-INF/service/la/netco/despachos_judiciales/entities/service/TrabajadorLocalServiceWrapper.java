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
 * This class is a wrapper for {@link TrabajadorLocalService}.
 * </p>
 *
 * @author    mariza
 * @see       TrabajadorLocalService
 * @generated
 */
public class TrabajadorLocalServiceWrapper implements TrabajadorLocalService,
	ServiceWrapper<TrabajadorLocalService> {
	public TrabajadorLocalServiceWrapper(
		TrabajadorLocalService trabajadorLocalService) {
		_trabajadorLocalService = trabajadorLocalService;
	}

	/**
	* Adds the trabajador to the database. Also notifies the appropriate model listeners.
	*
	* @param trabajador the trabajador
	* @return the trabajador that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador addTrabajador(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.addTrabajador(trabajador);
	}

	/**
	* Creates a new trabajador with the primary key. Does not add the trabajador to the database.
	*
	* @param cedula the primary key for the new trabajador
	* @return the new trabajador
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador createTrabajador(
		java.lang.String cedula) {
		return _trabajadorLocalService.createTrabajador(cedula);
	}

	/**
	* Deletes the trabajador with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador that was removed
	* @throws PortalException if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador deleteTrabajador(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.deleteTrabajador(cedula);
	}

	/**
	* Deletes the trabajador from the database. Also notifies the appropriate model listeners.
	*
	* @param trabajador the trabajador
	* @return the trabajador that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador deleteTrabajador(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.deleteTrabajador(trabajador);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _trabajadorLocalService.dynamicQuery();
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
		return _trabajadorLocalService.dynamicQuery(dynamicQuery);
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
		return _trabajadorLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _trabajadorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _trabajadorLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.despachos_judiciales.entities.model.Trabajador fetchTrabajador(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.fetchTrabajador(cedula);
	}

	/**
	* Returns the trabajador with the primary key.
	*
	* @param cedula the primary key of the trabajador
	* @return the trabajador
	* @throws PortalException if a trabajador with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador getTrabajador(
		java.lang.String cedula)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.getTrabajador(cedula);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> getTrabajadors(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.getTrabajadors(start, end);
	}

	/**
	* Returns the number of trabajadors.
	*
	* @return the number of trabajadors
	* @throws SystemException if a system exception occurred
	*/
	public int getTrabajadorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.getTrabajadorsCount();
	}

	/**
	* Updates the trabajador in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trabajador the trabajador
	* @return the trabajador that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador updateTrabajador(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.updateTrabajador(trabajador);
	}

	/**
	* Updates the trabajador in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param trabajador the trabajador
	* @param merge whether to merge the trabajador with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the trabajador that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Trabajador updateTrabajador(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.updateTrabajador(trabajador, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _trabajadorLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_trabajadorLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trabajadorLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findByDespachoRelacion(
		java.lang.String idDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.findByDespachoRelacion(idDespacho);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findByFields(
		java.lang.String idTrabajador, java.lang.String nombres,
		java.lang.String apellidos, java.lang.String especialidad,
		java.lang.String correo, java.lang.String telefonos,
		java.lang.Integer carrera, java.lang.Integer tipoTrabajador,
		java.lang.Integer tipoContrato, java.lang.String sexo,
		java.sql.Date fechaNacimiento, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.findByFields(idTrabajador, nombres,
			apellidos, especialidad, correo, telefonos, carrera,
			tipoTrabajador, tipoContrato, sexo, fechaNacimiento, start, end);
	}

	public java.lang.Integer countByFields(java.lang.String idTrabajador,
		java.lang.String nombres, java.lang.String apellidos,
		java.lang.String especialidad, java.lang.String correo,
		java.lang.String telefonos, java.lang.Integer carrera,
		java.lang.Integer tipoTrabajador, java.lang.Integer tipoContrato,
		java.lang.String sexo, java.sql.Date fechaNacimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _trabajadorLocalService.countByFields(idTrabajador, nombres,
			apellidos, especialidad, correo, telefonos, carrera,
			tipoTrabajador, tipoContrato, sexo, fechaNacimiento);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public TrabajadorLocalService getWrappedTrabajadorLocalService() {
		return _trabajadorLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedTrabajadorLocalService(
		TrabajadorLocalService trabajadorLocalService) {
		_trabajadorLocalService = trabajadorLocalService;
	}

	public TrabajadorLocalService getWrappedService() {
		return _trabajadorLocalService;
	}

	public void setWrappedService(TrabajadorLocalService trabajadorLocalService) {
		_trabajadorLocalService = trabajadorLocalService;
	}

	private TrabajadorLocalService _trabajadorLocalService;
}