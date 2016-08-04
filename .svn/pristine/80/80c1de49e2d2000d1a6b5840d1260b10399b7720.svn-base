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
public class DespachoSoap implements Serializable {
	public static DespachoSoap toSoapModel(Despacho model) {
		DespachoSoap soapModel = new DespachoSoap();

		soapModel.setCodigo(model.getCodigo());
		soapModel.setIdDepartamento(model.getIdDepartamento());
		soapModel.setIdMunicipio(model.getIdMunicipio());
		soapModel.setIdEntidad(model.getIdEntidad());
		soapModel.setIdEspecialidad(model.getIdEspecialidad());
		soapModel.setConsecutivo(model.getConsecutivo());
		soapModel.setNombre(model.getNombre());
		soapModel.setDireccion(model.getDireccion());
		soapModel.setTelefonos(model.getTelefonos());
		soapModel.setCorreo_electronico(model.getCorreo_electronico());
		soapModel.setAcuerdo(model.getAcuerdo());
		soapModel.setEstado(model.getEstado());
		soapModel.setFax(model.getFax());
		soapModel.setHorario_atencion(model.getHorario_atencion());
		soapModel.setFecha_act(model.getFecha_act());

		return soapModel;
	}

	public static DespachoSoap[] toSoapModels(Despacho[] models) {
		DespachoSoap[] soapModels = new DespachoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DespachoSoap[][] toSoapModels(Despacho[][] models) {
		DespachoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DespachoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DespachoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DespachoSoap[] toSoapModels(List<Despacho> models) {
		List<DespachoSoap> soapModels = new ArrayList<DespachoSoap>(models.size());

		for (Despacho model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DespachoSoap[soapModels.size()]);
	}

	public DespachoSoap() {
	}

	public String getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(String pk) {
		setCodigo(pk);
	}

	public String getCodigo() {
		return _codigo;
	}

	public void setCodigo(String codigo) {
		_codigo = codigo;
	}

	public int getIdDepartamento() {
		return _idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		_idDepartamento = idDepartamento;
	}

	public int getIdMunicipio() {
		return _idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		_idMunicipio = idMunicipio;
	}

	public int getIdEntidad() {
		return _idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		_idEntidad = idEntidad;
	}

	public int getIdEspecialidad() {
		return _idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		_idEspecialidad = idEspecialidad;
	}

	public String getConsecutivo() {
		return _consecutivo;
	}

	public void setConsecutivo(String consecutivo) {
		_consecutivo = consecutivo;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getDireccion() {
		return _direccion;
	}

	public void setDireccion(String direccion) {
		_direccion = direccion;
	}

	public String getTelefonos() {
		return _telefonos;
	}

	public void setTelefonos(String telefonos) {
		_telefonos = telefonos;
	}

	public String getCorreo_electronico() {
		return _correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		_correo_electronico = correo_electronico;
	}

	public String getAcuerdo() {
		return _acuerdo;
	}

	public void setAcuerdo(String acuerdo) {
		_acuerdo = acuerdo;
	}

	public long getEstado() {
		return _estado;
	}

	public void setEstado(long estado) {
		_estado = estado;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getHorario_atencion() {
		return _horario_atencion;
	}

	public void setHorario_atencion(String horario_atencion) {
		_horario_atencion = horario_atencion;
	}

	public Date getFecha_act() {
		return _fecha_act;
	}

	public void setFecha_act(Date fecha_act) {
		_fecha_act = fecha_act;
	}

	private String _codigo;
	private int _idDepartamento;
	private int _idMunicipio;
	private int _idEntidad;
	private int _idEspecialidad;
	private String _consecutivo;
	private String _nombre;
	private String _direccion;
	private String _telefonos;
	private String _correo_electronico;
	private String _acuerdo;
	private long _estado;
	private String _fax;
	private String _horario_atencion;
	private Date _fecha_act;
}