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
public class DepartamentoSoap implements Serializable {
	public static DepartamentoSoap toSoapModel(Departamento model) {
		DepartamentoSoap soapModel = new DepartamentoSoap();

		soapModel.setCodigo(model.getCodigo());
		soapModel.setNombre(model.getNombre());

		return soapModel;
	}

	public static DepartamentoSoap[] toSoapModels(Departamento[] models) {
		DepartamentoSoap[] soapModels = new DepartamentoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DepartamentoSoap[][] toSoapModels(Departamento[][] models) {
		DepartamentoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DepartamentoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DepartamentoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DepartamentoSoap[] toSoapModels(List<Departamento> models) {
		List<DepartamentoSoap> soapModels = new ArrayList<DepartamentoSoap>(models.size());

		for (Departamento model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DepartamentoSoap[soapModels.size()]);
	}

	public DepartamentoSoap() {
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

	private int _codigo;
	private String _nombre;
}