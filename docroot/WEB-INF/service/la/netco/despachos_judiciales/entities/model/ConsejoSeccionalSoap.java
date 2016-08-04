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
public class ConsejoSeccionalSoap implements Serializable {
	public static ConsejoSeccionalSoap toSoapModel(ConsejoSeccional model) {
		ConsejoSeccionalSoap soapModel = new ConsejoSeccionalSoap();

		soapModel.setCodigo(model.getCodigo());
		soapModel.setNombre(model.getNombre());
		soapModel.setDireccion(model.getDireccion());
		soapModel.setTelefonos(model.getTelefonos());
		soapModel.setCorreo_electronico(model.getCorreo_electronico());

		return soapModel;
	}

	public static ConsejoSeccionalSoap[] toSoapModels(ConsejoSeccional[] models) {
		ConsejoSeccionalSoap[] soapModels = new ConsejoSeccionalSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ConsejoSeccionalSoap[][] toSoapModels(
		ConsejoSeccional[][] models) {
		ConsejoSeccionalSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ConsejoSeccionalSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ConsejoSeccionalSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ConsejoSeccionalSoap[] toSoapModels(
		List<ConsejoSeccional> models) {
		List<ConsejoSeccionalSoap> soapModels = new ArrayList<ConsejoSeccionalSoap>(models.size());

		for (ConsejoSeccional model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ConsejoSeccionalSoap[soapModels.size()]);
	}

	public ConsejoSeccionalSoap() {
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

	private int _codigo;
	private String _nombre;
	private String _direccion;
	private String _telefonos;
	private String _correo_electronico;
}