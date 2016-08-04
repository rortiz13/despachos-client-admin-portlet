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

import la.netco.despachos_judiciales.entities.model.Trabajador;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing Trabajador in entity cache.
 *
 * @author mariza
 * @see Trabajador
 * @generated
 */
public class TrabajadorCacheModel implements CacheModel<Trabajador>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{cedula=");
		sb.append(cedula);
		sb.append(", nombres=");
		sb.append(nombres);
		sb.append(", apellidos=");
		sb.append(apellidos);
		sb.append(", especialidad=");
		sb.append(especialidad);
		sb.append(", correo_electronico=");
		sb.append(correo_electronico);
		sb.append(", telefonos_oficina=");
		sb.append(telefonos_oficina);
		sb.append(", carrera=");
		sb.append(carrera);
		sb.append(", tipo_trabajador=");
		sb.append(tipo_trabajador);
		sb.append(", tipo_contrato=");
		sb.append(tipo_contrato);
		sb.append(", sexo=");
		sb.append(sexo);
		sb.append(", fecha_nacimiento=");
		sb.append(fecha_nacimiento);
		sb.append("}");

		return sb.toString();
	}

	public Trabajador toEntityModel() {
		TrabajadorImpl trabajadorImpl = new TrabajadorImpl();

		if (cedula == null) {
			trabajadorImpl.setCedula(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setCedula(cedula);
		}

		if (nombres == null) {
			trabajadorImpl.setNombres(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setNombres(nombres);
		}

		if (apellidos == null) {
			trabajadorImpl.setApellidos(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setApellidos(apellidos);
		}

		if (especialidad == null) {
			trabajadorImpl.setEspecialidad(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setEspecialidad(especialidad);
		}

		if (correo_electronico == null) {
			trabajadorImpl.setCorreo_electronico(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setCorreo_electronico(correo_electronico);
		}

		if (telefonos_oficina == null) {
			trabajadorImpl.setTelefonos_oficina(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setTelefonos_oficina(telefonos_oficina);
		}

		trabajadorImpl.setCarrera(carrera);
		trabajadorImpl.setTipo_trabajador(tipo_trabajador);
		trabajadorImpl.setTipo_contrato(tipo_contrato);

		if (sexo == null) {
			trabajadorImpl.setSexo(StringPool.BLANK);
		}
		else {
			trabajadorImpl.setSexo(sexo);
		}

		if (fecha_nacimiento == Long.MIN_VALUE) {
			trabajadorImpl.setFecha_nacimiento(null);
		}
		else {
			trabajadorImpl.setFecha_nacimiento(new Date(fecha_nacimiento));
		}

		trabajadorImpl.resetOriginalValues();

		return trabajadorImpl;
	}

	public String cedula;
	public String nombres;
	public String apellidos;
	public String especialidad;
	public String correo_electronico;
	public String telefonos_oficina;
	public long carrera;
	public long tipo_trabajador;
	public long tipo_contrato;
	public String sexo;
	public long fecha_nacimiento;
}