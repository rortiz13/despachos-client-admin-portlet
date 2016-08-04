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

package la.netco.despachos_judiciales.entities.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import la.netco.despachos_judiciales.entities.service.CircuitoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.ClpSerializer;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.DistritoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EntidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.RelacionUsuarioConsejoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.TrabajadorLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			CircuitoLocalServiceUtil.clearService();

			ConsejoSeccionalLocalServiceUtil.clearService();

			DepartamentoLocalServiceUtil.clearService();

			DespachoLocalServiceUtil.clearService();

			DistritoLocalServiceUtil.clearService();

			EntidadLocalServiceUtil.clearService();

			EspecialidadLocalServiceUtil.clearService();

			MunicipioLocalServiceUtil.clearService();

			RelacionTrabajadorDespachoLocalServiceUtil.clearService();

			RelacionUsuarioConsejoLocalServiceUtil.clearService();

			TrabajadorLocalServiceUtil.clearService();
		}
	}
}