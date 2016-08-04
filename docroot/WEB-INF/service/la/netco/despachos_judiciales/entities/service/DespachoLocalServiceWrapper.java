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
 * This class is a wrapper for {@link DespachoLocalService}.
 * </p>
 *
 * @author    mariza
 * @see       DespachoLocalService
 * @generated
 */
public class DespachoLocalServiceWrapper implements DespachoLocalService,
	ServiceWrapper<DespachoLocalService> {
	public DespachoLocalServiceWrapper(
		DespachoLocalService despachoLocalService) {
		_despachoLocalService = despachoLocalService;
	}

	/**
	* Adds the despacho to the database. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho addDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.addDespacho(despacho);
	}

	/**
	* Creates a new despacho with the primary key. Does not add the despacho to the database.
	*
	* @param codigo the primary key for the new despacho
	* @return the new despacho
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho createDespacho(
		java.lang.String codigo) {
		return _despachoLocalService.createDespacho(codigo);
	}

	/**
	* Deletes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the despacho
	* @return the despacho that was removed
	* @throws PortalException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho deleteDespacho(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.deleteDespacho(codigo);
	}

	/**
	* Deletes the despacho from the database. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho deleteDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.deleteDespacho(despacho);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _despachoLocalService.dynamicQuery();
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
		return _despachoLocalService.dynamicQuery(dynamicQuery);
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
		return _despachoLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _despachoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _despachoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.despachos_judiciales.entities.model.Despacho fetchDespacho(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.fetchDespacho(codigo);
	}

	/**
	* Returns the despacho with the primary key.
	*
	* @param codigo the primary key of the despacho
	* @return the despacho
	* @throws PortalException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho getDespacho(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getDespacho(codigo);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the despachos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of despachos
	* @param end the upper bound of the range of despachos (not inclusive)
	* @return the range of despachos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> getDespachos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getDespachos(start, end);
	}

	/**
	* Returns the number of despachos.
	*
	* @return the number of despachos
	* @throws SystemException if a system exception occurred
	*/
	public int getDespachosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.getDespachosCount();
	}

	/**
	* Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho updateDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.updateDespacho(despacho);
	}

	/**
	* Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @param merge whether to merge the despacho with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Despacho updateDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.updateDespacho(despacho, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _despachoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_despachoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _despachoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> findByFields(
		java.lang.Integer idConsejo, java.lang.String idDespacho,
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad, java.lang.Integer idEspecialidad,
		java.lang.String consecutivo, java.lang.String nombre,
		java.lang.String direccion, java.lang.String telefonos,
		java.lang.String correo_electronico, java.lang.String acuerdo,
		java.lang.Integer estado, java.lang.String fax,
		java.lang.String horario_atencion, java.sql.Date fechaInicial,
		java.sql.Date fechaFinal, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.findByFields(idConsejo, idDespacho,
			idDepartamento, idMunicipio, idEntidad, idEspecialidad,
			consecutivo, nombre, direccion, telefonos, correo_electronico,
			acuerdo, estado, fax, horario_atencion, fechaInicial, fechaFinal,
			start, end);
	}

	public java.lang.Integer countbyFields(java.lang.Integer idConsejo,
		java.lang.String idDespacho, java.lang.Integer idDepartamento,
		java.lang.Integer idMunicipio, java.lang.Integer idEntidad,
		java.lang.Integer idEspecialidad, java.lang.String consecutivo,
		java.lang.String nombre, java.lang.String direccion,
		java.lang.String telefonos, java.lang.String correo_electronico,
		java.lang.String acuerdo, java.lang.Integer estado,
		java.lang.String fax, java.lang.String horario_atencion,
		java.sql.Date fechaInicial, java.sql.Date fechaFinal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.countbyFields(idConsejo, idDespacho,
			idDepartamento, idMunicipio, idEntidad, idEspecialidad,
			consecutivo, nombre, direccion, telefonos, correo_electronico,
			acuerdo, estado, fax, horario_atencion, fechaInicial, fechaFinal);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> findDespacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad, java.lang.Integer idEspecialidad,
		java.lang.Integer idDistrito, java.lang.Integer idCosenjoSec,
		java.lang.Integer idCircuito, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.findDespacho(idDepartamento, idMunicipio,
			idEntidad, idEspecialidad, idDistrito, idCosenjoSec, idCircuito,
			start, end);
	}

	public java.lang.Integer countDespacho(java.lang.Integer idDepartamento,
		java.lang.Integer idMunicipio, java.lang.Integer idEntidad,
		java.lang.Integer idEspecialidad, java.lang.Integer idDistrito,
		java.lang.Integer idCosenjoSec, java.lang.Integer idCircuito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _despachoLocalService.countDespacho(idDepartamento, idMunicipio,
			idEntidad, idEspecialidad, idDistrito, idCosenjoSec, idCircuito);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DespachoLocalService getWrappedDespachoLocalService() {
		return _despachoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDespachoLocalService(
		DespachoLocalService despachoLocalService) {
		_despachoLocalService = despachoLocalService;
	}

	public DespachoLocalService getWrappedService() {
		return _despachoLocalService;
	}

	public void setWrappedService(DespachoLocalService despachoLocalService) {
		_despachoLocalService = despachoLocalService;
	}

	private DespachoLocalService _despachoLocalService;
}