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

import la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class TrabajadorClp extends BaseModelImpl<Trabajador>
	implements Trabajador {
	public TrabajadorClp() {
	}

	public Class<?> getModelClass() {
		return Trabajador.class;
	}

	public String getModelClassName() {
		return Trabajador.class.getName();
	}

	public String getPrimaryKey() {
		return _cedula;
	}

	public void setPrimaryKey(String primaryKey) {
		setCedula(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return _cedula;
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cedula", getCedula());
		attributes.put("nombres", getNombres());
		attributes.put("apellidos", getApellidos());
		attributes.put("especialidad", getEspecialidad());
		attributes.put("correo_electronico", getCorreo_electronico());
		attributes.put("telefonos_oficina", getTelefonos_oficina());
		attributes.put("carrera", getCarrera());
		attributes.put("tipo_trabajador", getTipo_trabajador());
		attributes.put("tipo_contrato", getTipo_contrato());
		attributes.put("sexo", getSexo());
		attributes.put("fecha_nacimiento", getFecha_nacimiento());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String cedula = (String)attributes.get("cedula");

		if (cedula != null) {
			setCedula(cedula);
		}

		String nombres = (String)attributes.get("nombres");

		if (nombres != null) {
			setNombres(nombres);
		}

		String apellidos = (String)attributes.get("apellidos");

		if (apellidos != null) {
			setApellidos(apellidos);
		}

		String especialidad = (String)attributes.get("especialidad");

		if (especialidad != null) {
			setEspecialidad(especialidad);
		}

		String correo_electronico = (String)attributes.get("correo_electronico");

		if (correo_electronico != null) {
			setCorreo_electronico(correo_electronico);
		}

		String telefonos_oficina = (String)attributes.get("telefonos_oficina");

		if (telefonos_oficina != null) {
			setTelefonos_oficina(telefonos_oficina);
		}

		Long carrera = (Long)attributes.get("carrera");

		if (carrera != null) {
			setCarrera(carrera);
		}

		Long tipo_trabajador = (Long)attributes.get("tipo_trabajador");

		if (tipo_trabajador != null) {
			setTipo_trabajador(tipo_trabajador);
		}

		Long tipo_contrato = (Long)attributes.get("tipo_contrato");

		if (tipo_contrato != null) {
			setTipo_contrato(tipo_contrato);
		}

		String sexo = (String)attributes.get("sexo");

		if (sexo != null) {
			setSexo(sexo);
		}

		Date fecha_nacimiento = (Date)attributes.get("fecha_nacimiento");

		if (fecha_nacimiento != null) {
			setFecha_nacimiento(fecha_nacimiento);
		}
	}

	public String getCedula() {
		return _cedula;
	}

	public void setCedula(String cedula) {
		_cedula = cedula;
	}

	public String getNombres() {
		return _nombres;
	}

	public void setNombres(String nombres) {
		_nombres = nombres;
	}

	public String getApellidos() {
		return _apellidos;
	}

	public void setApellidos(String apellidos) {
		_apellidos = apellidos;
	}

	public String getEspecialidad() {
		return _especialidad;
	}

	public void setEspecialidad(String especialidad) {
		_especialidad = especialidad;
	}

	public String getCorreo_electronico() {
		return _correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		_correo_electronico = correo_electronico;
	}

	public String getTelefonos_oficina() {
		return _telefonos_oficina;
	}

	public void setTelefonos_oficina(String telefonos_oficina) {
		_telefonos_oficina = telefonos_oficina;
	}

	public long getCarrera() {
		return _carrera;
	}

	public void setCarrera(long carrera) {
		_carrera = carrera;
	}

	public long getTipo_trabajador() {
		return _tipo_trabajador;
	}

	public void setTipo_trabajador(long tipo_trabajador) {
		_tipo_trabajador = tipo_trabajador;
	}

	public long getTipo_contrato() {
		return _tipo_contrato;
	}

	public void setTipo_contrato(long tipo_contrato) {
		_tipo_contrato = tipo_contrato;
	}

	public String getSexo() {
		return _sexo;
	}

	public void setSexo(String sexo) {
		_sexo = sexo;
	}

	public Date getFecha_nacimiento() {
		return _fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		_fecha_nacimiento = fecha_nacimiento;
	}

	public BaseModel<?> getTrabajadorRemoteModel() {
		return _trabajadorRemoteModel;
	}

	public void setTrabajadorRemoteModel(BaseModel<?> trabajadorRemoteModel) {
		_trabajadorRemoteModel = trabajadorRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TrabajadorLocalServiceUtil.addTrabajador(this);
		}
		else {
			TrabajadorLocalServiceUtil.updateTrabajador(this);
		}
	}

	@Override
	public Trabajador toEscapedModel() {
		return (Trabajador)Proxy.newProxyInstance(Trabajador.class.getClassLoader(),
			new Class[] { Trabajador.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TrabajadorClp clone = new TrabajadorClp();

		clone.setCedula(getCedula());
		clone.setNombres(getNombres());
		clone.setApellidos(getApellidos());
		clone.setEspecialidad(getEspecialidad());
		clone.setCorreo_electronico(getCorreo_electronico());
		clone.setTelefonos_oficina(getTelefonos_oficina());
		clone.setCarrera(getCarrera());
		clone.setTipo_trabajador(getTipo_trabajador());
		clone.setTipo_contrato(getTipo_contrato());
		clone.setSexo(getSexo());
		clone.setFecha_nacimiento(getFecha_nacimiento());

		return clone;
	}

	public int compareTo(Trabajador trabajador) {
		String primaryKey = trabajador.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TrabajadorClp trabajador = null;

		try {
			trabajador = (TrabajadorClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		String primaryKey = trabajador.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{cedula=");
		sb.append(getCedula());
		sb.append(", nombres=");
		sb.append(getNombres());
		sb.append(", apellidos=");
		sb.append(getApellidos());
		sb.append(", especialidad=");
		sb.append(getEspecialidad());
		sb.append(", correo_electronico=");
		sb.append(getCorreo_electronico());
		sb.append(", telefonos_oficina=");
		sb.append(getTelefonos_oficina());
		sb.append(", carrera=");
		sb.append(getCarrera());
		sb.append(", tipo_trabajador=");
		sb.append(getTipo_trabajador());
		sb.append(", tipo_contrato=");
		sb.append(getTipo_contrato());
		sb.append(", sexo=");
		sb.append(getSexo());
		sb.append(", fecha_nacimiento=");
		sb.append(getFecha_nacimiento());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("la.netco.despachos_judiciales.entities.model.Trabajador");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cedula</column-name><column-value><![CDATA[");
		sb.append(getCedula());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nombres</column-name><column-value><![CDATA[");
		sb.append(getNombres());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>apellidos</column-name><column-value><![CDATA[");
		sb.append(getApellidos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>especialidad</column-name><column-value><![CDATA[");
		sb.append(getEspecialidad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>correo_electronico</column-name><column-value><![CDATA[");
		sb.append(getCorreo_electronico());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefonos_oficina</column-name><column-value><![CDATA[");
		sb.append(getTelefonos_oficina());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carrera</column-name><column-value><![CDATA[");
		sb.append(getCarrera());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipo_trabajador</column-name><column-value><![CDATA[");
		sb.append(getTipo_trabajador());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tipo_contrato</column-name><column-value><![CDATA[");
		sb.append(getTipo_contrato());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sexo</column-name><column-value><![CDATA[");
		sb.append(getSexo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fecha_nacimiento</column-name><column-value><![CDATA[");
		sb.append(getFecha_nacimiento());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _cedula;
	private String _nombres;
	private String _apellidos;
	private String _especialidad;
	private String _correo_electronico;
	private String _telefonos_oficina;
	private long _carrera;
	private long _tipo_trabajador;
	private long _tipo_contrato;
	private String _sexo;
	private Date _fecha_nacimiento;
	private BaseModel<?> _trabajadorRemoteModel;
}