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

import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.service.base.DespachoLocalServiceBaseImpl;
import la.netco.despachos_judiciales.entities.service.persistence.DespachoFinderUtil;

/**
 * The implementation of the despacho local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link la.netco.despachos_judiciales.entities.service.DespachoLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.base.DespachoLocalServiceBaseImpl
 * @see la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil
 */
public class DespachoLocalServiceImpl extends DespachoLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil} to access the despacho local service.
	 */
	

	
	public List<Despacho> findByFields(Integer idConsejo, String idDespacho, Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad,
			String consecutivo, String nombre, String direccion, String telefonos, String correo_electronico, String acuerdo, Integer estado,
			String fax, String horario_atencion, Date fechaInicial, Date fechaFinal, int start, int end) throws SystemException {
		return DespachoFinderUtil.findByFields(idConsejo, idDespacho, idDepartamento, idMunicipio, idEntidad, idEspecialidad, consecutivo, nombre, direccion,
				telefonos, correo_electronico, acuerdo, estado, fax, horario_atencion, fechaInicial, fechaFinal, start, end);
	}

	public Integer countbyFields(Integer idConsejo, String idDespacho, Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad,
			String consecutivo, String nombre, String direccion, String telefonos, String correo_electronico, String acuerdo, Integer estado,
			String fax, String horario_atencion, Date fechaInicial, Date fechaFinal) throws SystemException {
		return DespachoFinderUtil.countbyFields(idConsejo, idDespacho, idDepartamento, idMunicipio, idEntidad, idEspecialidad, consecutivo, nombre, direccion,
				telefonos, correo_electronico, acuerdo, estado, fax, horario_atencion, fechaInicial, fechaFinal);
	}

	public List<Despacho> findDespacho(Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad, Integer idDistrito,
			Integer idCosenjoSec, Integer idCircuito, int start, int end) throws SystemException {
		return DespachoFinderUtil.findDespacho(idDepartamento, idMunicipio, idEntidad, idEspecialidad, idDistrito, idCosenjoSec, idCircuito, start,
				end);
	}

	public Integer countDespacho(Integer idDepartamento, Integer idMunicipio, Integer idEntidad, Integer idEspecialidad, Integer idDistrito,
			Integer idCosenjoSec, Integer idCircuito) throws SystemException {
		return DespachoFinderUtil.countDespacho(idDepartamento, idMunicipio, idEntidad, idEspecialidad, idDistrito, idCosenjoSec, idCircuito);
	}

	
}