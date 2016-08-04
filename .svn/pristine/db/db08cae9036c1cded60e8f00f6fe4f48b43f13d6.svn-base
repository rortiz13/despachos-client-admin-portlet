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

package la.netco.despachos_judiciales.entities.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author mariza
 */
public class TrabajadorFinderUtil {
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findByDespachoRelacion(
		java.lang.String idDespacho)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByDespachoRelacion(idDespacho);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findByFields(
		java.lang.String idTrabajador, java.lang.String nombres,
		java.lang.String apellidos, java.lang.String especialidad,
		java.lang.String correo, java.lang.String telefonos,
		java.lang.Integer carrera, java.lang.Integer tipoTrabajador,
		java.lang.Integer tipoContrato, java.lang.String sexo,
		java.sql.Date fechaNacimiento, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByFields(idTrabajador, nombres, apellidos,
			especialidad, correo, telefonos, carrera, tipoTrabajador,
			tipoContrato, sexo, fechaNacimiento, start, end);
	}

	public static java.lang.Integer countByFields(
		java.lang.String idTrabajador, java.lang.String nombres,
		java.lang.String apellidos, java.lang.String especialidad,
		java.lang.String correo, java.lang.String telefonos,
		java.lang.Integer carrera, java.lang.Integer tipoTrabajador,
		java.lang.Integer tipoContrato, java.lang.String sexo,
		java.sql.Date fechaNacimiento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByFields(idTrabajador, nombres, apellidos,
			especialidad, correo, telefonos, carrera, tipoTrabajador,
			tipoContrato, sexo, fechaNacimiento);
	}

	public static TrabajadorFinder getFinder() {
		if (_finder == null) {
			_finder = (TrabajadorFinder)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					TrabajadorFinder.class.getName());

			ReferenceRegistry.registerReference(TrabajadorFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TrabajadorFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TrabajadorFinderUtil.class,
			"_finder");
	}

	private static TrabajadorFinder _finder;
}