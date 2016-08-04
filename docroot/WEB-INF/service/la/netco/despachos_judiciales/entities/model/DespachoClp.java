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

import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class DespachoClp extends BaseModelImpl<Despacho> implements Despacho {
	public DespachoClp() {
	}

	public Class<?> getModelClass() {
		return Despacho.class;
	}

	public String getModelClassName() {
		return Despacho.class.getName();
	}

	public String getPrimaryKey() {
		return _codigo;
	}

	public void setPrimaryKey(String primaryKey) {
		setCodigo(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _codigo;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("idDepartamento", getIdDepartamento());
		attributes.put("idMunicipio", getIdMunicipio());
		attributes.put("idEntidad", getIdEntidad());
		attributes.put("idEspecialidad", getIdEspecialidad());
		attributes.put("consecutivo", getConsecutivo());
		attributes.put("nombre", getNombre());
		attributes.put("direccion", getDireccion());
		attributes.put("telefonos", getTelefonos());
		attributes.put("correo_electronico", getCorreo_electronico());
		attributes.put("acuerdo", getAcuerdo());
		attributes.put("estado", getEstado());
		attributes.put("fax", getFax());
		attributes.put("horario_atencion", getHorario_atencion());
		attributes.put("fecha_act", getFecha_act());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		Integer idDepartamento = (Integer)attributes.get("idDepartamento");

		if (idDepartamento != null) {
			setIdDepartamento(idDepartamento);
		}

		Integer idMunicipio = (Integer)attributes.get("idMunicipio");

		if (idMunicipio != null) {
			setIdMunicipio(idMunicipio);
		}

		Integer idEntidad = (Integer)attributes.get("idEntidad");

		if (idEntidad != null) {
			setIdEntidad(idEntidad);
		}

		Integer idEspecialidad = (Integer)attributes.get("idEspecialidad");

		if (idEspecialidad != null) {
			setIdEspecialidad(idEspecialidad);
		}

		String consecutivo = (String)attributes.get("consecutivo");

		if (consecutivo != null) {
			setConsecutivo(consecutivo);
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

		String acuerdo = (String)attributes.get("acuerdo");

		if (acuerdo != null) {
			setAcuerdo(acuerdo);
		}

		Long estado = (Long)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String horario_atencion = (String)attributes.get("horario_atencion");

		if (horario_atencion != null) {
			setHorario_atencion(horario_atencion);
		}

		Date fecha_act = (Date)attributes.get("fecha_act");

		if (fecha_act != null) {
			setFecha_act(fecha_act);
		}
	}

	public String getCodigo() {
		return _codigo;
	}

	public void setCodigo(String codigo) {
		_codigo = codigo;
	}

	public int getIdDepartamento() {
		return _idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		_idDepartamento = idDepartamento;
	}

	public int getIdMunicipio() {
		return _idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		_idMunicipio = idMunicipio;
	}

	public int getIdEntidad() {
		return _idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		_idEntidad = idEntidad;
	}

	public int getIdEspecialidad() {
		return _idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		_idEspecialidad = idEspecialidad;
	}

	public String getConsecutivo() {
		return _consecutivo;
	}

	public void setConsecutivo(String consecutivo) {
		_consecutivo = consecutivo;
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

	public String getAcuerdo() {
		return _acuerdo;
	}

	public void setAcuerdo(String acuerdo) {
		_acuerdo = acuerdo;
	}

	public long getEstado() {
		return _estado;
	}

	public void setEstado(long estado) {
		_estado = estado;
	}

	public String getFax() {
		return _fax;
	}

	public void setFax(String fax) {
		_fax = fax;
	}

	public String getHorario_atencion() {
		return _horario_atencion;
	}

	public void setHorario_atencion(String horario_atencion) {
		_horario_atencion = horario_atencion;
	}

	public Date getFecha_act() {
		return _fecha_act;
	}

	public void setFecha_act(Date fecha_act) {
		_fecha_act = fecha_act;
	}

	public BaseModel<?> getDespachoRemoteModel() {
		return _despachoRemoteModel;
	}

	public void setDespachoRemoteModel(BaseModel<?> despachoRemoteModel) {
		_despachoRemoteModel = despachoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DespachoLocalServiceUtil.addDespacho(this);
		}
		else {
			DespachoLocalServiceUtil.updateDespacho(this);
		}
	}

	@Override
	public Despacho toEscapedModel() {
		return (Despacho)Proxy.newProxyInstance(Despacho.class.getClassLoader(),
			new Class[] { Despacho.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DespachoClp clone = new DespachoClp();

		clone.setCodigo(getCodigo());
		clone.setIdDepartamento(getIdDepartamento());
		clone.setIdMunicipio(getIdMunicipio());
		clone.setIdEntidad(getIdEntidad());
		clone.setIdEspecialidad(getIdEspecialidad());
		clone.setConsecutivo(getConsecutivo());
		clone.setNombre(getNombre());
		clone.setDireccion(getDireccion());
		clone.setTelefonos(getTelefonos());
		clone.setCorreo_electronico(getCorreo_electronico());
		clone.setAcuerdo(getAcuerdo());
		clone.setEstado(getEstado());
		clone.setFax(getFax());
		clone.setHorario_atencion(getHorario_atencion());
		clone.setFecha_act(getFecha_act());

		return clone;
	}

	public int compareTo(Despacho despacho) {
		String primaryKey = despacho.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DespachoClp despacho = null;

		try {
			despacho = (DespachoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = despacho.getPrimaryKey();

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
		StringBundler sb = new StringBundler(31);

		sb.append("{codigo=");
		sb.append(getCodigo());
		sb.append(", idDepartamento=");
		sb.append(getIdDepartamento());
		sb.append(", idMunicipio=");
		sb.append(getIdMunicipio());
		sb.append(", idEntidad=");
		sb.append(getIdEntidad());
		sb.append(", idEspecialidad=");
		sb.append(getIdEspecialidad());
		sb.append(", consecutivo=");
		sb.append(getConsecutivo());
		sb.append(", nombre=");
		sb.append(getNombre());
		sb.append(", direccion=");
		sb.append(getDireccion());
		sb.append(", telefonos=");
		sb.append(getTelefonos());
		sb.append(", correo_electronico=");
		sb.append(getCorreo_electronico());
		sb.append(", acuerdo=");
		sb.append(getAcuerdo());
		sb.append(", estado=");
		sb.append(getEstado());
		sb.append(", fax=");
		sb.append(getFax());
		sb.append(", horario_atencion=");
		sb.append(getHorario_atencion());
		sb.append(", fecha_act=");
		sb.append(getFecha_act());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Despacho");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>codigo</column-name><column-value><![CDATA[");
		sb.append(getCodigo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idDepartamento</column-name><column-value><![CDATA[");
		sb.append(getIdDepartamento());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idMunicipio</column-name><column-value><![CDATA[");
		sb.append(getIdMunicipio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idEntidad</column-name><column-value><![CDATA[");
		sb.append(getIdEntidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idEspecialidad</column-name><column-value><![CDATA[");
		sb.append(getIdEspecialidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>consecutivo</column-name><column-value><![CDATA[");
		sb.append(getConsecutivo());
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
		sb.append(
			"<column><column-name>acuerdo</column-name><column-value><![CDATA[");
		sb.append(getAcuerdo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>estado</column-name><column-value><![CDATA[");
		sb.append(getEstado());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fax</column-name><column-value><![CDATA[");
		sb.append(getFax());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>horario_atencion</column-name><column-value><![CDATA[");
		sb.append(getHorario_atencion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha_act</column-name><column-value><![CDATA[");
		sb.append(getFecha_act());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _codigo;
	private int _idDepartamento;
	private int _idMunicipio;
	private int _idEntidad;
	private int _idEspecialidad;
	private String _consecutivo;
	private String _nombre;
	private String _direccion;
	private String _telefonos;
	private String _correo_electronico;
	private String _acuerdo;
	private long _estado;
	private String _fax;
	private String _horario_atencion;
	private Date _fecha_act;
	private BaseModel<?> _despachoRemoteModel;
}