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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class MunicipioClp extends BaseModelImpl<Municipio> implements Municipio {
	public MunicipioClp() {
	}

	public Class<?> getModelClass() {
		return Municipio.class;
	}

	public String getModelClassName() {
		return Municipio.class.getName();
	}

	public MunicipioPK getPrimaryKey() {
		return new MunicipioPK(_idDepartamento, _codigo);
	}

	public void setPrimaryKey(MunicipioPK primaryKey) {
		setIdDepartamento(primaryKey.idDepartamento);
		setCodigo(primaryKey.codigo);
	}

	public Serializable getPrimaryKeyObj() {
		return new MunicipioPK(_idDepartamento, _codigo);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((MunicipioPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idDepartamento", getIdDepartamento());
		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("indicativo", getIndicativo());
		attributes.put("idCircuito", getIdCircuito());
		attributes.put("idCircuitoAdministrativo", getIdCircuitoAdministrativo());
		attributes.put("idConsejoSeccional", getIdConsejoSeccional());
		attributes.put("idCircuitoDisciplinario", getIdCircuitoDisciplinario());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idDepartamento = (Integer)attributes.get("idDepartamento");

		if (idDepartamento != null) {
			setIdDepartamento(idDepartamento);
		}

		Integer codigo = (Integer)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Integer indicativo = (Integer)attributes.get("indicativo");

		if (indicativo != null) {
			setIndicativo(indicativo);
		}

		Integer idCircuito = (Integer)attributes.get("idCircuito");

		if (idCircuito != null) {
			setIdCircuito(idCircuito);
		}

		Integer idCircuitoAdministrativo = (Integer)attributes.get(
				"idCircuitoAdministrativo");

		if (idCircuitoAdministrativo != null) {
			setIdCircuitoAdministrativo(idCircuitoAdministrativo);
		}

		Integer idConsejoSeccional = (Integer)attributes.get(
				"idConsejoSeccional");

		if (idConsejoSeccional != null) {
			setIdConsejoSeccional(idConsejoSeccional);
		}

		Integer idCircuitoDisciplinario = (Integer)attributes.get(
				"idCircuitoDisciplinario");

		if (idCircuitoDisciplinario != null) {
			setIdCircuitoDisciplinario(idCircuitoDisciplinario);
		}
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

	public BaseModel<?> getMunicipioRemoteModel() {
		return _municipioRemoteModel;
	}

	public void setMunicipioRemoteModel(BaseModel<?> municipioRemoteModel) {
		_municipioRemoteModel = municipioRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			MunicipioLocalServiceUtil.addMunicipio(this);
		}
		else {
			MunicipioLocalServiceUtil.updateMunicipio(this);
		}
	}

	@Override
	public Municipio toEscapedModel() {
		return (Municipio)Proxy.newProxyInstance(Municipio.class.getClassLoader(),
			new Class[] { Municipio.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MunicipioClp clone = new MunicipioClp();

		clone.setIdDepartamento(getIdDepartamento());
		clone.setCodigo(getCodigo());
		clone.setNombre(getNombre());
		clone.setIndicativo(getIndicativo());
		clone.setIdCircuito(getIdCircuito());
		clone.setIdCircuitoAdministrativo(getIdCircuitoAdministrativo());
		clone.setIdConsejoSeccional(getIdConsejoSeccional());
		clone.setIdCircuitoDisciplinario(getIdCircuitoDisciplinario());

		return clone;
	}

	public int compareTo(Municipio municipio) {
		MunicipioPK primaryKey = municipio.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MunicipioClp municipio = null;

		try {
			municipio = (MunicipioClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		MunicipioPK primaryKey = municipio.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{idDepartamento=");
		sb.append(getIdDepartamento());
		sb.append(", codigo=");
		sb.append(getCodigo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", indicativo=");
		sb.append(getIndicativo());
		sb.append(", idCircuito=");
		sb.append(getIdCircuito());
		sb.append(", idCircuitoAdministrativo=");
		sb.append(getIdCircuitoAdministrativo());
		sb.append(", idConsejoSeccional=");
		sb.append(getIdConsejoSeccional());
		sb.append(", idCircuitoDisciplinario=");
		sb.append(getIdCircuitoDisciplinario());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Municipio");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idDepartamento</column-name><column-value><![CDATA[");
		sb.append(getIdDepartamento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>indicativo</column-name><column-value><![CDATA[");
		sb.append(getIndicativo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCircuito</column-name><column-value><![CDATA[");
		sb.append(getIdCircuito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCircuitoAdministrativo</column-name><column-value><![CDATA[");
		sb.append(getIdCircuitoAdministrativo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idConsejoSeccional</column-name><column-value><![CDATA[");
		sb.append(getIdConsejoSeccional());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idCircuitoDisciplinario</column-name><column-value><![CDATA[");
		sb.append(getIdCircuitoDisciplinario());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _idDepartamento;
	private int _codigo;
	private String _nombre;
	private int _indicativo;
	private int _idCircuito;
	private int _idCircuitoAdministrativo;
	private int _idConsejoSeccional;
	private int _idCircuitoDisciplinario;
	private BaseModel<?> _municipioRemoteModel;
}