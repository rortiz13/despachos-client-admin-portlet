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
 * The utility for the consejo seccional local service. This utility wraps {@link la.netco.despachos_judiciales.entities.service.impl.ConsejoSeccionalLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see ConsejoSeccionalLocalService
 * @see la.netco.despachos_judiciales.entities.service.base.ConsejoSeccionalLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.ConsejoSeccionalLocalServiceImpl
 * @generated
 */
public class ConsejoSeccionalLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.ConsejoSeccionalLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the consejo seccional to the database. Also notifies the appropriate model listeners.
	*
	* @param consejoSeccional the consejo seccional
	* @return the consejo seccional that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional addConsejoSeccional(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addConsejoSeccional(consejoSeccional);
	}

	/**
	* Creates a new consejo seccional with the primary key. Does not add the consejo seccional to the database.
	*
	* @param codigo the primary key for the new consejo seccional
	* @return the new consejo seccional
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional createConsejoSeccional(
		int codigo) {
		return getService().createConsejoSeccional(codigo);
	}

	/**
	* Deletes the consejo seccional with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param codigo the primary key of the consejo seccional
	* @return the consejo seccional that was removed
	* @throws PortalException if a consejo seccional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional deleteConsejoSeccional(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConsejoSeccional(codigo);
	}

	/**
	* Deletes the consejo seccional from the database. Also notifies the appropriate model listeners.
	*
	* @param consejoSeccional the consejo seccional
	* @return the consejo seccional that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional deleteConsejoSeccional(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteConsejoSeccional(consejoSeccional);
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

	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional fetchConsejoSeccional(
		int codigo) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchConsejoSeccional(codigo);
	}

	/**
	* Returns the consejo seccional with the primary key.
	*
	* @param codigo the primary key of the consejo seccional
	* @return the consejo seccional
	* @throws PortalException if a consejo seccional with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional getConsejoSeccional(
		int codigo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getConsejoSeccional(codigo);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> getConsejoSeccionals(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConsejoSeccionals(start, end);
	}

	/**
	* Returns the number of consejo seccionals.
	*
	* @return the number of consejo seccionals
	* @throws SystemException if a system exception occurred
	*/
	public static int getConsejoSeccionalsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getConsejoSeccionalsCount();
	}

	/**
	* Updates the consejo seccional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param consejoSeccional the consejo seccional
	* @return the consejo seccional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional updateConsejoSeccional(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateConsejoSeccional(consejoSeccional);
	}

	/**
	* Updates the consejo seccional in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param consejoSeccional the consejo seccional
	* @param merge whether to merge the consejo seccional with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the consejo seccional that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.ConsejoSeccional updateConsejoSeccional(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateConsejoSeccional(consejoSeccional, merge);
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

	public static java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findByDespacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDespacho(idDepartamento, idMunicipio);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findByFields(
		java.lang.Integer idConsejoSec, java.lang.String nombre,
		java.lang.String direccion, java.lang.String telefonos,
		java.lang.String correo_electronico, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFields(idConsejoSec, nombre, direccion, telefonos,
			correo_electronico, start, end);
	}

	public static java.lang.Integer countByFields(
		java.lang.Integer idConsejoSec, java.lang.String nombre,
		java.lang.String direccion, java.lang.String telefonos,
		java.lang.String correo_electronico)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByFields(idConsejoSec, nombre, direccion, telefonos,
			correo_electronico);
	}

	public static void clearService() {
		_service = null;
	}

	public static ConsejoSeccionalLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ConsejoSeccionalLocalService.class.getName());

			if (invokableLocalService instanceof ConsejoSeccionalLocalService) {
				_service = (ConsejoSeccionalLocalService)invokableLocalService;
			}
			else {
				_service = new ConsejoSeccionalLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ConsejoSeccionalLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(ConsejoSeccionalLocalService service) {
	}

	private static ConsejoSeccionalLocalService _service;
}