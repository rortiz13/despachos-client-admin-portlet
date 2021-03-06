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
 * This class is a wrapper for {@link Departamento}.
 * </p>
 *
 * @author    mariza
 * @see       Departamento
 * @generated
 */
public class DepartamentoWrapper implements Departamento,
	ModelWrapper<Departamento> {
	public DepartamentoWrapper(Departamento departamento) {
		_departamento = departamento;
	}

	public Class<?> getModelClass() {
		return Departamento.class;
	}

	public String getModelClassName() {
		return Departamento.class.getName();
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
	* Returns the primary key of this departamento.
	*
	* @return the primary key of this departamento
	*/
	public int getPrimaryKey() {
		return _departamento.getPrimaryKey();
	}

	/**
	* Sets the primary key of this departamento.
	*
	* @param primaryKey the primary key of this departamento
	*/
	public void setPrimaryKey(int primaryKey) {
		_departamento.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this departamento.
	*
	* @return the codigo of this departamento
	*/
	public int getCodigo() {
		return _departamento.getCodigo();
	}

	/**
	* Sets the codigo of this departamento.
	*
	* @param codigo the codigo of this departamento
	*/
	public void setCodigo(int codigo) {
		_departamento.setCodigo(codigo);
	}

	/**
	* Returns the nombre of this departamento.
	*
	* @return the nombre of this departamento
	*/
	public java.lang.String getNombre() {
		return _departamento.getNombre();
	}

	/**
	* Sets the nombre of this departamento.
	*
	* @param nombre the nombre of this departamento
	*/
	public void setNombre(java.lang.String nombre) {
		_departamento.setNombre(nombre);
	}

	public boolean isNew() {
		return _departamento.isNew();
	}

	public void setNew(boolean n) {
		_departamento.setNew(n);
	}

	public boolean isCachedModel() {
		return _departamento.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_departamento.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _departamento.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _departamento.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_departamento.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _departamento.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_departamento.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DepartamentoWrapper((Departamento)_departamento.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.Departamento departamento) {
		return _departamento.compareTo(departamento);
	}

	@Override
	public int hashCode() {
		return _departamento.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.Departamento> toCacheModel() {
		return _departamento.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.Departamento toEscapedModel() {
		return new DepartamentoWrapper(_departamento.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _departamento.toString();
	}

	public java.lang.String toXmlString() {
		return _departamento.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_departamento.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Departamento getWrappedDepartamento() {
		return _departamento;
	}

	public Departamento getWrappedModel() {
		return _departamento;
	}

	public void resetOriginalValues() {
		_departamento.resetOriginalValues();
	}

	private Departamento _departamento;
}