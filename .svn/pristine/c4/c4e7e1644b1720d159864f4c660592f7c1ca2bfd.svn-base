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

import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class CircuitoClp extends BaseModelImpl<Circuito> implements Circuito {
	public CircuitoClp() {
	}

	public Class<?> getModelClass() {
		return Circuito.class;
	}

	public String getModelClassName() {
		return Circuito.class.getName();
	}

	public int getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(int primaryKey) {
		setCodigo(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_codigo);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("idDistrito", getIdDistrito());
		attributes.put("jurisdiccion", getJurisdiccion());
		attributes.put("codigo_dane", getCodigo_dane());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer codigo = (Integer)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		Integer idDistrito = (Integer)attributes.get("idDistrito");

		if (idDistrito != null) {
			setIdDistrito(idDistrito);
		}

		String jurisdiccion = (String)attributes.get("jurisdiccion");

		if (jurisdiccion != null) {
			setJurisdiccion(jurisdiccion);
		}

		String codigo_dane = (String)attributes.get("codigo_dane");

		if (codigo_dane != null) {
			setCodigo_dane(codigo_dane);
		}
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

	public BaseModel<?> getCircuitoRemoteModel() {
		return _circuitoRemoteModel;
	}

	public void setCircuitoRemoteModel(BaseModel<?> circuitoRemoteModel) {
		_circuitoRemoteModel = circuitoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			CircuitoLocalServiceUtil.addCircuito(this);
		}
		else {
			CircuitoLocalServiceUtil.updateCircuito(this);
		}
	}

	@Override
	public Circuito toEscapedModel() {
		return (Circuito)Proxy.newProxyInstance(Circuito.class.getClassLoader(),
			new Class[] { Circuito.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CircuitoClp clone = new CircuitoClp();

		clone.setCodigo(getCodigo());
		clone.setNombre(getNombre());
		clone.setIdDistrito(getIdDistrito());
		clone.setJurisdiccion(getJurisdiccion());
		clone.setCodigo_dane(getCodigo_dane());

		return clone;
	}

	public int compareTo(Circuito circuito) {
		int primaryKey = circuito.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		CircuitoClp circuito = null;

		try {
			circuito = (CircuitoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = circuito.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{codigo=");
		sb.append(getCodigo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", idDistrito=");
		sb.append(getIdDistrito());
		sb.append(", jurisdiccion=");
		sb.append(getJurisdiccion());
		sb.append(", codigo_dane=");
		sb.append(getCodigo_dane());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Circuito");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombre</column-name><column-value><![CDATA[");
		sb.append(getNombre());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idDistrito</column-name><column-value><![CDATA[");
		sb.append(getIdDistrito());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jurisdiccion</column-name><column-value><![CDATA[");
		sb.append(getJurisdiccion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>codigo_dane</column-name><column-value><![CDATA[");
		sb.append(getCodigo_dane());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _codigo;
	private String _nombre;
	private int _idDistrito;
	private String _jurisdiccion;
	private String _codigo_dane;
	private BaseModel<?> _circuitoRemoteModel;
}