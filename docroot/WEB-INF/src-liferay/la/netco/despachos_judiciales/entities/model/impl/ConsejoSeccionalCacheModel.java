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

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;

import java.io.Serializable;

/**
 * The cache model class for representing ConsejoSeccional in entity cache.
 *
 * @author mariza
 * @see ConsejoSeccional
 * @generated
 */
public class ConsejoSeccionalCacheModel implements CacheModel<ConsejoSeccional>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", direccion=");
		sb.append(direccion);
		sb.append(", telefonos=");
		sb.append(telefonos);
		sb.append(", correo_electronico=");
		sb.append(correo_electronico);
		sb.append("}");

		return sb.toString();
	}

	public ConsejoSeccional toEntityModel() {
		ConsejoSeccionalImpl consejoSeccionalImpl = new ConsejoSeccionalImpl();

		consejoSeccionalImpl.setCodigo(codigo);

		if (nombre == null) {
			consejoSeccionalImpl.setNombre(StringPool.BLANK);
		}
		else {
			consejoSeccionalImpl.setNombre(nombre);
		}

		if (direccion == null) {
			consejoSeccionalImpl.setDireccion(StringPool.BLANK);
		}
		else {
			consejoSeccionalImpl.setDireccion(direccion);
		}

		if (telefonos == null) {
			consejoSeccionalImpl.setTelefonos(StringPool.BLANK);
		}
		else {
			consejoSeccionalImpl.setTelefonos(telefonos);
		}

		if (correo_electronico == null) {
			consejoSeccionalImpl.setCorreo_electronico(StringPool.BLANK);
		}
		else {
			consejoSeccionalImpl.setCorreo_electronico(correo_electronico);
		}

		consejoSeccionalImpl.resetOriginalValues();

		return consejoSeccionalImpl;
	}

	public int codigo;
	public String nombre;
	public String direccion;
	public String telefonos;
	public String correo_electronico;
}