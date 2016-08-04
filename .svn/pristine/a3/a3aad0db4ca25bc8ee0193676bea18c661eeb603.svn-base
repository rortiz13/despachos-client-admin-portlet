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

package la.netco.despachos_judiciales.entities.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author mariza
 */
public class RelacionTrabajadorDespachoPK implements Comparable<RelacionTrabajadorDespachoPK>,
	Serializable {
	public String idDespacho;
	public String idTrabajador;

	public RelacionTrabajadorDespachoPK() {
	}

	public RelacionTrabajadorDespachoPK(String idDespacho, String idTrabajador) {
		this.idDespacho = idDespacho;
		this.idTrabajador = idTrabajador;
	}

	public String getIdDespacho() {
		return idDespacho;
	}

	public void setIdDespacho(String idDespacho) {
		this.idDespacho = idDespacho;
	}

	public String getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(String idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public int compareTo(RelacionTrabajadorDespachoPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		value = idDespacho.compareTo(pk.idDespacho);

		if (value != 0) {
			return value;
		}

		value = idTrabajador.compareTo(pk.idTrabajador);

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		RelacionTrabajadorDespachoPK pk = null;

		try {
			pk = (RelacionTrabajadorDespachoPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((idDespacho.equals(pk.idDespacho)) &&
				(idTrabajador.equals(pk.idTrabajador))) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(idDespacho) + String.valueOf(idTrabajador)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("idDespacho");
		sb.append(StringPool.EQUAL);
		sb.append(idDespacho);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("idTrabajador");
		sb.append(StringPool.EQUAL);
		sb.append(idTrabajador);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}