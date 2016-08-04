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

import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class EntidadClp extends BaseModelImpl<Entidad> implements Entidad {
	public EntidadClp() {
	}

	public Class<?> getModelClass() {
		return Entidad.class;
	}

	public String getModelClassName() {
		return Entidad.class.getName();
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
		attributes.put("mascara", getMascara());
		attributes.put("jurisdiccion", getJurisdiccion());

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

		String mascara = (String)attributes.get("mascara");

		if (mascara != null) {
			setMascara(mascara);
		}

		String jurisdiccion = (String)attributes.get("jurisdiccion");

		if (jurisdiccion != null) {
			setJurisdiccion(jurisdiccion);
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

	public String getMascara() {
		return _mascara;
	}

	public void setMascara(String mascara) {
		_mascara = mascara;
	}

	public String getJurisdiccion() {
		return _jurisdiccion;
	}

	public void setJurisdiccion(String jurisdiccion) {
		_jurisdiccion = jurisdiccion;
	}

	public BaseModel<?> getEntidadRemoteModel() {
		return _entidadRemoteModel;
	}

	public void setEntidadRemoteModel(BaseModel<?> entidadRemoteModel) {
		_entidadRemoteModel = entidadRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			EntidadLocalServiceUtil.addEntidad(this);
		}
		else {
			EntidadLocalServiceUtil.updateEntidad(this);
		}
	}

	@Override
	public Entidad toEscapedModel() {
		return (Entidad)Proxy.newProxyInstance(Entidad.class.getClassLoader(),
			new Class[] { Entidad.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EntidadClp clone = new EntidadClp();

		clone.setCodigo(getCodigo());
		clone.setNombre(getNombre());
		clone.setMascara(getMascara());
		clone.setJurisdiccion(getJurisdiccion());

		return clone;
	}

	public int compareTo(Entidad entidad) {
		int primaryKey = entidad.getPrimaryKey();

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

		EntidadClp entidad = null;

		try {
			entidad = (EntidadClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = entidad.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{codigo=");
		sb.append(getCodigo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", mascara=");
		sb.append(getMascara());
		sb.append(", jurisdiccion=");
		sb.append(getJurisdiccion());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Entidad");
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
			"<column><column-name>mascara</column-name><column-value><![CDATA[");
		sb.append(getMascara());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jurisdiccion</column-name><column-value><![CDATA[");
		sb.append(getJurisdiccion());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _codigo;
	private String _nombre;
	private String _mascara;
	private String _jurisdiccion;
	private BaseModel<?> _entidadRemoteModel;
}