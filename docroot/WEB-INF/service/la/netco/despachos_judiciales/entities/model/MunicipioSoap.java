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

import la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    mariza
 * @generated
 */
public class MunicipioSoap implements Serializable {
	public static MunicipioSoap toSoapModel(Municipio model) {
		MunicipioSoap soapModel = new MunicipioSoap();

		soapModel.setIdDepartamento(model.getIdDepartamento());
		soapModel.setCodigo(model.getCodigo());
		soapModel.setNombre(model.getNombre());
		soapModel.setIndicativo(model.getIndicativo());
		soapModel.setIdCircuito(model.getIdCircuito());
		soapModel.setIdCircuitoAdministrativo(model.getIdCircuitoAdministrativo());
		soapModel.setIdConsejoSeccional(model.getIdConsejoSeccional());
		soapModel.setIdCircuitoDisciplinario(model.getIdCircuitoDisciplinario());

		return soapModel;
	}

	public static MunicipioSoap[] toSoapModels(Municipio[] models) {
		MunicipioSoap[] soapModels = new MunicipioSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MunicipioSoap[][] toSoapModels(Municipio[][] models) {
		MunicipioSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MunicipioSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MunicipioSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MunicipioSoap[] toSoapModels(List<Municipio> models) {
		List<MunicipioSoap> soapModels = new ArrayList<MunicipioSoap>(models.size());

		for (Municipio model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MunicipioSoap[soapModels.size()]);
	}

	public MunicipioSoap() {
	}

	public MunicipioPK getPrimaryKey() {
		return new MunicipioPK(_idDepartamento, _codigo);
	}

	public void setPrimaryKey(MunicipioPK pk) {
		setIdDepartamento(pk.idDepartamento);
		setCodigo(pk.codigo);
	}

	public int getIdDepartamento() {
		return _idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		_idDepartamento = idDepartamento;
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

	public int getIndicativo() {
		return _indicativo;
	}

	public void setIndicativo(int indicativo) {
		_indicativo = indicativo;
	}

	public int getIdCircuito() {
		return _idCircuito;
	}

	public void setIdCircuito(int idCircuito) {
		_idCircuito = idCircuito;
	}

	public int getIdCircuitoAdministrativo() {
		return _idCircuitoAdministrativo;
	}

	public void setIdCircuitoAdministrativo(int idCircuitoAdministrativo) {
		_idCircuitoAdministrativo = idCircuitoAdministrativo;
	}

	public int getIdConsejoSeccional() {
		return _idConsejoSeccional;
	}

	public void setIdConsejoSeccional(int idConsejoSeccional) {
		_idConsejoSeccional = idConsejoSeccional;
	}

	public int getIdCircuitoDisciplinario() {
		return _idCircuitoDisciplinario;
	}

	public void setIdCircuitoDisciplinario(int idCircuitoDisciplinario) {
		_idCircuitoDisciplinario = idCircuitoDisciplinario;
	}

	private int _idDepartamento;
	private int _codigo;
	private String _nombre;
	private int _indicativo;
	private int _idCircuito;
	private int _idCircuitoAdministrativo;
	private int _idConsejoSeccional;
	private int _idCircuitoDisciplinario;
}