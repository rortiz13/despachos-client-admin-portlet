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
public class ConsejoSeccionalFinderUtil {
	public static java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findByDespacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByDespacho(idDepartamento, idMunicipio);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> findByFields(
		java.lang.Integer idConsejoSec, java.lang.String nombre,
		java.lang.String direccion, java.lang.String telefonos,
		java.lang.String correo_electronico, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByFields(idConsejoSec, nombre, direccion, telefonos,
			correo_electronico, start, end);
	}

	public static java.lang.Integer countByFields(
		java.lang.Integer idConsejoSec, java.lang.String nombre,
		java.lang.String direccion, java.lang.String telefonos,
		java.lang.String correo_electronico)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByFields(idConsejoSec, nombre, direccion, telefonos,
			correo_electronico);
	}

	public static ConsejoSeccionalFinder getFinder() {
		if (_finder == null) {
			_finder = (ConsejoSeccionalFinder)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					ConsejoSeccionalFinder.class.getName());

			ReferenceRegistry.registerReference(ConsejoSeccionalFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ConsejoSeccionalFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ConsejoSeccionalFinderUtil.class,
			"_finder");
	}

	private static ConsejoSeccionalFinder _finder;
}