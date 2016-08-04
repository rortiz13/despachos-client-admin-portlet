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
 * This class is a wrapper for {@link Despacho}.
 * </p>
 *
 * @author    mariza
 * @see       Despacho
 * @generated
 */
public class DespachoWrapper implements Despacho, ModelWrapper<Despacho> {
	public DespachoWrapper(Despacho despacho) {
		_despacho = despacho;
	}

	public Class<?> getModelClass() {
		return Despacho.class;
	}

	public String getModelClassName() {
		return Despacho.class.getName();
	}

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

	/**
	* Returns the primary key of this despacho.
	*
	* @return the primary key of this despacho
	*/
	public java.lang.String getPrimaryKey() {
		return _despacho.getPrimaryKey();
	}

	/**
	* Sets the primary key of this despacho.
	*
	* @param primaryKey the primary key of this despacho
	*/
	public void setPrimaryKey(java.lang.String primaryKey) {
		_despacho.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this despacho.
	*
	* @return the codigo of this despacho
	*/
	public java.lang.String getCodigo() {
		return _despacho.getCodigo();
	}

	/**
	* Sets the codigo of this despacho.
	*
	* @param codigo the codigo of this despacho
	*/
	public void setCodigo(java.lang.String codigo) {
		_despacho.setCodigo(codigo);
	}

	/**
	* Returns the id departamento of this despacho.
	*
	* @return the id departamento of this despacho
	*/
	public int getIdDepartamento() {
		return _despacho.getIdDepartamento();
	}

	/**
	* Sets the id departamento of this despacho.
	*
	* @param idDepartamento the id departamento of this despacho
	*/
	public void setIdDepartamento(int idDepartamento) {
		_despacho.setIdDepartamento(idDepartamento);
	}

	/**
	* Returns the id municipio of this despacho.
	*
	* @return the id municipio of this despacho
	*/
	public int getIdMunicipio() {
		return _despacho.getIdMunicipio();
	}

	/**
	* Sets the id municipio of this despacho.
	*
	* @param idMunicipio the id municipio of this despacho
	*/
	public void setIdMunicipio(int idMunicipio) {
		_despacho.setIdMunicipio(idMunicipio);
	}

	/**
	* Returns the id entidad of this despacho.
	*
	* @return the id entidad of this despacho
	*/
	public int getIdEntidad() {
		return _despacho.getIdEntidad();
	}

	/**
	* Sets the id entidad of this despacho.
	*
	* @param idEntidad the id entidad of this despacho
	*/
	public void setIdEntidad(int idEntidad) {
		_despacho.setIdEntidad(idEntidad);
	}

	/**
	* Returns the id especialidad of this despacho.
	*
	* @return the id especialidad of this despacho
	*/
	public int getIdEspecialidad() {
		return _despacho.getIdEspecialidad();
	}

	/**
	* Sets the id especialidad of this despacho.
	*
	* @param idEspecialidad the id especialidad of this despacho
	*/
	public void setIdEspecialidad(int idEspecialidad) {
		_despacho.setIdEspecialidad(idEspecialidad);
	}

	/**
	* Returns the consecutivo of this despacho.
	*
	* @return the consecutivo of this despacho
	*/
	public java.lang.String getConsecutivo() {
		return _despacho.getConsecutivo();
	}

	/**
	* Sets the consecutivo of this despacho.
	*
	* @param consecutivo the consecutivo of this despacho
	*/
	public void setConsecutivo(java.lang.String consecutivo) {
		_despacho.setConsecutivo(consecutivo);
	}

	/**
	* Returns the nombre of this despacho.
	*
	* @return the nombre of this despacho
	*/
	public java.lang.String getNombre() {
		return _despacho.getNombre();
	}

	/**
	* Sets the nombre of this despacho.
	*
	* @param nombre the nombre of this despacho
	*/
	public void setNombre(java.lang.String nombre) {
		_despacho.setNombre(nombre);
	}

	/**
	* Returns the direccion of this despacho.
	*
	* @return the direccion of this despacho
	*/
	public java.lang.String getDireccion() {
		return _despacho.getDireccion();
	}

	/**
	* Sets the direccion of this despacho.
	*
	* @param direccion the direccion of this despacho
	*/
	public void setDireccion(java.lang.String direccion) {
		_despacho.setDireccion(direccion);
	}

	/**
	* Returns the telefonos of this despacho.
	*
	* @return the telefonos of this despacho
	*/
	public java.lang.String getTelefonos() {
		return _despacho.getTelefonos();
	}

	/**
	* Sets the telefonos of this despacho.
	*
	* @param telefonos the telefonos of this despacho
	*/
	public void setTelefonos(java.lang.String telefonos) {
		_despacho.setTelefonos(telefonos);
	}

	/**
	* Returns the correo_electronico of this despacho.
	*
	* @return the correo_electronico of this despacho
	*/
	public java.lang.String getCorreo_electronico() {
		return _despacho.getCorreo_electronico();
	}

	/**
	* Sets the correo_electronico of this despacho.
	*
	* @param correo_electronico the correo_electronico of this despacho
	*/
	public void setCorreo_electronico(java.lang.String correo_electronico) {
		_despacho.setCorreo_electronico(correo_electronico);
	}

	/**
	* Returns the acuerdo of this despacho.
	*
	* @return the acuerdo of this despacho
	*/
	public java.lang.String getAcuerdo() {
		return _despacho.getAcuerdo();
	}

	/**
	* Sets the acuerdo of this despacho.
	*
	* @param acuerdo the acuerdo of this despacho
	*/
	public void setAcuerdo(java.lang.String acuerdo) {
		_despacho.setAcuerdo(acuerdo);
	}

	/**
	* Returns the estado of this despacho.
	*
	* @return the estado of this despacho
	*/
	public long getEstado() {
		return _despacho.getEstado();
	}

	/**
	* Sets the estado of this despacho.
	*
	* @param estado the estado of this despacho
	*/
	public void setEstado(long estado) {
		_despacho.setEstado(estado);
	}

	/**
	* Returns the fax of this despacho.
	*
	* @return the fax of this despacho
	*/
	public java.lang.String getFax() {
		return _despacho.getFax();
	}

	/**
	* Sets the fax of this despacho.
	*
	* @param fax the fax of this despacho
	*/
	public void setFax(java.lang.String fax) {
		_despacho.setFax(fax);
	}

	/**
	* Returns the horario_atencion of this despacho.
	*
	* @return the horario_atencion of this despacho
	*/
	public java.lang.String getHorario_atencion() {
		return _despacho.getHorario_atencion();
	}

	/**
	* Sets the horario_atencion of this despacho.
	*
	* @param horario_atencion the horario_atencion of this despacho
	*/
	public void setHorario_atencion(java.lang.String horario_atencion) {
		_despacho.setHorario_atencion(horario_atencion);
	}

	/**
	* Returns the fecha_act of this despacho.
	*
	* @return the fecha_act of this despacho
	*/
	public java.util.Date getFecha_act() {
		return _despacho.getFecha_act();
	}

	/**
	* Sets the fecha_act of this despacho.
	*
	* @param fecha_act the fecha_act of this despacho
	*/
	public void setFecha_act(java.util.Date fecha_act) {
		_despacho.setFecha_act(fecha_act);
	}

	public boolean isNew() {
		return _despacho.isNew();
	}

	public void setNew(boolean n) {
		_despacho.setNew(n);
	}

	public boolean isCachedModel() {
		return _despacho.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_despacho.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _despacho.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _despacho.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_despacho.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _despacho.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_despacho.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DespachoWrapper((Despacho)_despacho.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.Despacho despacho) {
		return _despacho.compareTo(despacho);
	}

	@Override
	public int hashCode() {
		return _despacho.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.Despacho> toCacheModel() {
		return _despacho.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.Despacho toEscapedModel() {
		return new DespachoWrapper(_despacho.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _despacho.toString();
	}

	public java.lang.String toXmlString() {
		return _despacho.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_despacho.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Despacho getWrappedDespacho() {
		return _despacho;
	}

	public Despacho getWrappedModel() {
		return _despacho;
	}

	public void resetOriginalValues() {
		_despacho.resetOriginalValues();
	}

	private Despacho _despacho;
}