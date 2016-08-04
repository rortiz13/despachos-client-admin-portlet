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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Trabajador}.
 * </p>
 *
 * @author    mariza
 * @see       Trabajador
 * @generated
 */
public class TrabajadorWrapper implements Trabajador, ModelWrapper<Trabajador> {
	public TrabajadorWrapper(Trabajador trabajador) {
		_trabajador = trabajador;
	}

	public Class<?> getModelClass() {
		return Trabajador.class;
	}

	public String getModelClassName() {
		return Trabajador.class.getName();
	}

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

	/**
	* Returns the primary key of this trabajador.
	*
	* @return the primary key of this trabajador
	*/
	public java.lang.String getPrimaryKey() {
		return _trabajador.getPrimaryKey();
	}

	/**
	* Sets the primary key of this trabajador.
	*
	* @param primaryKey the primary key of this trabajador
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_trabajador.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cedula of this trabajador.
	*
	* @return the cedula of this trabajador
	*/
	public java.lang.String getCedula() {
		return _trabajador.getCedula();
	}

	/**
	* Sets the cedula of this trabajador.
	*
	* @param cedula the cedula of this trabajador
	*/
	public void setCedula(java.lang.String cedula) {
		_trabajador.setCedula(cedula);
	}

	/**
	* Returns the nombres of this trabajador.
	*
	* @return the nombres of this trabajador
	*/
	public java.lang.String getNombres() {
		return _trabajador.getNombres();
	}

	/**
	* Sets the nombres of this trabajador.
	*
	* @param nombres the nombres of this trabajador
	*/
	public void setNombres(java.lang.String nombres) {
		_trabajador.setNombres(nombres);
	}

	/**
	* Returns the apellidos of this trabajador.
	*
	* @return the apellidos of this trabajador
	*/
	public java.lang.String getApellidos() {
		return _trabajador.getApellidos();
	}

	/**
	* Sets the apellidos of this trabajador.
	*
	* @param apellidos the apellidos of this trabajador
	*/
	public void setApellidos(java.lang.String apellidos) {
		_trabajador.setApellidos(apellidos);
	}

	/**
	* Returns the especialidad of this trabajador.
	*
	* @return the especialidad of this trabajador
	*/
	public java.lang.String getEspecialidad() {
		return _trabajador.getEspecialidad();
	}

	/**
	* Sets the especialidad of this trabajador.
	*
	* @param especialidad the especialidad of this trabajador
	*/
	public void setEspecialidad(java.lang.String especialidad) {
		_trabajador.setEspecialidad(especialidad);
	}

	/**
	* Returns the correo_electronico of this trabajador.
	*
	* @return the correo_electronico of this trabajador
	*/
	public java.lang.String getCorreo_electronico() {
		return _trabajador.getCorreo_electronico();
	}

	/**
	* Sets the correo_electronico of this trabajador.
	*
	* @param correo_electronico the correo_electronico of this trabajador
	*/
	public void setCorreo_electronico(java.lang.String correo_electronico) {
		_trabajador.setCorreo_electronico(correo_electronico);
	}

	/**
	* Returns the telefonos_oficina of this trabajador.
	*
	* @return the telefonos_oficina of this trabajador
	*/
	public java.lang.String getTelefonos_oficina() {
		return _trabajador.getTelefonos_oficina();
	}

	/**
	* Sets the telefonos_oficina of this trabajador.
	*
	* @param telefonos_oficina the telefonos_oficina of this trabajador
	*/
	public void setTelefonos_oficina(java.lang.String telefonos_oficina) {
		_trabajador.setTelefonos_oficina(telefonos_oficina);
	}

	/**
	* Returns the carrera of this trabajador.
	*
	* @return the carrera of this trabajador
	*/
	public long getCarrera() {
		return _trabajador.getCarrera();
	}

	/**
	* Sets the carrera of this trabajador.
	*
	* @param carrera the carrera of this trabajador
	*/
	public void setCarrera(long carrera) {
		_trabajador.setCarrera(carrera);
	}

	/**
	* Returns the tipo_trabajador of this trabajador.
	*
	* @return the tipo_trabajador of this trabajador
	*/
	public long getTipo_trabajador() {
		return _trabajador.getTipo_trabajador();
	}

	/**
	* Sets the tipo_trabajador of this trabajador.
	*
	* @param tipo_trabajador the tipo_trabajador of this trabajador
	*/
	public void setTipo_trabajador(long tipo_trabajador) {
		_trabajador.setTipo_trabajador(tipo_trabajador);
	}

	/**
	* Returns the tipo_contrato of this trabajador.
	*
	* @return the tipo_contrato of this trabajador
	*/
	public long getTipo_contrato() {
		return _trabajador.getTipo_contrato();
	}

	/**
	* Sets the tipo_contrato of this trabajador.
	*
	* @param tipo_contrato the tipo_contrato of this trabajador
	*/
	public void setTipo_contrato(long tipo_contrato) {
		_trabajador.setTipo_contrato(tipo_contrato);
	}

	/**
	* Returns the sexo of this trabajador.
	*
	* @return the sexo of this trabajador
	*/
	public java.lang.String getSexo() {
		return _trabajador.getSexo();
	}

	/**
	* Sets the sexo of this trabajador.
	*
	* @param sexo the sexo of this trabajador
	*/
	public void setSexo(java.lang.String sexo) {
		_trabajador.setSexo(sexo);
	}

	/**
	* Returns the fecha_nacimiento of this trabajador.
	*
	* @return the fecha_nacimiento of this trabajador
	*/
	public java.util.Date getFecha_nacimiento() {
		return _trabajador.getFecha_nacimiento();
	}

	/**
	* Sets the fecha_nacimiento of this trabajador.
	*
	* @param fecha_nacimiento the fecha_nacimiento of this trabajador
	*/
	public void setFecha_nacimiento(java.util.Date fecha_nacimiento) {
		_trabajador.setFecha_nacimiento(fecha_nacimiento);
	}

	public boolean isNew() {
		return _trabajador.isNew();
	}

	public void setNew(boolean n) {
		_trabajador.setNew(n);
	}

	public boolean isCachedModel() {
		return _trabajador.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_trabajador.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _trabajador.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _trabajador.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_trabajador.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _trabajador.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_trabajador.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TrabajadorWrapper((Trabajador)_trabajador.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.Trabajador trabajador) {
		return _trabajador.compareTo(trabajador);
	}

	@Override
	public int hashCode() {
		return _trabajador.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.Trabajador> toCacheModel() {
		return _trabajador.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.Trabajador toEscapedModel() {
		return new TrabajadorWrapper(_trabajador.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _trabajador.toString();
	}

	public java.lang.String toXmlString() {
		return _trabajador.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_trabajador.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Trabajador getWrappedTrabajador() {
		return _trabajador;
	}

	public Trabajador getWrappedModel() {
		return _trabajador;
	}

	public void resetOriginalValues() {
		_trabajador.resetOriginalValues();
	}

	private Trabajador _trabajador;
}