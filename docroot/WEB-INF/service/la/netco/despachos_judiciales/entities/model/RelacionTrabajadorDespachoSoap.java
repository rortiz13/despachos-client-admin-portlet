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

import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    mariza
 * @generated
 */
public class RelacionTrabajadorDespachoSoap implements Serializable {
	public static RelacionTrabajadorDespachoSoap toSoapModel(
		RelacionTrabajadorDespacho model) {
		RelacionTrabajadorDespachoSoap soapModel = new RelacionTrabajadorDespachoSoap();

		soapModel.setIdDespacho(model.getIdDespacho());
		soapModel.setIdTrabajador(model.getIdTrabajador());
		soapModel.setCargo(model.getCargo());
		soapModel.setAcuerdo(model.getAcuerdo());
		soapModel.setActivo(model.getActivo());
		soapModel.setFecha_ini(model.getFecha_ini());
		soapModel.setFecha_fin(model.getFecha_fin());
		soapModel.setSecuencia(model.getSecuencia());

		return soapModel;
	}

	public static RelacionTrabajadorDespachoSoap[] toSoapModels(
		RelacionTrabajadorDespacho[] models) {
		RelacionTrabajadorDespachoSoap[] soapModels = new RelacionTrabajadorDespachoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RelacionTrabajadorDespachoSoap[][] toSoapModels(
		RelacionTrabajadorDespacho[][] models) {
		RelacionTrabajadorDespachoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RelacionTrabajadorDespachoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RelacionTrabajadorDespachoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RelacionTrabajadorDespachoSoap[] toSoapModels(
		List<RelacionTrabajadorDespacho> models) {
		List<RelacionTrabajadorDespachoSoap> soapModels = new ArrayList<RelacionTrabajadorDespachoSoap>(models.size());

		for (RelacionTrabajadorDespacho model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RelacionTrabajadorDespachoSoap[soapModels.size()]);
	}

	public RelacionTrabajadorDespachoSoap() {
	}

	public RelacionTrabajadorDespachoPK getPrimaryKey() {
		return new RelacionTrabajadorDespachoPK(_idDespacho, _idTrabajador);
	}

	public void setPrimaryKey(RelacionTrabajadorDespachoPK pk) {
		setIdDespacho(pk.idDespacho);
		setIdTrabajador(pk.idTrabajador);
	}

	public String getIdDespacho() {
		return _idDespacho;
	}

	public void setIdDespacho(String idDespacho) {
		_idDespacho = idDespacho;
	}

	public String getIdTrabajador() {
		return _idTrabajador;
	}

	public void setIdTrabajador(String idTrabajador) {
		_idTrabajador = idTrabajador;
	}

	public String getCargo() {
		return _cargo;
	}

	public void setCargo(String cargo) {
		_cargo = cargo;
	}

	public String getAcuerdo() {
		return _acuerdo;
	}

	public void setAcuerdo(String acuerdo) {
		_acuerdo = acuerdo;
	}

	public String getActivo() {
		return _activo;
	}

	public void setActivo(String activo) {
		_activo = activo;
	}

	public String getFecha_ini() {
		return _fecha_ini;
	}

	public void setFecha_ini(String fecha_ini) {
		_fecha_ini = fecha_ini;
	}

	public String getFecha_fin() {
		return _fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		_fecha_fin = fecha_fin;
	}

	public String getSecuencia() {
		return _secuencia;
	}

	public void setSecuencia(String secuencia) {
		_secuencia = secuencia;
	}

	private String _idDespacho;
	private String _idTrabajador;
	private String _cargo;
	private String _acuerdo;
	private String _activo;
	private String _fecha_ini;
	private String _fecha_fin;
	private String _secuencia;
}