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

import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class DistritoClp extends BaseModelImpl<Distrito> implements Distrito {
	public DistritoClp() {
	}

	public Class<?> getModelClass() {
		return Distrito.class;
	}

	public String getModelClassName() {
		return Distrito.class.getName();
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
		attributes.put("idConsejo_sec", getIdConsejo_sec());
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

		Integer idConsejo_sec = (Integer)attributes.get("idConsejo_sec");

		if (idConsejo_sec != null) {
			setIdConsejo_sec(idConsejo_sec);
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

	public int getIdConsejo_sec() {
		return _idConsejo_sec;
	}

	public void setIdConsejo_sec(int idConsejo_sec) {
		_idConsejo_sec = idConsejo_sec;
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

	public BaseModel<?> getDistritoRemoteModel() {
		return _distritoRemoteModel;
	}

	public void setDistritoRemoteModel(BaseModel<?> distritoRemoteModel) {
		_distritoRemoteModel = distritoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DistritoLocalServiceUtil.addDistrito(this);
		}
		else {
			DistritoLocalServiceUtil.updateDistrito(this);
		}
	}

	@Override
	public Distrito toEscapedModel() {
		return (Distrito)Proxy.newProxyInstance(Distrito.class.getClassLoader(),
			new Class[] { Distrito.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DistritoClp clone = new DistritoClp();

		clone.setCodigo(getCodigo());
		clone.setNombre(getNombre());
		clone.setIdConsejo_sec(getIdConsejo_sec());
		clone.setJurisdiccion(getJurisdiccion());
		clone.setCodigo_dane(getCodigo_dane());

		return clone;
	}

	public int compareTo(Distrito distrito) {
		int primaryKey = distrito.getPrimaryKey();

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

		DistritoClp distrito = null;

		try {
			distrito = (DistritoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = distrito.getPrimaryKey();

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
		sb.append(", idConsejo_sec=");
		sb.append(getIdConsejo_sec());
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
		sb.append("la.netco.despachos_judiciales.entities.model.Distrito");
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
			"<column><column-name>idConsejo_sec</column-name><column-value><![CDATA[");
		sb.append(getIdConsejo_sec());
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
	private int _idConsejo_sec;
	private String _jurisdiccion;
	private String _codigo_dane;
	private BaseModel<?> _distritoRemoteModel;
}