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

package la.netco.despachos_judiciales.entities.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import la.netco.despachos_judiciales.entities.model.Despacho;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Despacho in entity cache.
 *
 * @author mariza
 * @see Despacho
 * @generated
 */
public class DespachoCacheModel implements CacheModel<Despacho>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{codigo=");
		sb.append(codigo);
		sb.append(", idDepartamento=");
		sb.append(idDepartamento);
		sb.append(", idMunicipio=");
		sb.append(idMunicipio);
		sb.append(", idEntidad=");
		sb.append(idEntidad);
		sb.append(", idEspecialidad=");
		sb.append(idEspecialidad);
		sb.append(", consecutivo=");
		sb.append(consecutivo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", direccion=");
		sb.append(direccion);
		sb.append(", telefonos=");
		sb.append(telefonos);
		sb.append(", correo_electronico=");
		sb.append(correo_electronico);
		sb.append(", acuerdo=");
		sb.append(acuerdo);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", fax=");
		sb.append(fax);
		sb.append(", horario_atencion=");
		sb.append(horario_atencion);
		sb.append(", fecha_act=");
		sb.append(fecha_act);
		sb.append("}");

		return sb.toString();
	}

	public Despacho toEntityModel() {
		DespachoImpl despachoImpl = new DespachoImpl();

		if (codigo == null) {
			despachoImpl.setCodigo(StringPool.BLANK);
		}
		else {
			despachoImpl.setCodigo(codigo);
		}

		despachoImpl.setIdDepartamento(idDepartamento);
		despachoImpl.setIdMunicipio(idMunicipio);
		despachoImpl.setIdEntidad(idEntidad);
		despachoImpl.setIdEspecialidad(idEspecialidad);

		if (consecutivo == null) {
			despachoImpl.setConsecutivo(StringPool.BLANK);
		}
		else {
			despachoImpl.setConsecutivo(consecutivo);
		}

		if (nombre == null) {
			despachoImpl.setNombre(StringPool.BLANK);
		}
		else {
			despachoImpl.setNombre(nombre);
		}

		if (direccion == null) {
			despachoImpl.setDireccion(StringPool.BLANK);
		}
		else {
			despachoImpl.setDireccion(direccion);
		}

		if (telefonos == null) {
			despachoImpl.setTelefonos(StringPool.BLANK);
		}
		else {
			despachoImpl.setTelefonos(telefonos);
		}

		if (correo_electronico == null) {
			despachoImpl.setCorreo_electronico(StringPool.BLANK);
		}
		else {
			despachoImpl.setCorreo_electronico(correo_electronico);
		}

		if (acuerdo == null) {
			despachoImpl.setAcuerdo(StringPool.BLANK);
		}
		else {
			despachoImpl.setAcuerdo(acuerdo);
		}

		despachoImpl.setEstado(estado);

		if (fax == null) {
			despachoImpl.setFax(StringPool.BLANK);
		}
		else {
			despachoImpl.setFax(fax);
		}

		if (horario_atencion == null) {
			despachoImpl.setHorario_atencion(StringPool.BLANK);
		}
		else {
			despachoImpl.setHorario_atencion(horario_atencion);
		}

		if (fecha_act == Long.MIN_VALUE) {
			despachoImpl.setFecha_act(null);
		}
		else {
			despachoImpl.setFecha_act(new Date(fecha_act));
		}

		despachoImpl.resetOriginalValues();

		return despachoImpl;
	}

	public String codigo;
	public int idDepartamento;
	public int idMunicipio;
	public int idEntidad;
	public int idEspecialidad;
	public String consecutivo;
	public String nombre;
	public String direccion;
	public String telefonos;
	public String correo_electronico;
	public String acuerdo;
	public long estado;
	public String fax;
	public String horario_atencion;
	public long fecha_act;
}