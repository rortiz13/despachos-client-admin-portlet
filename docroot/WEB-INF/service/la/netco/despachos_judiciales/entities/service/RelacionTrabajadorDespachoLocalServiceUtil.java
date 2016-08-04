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
 * The utility for the relacion trabajador despacho local service. This utility wraps {@link la.netco.despachos_judiciales.entities.service.impl.RelacionTrabajadorDespachoLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see RelacionTrabajadorDespachoLocalService
 * @see la.netco.despachos_judiciales.entities.service.base.RelacionTrabajadorDespachoLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.impl.RelacionTrabajadorDespachoLocalServiceImpl
 * @generated
 */
public class RelacionTrabajadorDespachoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link la.netco.despachos_judiciales.entities.service.impl.RelacionTrabajadorDespachoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the relacion trabajador despacho to the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @return the relacion trabajador despacho that was added
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho addRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addRelacionTrabajadorDespacho(relacionTrabajadorDespacho);
	}

	/**
	* Creates a new relacion trabajador despacho with the primary key. Does not add the relacion trabajador despacho to the database.
	*
	* @param relacionTrabajadorDespachoPK the primary key for the new relacion trabajador despacho
	* @return the new relacion trabajador despacho
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho createRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK) {
		return getService()
				   .createRelacionTrabajadorDespacho(relacionTrabajadorDespachoPK);
	}

	/**
	* Deletes the relacion trabajador despacho with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho that was removed
	* @throws PortalException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho deleteRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteRelacionTrabajadorDespacho(relacionTrabajadorDespachoPK);
	}

	/**
	* Deletes the relacion trabajador despacho from the database. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @return the relacion trabajador despacho that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho deleteRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .deleteRelacionTrabajadorDespacho(relacionTrabajadorDespacho);
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

	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho fetchRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .fetchRelacionTrabajadorDespacho(relacionTrabajadorDespachoPK);
	}

	/**
	* Returns the relacion trabajador despacho with the primary key.
	*
	* @param relacionTrabajadorDespachoPK the primary key of the relacion trabajador despacho
	* @return the relacion trabajador despacho
	* @throws PortalException if a relacion trabajador despacho with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho getRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK relacionTrabajadorDespachoPK)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getRelacionTrabajadorDespacho(relacionTrabajadorDespachoPK);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> getRelacionTrabajadorDespachos(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelacionTrabajadorDespachos(start, end);
	}

	/**
	* Returns the number of relacion trabajador despachos.
	*
	* @return the number of relacion trabajador despachos
	* @throws SystemException if a system exception occurred
	*/
	public static int getRelacionTrabajadorDespachosCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRelacionTrabajadorDespachosCount();
	}

	/**
	* Updates the relacion trabajador despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @return the relacion trabajador despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho updateRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRelacionTrabajadorDespacho(relacionTrabajadorDespacho);
	}

	/**
	* Updates the relacion trabajador despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relacionTrabajadorDespacho the relacion trabajador despacho
	* @param merge whether to merge the relacion trabajador despacho with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the relacion trabajador despacho that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho updateRelacionTrabajadorDespacho(
		la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho relacionTrabajadorDespacho,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateRelacionTrabajadorDespacho(relacionTrabajadorDespacho,
			merge);
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

	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findByFields(
		java.lang.String idDespacho, java.lang.String idTrabajador,
		java.lang.String cargo, java.lang.String acuerdo,
		java.lang.String activo, java.lang.String fecha_ini,
		java.lang.String fecha_fin, java.lang.String secuencia, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByFields(idDespacho, idTrabajador, cargo, acuerdo,
			activo, fecha_ini, fecha_fin, secuencia, start, end);
	}

	public static java.lang.Integer countByFields(java.lang.String idDespacho,
		java.lang.String idTrabajador, java.lang.String cargo,
		java.lang.String acuerdo, java.lang.String activo,
		java.lang.String fecha_ini, java.lang.String fecha_fin,
		java.lang.String secuencia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .countByFields(idDespacho, idTrabajador, cargo, acuerdo,
			activo, fecha_ini, fecha_fin, secuencia);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> createMold()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().createMold();
	}

	public static void clearService() {
		_service = null;
	}

	public static RelacionTrabajadorDespachoLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RelacionTrabajadorDespachoLocalService.class.getName());

			if (invokableLocalService instanceof RelacionTrabajadorDespachoLocalService) {
				_service = (RelacionTrabajadorDespachoLocalService)invokableLocalService;
			}
			else {
				_service = new RelacionTrabajadorDespachoLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RelacionTrabajadorDespachoLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(RelacionTrabajadorDespachoLocalService service) {
	}

	private static RelacionTrabajadorDespachoLocalService _service;
}