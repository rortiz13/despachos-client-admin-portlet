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
 * This class is a wrapper for {@link Distrito}.
 * </p>
 *
 * @author    mariza
 * @see       Distrito
 * @generated
 */
public class DistritoWrapper implements Distrito, ModelWrapper<Distrito> {
	public DistritoWrapper(Distrito distrito) {
		_distrito = distrito;
	}

	public Class<?> getModelClass() {
		return Distrito.class;
	}

	public String getModelClassName() {
		return Distrito.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("codigo", getCodigo());
		attributes.put("nombre", getNombre());
		attributes.put("idConsejo_sec", getIdConsejo_sec());
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

		Integer idConsejo_sec = (Integer)attributes.get("idConsejo_sec");

		if (idConsejo_sec != null) {
			setIdConsejo_sec(idConsejo_sec);
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
	* Returns the primary key of this distrito.
	*
	* @return the primary key of this distrito
	*/
	public int getPrimaryKey() {
		return _distrito.getPrimaryKey();
	}

	/**
	* Sets the primary key of this distrito.
	*
	* @param primaryKey the primary key of this distrito
	*/
	public void setPrimaryKey(int primaryKey) {
		_distrito.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the codigo of this distrito.
	*
	* @return the codigo of this distrito
	*/
	public int getCodigo() {
		return _distrito.getCodigo();
	}

	/**
	* Sets the codigo of this distrito.
	*
	* @param codigo the codigo of this distrito
	*/
	public void setCodigo(int codigo) {
		_distrito.setCodigo(codigo);
	}

	/**
	* Returns the nombre of this distrito.
	*
	* @return the nombre of this distrito
	*/
	public java.lang.String getNombre() {
		return _distrito.getNombre();
	}

	/**
	* Sets the nombre of this distrito.
	*
	* @param nombre the nombre of this distrito
	*/
	public void setNombre(java.lang.String nombre) {
		_distrito.setNombre(nombre);
	}

	/**
	* Returns the id consejo_sec of this distrito.
	*
	* @return the id consejo_sec of this distrito
	*/
	public int getIdConsejo_sec() {
		return _distrito.getIdConsejo_sec();
	}

	/**
	* Sets the id consejo_sec of this distrito.
	*
	* @param idConsejo_sec the id consejo_sec of this distrito
	*/
	public void setIdConsejo_sec(int idConsejo_sec) {
		_distrito.setIdConsejo_sec(idConsejo_sec);
	}

	/**
	* Returns the jurisdiccion of this distrito.
	*
	* @return the jurisdiccion of this distrito
	*/
	public java.lang.String getJurisdiccion() {
		return _distrito.getJurisdiccion();
	}

	/**
	* Sets the jurisdiccion of this distrito.
	*
	* @param jurisdiccion the jurisdiccion of this distrito
	*/
	public void setJurisdiccion(java.lang.String jurisdiccion) {
		_distrito.setJurisdiccion(jurisdiccion);
	}

	/**
	* Returns the codigo_dane of this distrito.
	*
	* @return the codigo_dane of this distrito
	*/
	public java.lang.String getCodigo_dane() {
		return _distrito.getCodigo_dane();
	}

	/**
	* Sets the codigo_dane of this distrito.
	*
	* @param codigo_dane the codigo_dane of this distrito
	*/
	public void setCodigo_dane(java.lang.String codigo_dane) {
		_distrito.setCodigo_dane(codigo_dane);
	}

	public boolean isNew() {
		return _distrito.isNew();
	}

	public void setNew(boolean n) {
		_distrito.setNew(n);
	}

	public boolean isCachedModel() {
		return _distrito.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_distrito.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _distrito.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _distrito.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_distrito.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _distrito.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_distrito.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DistritoWrapper((Distrito)_distrito.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.Distrito distrito) {
		return _distrito.compareTo(distrito);
	}

	@Override
	public int hashCode() {
		return _distrito.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.Distrito> toCacheModel() {
		return _distrito.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.Distrito toEscapedModel() {
		return new DistritoWrapper(_distrito.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _distrito.toString();
	}

	public java.lang.String toXmlString() {
		return _distrito.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_distrito.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Distrito getWrappedDistrito() {
		return _distrito;
	}

	public Distrito getWrappedModel() {
		return _distrito;
	}

	public void resetOriginalValues() {
		_distrito.resetOriginalValues();
	}

	private Distrito _distrito;
}