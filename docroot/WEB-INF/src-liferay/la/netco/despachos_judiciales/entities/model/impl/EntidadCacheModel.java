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

import la.netco.despachos_judiciales.entities.model.Entidad;

import java.io.Serializable;

/**
 * The cache model class for representing Entidad in entity cache.
 *
 * @author mariza
 * @see Entidad
 * @generated
 */
public class EntidadCacheModel implements CacheModel<Entidad>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", mascara=");
		sb.append(mascara);
		sb.append(", jurisdiccion=");
		sb.append(jurisdiccion);
		sb.append("}");

		return sb.toString();
	}

	public Entidad toEntityModel() {
		EntidadImpl entidadImpl = new EntidadImpl();

		entidadImpl.setCodigo(codigo);

		if (nombre == null) {
			entidadImpl.setNombre(StringPool.BLANK);
		}
		else {
			entidadImpl.setNombre(nombre);
		}

		if (mascara == null) {
			entidadImpl.setMascara(StringPool.BLANK);
		}
		else {
			entidadImpl.setMascara(mascara);
		}

		if (jurisdiccion == null) {
			entidadImpl.setJurisdiccion(StringPool.BLANK);
		}
		else {
			entidadImpl.setJurisdiccion(jurisdiccion);
		}

		entidadImpl.resetOriginalValues();

		return entidadImpl;
	}

	public int codigo;
	public String nombre;
	public String mascara;
	public String jurisdiccion;
}