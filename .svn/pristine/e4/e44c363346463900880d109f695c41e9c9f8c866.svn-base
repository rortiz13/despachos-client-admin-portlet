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

package la.netco.despachos_judiciales.entities.service.impl;

import java.util.List;

import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.service.base.MunicipioLocalServiceBaseImpl;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioFinderUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the municipio local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the
 * {@link la.netco.despachos_judiciales.entities.service.MunicipioLocalService} interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can
 * only be accessed from within the same VM.
 * </p>
 * 
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.base.MunicipioLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil
 */
public class MunicipioLocalServiceImpl extends MunicipioLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil} to access
	 * the municipio local service.
	 */

	public List<Municipio> findByEstadoDescpacho(Integer idDepartamento) throws SystemException {
		return MunicipioFinderUtil.findByEstadoDescpacho(idDepartamento);
	}

	public List<Municipio> findByCompositeKey(Integer idDepartamento, Integer idMunicipio) throws SystemException {
		return MunicipioFinderUtil.findByCompositeKey(idDepartamento, idMunicipio);
	}

	public List<Municipio> findByFields(Integer idDepartamento, Integer idMunicipio, String nombre, String indicativo, Integer idCircuito,
			Integer idCircuitoAdministrativo, Integer idConsejoSeccional, Integer idCircuitoDisciplinario, int start, int end) throws SystemException {
		return MunicipioFinderUtil.findByFields(idDepartamento, idMunicipio, nombre, indicativo, idCircuito, idCircuitoAdministrativo,
				idConsejoSeccional, idCircuitoDisciplinario, start, end);
	}

	public Integer countByFields(Integer idDepartamento, Integer idMunicipio, String nombre, String indicativo, Integer idCircuito,
			Integer idCircuitoAdministrativo, Integer idConsejoSeccional, Integer idCircuitoDisciplinario) throws SystemException {
		return MunicipioFinderUtil.countByFields(idDepartamento, idMunicipio, nombre, indicativo, idCircuito, idCircuitoAdministrativo,
				idConsejoSeccional, idCircuitoDisciplinario);
	}
}