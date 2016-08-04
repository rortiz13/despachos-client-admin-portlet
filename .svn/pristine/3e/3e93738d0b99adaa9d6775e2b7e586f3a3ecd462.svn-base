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
 * The utility for the despacho local service. This utility wraps {@link la.netco.despachos_judiciales.entities.service.impl.DespachoLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see DespachoLocalService
 * @see la.netco.despachos_judiciales.entities.service.base.DespachoLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.DespachoLocalServiceImpl
 * @generated
 */
public class DespachoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.DespachoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the despacho to the database. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho addDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDespacho(despacho);
	}

	/**
	* Creates a new despacho with the primary key. Does not add the despacho to the database.
	*
	* @param codigo the primary key for the new despacho
	* @return the new despacho
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho createDespacho(
		java.lang.String codigo) {
		return getService().createDespacho(codigo);
	}

	/**
	* Deletes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the despacho
	* @return the despacho that was removed
	* @throws PortalException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho deleteDespacho(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDespacho(codigo);
	}

	/**
	* Deletes the despacho from the database. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho deleteDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDespacho(despacho);
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

	public static la.netco.despachos_judiciales.entities.model.Despacho fetchDespacho(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDespacho(codigo);
	}

	/**
	* Returns the despacho with the primary key.
	*
	* @param codigo the primary key of the despacho
	* @return the despacho
	* @throws PortalException if a despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho getDespacho(
		java.lang.String codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDespacho(codigo);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> getDespachos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDespachos(start, end);
	}

	/**
	* Returns the number of despachos.
	*
	* @return the number of despachos
	* @throws SystemException if a system exception occurred
	*/
	public static int getDespachosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDespachosCount();
	}

	/**
	* Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @return the despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho updateDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDespacho(despacho);
	}

	/**
	* Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param despacho the despacho
	* @param merge whether to merge the despacho with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.Despacho updateDespacho(
		la.netco.despachos_judiciales.entities.model.Despacho despacho,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDespacho(despacho, merge);
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

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> findByFields(
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
		return getService()
				   .findByFields(idConsejo, idDespacho, idDepartamento,
			idMunicipio, idEntidad, idEspecialidad, consecutivo, nombre,
			direccion, telefonos, correo_electronico, acuerdo, estado, fax,
			horario_atencion, fechaInicial, fechaFinal, start, end);
	}

	public static java.lang.Integer countbyFields(java.lang.Integer idConsejo,
		java.lang.String idDespacho, java.lang.Integer idDepartamento,
		java.lang.Integer idMunicipio, java.lang.Integer idEntidad,
		java.lang.Integer idEspecialidad, java.lang.String consecutivo,
		java.lang.String nombre, java.lang.String direccion,
		java.lang.String telefonos, java.lang.String correo_electronico,
		java.lang.String acuerdo, java.lang.Integer estado,
		java.lang.String fax, java.lang.String horario_atencion,
		java.sql.Date fechaInicial, java.sql.Date fechaFinal)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countbyFields(idConsejo, idDespacho, idDepartamento,
			idMunicipio, idEntidad, idEspecialidad, consecutivo, nombre,
			direccion, telefonos, correo_electronico, acuerdo, estado, fax,
			horario_atencion, fechaInicial, fechaFinal);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> findDespacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad, java.lang.Integer idEspecialidad,
		java.lang.Integer idDistrito, java.lang.Integer idCosenjoSec,
		java.lang.Integer idCircuito, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findDespacho(idDepartamento, idMunicipio, idEntidad,
			idEspecialidad, idDistrito, idCosenjoSec, idCircuito, start, end);
	}

	public static java.lang.Integer countDespacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad, java.lang.Integer idEspecialidad,
		java.lang.Integer idDistrito, java.lang.Integer idCosenjoSec,
		java.lang.Integer idCircuito)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countDespacho(idDepartamento, idMunicipio, idEntidad,
			idEspecialidad, idDistrito, idCosenjoSec, idCircuito);
	}

	public static void clearService() {
		_service = null;
	}

	public static DespachoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DespachoLocalService.class.getName());

			if (invokableLocalService instanceof DespachoLocalService) {
				_service = (DespachoLocalService)invokableLocalService;
			}
			else {
				_service = new DespachoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DespachoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(DespachoLocalService service) {
	}

	private static DespachoLocalService _service;
}