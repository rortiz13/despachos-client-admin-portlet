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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Especialidad}.
 * </p>
 *
 * @author    mariza
 * @see       Especialidad
 * @generated
 */
public class EspecialidadWrapper implements Especialidad,
	ModelWrapper<Especialidad> {
	public EspecialidadWrapper(Especialidad especialidad) {
		_especialidad = especialidad;
	}

	public Class<?> getModelClass() {
		return Especialidad.class;
	}

	public String getModelClassName() {
		return Especialidad.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer codigo = (Integer)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}
	}

	/**
	* Returns the primary key of this especialidad.
	*
	* @return the primary key of this especialidad
	*/
	public int getPrimaryKey() {
		return _especialidad.getPrimaryKey();
	}

	/**
	* Sets the primary key of this especialidad.
	*
	* @param primaryKey the primary key of this especialidad
	*/
	public void setPrimaryKey(int primaryKey) {
		_especialidad.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this especialidad.
	*
	* @return the codigo of this especialidad
	*/
	public int getCodigo() {
		return _especialidad.getCodigo();
	}

	/**
	* Sets the codigo of this especialidad.
	*
	* @param codigo the codigo of this especialidad
	*/
	public void setCodigo(int codigo) {
		_especialidad.setCodigo(codigo);
	}

	/**
	* Returns the nombre of this especialidad.
	*
	* @return the nombre of this especialidad
	*/
	public java.lang.String getNombre() {
		return _especialidad.getNombre();
	}

	/**
	* Sets the nombre of this especialidad.
	*
	* @param nombre the nombre of this especialidad
	*/
	public void setNombre(java.lang.String nombre) {
		_especialidad.setNombre(nombre);
	}

	public boolean isNew() {
		return _especialidad.isNew();
	}

	public void setNew(boolean n) {
		_especialidad.setNew(n);
	}

	public boolean isCachedModel() {
		return _especialidad.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_especialidad.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _especialidad.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _especialidad.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_especialidad.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _especialidad.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_especialidad.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EspecialidadWrapper((Especialidad)_especialidad.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.Especialidad especialidad) {
		return _especialidad.compareTo(especialidad);
	}

	@Override
	public int hashCode() {
		return _especialidad.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.Especialidad> toCacheModel() {
		return _especialidad.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.Especialidad toEscapedModel() {
		return new EspecialidadWrapper(_especialidad.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _especialidad.toString();
	}

	public java.lang.String toXmlString() {
		return _especialidad.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_especialidad.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Especialidad getWrappedEspecialidad() {
		return _especialidad;
	}

	public Especialidad getWrappedModel() {
		return _especialidad;
	}

	public void resetOriginalValues() {
		_especialidad.resetOriginalValues();
	}

	private Especialidad _especialidad;
}