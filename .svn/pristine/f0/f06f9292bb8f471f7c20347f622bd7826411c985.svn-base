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

import la.netco.despachos_judiciales.entities.model.Distrito;

import java.io.Serializable;

/**
 * The cache model class for representing Distrito in entity cache.
 *
 * @author mariza
 * @see Distrito
 * @generated
 */
public class DistritoCacheModel implements CacheModel<Distrito>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", idConsejo_sec=");
		sb.append(idConsejo_sec);
		sb.append(", jurisdiccion=");
		sb.append(jurisdiccion);
		sb.append(", codigo_dane=");
		sb.append(codigo_dane);
		sb.append("}");

		return sb.toString();
	}

	public Distrito toEntityModel() {
		DistritoImpl distritoImpl = new DistritoImpl();

		distritoImpl.setCodigo(codigo);

		if (nombre == null) {
			distritoImpl.setNombre(StringPool.BLANK);
		}
		else {
			distritoImpl.setNombre(nombre);
		}

		distritoImpl.setIdConsejo_sec(idConsejo_sec);

		if (jurisdiccion == null) {
			distritoImpl.setJurisdiccion(StringPool.BLANK);
		}
		else {
			distritoImpl.setJurisdiccion(jurisdiccion);
		}

		if (codigo_dane == null) {
			distritoImpl.setCodigo_dane(StringPool.BLANK);
		}
		else {
			distritoImpl.setCodigo_dane(codigo_dane);
		}

		distritoImpl.resetOriginalValues();

		return distritoImpl;
	}

	public int codigo;
	public String nombre;
	public int idConsejo_sec;
	public String jurisdiccion;
	public String codigo_dane;
}