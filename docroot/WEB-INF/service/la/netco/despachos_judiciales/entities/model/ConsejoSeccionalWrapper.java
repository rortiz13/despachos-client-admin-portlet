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
 * This class is a wrapper for {@link ConsejoSeccional}.
 * </p>
 *
 * @author    mariza
 * @see       ConsejoSeccional
 * @generated
 */
public class ConsejoSeccionalWrapper implements ConsejoSeccional,
	ModelWrapper<ConsejoSeccional> {
	public ConsejoSeccionalWrapper(ConsejoSeccional consejoSeccional) {
		_consejoSeccional = consejoSeccional;
	}

	public Class<?> getModelClass() {
		return ConsejoSeccional.class;
	}

	public String getModelClassName() {
		return ConsejoSeccional.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("direccion", getDireccion());
		attributes.put("telefonos", getTelefonos());
		attributes.put("correo_electronico", getCorreo_electronico());

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

	/**
	* Returns the primary key of this consejo seccional.
	*
	* @return the primary key of this consejo seccional
	*/
	public int getPrimaryKey() {
		return _consejoSeccional.getPrimaryKey();
	}

	/**
	* Sets the primary key of this consejo seccional.
	*
	* @param primaryKey the primary key of this consejo seccional
	*/
	public void setPrimaryKey(int primaryKey) {
		_consejoSeccional.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this consejo seccional.
	*
	* @return the codigo of this consejo seccional
	*/
	public int getCodigo() {
		return _consejoSeccional.getCodigo();
	}

	/**
	* Sets the codigo of this consejo seccional.
	*
	* @param codigo the codigo of this consejo seccional
	*/
	public void setCodigo(int codigo) {
		_consejoSeccional.setCodigo(codigo);
	}

	/**
	* Returns the nombre of this consejo seccional.
	*
	* @return the nombre of this consejo seccional
	*/
	public java.lang.String getNombre() {
		return _consejoSeccional.getNombre();
	}

	/**
	* Sets the nombre of this consejo seccional.
	*
	* @param nombre the nombre of this consejo seccional
	*/
	public void setNombre(java.lang.String nombre) {
		_consejoSeccional.setNombre(nombre);
	}

	/**
	* Returns the direccion of this consejo seccional.
	*
	* @return the direccion of this consejo seccional
	*/
	public java.lang.String getDireccion() {
		return _consejoSeccional.getDireccion();
	}

	/**
	* Sets the direccion of this consejo seccional.
	*
	* @param direccion the direccion of this consejo seccional
	*/
	public void setDireccion(java.lang.String direccion) {
		_consejoSeccional.setDireccion(direccion);
	}

	/**
	* Returns the telefonos of this consejo seccional.
	*
	* @return the telefonos of this consejo seccional
	*/
	public java.lang.String getTelefonos() {
		return _consejoSeccional.getTelefonos();
	}

	/**
	* Sets the telefonos of this consejo seccional.
	*
	* @param telefonos the telefonos of this consejo seccional
	*/
	public void setTelefonos(java.lang.String telefonos) {
		_consejoSeccional.setTelefonos(telefonos);
	}

	/**
	* Returns the correo_electronico of this consejo seccional.
	*
	* @return the correo_electronico of this consejo seccional
	*/
	public java.lang.String getCorreo_electronico() {
		return _consejoSeccional.getCorreo_electronico();
	}

	/**
	* Sets the correo_electronico of this consejo seccional.
	*
	* @param correo_electronico the correo_electronico of this consejo seccional
	*/
	public void setCorreo_electronico(java.lang.String correo_electronico) {
		_consejoSeccional.setCorreo_electronico(correo_electronico);
	}

	public boolean isNew() {
		return _consejoSeccional.isNew();
	}

	public void setNew(boolean n) {
		_consejoSeccional.setNew(n);
	}

	public boolean isCachedModel() {
		return _consejoSeccional.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_consejoSeccional.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _consejoSeccional.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _consejoSeccional.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_consejoSeccional.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _consejoSeccional.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_consejoSeccional.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ConsejoSeccionalWrapper((ConsejoSeccional)_consejoSeccional.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.ConsejoSeccional consejoSeccional) {
		return _consejoSeccional.compareTo(consejoSeccional);
	}

	@Override
	public int hashCode() {
		return _consejoSeccional.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.ConsejoSeccional> toCacheModel() {
		return _consejoSeccional.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.ConsejoSeccional toEscapedModel() {
		return new ConsejoSeccionalWrapper(_consejoSeccional.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _consejoSeccional.toString();
	}

	public java.lang.String toXmlString() {
		return _consejoSeccional.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_consejoSeccional.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public ConsejoSeccional getWrappedConsejoSeccional() {
		return _consejoSeccional;
	}

	public ConsejoSeccional getWrappedModel() {
		return _consejoSeccional;
	}

	public void resetOriginalValues() {
		_consejoSeccional.resetOriginalValues();
	}

	private ConsejoSeccional _consejoSeccional;
}