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

package la.netco.despachos_judiciales.entities.service.base;

import la.netco.despachos_judiciales.entities.service.MunicipioLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class MunicipioLocalServiceClpInvoker {
	public MunicipioLocalServiceClpInvoker() {
		_methodName0 = "addMunicipio";

		_methodParameterTypes0 = new String[] {
				"la.netco.despachos_judiciales.entities.model.Municipio"
			};

		_methodName1 = "createMunicipio";

		_methodParameterTypes1 = new String[] {
				"la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK"
			};

		_methodName2 = "deleteMunicipio";

		_methodParameterTypes2 = new String[] {
				"la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK"
			};

		_methodName3 = "deleteMunicipio";

		_methodParameterTypes3 = new String[] {
				"la.netco.despachos_judiciales.entities.model.Municipio"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchMunicipio";

		_methodParameterTypes9 = new String[] {
				"la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK"
			};

		_methodName10 = "getMunicipio";

		_methodParameterTypes10 = new String[] {
				"la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK"
			};

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getMunicipios";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getMunicipiosCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateMunicipio";

		_methodParameterTypes14 = new String[] {
				"la.netco.despachos_judiciales.entities.model.Municipio"
			};

		_methodName15 = "updateMunicipio";

		_methodParameterTypes15 = new String[] {
				"la.netco.despachos_judiciales.entities.model.Municipio",
				"boolean"
			};

		_methodName98 = "getBeanIdentifier";

		_methodParameterTypes98 = new String[] {  };

		_methodName99 = "setBeanIdentifier";

		_methodParameterTypes99 = new String[] { "java.lang.String" };

		_methodName104 = "findByEstadoDescpacho";

		_methodParameterTypes104 = new String[] { "java.lang.Integer" };

		_methodName105 = "findByCompositeKey";

		_methodParameterTypes105 = new String[] {
				"java.lang.Integer", "java.lang.Integer"
			};

		_methodName106 = "findByFields";

		_methodParameterTypes106 = new String[] {
				"java.lang.Integer", "java.lang.Integer", "java.lang.String",
				"java.lang.String", "java.lang.Integer", "java.lang.Integer",
				"java.lang.Integer", "java.lang.Integer", "int", "int"
			};

		_methodName107 = "countByFields";

		_methodParameterTypes107 = new String[] {
				"java.lang.Integer", "java.lang.Integer", "java.lang.String",
				"java.lang.String", "java.lang.Integer", "java.lang.Integer",
				"java.lang.Integer", "java.lang.Integer"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return MunicipioLocalServiceUtil.addMunicipio((la.netco.despachos_judiciales.entities.model.Municipio)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return MunicipioLocalServiceUtil.createMunicipio((la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK)arguments[0]);
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return MunicipioLocalServiceUtil.deleteMunicipio((la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK)arguments[0]);
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return MunicipioLocalServiceUtil.deleteMunicipio((la.netco.despachos_judiciales.entities.model.Municipio)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return MunicipioLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return MunicipioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return MunicipioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return MunicipioLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return MunicipioLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return MunicipioLocalServiceUtil.fetchMunicipio((la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK)arguments[0]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return MunicipioLocalServiceUtil.getMunicipio((la.netco.despachos_judiciales.entities.service.persistence.MunicipioPK)arguments[0]);
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return MunicipioLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return MunicipioLocalServiceUtil.getMunicipios(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return MunicipioLocalServiceUtil.getMunicipiosCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return MunicipioLocalServiceUtil.updateMunicipio((la.netco.despachos_judiciales.entities.model.Municipio)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return MunicipioLocalServiceUtil.updateMunicipio((la.netco.despachos_judiciales.entities.model.Municipio)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName98.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
			return MunicipioLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName99.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
			MunicipioLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName104.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
			return MunicipioLocalServiceUtil.findByEstadoDescpacho((java.lang.Integer)arguments[0]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return MunicipioLocalServiceUtil.findByCompositeKey((java.lang.Integer)arguments[0],
				(java.lang.Integer)arguments[1]);
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			return MunicipioLocalServiceUtil.findByFields((java.lang.Integer)arguments[0],
				(java.lang.Integer)arguments[1],
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.Integer)arguments[4],
				(java.lang.Integer)arguments[5],
				(java.lang.Integer)arguments[6],
				(java.lang.Integer)arguments[7],
				((Integer)arguments[8]).intValue(),
				((Integer)arguments[9]).intValue());
		}

		if (_methodName107.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
			return MunicipioLocalServiceUtil.countByFields((java.lang.Integer)arguments[0],
				(java.lang.Integer)arguments[1],
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				(java.lang.Integer)arguments[4],
				(java.lang.Integer)arguments[5],
				(java.lang.Integer)arguments[6], (java.lang.Integer)arguments[7]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName98;
	private String[] _methodParameterTypes98;
	private String _methodName99;
	private String[] _methodParameterTypes99;
	private String _methodName104;
	private String[] _methodParameterTypes104;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName107;
	private String[] _methodParameterTypes107;
}