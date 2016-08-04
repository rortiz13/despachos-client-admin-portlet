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

import la.netco.despachos_judiciales.entities.model.Departamento;

import java.io.Serializable;

/**
 * The cache model class for representing Departamento in entity cache.
 *
 * @author mariza
 * @see Departamento
 * @generated
 */
public class DepartamentoCacheModel implements CacheModel<Departamento>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append("}");

		return sb.toString();
	}

	public Departamento toEntityModel() {
		DepartamentoImpl departamentoImpl = new DepartamentoImpl();

		departamentoImpl.setCodigo(codigo);

		if (nombre == null) {
			departamentoImpl.setNombre(StringPool.BLANK);
		}
		else {
			departamentoImpl.setNombre(nombre);
		}

		departamentoImpl.resetOriginalValues();

		return departamentoImpl;
	}

	public int codigo;
	public String nombre;
}