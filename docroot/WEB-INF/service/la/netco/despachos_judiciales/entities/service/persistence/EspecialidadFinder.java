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

/**
 * @author mariza
 */
public interface EspecialidadFinder {
	public java.util.List<la.netco.despachos_judiciales.entities.model.Especialidad> findByEstadoDescpacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<la.netco.despachos_judiciales.entities.model.Especialidad> findByFields(
		java.lang.Integer idEspecialidad, java.lang.String nombre, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	public java.lang.Integer countByFields(java.lang.Integer idEspecialidad,
		java.lang.String nombre)
		throws com.liferay.portal.kernel.exception.SystemException;
}