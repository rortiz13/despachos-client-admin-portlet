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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the municipio local service. This utility wraps {@link la.netco.despachos_judiciales.entities.service.impl.MunicipioLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see MunicipioLocalService
 * @see la.netco.despachos_judiciales.entities.service.base.MunicipioLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.MunicipioLocalServiceImpl
 * @generated
 */
public class MunicipioLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.MunicipioLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the municipio to the database. Also notifies the appropriate model listeners.
	*
	* @param municipio the municipio
	* @return the municipio that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio addMunicipio(
		la.netco.despachos_judiciales.entities.model.Municipio municipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMunicipio(municipio);
	}

	/**
	* Creates a new municipio with the primary key. Does not add the municipio to the database.
	*
	* @param municipioPK the primary key for the new municipio
	* @return the new municipio
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio createMunicipio(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK) {
		return getService().createMunicipio(municipioPK);
	}

	/**
	* Deletes the municipio with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param municipioPK the primary key of the municipio
	* @return the municipio that was removed
	* @throws PortalException if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio deleteMunicipio(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMunicipio(municipioPK);
	}

	/**
	* Deletes the municipio from the database. Also notifies the appropriate model listeners.
	*
	* @param municipio the municipio
	* @return the municipio that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio deleteMunicipio(
		la.netco.despachos_judiciales.entities.model.Municipio municipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMunicipio(municipio);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static la.netco.despachos_judiciales.entities.model.Municipio fetchMunicipio(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMunicipio(municipioPK);
	}

	/**
	* Returns the municipio with the primary key.
	*
	* @param municipioPK the primary key of the municipio
	* @return the municipio
	* @throws PortalException if a municipio with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio getMunicipio(
		la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK municipioPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMunicipio(municipioPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the municipios.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of municipios
	* @param end the upper bound of the range of municipios (not inclusive)
	* @return the range of municipios
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> getMunicipios(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMunicipios(start, end);
	}

	/**
	* Returns the number of municipios.
	*
	* @return the number of municipios
	* @throws SystemException if a system exception occurred
	*/
	public static int getMunicipiosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMunicipiosCount();
	}

	/**
	* Updates the municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param municipio the municipio
	* @return the municipio that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio updateMunicipio(
		la.netco.despachos_judiciales.entities.model.Municipio municipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMunicipio(municipio);
	}

	/**
	* Updates the municipio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param municipio the municipio
	* @param merge whether to merge the municipio with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the municipio that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Municipio updateMunicipio(
		la.netco.despachos_judiciales.entities.model.Municipio municipio,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMunicipio(municipio, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findByEstadoDescpacho(
		java.lang.Integer idDepartamento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByEstadoDescpacho(idDepartamento);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findByCompositeKey(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByCompositeKey(idDepartamento, idMunicipio);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findByFields(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.String nombre, java.lang.String indicativo,
		java.lang.Integer idCircuito,
		java.lang.Integer idCircuitoAdministrativo,
		java.lang.Integer idConsejoSeccional,
		java.lang.Integer idCircuitoDisciplinario, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFields(idDepartamento, idMunicipio, nombre,
			indicativo, idCircuito, idCircuitoAdministrativo,
			idConsejoSeccional, idCircuitoDisciplinario, start, end);
	}

	public static java.lang.Integer countByFields(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.String nombre, java.lang.String indicativo,
		java.lang.Integer idCircuito,
		java.lang.Integer idCircuitoAdministrativo,
		java.lang.Integer idConsejoSeccional,
		java.lang.Integer idCircuitoDisciplinario)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByFields(idDepartamento, idMunicipio, nombre,
			indicativo, idCircuito, idCircuitoAdministrativo,
			idConsejoSeccional, idCircuitoDisciplinario);
	}

	public static void clearService() {
		_service = null;
	}

	public static MunicipioLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MunicipioLocalService.class.getName());

			if (invokableLocalService instanceof MunicipioLocalService) {
				_service = (MunicipioLocalService)invokableLocalService;
			}
			else {
				_service = new MunicipioLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MunicipioLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(MunicipioLocalService service) {
	}

	private static MunicipioLocalService _service;
}