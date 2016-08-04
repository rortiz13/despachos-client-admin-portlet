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

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.service.base.ConsejoSeccionalLocalServiceBaseImpl;
import la.netco.despachos_judiciales.entities.service.persistence.ConsejoSeccionalFinderUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the consejo seccional local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.base.ConsejoSeccionalLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil
 */
public class ConsejoSeccionalLocalServiceImpl
	extends ConsejoSeccionalLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil} to access the consejo seccional local service.
	 */
	
	public List<ConsejoSeccional> findByDespacho(Integer idDepartamento, Integer idMunicipio) throws SystemException {
		return ConsejoSeccionalFinderUtil.findByDespacho(idDepartamento, idMunicipio);
	}
	
	public List<ConsejoSeccional> findByFields(Integer idConsejoSec, String nombre, String direccion, String telefonos, String correo_electronico,int start, int end)
			throws SystemException {
		return ConsejoSeccionalFinderUtil.findByFields(idConsejoSec, nombre, direccion, telefonos, correo_electronico, start, end);
	}
	
	public Integer countByFields(Integer idConsejoSec, String nombre, String direccion, String telefonos, String correo_electronico)
			throws SystemException {
		return ConsejoSeccionalFinderUtil.countByFields(idConsejoSec, nombre, direccion, telefonos, correo_electronico);
	}
	
}