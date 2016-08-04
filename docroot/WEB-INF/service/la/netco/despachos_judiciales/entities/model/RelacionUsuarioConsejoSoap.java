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

package la.netco.despachos_judiciales.entities.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    mariza
 * @generated
 */
public class RelacionUsuarioConsejoSoap implements Serializable {
	public static RelacionUsuarioConsejoSoap toSoapModel(
		RelacionUsuarioConsejo model) {
		RelacionUsuarioConsejoSoap soapModel = new RelacionUsuarioConsejoSoap();

		soapModel.setIdConsejoSec(model.getIdConsejoSec());
		soapModel.setUsuarioPortal(model.getUsuarioPortal());

		return soapModel;
	}

	public static RelacionUsuarioConsejoSoap[] toSoapModels(
		RelacionUsuarioConsejo[] models) {
		RelacionUsuarioConsejoSoap[] soapModels = new RelacionUsuarioConsejoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RelacionUsuarioConsejoSoap[][] toSoapModels(
		RelacionUsuarioConsejo[][] models) {
		RelacionUsuarioConsejoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RelacionUsuarioConsejoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RelacionUsuarioConsejoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RelacionUsuarioConsejoSoap[] toSoapModels(
		List<RelacionUsuarioConsejo> models) {
		List<RelacionUsuarioConsejoSoap> soapModels = new ArrayList<RelacionUsuarioConsejoSoap>(models.size());

		for (RelacionUsuarioConsejo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RelacionUsuarioConsejoSoap[soapModels.size()]);
	}

	public RelacionUsuarioConsejoSoap() {
	}

	public int getPrimaryKey() {
		return _idConsejoSec;
	}

	public void setPrimaryKey(int pk) {
		setIdConsejoSec(pk);
	}

	public int getIdConsejoSec() {
		return _idConsejoSec;
	}

	public void setIdConsejoSec(int idConsejoSec) {
		_idConsejoSec = idConsejoSec;
	}

	public String getUsuarioPortal() {
		return _usuarioPortal;
	}

	public void setUsuarioPortal(String usuarioPortal) {
		_usuarioPortal = usuarioPortal;
	}

	private int _idConsejoSec;
	private String _usuarioPortal;
}