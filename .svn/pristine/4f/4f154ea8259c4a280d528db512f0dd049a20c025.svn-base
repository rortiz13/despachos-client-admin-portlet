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
public class MunicipioFinderUtil {
	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findByEstadoDescpacho(
		java.lang.Integer idDepartamento)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByEstadoDescpacho(idDepartamento);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findByCompositeKey(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder().findByCompositeKey(idDepartamento, idMunicipio);
	}

	public static java.util.List<la.netco.despachos_judiciales.entities.model.Municipio> findByFields(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.String nombre, java.lang.String indicativo,
		java.lang.Integer idCircuito,
		java.lang.Integer idCircuitoAdministrativo,
		java.lang.Integer idConsejoSeccional,
		java.lang.Integer idCircuitoDisciplinario, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getFinder()
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
		return getFinder()
				   .countByFields(idDepartamento, idMunicipio, nombre,
			indicativo, idCircuito, idCircuitoAdministrativo,
			idConsejoSeccional, idCircuitoDisciplinario);
	}

	public static MunicipioFinder getFinder() {
		if (_finder == null) {
			_finder = (MunicipioFinder)PortletBeanLocatorUtil.locate(la.netco.despachos_judiciales.entities.service.ClpSerializer.getServletContextName(),
					MunicipioFinder.class.getName());

			ReferenceRegistry.registerReference(MunicipioFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(MunicipioFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(MunicipioFinderUtil.class, "_finder");
	}

	private static MunicipioFinder _finder;
}