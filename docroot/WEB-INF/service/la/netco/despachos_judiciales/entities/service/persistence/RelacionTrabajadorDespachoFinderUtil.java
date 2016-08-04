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
public class RelacionTrabajadorDespachoFinderUtil {
	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> findByFields(
		java.lang.String idDespacho, java.lang.String idTrabajador,
		java.lang.String cargo, java.lang.String acuerdo,
		java.lang.String activo, java.lang.String fecha_ini,
		java.lang.String fecha_fin, java.lang.String secuencia, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByFields(idDespacho, idTrabajador, cargo, acuerdo,
			activo, fecha_ini, fecha_fin, secuencia, start, end);
	}

	public static java.lang.Integer countByFields(java.lang.String idDespacho,
		java.lang.String idTrabajador, java.lang.String cargo,
		java.lang.String acuerdo, java.lang.String activo,
		java.lang.String fecha_ini, java.lang.String fecha_fin,
		java.lang.String secuencia)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByFields(idDespacho, idTrabajador, cargo, acuerdo,
			activo, fecha_ini, fecha_fin, secuencia);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho> createMold()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().createMold();
	}

	public static RelacionTrabajadorDespachoFinder getFinder() {
		if (_finder == null) {
			_finder = (RelacionTrabajadorDespachoFinder)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					RelacionTrabajadorDespachoFinder.class.getName());

			ReferenceRegistry.registerReference(RelacionTrabajadorDespachoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(RelacionTrabajadorDespachoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(RelacionTrabajadorDespachoFinderUtil.class,
			"_finder");
	}

	private static RelacionTrabajadorDespachoFinder _finder;
}