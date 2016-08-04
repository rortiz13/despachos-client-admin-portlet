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
public class DepartamentoFinderUtil {
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Departamento> findByFields(
		java.lang.Integer idDepartamento, java.lang.String nombre, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByFields(idDepartamento, nombre, start, end);
	}

	public static java.lang.Integer countByFields(
		java.lang.Integer idDepartamento, java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().countByFields(idDepartamento, nombre);
	}

	public static DepartamentoFinder getFinder() {
		if (_finder == null) {
			_finder = (DepartamentoFinder)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					DepartamentoFinder.class.getName());

			ReferenceRegistry.registerReference(DepartamentoFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(DepartamentoFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(DepartamentoFinderUtil.class,
			"_finder");
	}

	private static DepartamentoFinder _finder;
}