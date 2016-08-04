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

import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class ConsejoSeccionalClp extends BaseModelImpl<ConsejoSeccional>
	implements ConsejoSeccional {
	public ConsejoSeccionalClp() {
	}

	public Class<?> getModelClass() {
		return ConsejoSeccional.class;
	}

	public String getModelClassName() {
		return ConsejoSeccional.class.getName();
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
		attributes.put("direccion", getDireccion());
		attributes.put("telefonos", getTelefonos());
		attributes.put("correo_electronico", getCorreo_electronico());

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

		String direccion = (String)attributes.get("direccion");

		if (direccion != null) {
			setDireccion(direccion);
		}

		String telefonos = (String)attributes.get("telefonos");

		if (telefonos != null) {
			setTelefonos(telefonos);
		}

		String correo_electronico = (String)attributes.get("correo_electronico");

		if (correo_electronico != null) {
			setCorreo_electronico(correo_electronico);
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

	public BaseModel<?> getConsejoSeccionalRemoteModel() {
		return _consejoSeccionalRemoteModel;
	}

	public void setConsejoSeccionalRemoteModel(
		BaseModel<?> consejoSeccionalRemoteModel) {
		_consejoSeccionalRemoteModel = consejoSeccionalRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ConsejoSeccionalLocalServiceUtil.addConsejoSeccional(this);
		}
		else {
			ConsejoSeccionalLocalServiceUtil.updateConsejoSeccional(this);
		}
	}

	@Override
	public ConsejoSeccional toEscapedModel() {
		return (ConsejoSeccional)Proxy.newProxyInstance(ConsejoSeccional.class.getClassLoader(),
			new Class[] { ConsejoSeccional.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ConsejoSeccionalClp clone = new ConsejoSeccionalClp();

		clone.setCodigo(getCodigo());
		clone.setNombre(getNombre());
		clone.setDireccion(getDireccion());
		clone.setTelefonos(getTelefonos());
		clone.setCorreo_electronico(getCorreo_electronico());

		return clone;
	}

	public int compareTo(ConsejoSeccional consejoSeccional) {
		int primaryKey = consejoSeccional.getPrimaryKey();

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

		ConsejoSeccionalClp consejoSeccional = null;

		try {
			consejoSeccional = (ConsejoSeccionalClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = consejoSeccional.getPrimaryKey();

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
		sb.append(", direccion=");
		sb.append(getDireccion());
		sb.append(", telefonos=");
		sb.append(getTelefonos());
		sb.append(", correo_electronico=");
		sb.append(getCorreo_electronico());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append(
			"la.netco.despachos_judiciales.entities.model.ConsejoSeccional");
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
			"<column><column-name>direccion</column-name><column-value><![CDATA[");
		sb.append(getDireccion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefonos</column-name><column-value><![CDATA[");
		sb.append(getTelefonos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correo_electronico</column-name><column-value><![CDATA[");
		sb.append(getCorreo_electronico());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _codigo;
	private String _nombre;
	private String _direccion;
	private String _telefonos;
	private String _correo_electronico;
	private BaseModel<?> _consejoSeccionalRemoteModel;
}