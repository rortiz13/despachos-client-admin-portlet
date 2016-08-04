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
public interface DespachoFinder {
	public java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> findByFields(
		java.lang.Integer idConsejo, java.lang.String idDespacho,
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad, java.lang.Integer idEspecialidad,
		java.lang.String consecutivo, java.lang.String nombre,
		java.lang.String direccion, java.lang.String telefonos,
		java.lang.String correo_electronico, java.lang.String acuerdo,
		java.lang.Integer estado, java.lang.String fax,
		java.lang.String horario_atencion, java.sql.Date fechaInicial,
		java.sql.Date fechaFinal, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.lang.Integer countbyFields(java.lang.Integer idConsejo,
		java.lang.String idDespacho, java.lang.Integer idDepartamento,
		java.lang.Integer idMunicipio, java.lang.Integer idEntidad,
		java.lang.Integer idEspecialidad, java.lang.String consecutivo,
		java.lang.String nombre, java.lang.String direccion,
		java.lang.String telefonos, java.lang.String correo_electronico,
		java.lang.String acuerdo, java.lang.Integer estado,
		java.lang.String fax, java.lang.String horario_atencion,
		java.sql.Date fechaInicial, java.sql.Date fechaFinal)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<la.netco.despachos_judiciales.entities.model.Despacho> findDespacho(
		java.lang.Integer idDepartamento, java.lang.Integer idMunicipio,
		java.lang.Integer idEntidad, java.lang.Integer idEspecialidad,
		java.lang.Integer idDistrito, java.lang.Integer idCosenjoSec,
		java.lang.Integer idCircuito, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.lang.Integer countDespacho(java.lang.Integer idDepartamento,
		java.lang.Integer idMunicipio, java.lang.Integer idEntidad,
		java.lang.Integer idEspecialidad, java.lang.Integer idDistrito,
		java.lang.Integer idCosenjoSec, java.lang.Integer idCircuito)
		throws com.liferay.portal.kernel.exception.SystemException;
}