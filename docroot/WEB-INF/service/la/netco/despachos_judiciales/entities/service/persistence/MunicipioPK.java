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
public class MunicipioPK implements Comparable<MunicipioPK>, Serializable {
	public int idDepartamento;
	public int codigo;

	public MunicipioPK() {
	}

	public MunicipioPK(int idDepartamento, int codigo) {
		this.idDepartamento = idDepartamento;
		this.codigo = codigo;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int compareTo(MunicipioPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (idDepartamento < pk.idDepartamento) {
			value = -1;
		}
		else if (idDepartamento > pk.idDepartamento) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (codigo < pk.codigo) {
			value = -1;
		}
		else if (codigo > pk.codigo) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		MunicipioPK pk = null;

		try {
			pk = (MunicipioPK)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		if ((idDepartamento == pk.idDepartamento) && (codigo == pk.codigo)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(idDepartamento) + String.valueOf(codigo)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("idDepartamento");
		sb.append(StringPool.EQUAL);
		sb.append(idDepartamento);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("codigo");
		sb.append(StringPool.EQUAL);
		sb.append(codigo);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}