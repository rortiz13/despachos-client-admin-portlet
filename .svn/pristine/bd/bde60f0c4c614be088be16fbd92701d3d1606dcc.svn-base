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

package la.netco.despachos_judiciales.entities.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    mariza
 * @generated
 */
public class TrabajadorSoap implements Serializable {
	public static TrabajadorSoap toSoapModel(Trabajador model) {
		TrabajadorSoap soapModel = new TrabajadorSoap();

		soapModel.setCedula(model.getCedula());
		soapModel.setNombres(model.getNombres());
		soapModel.setApellidos(model.getApellidos());
		soapModel.setEspecialidad(model.getEspecialidad());
		soapModel.setCorreo_electronico(model.getCorreo_electronico());
		soapModel.setTelefonos_oficina(model.getTelefonos_oficina());
		soapModel.setCarrera(model.getCarrera());
		soapModel.setTipo_trabajador(model.getTipo_trabajador());
		soapModel.setTipo_contrato(model.getTipo_contrato());
		soapModel.setSexo(model.getSexo());
		soapModel.setFecha_nacimiento(model.getFecha_nacimiento());

		return soapModel;
	}

	public static TrabajadorSoap[] toSoapModels(Trabajador[] models) {
		TrabajadorSoap[] soapModels = new TrabajadorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TrabajadorSoap[][] toSoapModels(Trabajador[][] models) {
		TrabajadorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TrabajadorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TrabajadorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TrabajadorSoap[] toSoapModels(List<Trabajador> models) {
		List<TrabajadorSoap> soapModels = new ArrayList<TrabajadorSoap>(models.size());

		for (Trabajador model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TrabajadorSoap[soapModels.size()]);
	}

	public TrabajadorSoap() {
	}

	public String getPrimaryKey() {
		return _cedula;
	}

	public void setPrimaryKey(String pk) {
		setCedula(pk);
	}

	public String getCedula() {
		return _cedula;
	}

	public void setCedula(String cedula) {
		_cedula = cedula;
	}

	public String getNombres() {
		return _nombres;
	}

	public void setNombres(String nombres) {
		_nombres = nombres;
	}

	public String getApellidos() {
		return _apellidos;
	}

	public void setApellidos(String apellidos) {
		_apellidos = apellidos;
	}

	public String getEspecialidad() {
		return _especialidad;
	}

	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;
	}

	public String getCorreo_electronico() {
		return _correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		_correo_electronico = correo_electronico;
	}

	public String getTelefonos_oficina() {
		return _telefonos_oficina;
	}

	public void setTelefonos_oficina(String telefonos_oficina) {
		_telefonos_oficina = telefonos_oficina;
	}

	public long getCarrera() {
		return _carrera;
	}

	public void setCarrera(long carrera) {
		_carrera = carrera;
	}

	public long getTipo_trabajador() {
		return _tipo_trabajador;
	}

	public void setTipo_trabajador(long tipo_trabajador) {
		_tipo_trabajador = tipo_trabajador;
	}

	public long getTipo_contrato() {
		return _tipo_contrato;
	}

	public void setTipo_contrato(long tipo_contrato) {
		_tipo_contrato = tipo_contrato;
	}

	public String getSexo() {
		return _sexo;
	}

	public void setSexo(String sexo) {
		_sexo = sexo;
	}

	public Date getFecha_nacimiento() {
		return _fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		_fecha_nacimiento = fecha_nacimiento;
	}

	private String _cedula;
	private String _nombres;
	private String _apellidos;
	private String _especialidad;
	private String _correo_electronico;
	private String _telefonos_oficina;
	private long _carrera;
	private long _tipo_trabajador;
	private long _tipo_contrato;
	private String _sexo;
	private Date _fecha_nacimiento;
}