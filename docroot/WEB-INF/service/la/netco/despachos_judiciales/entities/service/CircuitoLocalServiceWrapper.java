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
 * This class is a wrapper for {@link CircuitoLocalService}.
 * </p>
 *
 * @author    mariza
 * @see       CircuitoLocalService
 * @generated
 */
public class CircuitoLocalServiceWrapper implements CircuitoLocalService,
	ServiceWrapper<CircuitoLocalService> {
	public CircuitoLocalServiceWrapper(
		CircuitoLocalService circuitoLocalService) {
		_circuitoLocalService = circuitoLocalService;
	}

	/**
	* Adds the circuito to the database. Also notifies the appropriate model listeners.
	*
	* @param circuito the circuito
	* @return the circuito that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito addCircuito(
		la.netco.despachos_judiciales.entities.model.Circuito circuito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.addCircuito(circuito);
	}

	/**
	* Creates a new circuito with the primary key. Does not add the circuito to the database.
	*
	* @param codigo the primary key for the new circuito
	* @return the new circuito
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito createCircuito(
		int codigo) {
		return _circuitoLocalService.createCircuito(codigo);
	}

	/**
	* Deletes the circuito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito that was removed
	* @throws PortalException if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito deleteCircuito(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.deleteCircuito(codigo);
	}

	/**
	* Deletes the circuito from the database. Also notifies the appropriate model listeners.
	*
	* @param circuito the circuito
	* @return the circuito that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito deleteCircuito(
		la.netco.despachos_judiciales.entities.model.Circuito circuito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.deleteCircuito(circuito);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _circuitoLocalService.dynamicQuery();
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
		return _circuitoLocalService.dynamicQuery(dynamicQuery);
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
		return _circuitoLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _circuitoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _circuitoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.despachos_judiciales.entities.model.Circuito fetchCircuito(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.fetchCircuito(codigo);
	}

	/**
	* Returns the circuito with the primary key.
	*
	* @param codigo the primary key of the circuito
	* @return the circuito
	* @throws PortalException if a circuito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito getCircuito(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.getCircuito(codigo);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> getCircuitos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.getCircuitos(start, end);
	}

	/**
	* Returns the number of circuitos.
	*
	* @return the number of circuitos
	* @throws SystemException if a system exception occurred
	*/
	public int getCircuitosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.getCircuitosCount();
	}

	/**
	* Updates the circuito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param circuito the circuito
	* @return the circuito that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito updateCircuito(
		la.netco.despachos_judiciales.entities.model.Circuito circuito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.updateCircuito(circuito);
	}

	/**
	* Updates the circuito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param circuito the circuito
	* @param merge whether to merge the circuito with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the circuito that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Circuito updateCircuito(
		la.netco.despachos_judiciales.entities.model.Circuito circuito,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.updateCircuito(circuito, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _circuitoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_circuitoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _circuitoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findByDespacho(
		java.lang.Integer idConsejo, java.lang.Integer idDistrito,
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.findByDespacho(idConsejo, idDistrito,
			idDepartamento, idMunicipio);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findByFields(
		java.lang.Integer idCircuito, java.lang.String nombre,
		java.lang.Integer idDistrito, java.lang.String jurisdiccion,
		java.lang.String codigoDane, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.findByFields(idCircuito, nombre,
			idDistrito, jurisdiccion, codigoDane, start, end);
	}

	public java.lang.Integer countByFields(java.lang.Integer idCircuito,
		java.lang.String nombre, java.lang.Integer idDistrito,
		java.lang.String jurisdiccion, java.lang.String codigoDane)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _circuitoLocalService.countByFields(idCircuito, nombre,
			idDistrito, jurisdiccion, codigoDane);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public CircuitoLocalService getWrappedCircuitoLocalService() {
		return _circuitoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedCircuitoLocalService(
		CircuitoLocalService circuitoLocalService) {
		_circuitoLocalService = circuitoLocalService;
	}

	public CircuitoLocalService getWrappedService() {
		return _circuitoLocalService;
	}

	public void setWrappedService(CircuitoLocalService circuitoLocalService) {
		_circuitoLocalService = circuitoLocalService;
	}

	private CircuitoLocalService _circuitoLocalService;
}