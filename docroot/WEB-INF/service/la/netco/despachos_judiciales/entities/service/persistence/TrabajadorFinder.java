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
public interface TrabajadorFinder {
	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findByDespachoRelacion(
		java.lang.String idDespacho)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<la.netco.despachos_judiciales.entities.model.Trabajador> findByFields(
		java.lang.String idTrabajador, java.lang.String nombres,
		java.lang.String apellidos, java.lang.String especialidad,
		java.lang.String correo, java.lang.String telefonos,
		java.lang.Integer carrera, java.lang.Integer tipoTrabajador,
		java.lang.Integer tipoContrato, java.lang.String sexo,
		java.sql.Date fechaNacimiento, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.lang.Integer countByFields(java.lang.String idTrabajador,
		java.lang.String nombres, java.lang.String apellidos,
		java.lang.String especialidad, java.lang.String correo,
		java.lang.String telefonos, java.lang.Integer carrera,
		java.lang.Integer tipoTrabajador, java.lang.Integer tipoContrato,
		java.lang.String sexo, java.sql.Date fechaNacimiento)
		throws com.liferay.portal.kernel.exception.SystemException;
}