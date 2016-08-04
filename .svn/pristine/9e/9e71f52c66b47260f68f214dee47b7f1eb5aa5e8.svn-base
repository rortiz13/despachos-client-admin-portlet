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

import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.service.base.DistritoLocalServiceBaseImpl;
import la.netco.despachos_judiciales.entities.service.persistence.DistritoFinderUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the distrito local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link la.netco.despachos_judiciales.entities.service.DistritoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.base.DistritoLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil
 */
public class DistritoLocalServiceImpl extends DistritoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil} to access the distrito local service.
	 */
	
	
	public List<Distrito> findByDespacho(Integer idConsejo, Integer idDepartamento, Integer idMunicipio) throws SystemException {
		return DistritoFinderUtil.findByDespacho(idConsejo, idDepartamento, idMunicipio);
	}
	
	public List<Distrito> findByFields(Integer idDistrito, String nombre, Integer idConsejoSec, String jurisdiccion, String codigoDane,int start, int end)
			throws SystemException {
		return DistritoFinderUtil.findByFields(idDistrito, nombre, idConsejoSec, jurisdiccion, codigoDane, start, end);
	}
	
	public Integer countByFields(Integer idDistrito, String nombre, Integer idConsejoSec, String jurisdiccion, String codigoDane)
			throws SystemException {
		return DistritoFinderUtil.countByFields(idDistrito, nombre, idConsejoSec, jurisdiccion, codigoDane);
	}
	
}