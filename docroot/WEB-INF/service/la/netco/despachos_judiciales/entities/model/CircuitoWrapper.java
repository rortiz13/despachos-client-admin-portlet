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
 * This class is a wrapper for {@link Circuito}.
 * </p>
 *
 * @author    mariza
 * @see       Circuito
 * @generated
 */
public class CircuitoWrapper implements Circuito, ModelWrapper<Circuito> {
	public CircuitoWrapper(Circuito circuito) {
		_circuito = circuito;
	}

	public Class<?> getModelClass() {
		return Circuito.class;
	}

	public String getModelClassName() {
		return Circuito.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("idDistrito", getIdDistrito());
		attributes.put("jurisdiccion", getJurisdiccion());
		attributes.put("codigo_dane", getCodigo_dane());

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

		Integer idDistrito = (Integer)attributes.get("idDistrito");

		if (idDistrito != null) {
			setIdDistrito(idDistrito);
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

	/**
	* Returns the primary key of this circuito.
	*
	* @return the primary key of this circuito
	*/
	public int getPrimaryKey() {
		return _circuito.getPrimaryKey();
	}

	/**
	* Sets the primary key of this circuito.
	*
	* @param primaryKey the primary key of this circuito
	*/
	public void setPrimaryKey(int primaryKey) {
		_circuito.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this circuito.
	*
	* @return the codigo of this circuito
	*/
	public int getCodigo() {
		return _circuito.getCodigo();
	}

	/**
	* Sets the codigo of this circuito.
	*
	* @param codigo the codigo of this circuito
	*/
	public void setCodigo(int codigo) {
		_circuito.setCodigo(codigo);
	}

	/**
	* Returns the nombre of this circuito.
	*
	* @return the nombre of this circuito
	*/
	public java.lang.String getNombre() {
		return _circuito.getNombre();
	}

	/**
	* Sets the nombre of this circuito.
	*
	* @param nombre the nombre of this circuito
	*/
	public void setNombre(java.lang.String nombre) {
		_circuito.setNombre(nombre);
	}

	/**
	* Returns the id distrito of this circuito.
	*
	* @return the id distrito of this circuito
	*/
	public int getIdDistrito() {
		return _circuito.getIdDistrito();
	}

	/**
	* Sets the id distrito of this circuito.
	*
	* @param idDistrito the id distrito of this circuito
	*/
	public void setIdDistrito(int idDistrito) {
		_circuito.setIdDistrito(idDistrito);
	}

	/**
	* Returns the jurisdiccion of this circuito.
	*
	* @return the jurisdiccion of this circuito
	*/
	public java.lang.String getJurisdiccion() {
		return _circuito.getJurisdiccion();
	}

	/**
	* Sets the jurisdiccion of this circuito.
	*
	* @param jurisdiccion the jurisdiccion of this circuito
	*/
	public void setJurisdiccion(java.lang.String jurisdiccion) {
		_circuito.setJurisdiccion(jurisdiccion);
	}

	/**
	* Returns the codigo_dane of this circuito.
	*
	* @return the codigo_dane of this circuito
	*/
	public java.lang.String getCodigo_dane() {
		return _circuito.getCodigo_dane();
	}

	/**
	* Sets the codigo_dane of this circuito.
	*
	* @param codigo_dane the codigo_dane of this circuito
	*/
	public void setCodigo_dane(java.lang.String codigo_dane) {
		_circuito.setCodigo_dane(codigo_dane);
	}

	public boolean isNew() {
		return _circuito.isNew();
	}

	public void setNew(boolean n) {
		_circuito.setNew(n);
	}

	public boolean isCachedModel() {
		return _circuito.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_circuito.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _circuito.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _circuito.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_circuito.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _circuito.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_circuito.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CircuitoWrapper((Circuito)_circuito.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.Circuito circuito) {
		return _circuito.compareTo(circuito);
	}

	@Override
	public int hashCode() {
		return _circuito.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.Circuito> toCacheModel() {
		return _circuito.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.Circuito toEscapedModel() {
		return new CircuitoWrapper(_circuito.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _circuito.toString();
	}

	public java.lang.String toXmlString() {
		return _circuito.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_circuito.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Circuito getWrappedCircuito() {
		return _circuito;
	}

	public Circuito getWrappedModel() {
		return _circuito;
	}

	public void resetOriginalValues() {
		_circuito.resetOriginalValues();
	}

	private Circuito _circuito;
}