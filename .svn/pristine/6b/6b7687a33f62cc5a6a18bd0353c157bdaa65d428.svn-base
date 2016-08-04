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

import com.liferay.portal.kernel.exception.SystemException;

import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespacho;
import la.netco.despachos_judiciales.entities.service.base.RelacionTrabajadorDespachoLocalServiceBaseImpl;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoFinderUtil;

/**
 * The implementation of the relacion trabajador despacho local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.base.RelacionTrabajadorDespachoLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalServiceUtil
 */
public class RelacionTrabajadorDespachoLocalServiceImpl
	extends RelacionTrabajadorDespachoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalServiceUtil} to access the relacion trabajador despacho local service.
	 */
	
	
	public List<RelacionTrabajadorDespacho> findByFields(String idDespacho, String idTrabajador, String cargo, String acuerdo, String activo,
			String fecha_ini, String fecha_fin, String secuencia, int start, int end) throws SystemException {
		return RelacionTrabajadorDespachoFinderUtil.findByFields(idDespacho, idTrabajador, cargo, acuerdo, activo, fecha_ini, fecha_fin, secuencia, start, end);
	}
	
	public Integer countByFields(String idDespacho, String idTrabajador, String cargo, String acuerdo, String activo, String fecha_ini,
			String fecha_fin, String secuencia) throws SystemException {
		return RelacionTrabajadorDespachoFinderUtil.countByFields(idDespacho, idTrabajador, cargo, acuerdo, activo, fecha_ini, fecha_fin, secuencia);
	}
	
	public List<RelacionTrabajadorDespacho> createMold()throws SystemException {
		return RelacionTrabajadorDespachoFinderUtil.createMold();
	}
}