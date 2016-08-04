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

package la.netco.despachos_judiciales.entities.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;

import java.io.Serializable;

/**
 * The cache model class for representing RelacionTrabajadorDespacho in entity cache.
 *
 * @author mariza
 * @see RelacionTrabajadorDespacho
 * @generated
 */
public class RelacionTrabajadorDespachoCacheModel implements CacheModel<RelacionTrabajadorDespacho>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{idDespacho=");
		sb.append(idDespacho);
		sb.append(", idTrabajador=");
		sb.append(idTrabajador);
		sb.append(", cargo=");
		sb.append(cargo);
		sb.append(", acuerdo=");
		sb.append(acuerdo);
		sb.append(", activo=");
		sb.append(activo);
		sb.append(", fecha_ini=");
		sb.append(fecha_ini);
		sb.append(", fecha_fin=");
		sb.append(fecha_fin);
		sb.append(", secuencia=");
		sb.append(secuencia);
		sb.append("}");

		return sb.toString();
	}

	public RelacionTrabajadorDespacho toEntityModel() {
		RelacionTrabajadorDespachoImpl relacionTrabajadorDespachoImpl = new RelacionTrabajadorDespachoImpl();

		if (idDespacho == null) {
			relacionTrabajadorDespachoImpl.setIdDespacho(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setIdDespacho(idDespacho);
		}

		if (idTrabajador == null) {
			relacionTrabajadorDespachoImpl.setIdTrabajador(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setIdTrabajador(idTrabajador);
		}

		if (cargo == null) {
			relacionTrabajadorDespachoImpl.setCargo(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setCargo(cargo);
		}

		if (acuerdo == null) {
			relacionTrabajadorDespachoImpl.setAcuerdo(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setAcuerdo(acuerdo);
		}

		if (activo == null) {
			relacionTrabajadorDespachoImpl.setActivo(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setActivo(activo);
		}

		if (fecha_ini == null) {
			relacionTrabajadorDespachoImpl.setFecha_ini(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setFecha_ini(fecha_ini);
		}

		if (fecha_fin == null) {
			relacionTrabajadorDespachoImpl.setFecha_fin(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setFecha_fin(fecha_fin);
		}

		if (secuencia == null) {
			relacionTrabajadorDespachoImpl.setSecuencia(StringPool.BLANK);
		}
		else {
			relacionTrabajadorDespachoImpl.setSecuencia(secuencia);
		}

		relacionTrabajadorDespachoImpl.resetOriginalValues();

		return relacionTrabajadorDespachoImpl;
	}

	public String idDespacho;
	public String idTrabajador;
	public String cargo;
	public String acuerdo;
	public String activo;
	public String fecha_ini;
	public String fecha_fin;
	public String secuencia;
}