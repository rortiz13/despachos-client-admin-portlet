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

import la.netco.despachos_judiciales.entities.model.Municipio;

import java.io.Serializable;

/**
 * The cache model class for representing Municipio in entity cache.
 *
 * @author mariza
 * @see Municipio
 * @generated
 */
public class MunicipioCacheModel implements CacheModel<Municipio>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{idDepartamento=");
		sb.append(idDepartamento);
		sb.append(", codigo=");
		sb.append(codigo);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", indicativo=");
		sb.append(indicativo);
		sb.append(", idCircuito=");
		sb.append(idCircuito);
		sb.append(", idCircuitoAdministrativo=");
		sb.append(idCircuitoAdministrativo);
		sb.append(", idConsejoSeccional=");
		sb.append(idConsejoSeccional);
		sb.append(", idCircuitoDisciplinario=");
		sb.append(idCircuitoDisciplinario);
		sb.append("}");

		return sb.toString();
	}

	public Municipio toEntityModel() {
		MunicipioImpl municipioImpl = new MunicipioImpl();

		municipioImpl.setIdDepartamento(idDepartamento);
		municipioImpl.setCodigo(codigo);

		if (nombre == null) {
			municipioImpl.setNombre(StringPool.BLANK);
		}
		else {
			municipioImpl.setNombre(nombre);
		}

		municipioImpl.setIndicativo(indicativo);
		municipioImpl.setIdCircuito(idCircuito);
		municipioImpl.setIdCircuitoAdministrativo(idCircuitoAdministrativo);
		municipioImpl.setIdConsejoSeccional(idConsejoSeccional);
		municipioImpl.setIdCircuitoDisciplinario(idCircuitoDisciplinario);

		municipioImpl.resetOriginalValues();

		return municipioImpl;
	}

	public int idDepartamento;
	public int codigo;
	public String nombre;
	public int indicativo;
	public int idCircuito;
	public int idCircuitoAdministrativo;
	public int idConsejoSeccional;
	public int idCircuitoDisciplinario;
}