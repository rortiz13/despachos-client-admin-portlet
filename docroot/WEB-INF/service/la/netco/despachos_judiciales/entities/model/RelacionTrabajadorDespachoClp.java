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

import la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class RelacionTrabajadorDespachoClp extends BaseModelImpl<RelacionTrabajadorDespacho>
	implements RelacionTrabajadorDespacho {
	public RelacionTrabajadorDespachoClp() {
	}

	public Class<?> getModelClass() {
		return RelacionTrabajadorDespacho.class;
	}

	public String getModelClassName() {
		return RelacionTrabajadorDespacho.class.getName();
	}

	public RelacionTrabajadorDespachoPK getPrimaryKey() {
		return new RelacionTrabajadorDespachoPK(_idDespacho, _idTrabajador);
	}

	public void setPrimaryKey(RelacionTrabajadorDespachoPK primaryKey) {
		setIdDespacho(primaryKey.idDespacho);
		setIdTrabajador(primaryKey.idTrabajador);
	}

	public Serializable getPrimaryKeyObj() {
		return new RelacionTrabajadorDespachoPK(_idDespacho, _idTrabajador);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((RelacionTrabajadorDespachoPK)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idDespacho", getIdDespacho());
		attributes.put("idTrabajador", getIdTrabajador());
		attributes.put("cargo", getCargo());
		attributes.put("acuerdo", getAcuerdo());
		attributes.put("activo", getActivo());
		attributes.put("fecha_ini", getFecha_ini());
		attributes.put("fecha_fin", getFecha_fin());
		attributes.put("secuencia", getSecuencia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String idDespacho = (String)attributes.get("idDespacho");

		if (idDespacho != null) {
			setIdDespacho(idDespacho);
		}

		String idTrabajador = (String)attributes.get("idTrabajador");

		if (idTrabajador != null) {
			setIdTrabajador(idTrabajador);
		}

		String cargo = (String)attributes.get("cargo");

		if (cargo != null) {
			setCargo(cargo);
		}

		String acuerdo = (String)attributes.get("acuerdo");

		if (acuerdo != null) {
			setAcuerdo(acuerdo);
		}

		String activo = (String)attributes.get("activo");

		if (activo != null) {
			setActivo(activo);
		}

		String fecha_ini = (String)attributes.get("fecha_ini");

		if (fecha_ini != null) {
			setFecha_ini(fecha_ini);
		}

		String fecha_fin = (String)attributes.get("fecha_fin");

		if (fecha_fin != null) {
			setFecha_fin(fecha_fin);
		}

		String secuencia = (String)attributes.get("secuencia");

		if (secuencia != null) {
			setSecuencia(secuencia);
		}
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

	public BaseModel<?> getRelacionTrabajadorDespachoRemoteModel() {
		return _relacionTrabajadorDespachoRemoteModel;
	}

	public void setRelacionTrabajadorDespachoRemoteModel(
		BaseModel<?> relacionTrabajadorDespachoRemoteModel) {
		_relacionTrabajadorDespachoRemoteModel = relacionTrabajadorDespachoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			RelacionTrabajadorDespachoLocalServiceUtil.addRelacionTrabajadorDespacho(this);
		}
		else {
			RelacionTrabajadorDespachoLocalServiceUtil.updateRelacionTrabajadorDespacho(this);
		}
	}

	@Override
	public RelacionTrabajadorDespacho toEscapedModel() {
		return (RelacionTrabajadorDespacho)Proxy.newProxyInstance(RelacionTrabajadorDespacho.class.getClassLoader(),
			new Class[] { RelacionTrabajadorDespacho.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RelacionTrabajadorDespachoClp clone = new RelacionTrabajadorDespachoClp();

		clone.setIdDespacho(getIdDespacho());
		clone.setIdTrabajador(getIdTrabajador());
		clone.setCargo(getCargo());
		clone.setAcuerdo(getAcuerdo());
		clone.setActivo(getActivo());
		clone.setFecha_ini(getFecha_ini());
		clone.setFecha_fin(getFecha_fin());
		clone.setSecuencia(getSecuencia());

		return clone;
	}

	public int compareTo(RelacionTrabajadorDespacho relacionTrabajadorDespacho) {
		RelacionTrabajadorDespachoPK primaryKey = relacionTrabajadorDespacho.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		RelacionTrabajadorDespachoClp relacionTrabajadorDespacho = null;

		try {
			relacionTrabajadorDespacho = (RelacionTrabajadorDespachoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		RelacionTrabajadorDespachoPK primaryKey = relacionTrabajadorDespacho.getPrimaryKey();

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

		sb.append("{idDespacho=");
		sb.append(getIdDespacho());
		sb.append(", idTrabajador=");
		sb.append(getIdTrabajador());
		sb.append(", cargo=");
		sb.append(getCargo());
		sb.append(", acuerdo=");
		sb.append(getAcuerdo());
		sb.append(", activo=");
		sb.append(getActivo());
		sb.append(", fecha_ini=");
		sb.append(getFecha_ini());
		sb.append(", fecha_fin=");
		sb.append(getFecha_fin());
		sb.append(", secuencia=");
		sb.append(getSecuencia());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append(
			"la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idDespacho</column-name><column-value><![CDATA[");
		sb.append(getIdDespacho());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idTrabajador</column-name><column-value><![CDATA[");
		sb.append(getIdTrabajador());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cargo</column-name><column-value><![CDATA[");
		sb.append(getCargo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>acuerdo</column-name><column-value><![CDATA[");
		sb.append(getAcuerdo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activo</column-name><column-value><![CDATA[");
		sb.append(getActivo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha_ini</column-name><column-value><![CDATA[");
		sb.append(getFecha_ini());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha_fin</column-name><column-value><![CDATA[");
		sb.append(getFecha_fin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>secuencia</column-name><column-value><![CDATA[");
		sb.append(getSecuencia());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _idDespacho;
	private String _idTrabajador;
	private String _cargo;
	private String _acuerdo;
	private String _activo;
	private String _fecha_ini;
	private String _fecha_fin;
	private String _secuencia;
	private BaseModel<?> _relacionTrabajadorDespachoRemoteModel;
}