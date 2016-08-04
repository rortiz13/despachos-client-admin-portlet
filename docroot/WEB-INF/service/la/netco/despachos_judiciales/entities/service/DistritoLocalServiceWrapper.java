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
 * This class is a wrapper for {@link DistritoLocalService}.
 * </p>
 *
 * @author    mariza
 * @see       DistritoLocalService
 * @generated
 */
public class DistritoLocalServiceWrapper implements DistritoLocalService,
	ServiceWrapper<DistritoLocalService> {
	public DistritoLocalServiceWrapper(
		DistritoLocalService distritoLocalService) {
		_distritoLocalService = distritoLocalService;
	}

	/**
	* Adds the distrito to the database. Also notifies the appropriate model listeners.
	*
	* @param distrito the distrito
	* @return the distrito that was added
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito addDistrito(
		la.netco.despachos_judiciales.entities.model.Distrito distrito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.addDistrito(distrito);
	}

	/**
	* Creates a new distrito with the primary key. Does not add the distrito to the database.
	*
	* @param codigo the primary key for the new distrito
	* @return the new distrito
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito createDistrito(
		int codigo) {
		return _distritoLocalService.createDistrito(codigo);
	}

	/**
	* Deletes the distrito with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the distrito
	* @return the distrito that was removed
	* @throws PortalException if a distrito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito deleteDistrito(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.deleteDistrito(codigo);
	}

	/**
	* Deletes the distrito from the database. Also notifies the appropriate model listeners.
	*
	* @param distrito the distrito
	* @return the distrito that was removed
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito deleteDistrito(
		la.netco.despachos_judiciales.entities.model.Distrito distrito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.deleteDistrito(distrito);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _distritoLocalService.dynamicQuery();
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
		return _distritoLocalService.dynamicQuery(dynamicQuery);
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
		return _distritoLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _distritoLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _distritoLocalService.dynamicQueryCount(dynamicQuery);
	}

	public la.netco.despachos_judiciales.entities.model.Distrito fetchDistrito(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.fetchDistrito(codigo);
	}

	/**
	* Returns the distrito with the primary key.
	*
	* @param codigo the primary key of the distrito
	* @return the distrito
	* @throws PortalException if a distrito with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito getDistrito(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.getDistrito(codigo);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the distritos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of distritos
	* @param end the upper bound of the range of distritos (not inclusive)
	* @return the range of distritos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<la.netco.despachos_judiciales.entities.model.Distrito> getDistritos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.getDistritos(start, end);
	}

	/**
	* Returns the number of distritos.
	*
	* @return the number of distritos
	* @throws SystemException if a system exception occurred
	*/
	public int getDistritosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.getDistritosCount();
	}

	/**
	* Updates the distrito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param distrito the distrito
	* @return the distrito that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito updateDistrito(
		la.netco.despachos_judiciales.entities.model.Distrito distrito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.updateDistrito(distrito);
	}

	/**
	* Updates the distrito in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param distrito the distrito
	* @param merge whether to merge the distrito with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the distrito that was updated
	* @throws SystemException if a system exception occurred
	*/
	public la.netco.despachos_judiciales.entities.model.Distrito updateDistrito(
		la.netco.despachos_judiciales.entities.model.Distrito distrito,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.updateDistrito(distrito, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _distritoLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_distritoLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _distritoLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Distrito> findByDespacho(
		java.lang.Integer idConsejo, java.lang.Integer idDepartamento,
		java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.findByDespacho(idConsejo, idDepartamento,
			idMunicipio);
	}

	public java.util.List<la.netco.despachos_judiciales.entities.model.Distrito> findByFields(
		java.lang.Integer idDistrito, java.lang.String nombre,
		java.lang.Integer idConsejoSec, java.lang.String jurisdiccion,
		java.lang.String codigoDane, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.findByFields(idDistrito, nombre,
			idConsejoSec, jurisdiccion, codigoDane, start, end);
	}

	public java.lang.Integer countByFields(java.lang.Integer idDistrito,
		java.lang.String nombre, java.lang.Integer idConsejoSec,
		java.lang.String jurisdiccion, java.lang.String codigoDane)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _distritoLocalService.countByFields(idDistrito, nombre,
			idConsejoSec, jurisdiccion, codigoDane);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public DistritoLocalService getWrappedDistritoLocalService() {
		return _distritoLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedDistritoLocalService(
		DistritoLocalService distritoLocalService) {
		_distritoLocalService = distritoLocalService;
	}

	public DistritoLocalService getWrappedService() {
		return _distritoLocalService;
	}

	public void setWrappedService(DistritoLocalService distritoLocalService) {
		_distritoLocalService = distritoLocalService;
	}

	private DistritoLocalService _distritoLocalService;
}