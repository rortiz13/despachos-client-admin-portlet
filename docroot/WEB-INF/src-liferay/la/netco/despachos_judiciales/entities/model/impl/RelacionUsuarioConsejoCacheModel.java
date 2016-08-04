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

import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;

import java.io.Serializable;

/**
 * The cache model class for representing RelacionUsuarioConsejo in entity cache.
 *
 * @author mariza
 * @see RelacionUsuarioConsejo
 * @generated
 */
public class RelacionUsuarioConsejoCacheModel implements CacheModel<RelacionUsuarioConsejo>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{idConsejoSec=");
		sb.append(idConsejoSec);
		sb.append(", usuarioPortal=");
		sb.append(usuarioPortal);
		sb.append("}");

		return sb.toString();
	}

	public RelacionUsuarioConsejo toEntityModel() {
		RelacionUsuarioConsejoImpl relacionUsuarioConsejoImpl = new RelacionUsuarioConsejoImpl();

		relacionUsuarioConsejoImpl.setIdConsejoSec(idConsejoSec);

		if (usuarioPortal == null) {
			relacionUsuarioConsejoImpl.setUsuarioPortal(StringPool.BLANK);
		}
		else {
			relacionUsuarioConsejoImpl.setUsuarioPortal(usuarioPortal);
		}

		relacionUsuarioConsejoImpl.resetOriginalValues();

		return relacionUsuarioConsejoImpl;
	}

	public int idConsejoSec;
	public String usuarioPortal;
}