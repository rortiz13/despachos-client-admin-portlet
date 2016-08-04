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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import la.netco.despachos_judiciales.entities.service.RelacionUsuarioConsejoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mariza
 */
public class RelacionUsuarioConsejoClp extends BaseModelImpl<RelacionUsuarioConsejo>
	implements RelacionUsuarioConsejo {
	public RelacionUsuarioConsejoClp() {
	}

	public Class<?> getModelClass() {
		return RelacionUsuarioConsejo.class;
	}

	public String getModelClassName() {
		return RelacionUsuarioConsejo.class.getName();
	}

	public int getPrimaryKey() {
		return _idConsejoSec;
	}

	public void setPrimaryKey(int primaryKey) {
		setIdConsejoSec(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_idConsejoSec);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idConsejoSec", getIdConsejoSec());
		attributes.put("usuarioPortal", getUsuarioPortal());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer idConsejoSec = (Integer)attributes.get("idConsejoSec");

		if (idConsejoSec != null) {
			setIdConsejoSec(idConsejoSec);
		}

		String usuarioPortal = (String)attributes.get("usuarioPortal");

		if (usuarioPortal != null) {
			setUsuarioPortal(usuarioPortal);
		}
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

	public BaseModel<?> getRelacionUsuarioConsejoRemoteModel() {
		return _relacionUsuarioConsejoRemoteModel;
	}

	public void setRelacionUsuarioConsejoRemoteModel(
		BaseModel<?> relacionUsuarioConsejoRemoteModel) {
		_relacionUsuarioConsejoRemoteModel = relacionUsuarioConsejoRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			RelacionUsuarioConsejoLocalServiceUtil.addRelacionUsuarioConsejo(this);
		}
		else {
			RelacionUsuarioConsejoLocalServiceUtil.updateRelacionUsuarioConsejo(this);
		}
	}

	@Override
	public RelacionUsuarioConsejo toEscapedModel() {
		return (RelacionUsuarioConsejo)Proxy.newProxyInstance(RelacionUsuarioConsejo.class.getClassLoader(),
			new Class[] { RelacionUsuarioConsejo.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RelacionUsuarioConsejoClp clone = new RelacionUsuarioConsejoClp();

		clone.setIdConsejoSec(getIdConsejoSec());
		clone.setUsuarioPortal(getUsuarioPortal());

		return clone;
	}

	public int compareTo(RelacionUsuarioConsejo relacionUsuarioConsejo) {
		int primaryKey = relacionUsuarioConsejo.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		RelacionUsuarioConsejoClp relacionUsuarioConsejo = null;

		try {
			relacionUsuarioConsejo = (RelacionUsuarioConsejoClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = relacionUsuarioConsejo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{idConsejoSec=");
		sb.append(getIdConsejoSec());
		sb.append(", usuarioPortal=");
		sb.append(getUsuarioPortal());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append(
			"la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idConsejoSec</column-name><column-value><![CDATA[");
		sb.append(getIdConsejoSec());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>usuarioPortal</column-name><column-value><![CDATA[");
		sb.append(getUsuarioPortal());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _idConsejoSec;
	private String _usuarioPortal;
	private BaseModel<?> _relacionUsuarioConsejoRemoteModel;
}