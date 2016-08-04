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

package la.netco.despachos_judiciales.entities.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import la.netco.despachos_judiciales.entities.model.CircuitoClp;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccionalClp;
import la.netco.despachos_judiciales.entities.model.DepartamentoClp;
import la.netco.despachos_judiciales.entities.model.DespachoClp;
import la.netco.despachos_judiciales.entities.model.DistritoClp;
import la.netco.despachos_judiciales.entities.model.EntidadClp;
import la.netco.despachos_judiciales.entities.model.EspecialidadClp;
import la.netco.despachos_judiciales.entities.model.MunicipioClp;
import la.netco.despachos_judiciales.entities.model.RelacionTrabajadorDespachoClp;
import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejoClp;
import la.netco.despachos_judiciales.entities.model.TrabajadorClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"despachos-client-admin-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"despachos-client-admin-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "despachos-client-admin-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(CircuitoClp.class.getName())) {
			return translateInputCircuito(oldModel);
		}

		if (oldModelClassName.equals(ConsejoSeccionalClp.class.getName())) {
			return translateInputConsejoSeccional(oldModel);
		}

		if (oldModelClassName.equals(DepartamentoClp.class.getName())) {
			return translateInputDepartamento(oldModel);
		}

		if (oldModelClassName.equals(DespachoClp.class.getName())) {
			return translateInputDespacho(oldModel);
		}

		if (oldModelClassName.equals(DistritoClp.class.getName())) {
			return translateInputDistrito(oldModel);
		}

		if (oldModelClassName.equals(EntidadClp.class.getName())) {
			return translateInputEntidad(oldModel);
		}

		if (oldModelClassName.equals(EspecialidadClp.class.getName())) {
			return translateInputEspecialidad(oldModel);
		}

		if (oldModelClassName.equals(MunicipioClp.class.getName())) {
			return translateInputMunicipio(oldModel);
		}

		if (oldModelClassName.equals(
					RelacionTrabajadorDespachoClp.class.getName())) {
			return translateInputRelacionTrabajadorDespacho(oldModel);
		}

		if (oldModelClassName.equals(RelacionUsuarioConsejoClp.class.getName())) {
			return translateInputRelacionUsuarioConsejo(oldModel);
		}

		if (oldModelClassName.equals(TrabajadorClp.class.getName())) {
			return translateInputTrabajador(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputCircuito(BaseModel<?> oldModel) {
		CircuitoClp oldClpModel = (CircuitoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getCircuitoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputConsejoSeccional(BaseModel<?> oldModel) {
		ConsejoSeccionalClp oldClpModel = (ConsejoSeccionalClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getConsejoSeccionalRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDepartamento(BaseModel<?> oldModel) {
		DepartamentoClp oldClpModel = (DepartamentoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDepartamentoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDespacho(BaseModel<?> oldModel) {
		DespachoClp oldClpModel = (DespachoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDespachoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputDistrito(BaseModel<?> oldModel) {
		DistritoClp oldClpModel = (DistritoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getDistritoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEntidad(BaseModel<?> oldModel) {
		EntidadClp oldClpModel = (EntidadClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEntidadRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputEspecialidad(BaseModel<?> oldModel) {
		EspecialidadClp oldClpModel = (EspecialidadClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getEspecialidadRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputMunicipio(BaseModel<?> oldModel) {
		MunicipioClp oldClpModel = (MunicipioClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getMunicipioRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRelacionTrabajadorDespacho(
		BaseModel<?> oldModel) {
		RelacionTrabajadorDespachoClp oldClpModel = (RelacionTrabajadorDespachoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRelacionTrabajadorDespachoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputRelacionUsuarioConsejo(
		BaseModel<?> oldModel) {
		RelacionUsuarioConsejoClp oldClpModel = (RelacionUsuarioConsejoClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getRelacionUsuarioConsejoRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputTrabajador(BaseModel<?> oldModel) {
		TrabajadorClp oldClpModel = (TrabajadorClp)oldModel;

		BaseModel<?> newModel = oldClpModel.getTrabajadorRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.CircuitoImpl")) {
			return translateOutputCircuito(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.ConsejoSeccionalImpl")) {
			return translateOutputConsejoSeccional(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.DepartamentoImpl")) {
			return translateOutputDepartamento(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.DespachoImpl")) {
			return translateOutputDespacho(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.DistritoImpl")) {
			return translateOutputDistrito(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.EntidadImpl")) {
			return translateOutputEntidad(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.EspecialidadImpl")) {
			return translateOutputEspecialidad(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.MunicipioImpl")) {
			return translateOutputMunicipio(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.RelacionTrabajadorDespachoImpl")) {
			return translateOutputRelacionTrabajadorDespacho(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.RelacionUsuarioConsejoImpl")) {
			return translateOutputRelacionUsuarioConsejo(oldModel);
		}

		if (oldModelClassName.equals(
					"la.netco.despachos_judiciales.entities.model.impl.TrabajadorImpl")) {
			return translateOutputTrabajador(oldModel);
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(PortalException.class.getName())) {
			return new PortalException();
		}

		if (className.equals(SystemException.class.getName())) {
			return new SystemException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchCircuitoException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchCircuitoException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchConsejoSeccionalException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchDepartamentoException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchDepartamentoException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchDespachoException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchDespachoException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchDistritoException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchDistritoException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchEntidadException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchEntidadException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchEspecialidadException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchEspecialidadException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchMunicipioException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchMunicipioException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchRelacionTrabajadorDespachoException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchRelacionUsuarioConsejoException();
		}

		if (className.equals(
					"la.netco.despachos_judiciales.entities.NoSuchTrabajadorException")) {
			return new la.netco.despachos_judiciales.entities.NoSuchTrabajadorException();
		}

		return throwable;
	}

	public static Object translateOutputCircuito(BaseModel<?> oldModel) {
		CircuitoClp newModel = new CircuitoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setCircuitoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputConsejoSeccional(BaseModel<?> oldModel) {
		ConsejoSeccionalClp newModel = new ConsejoSeccionalClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setConsejoSeccionalRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDepartamento(BaseModel<?> oldModel) {
		DepartamentoClp newModel = new DepartamentoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDepartamentoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDespacho(BaseModel<?> oldModel) {
		DespachoClp newModel = new DespachoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDespachoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputDistrito(BaseModel<?> oldModel) {
		DistritoClp newModel = new DistritoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setDistritoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEntidad(BaseModel<?> oldModel) {
		EntidadClp newModel = new EntidadClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEntidadRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputEspecialidad(BaseModel<?> oldModel) {
		EspecialidadClp newModel = new EspecialidadClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setEspecialidadRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputMunicipio(BaseModel<?> oldModel) {
		MunicipioClp newModel = new MunicipioClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setMunicipioRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRelacionTrabajadorDespacho(
		BaseModel<?> oldModel) {
		RelacionTrabajadorDespachoClp newModel = new RelacionTrabajadorDespachoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRelacionTrabajadorDespachoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputRelacionUsuarioConsejo(
		BaseModel<?> oldModel) {
		RelacionUsuarioConsejoClp newModel = new RelacionUsuarioConsejoClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setRelacionUsuarioConsejoRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputTrabajador(BaseModel<?> oldModel) {
		TrabajadorClp newModel = new TrabajadorClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.setTrabajadorRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}