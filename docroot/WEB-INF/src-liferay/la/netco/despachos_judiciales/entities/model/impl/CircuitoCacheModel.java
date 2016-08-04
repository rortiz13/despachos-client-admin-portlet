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

import la.netco.despachos_judiciales.entities.model.Circuito;

import java.io.Serializable;

/**
 * The cache model class for representing Circuito in entity cache.
 *
 * @author mariza
 * @see Circuito
 * @generated
 */
public class CircuitoCacheModel implements CacheModel<Circuito>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", idDistrito=");
		sb.append(idDistrito);
		sb.append(", jurisdiccion=");
		sb.append(jurisdiccion);
		sb.append(", codigo_dane=");
		sb.append(codigo_dane);
		sb.append("}");

		return sb.toString();
	}

	public Circuito toEntityModel() {
		CircuitoImpl circuitoImpl = new CircuitoImpl();

		circuitoImpl.setCodigo(codigo);

		if (nombre == null) {
			circuitoImpl.setNombre(StringPool.BLANK);
		}
		else {
			circuitoImpl.setNombre(nombre);
		}

		circuitoImpl.setIdDistrito(idDistrito);

		if (jurisdiccion == null) {
			circuitoImpl.setJurisdiccion(StringPool.BLANK);
		}
		else {
			circuitoImpl.setJurisdiccion(jurisdiccion);
		}

		if (codigo_dane == null) {
			circuitoImpl.setCodigo_dane(StringPool.BLANK);
		}
		else {
			circuitoImpl.setCodigo_dane(codigo_dane);
		}

		circuitoImpl.resetOriginalValues();

		return circuitoImpl;
	}

	public int codigo;
	public String nombre;
	public int idDistrito;
	public String jurisdiccion;
	public String codigo_dane;
}