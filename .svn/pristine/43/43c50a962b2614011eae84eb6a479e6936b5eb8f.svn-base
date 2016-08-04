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
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    mariza
 * @generated
 */
public class CircuitoSoap implements Serializable {
	public static CircuitoSoap toSoapModel(Circuito model) {
		CircuitoSoap soapModel = new CircuitoSoap();

		soapModel.setCodigo(model.getCodigo());
		soapModel.setNombre(model.getNombre());
		soapModel.setIdDistrito(model.getIdDistrito());
		soapModel.setJurisdiccion(model.getJurisdiccion());
		soapModel.setCodigo_dane(model.getCodigo_dane());

		return soapModel;
	}

	public static CircuitoSoap[] toSoapModels(Circuito[] models) {
		CircuitoSoap[] soapModels = new CircuitoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CircuitoSoap[][] toSoapModels(Circuito[][] models) {
		CircuitoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CircuitoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CircuitoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CircuitoSoap[] toSoapModels(List<Circuito> models) {
		List<CircuitoSoap> soapModels = new ArrayList<CircuitoSoap>(models.size());

		for (Circuito model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CircuitoSoap[soapModels.size()]);
	}

	public CircuitoSoap() {
	}

	public int getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(int pk) {
		setCodigo(pk);
	}

	public int getCodigo() {
		return _codigo;
	}

	public void setCodigo(int codigo) {
		_codigo = codigo;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public int getIdDistrito() {
		return _idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		_idDistrito = idDistrito;
	}

	public String getJurisdiccion() {
		return _jurisdiccion;
	}

	public void setJurisdiccion(String jurisdiccion) {
		_jurisdiccion = jurisdiccion;
	}

	public String getCodigo_dane() {
		return _codigo_dane;
	}

	public void setCodigo_dane(String codigo_dane) {
		_codigo_dane = codigo_dane;
	}

	private int _codigo;
	private String _nombre;
	private int _idDistrito;
	private String _jurisdiccion;
	private String _codigo_dane;
}