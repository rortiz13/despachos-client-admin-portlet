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
public class CircuitoFinderUtil {
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findByDespacho(
		java.lang.Integer idConsejo, java.lang.Integer idDistrito,
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByDespacho(idConsejo, idDistrito, idDepartamento,
			idMunicipio);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Circuito> findByFields(
		java.lang.Integer idCircuito, java.lang.String nombre,
		java.lang.Integer idDistrito, java.lang.String jurisdiccion,
		java.lang.String codigoDane, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .findByFields(idCircuito, nombre, idDistrito, jurisdiccion,
			codigoDane, start, end);
	}

	public static java.lang.Integer countByFields(
		java.lang.Integer idCircuito, java.lang.String nombre,
		java.lang.Integer idDistrito, java.lang.String jurisdiccion,
		java.lang.String codigoDane)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
				   .countByFields(idCircuito, nombre, idDistrito, jurisdiccion,
			codigoDane);
	}

	public static CircuitoFinder getFinder() {
		if (_finder == null) {
			_finder = (CircuitoFinder)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					CircuitoFinder.class.getName());

			ReferenceRegistry.registerReference(CircuitoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CircuitoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CircuitoFinderUtil.class, "_finder");
	}

	private static CircuitoFinder _finder;
}