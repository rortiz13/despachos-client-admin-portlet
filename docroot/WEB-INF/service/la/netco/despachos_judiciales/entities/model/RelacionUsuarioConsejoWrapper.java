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
 * This class is a wrapper for {@link RelacionUsuarioConsejo}.
 * </p>
 *
 * @author    mariza
 * @see       RelacionUsuarioConsejo
 * @generated
 */
public class RelacionUsuarioConsejoWrapper implements RelacionUsuarioConsejo,
	ModelWrapper<RelacionUsuarioConsejo> {
	public RelacionUsuarioConsejoWrapper(
		RelacionUsuarioConsejo relacionUsuarioConsejo) {
		_relacionUsuarioConsejo = relacionUsuarioConsejo;
	}

	public Class<?> getModelClass() {
		return RelacionUsuarioConsejo.class;
	}

	public String getModelClassName() {
		return RelacionUsuarioConsejo.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idConsejoSec", getIdConsejoSec());
		attributes.put("usuarioPortal", getUsuarioPortal());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idConsejoSec = (Integer)attributes.get("idConsejoSec");

		if (idConsejoSec != null) {
			setIdConsejoSec(idConsejoSec);
		}

		String usuarioPortal = (String)attributes.get("usuarioPortal");

		if (usuarioPortal != null) {
			setUsuarioPortal(usuarioPortal);
		}
	}

	/**
	* Returns the primary key of this relacion usuario consejo.
	*
	* @return the primary key of this relacion usuario consejo
	*/
	public int getPrimaryKey() {
		return _relacionUsuarioConsejo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this relacion usuario consejo.
	*
	* @param primaryKey the primary key of this relacion usuario consejo
	*/
	public void setPrimaryKey(int primaryKey) {
		_relacionUsuarioConsejo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the id consejo sec of this relacion usuario consejo.
	*
	* @return the id consejo sec of this relacion usuario consejo
	*/
	public int getIdConsejoSec() {
		return _relacionUsuarioConsejo.getIdConsejoSec();
	}

	/**
	* Sets the id consejo sec of this relacion usuario consejo.
	*
	* @param idConsejoSec the id consejo sec of this relacion usuario consejo
	*/
	public void setIdConsejoSec(int idConsejoSec) {
		_relacionUsuarioConsejo.setIdConsejoSec(idConsejoSec);
	}

	/**
	* Returns the usuario portal of this relacion usuario consejo.
	*
	* @return the usuario portal of this relacion usuario consejo
	*/
	public java.lang.String getUsuarioPortal() {
		return _relacionUsuarioConsejo.getUsuarioPortal();
	}

	/**
	* Sets the usuario portal of this relacion usuario consejo.
	*
	* @param usuarioPortal the usuario portal of this relacion usuario consejo
	*/
	public void setUsuarioPortal(java.lang.String usuarioPortal) {
		_relacionUsuarioConsejo.setUsuarioPortal(usuarioPortal);
	}

	public boolean isNew() {
		return _relacionUsuarioConsejo.isNew();
	}

	public void setNew(boolean n) {
		_relacionUsuarioConsejo.setNew(n);
	}

	public boolean isCachedModel() {
		return _relacionUsuarioConsejo.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_relacionUsuarioConsejo.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _relacionUsuarioConsejo.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _relacionUsuarioConsejo.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_relacionUsuarioConsejo.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _relacionUsuarioConsejo.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_relacionUsuarioConsejo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RelacionUsuarioConsejoWrapper((RelacionUsuarioConsejo)_relacionUsuarioConsejo.clone());
	}

	public int compareTo(
		la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo relacionUsuarioConsejo) {
		return _relacionUsuarioConsejo.compareTo(relacionUsuarioConsejo);
	}

	@Override
	public int hashCode() {
		return _relacionUsuarioConsejo.hashCode();
	}

	public com.liferay.portal.model.CacheModel<la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo> toCacheModel() {
		return _relacionUsuarioConsejo.toCacheModel();
	}

	public la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo toEscapedModel() {
		return new RelacionUsuarioConsejoWrapper(_relacionUsuarioConsejo.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _relacionUsuarioConsejo.toString();
	}

	public java.lang.String toXmlString() {
		return _relacionUsuarioConsejo.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_relacionUsuarioConsejo.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public RelacionUsuarioConsejo getWrappedRelacionUsuarioConsejo() {
		return _relacionUsuarioConsejo;
	}

	public RelacionUsuarioConsejo getWrappedModel() {
		return _relacionUsuarioConsejo;
	}

	public void resetOriginalValues() {
		_relacionUsuarioConsejo.resetOriginalValues();
	}

	private RelacionUsuarioConsejo _relacionUsuarioConsejo;
}