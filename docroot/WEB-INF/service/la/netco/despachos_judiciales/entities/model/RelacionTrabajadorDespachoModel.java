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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPK;

import java.io.Serializable;

/**
 * The base model interface for the RelacionTrabajadorDespacho service. Represents a row in the &quot;REL_TRA_DES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoImpl}.
 * </p>
 *
 * @author mariza
 * @see RelacionTrabajadorDespacho
 * @see la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoImpl
 * @see la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoModelImpl
 * @generated
 */
public interface RelacionTrabajadorDespachoModel extends BaseModel<RelacionTrabajadorDespacho> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a relacion trabajador despacho model instance should use the {@link RelacionTrabajadorDespacho} interface instead.
	 */

	/**
	 * Returns the primary key of this relacion trabajador despacho.
	 *
	 * @return the primary key of this relacion trabajador despacho
	 */
	public RelacionTrabajadorDespachoPK getPrimaryKey();

	/**
	 * Sets the primary key of this relacion trabajador despacho.
	 *
	 * @param primaryKey the primary key of this relacion trabajador despacho
	 */
	public void setPrimaryKey(RelacionTrabajadorDespachoPK primaryKey);

	/**
	 * Returns the id despacho of this relacion trabajador despacho.
	 *
	 * @return the id despacho of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getIdDespacho();

	/**
	 * Sets the id despacho of this relacion trabajador despacho.
	 *
	 * @param idDespacho the id despacho of this relacion trabajador despacho
	 */
	public void setIdDespacho(String idDespacho);

	/**
	 * Returns the id trabajador of this relacion trabajador despacho.
	 *
	 * @return the id trabajador of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getIdTrabajador();

	/**
	 * Sets the id trabajador of this relacion trabajador despacho.
	 *
	 * @param idTrabajador the id trabajador of this relacion trabajador despacho
	 */
	public void setIdTrabajador(String idTrabajador);

	/**
	 * Returns the cargo of this relacion trabajador despacho.
	 *
	 * @return the cargo of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getCargo();

	/**
	 * Sets the cargo of this relacion trabajador despacho.
	 *
	 * @param cargo the cargo of this relacion trabajador despacho
	 */
	public void setCargo(String cargo);

	/**
	 * Returns the acuerdo of this relacion trabajador despacho.
	 *
	 * @return the acuerdo of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getAcuerdo();

	/**
	 * Sets the acuerdo of this relacion trabajador despacho.
	 *
	 * @param acuerdo the acuerdo of this relacion trabajador despacho
	 */
	public void setAcuerdo(String acuerdo);

	/**
	 * Returns the activo of this relacion trabajador despacho.
	 *
	 * @return the activo of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getActivo();

	/**
	 * Sets the activo of this relacion trabajador despacho.
	 *
	 * @param activo the activo of this relacion trabajador despacho
	 */
	public void setActivo(String activo);

	/**
	 * Returns the fecha_ini of this relacion trabajador despacho.
	 *
	 * @return the fecha_ini of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getFecha_ini();

	/**
	 * Sets the fecha_ini of this relacion trabajador despacho.
	 *
	 * @param fecha_ini the fecha_ini of this relacion trabajador despacho
	 */
	public void setFecha_ini(String fecha_ini);

	/**
	 * Returns the fecha_fin of this relacion trabajador despacho.
	 *
	 * @return the fecha_fin of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getFecha_fin();

	/**
	 * Sets the fecha_fin of this relacion trabajador despacho.
	 *
	 * @param fecha_fin the fecha_fin of this relacion trabajador despacho
	 */
	public void setFecha_fin(String fecha_fin);

	/**
	 * Returns the secuencia of this relacion trabajador despacho.
	 *
	 * @return the secuencia of this relacion trabajador despacho
	 */
	@AutoEscape
	public String getSecuencia();

	/**
	 * Sets the secuencia of this relacion trabajador despacho.
	 *
	 * @param secuencia the secuencia of this relacion trabajador despacho
	 */
	public void setSecuencia(String secuencia);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(RelacionTrabajadorDespacho relacionTrabajadorDespacho);

	public int hashCode();

	public CacheModel<RelacionTrabajadorDespacho> toCacheModel();

	public RelacionTrabajadorDespacho toEscapedModel();

	public String toString();

	public String toXmlString();
}