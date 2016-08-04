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

import java.sql.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import la.netco.despachos_judiciales.entities.model.Trabajador;
import la.netco.despachos_judiciales.entities.service.base.TrabajadorLocalServiceBaseImpl;
import la.netco.despachos_judiciales.entities.service.persistence.TrabajadorFinderUtil;

/**
 * The implementation of the trabajador local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link la.netco.despachos_judiciales.entities.service.TrabajadorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.base.TrabajadorLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil
 */
public class TrabajadorLocalServiceImpl extends TrabajadorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil} to access the trabajador local service.
	 */
	
	
	public List<Trabajador> findByDespachoRelacion(String idDespacho) throws SystemException {
		return TrabajadorFinderUtil.findByDespachoRelacion(idDespacho);
	}

	public List<Trabajador> findByFields(String idTrabajador, String nombres, String apellidos, String especialidad, String correo,
			String telefonos, Integer carrera, Integer tipoTrabajador, Integer tipoContrato, String sexo, Date fechaNacimiento, int start, int end)
			throws SystemException {
		return TrabajadorFinderUtil.findByFields(idTrabajador, nombres, apellidos, especialidad, correo, telefonos, carrera, tipoTrabajador,
				tipoContrato, sexo, fechaNacimiento, start, end);
	}

	public Integer countByFields(String idTrabajador, String nombres, String apellidos, String especialidad, String correo, String telefonos,
			Integer carrera, Integer tipoTrabajador, Integer tipoContrato, String sexo, Date fechaNacimiento) throws SystemException {
		return TrabajadorFinderUtil.countByFields(idTrabajador, nombres, apellidos, especialidad, correo, telefonos, carrera, tipoTrabajador,
				tipoContrato, sexo, fechaNacimiento);
	}
	
	
}