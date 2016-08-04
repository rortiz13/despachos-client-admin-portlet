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

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Trabajador service. Represents a row in the &quot;ADM_TRABAJADORES&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link la.netco.despachos_judiciales.entities.model.impl.TrabajadorModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link la.netco.despachos_judiciales.entities.model.impl.TrabajadorImpl}.
 * </p>
 *
 * @author mariza
 * @see Trabajador
 * @see la.netco.despachos_judiciales.entities.model.impl.TrabajadorImpl
 * @see la.netco.despachos_judiciales.entities.model.impl.TrabajadorModelImpl
 * @generated
 */
public interface TrabajadorModel extends BaseModel<Trabajador> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a trabajador model instance should use the {@link Trabajador} interface instead.
	 */

	/**
	 * Returns the primary key of this trabajador.
	 *
	 * @return the primary key of this trabajador
	 */
	public String getPrimaryKey();

	/**
	 * Sets the primary key of this trabajador.
	 *
	 * @param primaryKey the primary key of this trabajador
	 */
	public void setPrimaryKey(String primaryKey);

	/**
	 * Returns the cedula of this trabajador.
	 *
	 * @return the cedula of this trabajador
	 */
	@AutoEscape
	public String getCedula();

	/**
	 * Sets the cedula of this trabajador.
	 *
	 * @param cedula the cedula of this trabajador
	 */
	public void setCedula(String cedula);

	/**
	 * Returns the nombres of this trabajador.
	 *
	 * @return the nombres of this trabajador
	 */
	@AutoEscape
	public String getNombres();

	/**
	 * Sets the nombres of this trabajador.
	 *
	 * @param nombres the nombres of this trabajador
	 */
	public void setNombres(String nombres);

	/**
	 * Returns the apellidos of this trabajador.
	 *
	 * @return the apellidos of this trabajador
	 */
	@AutoEscape
	public String getApellidos();

	/**
	 * Sets the apellidos of this trabajador.
	 *
	 * @param apellidos the apellidos of this trabajador
	 */
	public void setApellidos(String apellidos);

	/**
	 * Returns the especialidad of this trabajador.
	 *
	 * @return the especialidad of this trabajador
	 */
	@AutoEscape
	public String getEspecialidad();

	/**
	 * Sets the especialidad of this trabajador.
	 *
	 * @param especialidad the especialidad of this trabajador
	 */
	public void setEspecialidad(String especialidad);

	/**
	 * Returns the correo_electronico of this trabajador.
	 *
	 * @return the correo_electronico of this trabajador
	 */
	@AutoEscape
	public String getCorreo_electronico();

	/**
	 * Sets the correo_electronico of this trabajador.
	 *
	 * @param correo_electronico the correo_electronico of this trabajador
	 */
	public void setCorreo_electronico(String correo_electronico);

	/**
	 * Returns the telefonos_oficina of this trabajador.
	 *
	 * @return the telefonos_oficina of this trabajador
	 */
	@AutoEscape
	public String getTelefonos_oficina();

	/**
	 * Sets the telefonos_oficina of this trabajador.
	 *
	 * @param telefonos_oficina the telefonos_oficina of this trabajador
	 */
	public void setTelefonos_oficina(String telefonos_oficina);

	/**
	 * Returns the carrera of this trabajador.
	 *
	 * @return the carrera of this trabajador
	 */
	public long getCarrera();

	/**
	 * Sets the carrera of this trabajador.
	 *
	 * @param carrera the carrera of this trabajador
	 */
	public void setCarrera(long carrera);

	/**
	 * Returns the tipo_trabajador of this trabajador.
	 *
	 * @return the tipo_trabajador of this trabajador
	 */
	public long getTipo_trabajador();

	/**
	 * Sets the tipo_trabajador of this trabajador.
	 *
	 * @param tipo_trabajador the tipo_trabajador of this trabajador
	 */
	public void setTipo_trabajador(long tipo_trabajador);

	/**
	 * Returns the tipo_contrato of this trabajador.
	 *
	 * @return the tipo_contrato of this trabajador
	 */
	public long getTipo_contrato();

	/**
	 * Sets the tipo_contrato of this trabajador.
	 *
	 * @param tipo_contrato the tipo_contrato of this trabajador
	 */
	public void setTipo_contrato(long tipo_contrato);

	/**
	 * Returns the sexo of this trabajador.
	 *
	 * @return the sexo of this trabajador
	 */
	@AutoEscape
	public String getSexo();

	/**
	 * Sets the sexo of this trabajador.
	 *
	 * @param sexo the sexo of this trabajador
	 */
	public void setSexo(String sexo);

	/**
	 * Returns the fecha_nacimiento of this trabajador.
	 *
	 * @return the fecha_nacimiento of this trabajador
	 */
	public Date getFecha_nacimiento();

	/**
	 * Sets the fecha_nacimiento of this trabajador.
	 *
	 * @param fecha_nacimiento the fecha_nacimiento of this trabajador
	 */
	public void setFecha_nacimiento(Date fecha_nacimiento);

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

	public int compareTo(Trabajador trabajador);

	public int hashCode();

	public CacheModel<Trabajador> toCacheModel();

	public Trabajador toEscapedModel();

	public String toString();

	public String toXmlString();
}