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

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.service.CircuitoLocalService;
import la.netco.despachos_judiciales.entities.service.ConsejoSeccionalLocalService;
import la.netco.despachos_judiciales.entities.service.DepartamentoLocalService;
import la.netco.despachos_judiciales.entities.service.DespachoLocalService;
import la.netco.despachos_judiciales.entities.service.DistritoLocalService;
import la.netco.despachos_judiciales.entities.service.EntidadLocalService;
import la.netco.despachos_judiciales.entities.service.EspecialidadLocalService;
import la.netco.despachos_judiciales.entities.service.MunicipioLocalService;
import la.netco.despachos_judiciales.entities.service.RelacionTrabajadorDespachoLocalService;
import la.netco.despachos_judiciales.entities.service.RelacionUsuarioConsejoLocalService;
import la.netco.despachos_judiciales.entities.service.TrabajadorLocalService;
import la.netco.despachos_judiciales.entities.service.persistence.CircuitoFinder;
import la.netco.despachos_judiciales.entities.service.persistence.CircuitoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.ConsejoSeccionalFinder;
import la.netco.despachos_judiciales.entities.service.persistence.ConsejoSeccionalPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.DepartamentoFinder;
import la.netco.despachos_judiciales.entities.service.persistence.DepartamentoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.DespachoFinder;
import la.netco.despachos_judiciales.entities.service.persistence.DespachoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.DistritoFinder;
import la.netco.despachos_judiciales.entities.service.persistence.DistritoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.EntidadFinder;
import la.netco.despachos_judiciales.entities.service.persistence.EntidadPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.EspecialidadFinder;
import la.netco.despachos_judiciales.entities.service.persistence.EspecialidadPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioFinder;
import la.netco.despachos_judiciales.entities.service.persistence.MunicipioPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoFinder;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionTrabajadorDespachoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionUsuarioConsejoFinder;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionUsuarioConsejoPersistence;
import la.netco.despachos_judiciales.entities.service.persistence.TrabajadorFinder;
import la.netco.despachos_judiciales.entities.service.persistence.TrabajadorPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the despacho local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link la.netco.despachos_judiciales.entities.service.impl.DespachoLocalServiceImpl}.
 * </p>
 *
 * @author mariza
 * @see la.netco.despachos_judiciales.entities.service.impl.DespachoLocalServiceImpl
 * @see la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil
 * @generated
 */
public abstract class DespachoLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements DespachoLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link la.netco.despachos_judiciales.entities.service.DespachoLocalServiceUtil} to access the despacho local service.
	 */

	/**
	 * Adds the despacho to the database. Also notifies the appropriate model listeners.
	 *
	 * @param despacho the despacho
	 * @return the despacho that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Despacho addDespacho(Despacho despacho) throws SystemException {
		despacho.setNew(true);

		return despachoPersistence.update(despacho, false);
	}

	/**
	 * Creates a new despacho with the primary key. Does not add the despacho to the database.
	 *
	 * @param codigo the primary key for the new despacho
	 * @return the new despacho
	 */
	public Despacho createDespacho(String codigo) {
		return despachoPersistence.create(codigo);
	}

	/**
	 * Deletes the despacho with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param codigo the primary key of the despacho
	 * @return the despacho that was removed
	 * @throws PortalException if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Despacho deleteDespacho(String codigo)
		throws PortalException, SystemException {
		return despachoPersistence.remove(codigo);
	}

	/**
	 * Deletes the despacho from the database. Also notifies the appropriate model listeners.
	 *
	 * @param despacho the despacho
	 * @return the despacho that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Despacho deleteDespacho(Despacho despacho) throws SystemException {
		return despachoPersistence.remove(despacho);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Despacho.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return despachoPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return despachoPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return despachoPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return despachoPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Despacho fetchDespacho(String codigo) throws SystemException {
		return despachoPersistence.fetchByPrimaryKey(codigo);
	}

	/**
	 * Returns the despacho with the primary key.
	 *
	 * @param codigo the primary key of the despacho
	 * @return the despacho
	 * @throws PortalException if a despacho with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Despacho getDespacho(String codigo)
		throws PortalException, SystemException {
		return despachoPersistence.findByPrimaryKey(codigo);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return despachoPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the despachos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of despachos
	 * @param end the upper bound of the range of despachos (not inclusive)
	 * @return the range of despachos
	 * @throws SystemException if a system exception occurred
	 */
	public List<Despacho> getDespachos(int start, int end)
		throws SystemException {
		return despachoPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of despachos.
	 *
	 * @return the number of despachos
	 * @throws SystemException if a system exception occurred
	 */
	public int getDespachosCount() throws SystemException {
		return despachoPersistence.countAll();
	}

	/**
	 * Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param despacho the despacho
	 * @return the despacho that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Despacho updateDespacho(Despacho despacho) throws SystemException {
		return updateDespacho(despacho, true);
	}

	/**
	 * Updates the despacho in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param despacho the despacho
	 * @param merge whether to merge the despacho with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the despacho that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Despacho updateDespacho(Despacho despacho, boolean merge)
		throws SystemException {
		despacho.setNew(false);

		return despachoPersistence.update(despacho, merge);
	}

	/**
	 * Returns the circuito local service.
	 *
	 * @return the circuito local service
	 */
	public CircuitoLocalService getCircuitoLocalService() {
		return circuitoLocalService;
	}

	/**
	 * Sets the circuito local service.
	 *
	 * @param circuitoLocalService the circuito local service
	 */
	public void setCircuitoLocalService(
		CircuitoLocalService circuitoLocalService) {
		this.circuitoLocalService = circuitoLocalService;
	}

	/**
	 * Returns the circuito persistence.
	 *
	 * @return the circuito persistence
	 */
	public CircuitoPersistence getCircuitoPersistence() {
		return circuitoPersistence;
	}

	/**
	 * Sets the circuito persistence.
	 *
	 * @param circuitoPersistence the circuito persistence
	 */
	public void setCircuitoPersistence(CircuitoPersistence circuitoPersistence) {
		this.circuitoPersistence = circuitoPersistence;
	}

	/**
	 * Returns the circuito finder.
	 *
	 * @return the circuito finder
	 */
	public CircuitoFinder getCircuitoFinder() {
		return circuitoFinder;
	}

	/**
	 * Sets the circuito finder.
	 *
	 * @param circuitoFinder the circuito finder
	 */
	public void setCircuitoFinder(CircuitoFinder circuitoFinder) {
		this.circuitoFinder = circuitoFinder;
	}

	/**
	 * Returns the consejo seccional local service.
	 *
	 * @return the consejo seccional local service
	 */
	public ConsejoSeccionalLocalService getConsejoSeccionalLocalService() {
		return consejoSeccionalLocalService;
	}

	/**
	 * Sets the consejo seccional local service.
	 *
	 * @param consejoSeccionalLocalService the consejo seccional local service
	 */
	public void setConsejoSeccionalLocalService(
		ConsejoSeccionalLocalService consejoSeccionalLocalService) {
		this.consejoSeccionalLocalService = consejoSeccionalLocalService;
	}

	/**
	 * Returns the consejo seccional persistence.
	 *
	 * @return the consejo seccional persistence
	 */
	public ConsejoSeccionalPersistence getConsejoSeccionalPersistence() {
		return consejoSeccionalPersistence;
	}

	/**
	 * Sets the consejo seccional persistence.
	 *
	 * @param consejoSeccionalPersistence the consejo seccional persistence
	 */
	public void setConsejoSeccionalPersistence(
		ConsejoSeccionalPersistence consejoSeccionalPersistence) {
		this.consejoSeccionalPersistence = consejoSeccionalPersistence;
	}

	/**
	 * Returns the consejo seccional finder.
	 *
	 * @return the consejo seccional finder
	 */
	public ConsejoSeccionalFinder getConsejoSeccionalFinder() {
		return consejoSeccionalFinder;
	}

	/**
	 * Sets the consejo seccional finder.
	 *
	 * @param consejoSeccionalFinder the consejo seccional finder
	 */
	public void setConsejoSeccionalFinder(
		ConsejoSeccionalFinder consejoSeccionalFinder) {
		this.consejoSeccionalFinder = consejoSeccionalFinder;
	}

	/**
	 * Returns the departamento local service.
	 *
	 * @return the departamento local service
	 */
	public DepartamentoLocalService getDepartamentoLocalService() {
		return departamentoLocalService;
	}

	/**
	 * Sets the departamento local service.
	 *
	 * @param departamentoLocalService the departamento local service
	 */
	public void setDepartamentoLocalService(
		DepartamentoLocalService departamentoLocalService) {
		this.departamentoLocalService = departamentoLocalService;
	}

	/**
	 * Returns the departamento persistence.
	 *
	 * @return the departamento persistence
	 */
	public DepartamentoPersistence getDepartamentoPersistence() {
		return departamentoPersistence;
	}

	/**
	 * Sets the departamento persistence.
	 *
	 * @param departamentoPersistence the departamento persistence
	 */
	public void setDepartamentoPersistence(
		DepartamentoPersistence departamentoPersistence) {
		this.departamentoPersistence = departamentoPersistence;
	}

	/**
	 * Returns the departamento finder.
	 *
	 * @return the departamento finder
	 */
	public DepartamentoFinder getDepartamentoFinder() {
		return departamentoFinder;
	}

	/**
	 * Sets the departamento finder.
	 *
	 * @param departamentoFinder the departamento finder
	 */
	public void setDepartamentoFinder(DepartamentoFinder departamentoFinder) {
		this.departamentoFinder = departamentoFinder;
	}

	/**
	 * Returns the despacho local service.
	 *
	 * @return the despacho local service
	 */
	public DespachoLocalService getDespachoLocalService() {
		return despachoLocalService;
	}

	/**
	 * Sets the despacho local service.
	 *
	 * @param despachoLocalService the despacho local service
	 */
	public void setDespachoLocalService(
		DespachoLocalService despachoLocalService) {
		this.despachoLocalService = despachoLocalService;
	}

	/**
	 * Returns the despacho persistence.
	 *
	 * @return the despacho persistence
	 */
	public DespachoPersistence getDespachoPersistence() {
		return despachoPersistence;
	}

	/**
	 * Sets the despacho persistence.
	 *
	 * @param despachoPersistence the despacho persistence
	 */
	public void setDespachoPersistence(DespachoPersistence despachoPersistence) {
		this.despachoPersistence = despachoPersistence;
	}

	/**
	 * Returns the despacho finder.
	 *
	 * @return the despacho finder
	 */
	public DespachoFinder getDespachoFinder() {
		return despachoFinder;
	}

	/**
	 * Sets the despacho finder.
	 *
	 * @param despachoFinder the despacho finder
	 */
	public void setDespachoFinder(DespachoFinder despachoFinder) {
		this.despachoFinder = despachoFinder;
	}

	/**
	 * Returns the distrito local service.
	 *
	 * @return the distrito local service
	 */
	public DistritoLocalService getDistritoLocalService() {
		return distritoLocalService;
	}

	/**
	 * Sets the distrito local service.
	 *
	 * @param distritoLocalService the distrito local service
	 */
	public void setDistritoLocalService(
		DistritoLocalService distritoLocalService) {
		this.distritoLocalService = distritoLocalService;
	}

	/**
	 * Returns the distrito persistence.
	 *
	 * @return the distrito persistence
	 */
	public DistritoPersistence getDistritoPersistence() {
		return distritoPersistence;
	}

	/**
	 * Sets the distrito persistence.
	 *
	 * @param distritoPersistence the distrito persistence
	 */
	public void setDistritoPersistence(DistritoPersistence distritoPersistence) {
		this.distritoPersistence = distritoPersistence;
	}

	/**
	 * Returns the distrito finder.
	 *
	 * @return the distrito finder
	 */
	public DistritoFinder getDistritoFinder() {
		return distritoFinder;
	}

	/**
	 * Sets the distrito finder.
	 *
	 * @param distritoFinder the distrito finder
	 */
	public void setDistritoFinder(DistritoFinder distritoFinder) {
		this.distritoFinder = distritoFinder;
	}

	/**
	 * Returns the entidad local service.
	 *
	 * @return the entidad local service
	 */
	public EntidadLocalService getEntidadLocalService() {
		return entidadLocalService;
	}

	/**
	 * Sets the entidad local service.
	 *
	 * @param entidadLocalService the entidad local service
	 */
	public void setEntidadLocalService(EntidadLocalService entidadLocalService) {
		this.entidadLocalService = entidadLocalService;
	}

	/**
	 * Returns the entidad persistence.
	 *
	 * @return the entidad persistence
	 */
	public EntidadPersistence getEntidadPersistence() {
		return entidadPersistence;
	}

	/**
	 * Sets the entidad persistence.
	 *
	 * @param entidadPersistence the entidad persistence
	 */
	public void setEntidadPersistence(EntidadPersistence entidadPersistence) {
		this.entidadPersistence = entidadPersistence;
	}

	/**
	 * Returns the entidad finder.
	 *
	 * @return the entidad finder
	 */
	public EntidadFinder getEntidadFinder() {
		return entidadFinder;
	}

	/**
	 * Sets the entidad finder.
	 *
	 * @param entidadFinder the entidad finder
	 */
	public void setEntidadFinder(EntidadFinder entidadFinder) {
		this.entidadFinder = entidadFinder;
	}

	/**
	 * Returns the especialidad local service.
	 *
	 * @return the especialidad local service
	 */
	public EspecialidadLocalService getEspecialidadLocalService() {
		return especialidadLocalService;
	}

	/**
	 * Sets the especialidad local service.
	 *
	 * @param especialidadLocalService the especialidad local service
	 */
	public void setEspecialidadLocalService(
		EspecialidadLocalService especialidadLocalService) {
		this.especialidadLocalService = especialidadLocalService;
	}

	/**
	 * Returns the especialidad persistence.
	 *
	 * @return the especialidad persistence
	 */
	public EspecialidadPersistence getEspecialidadPersistence() {
		return especialidadPersistence;
	}

	/**
	 * Sets the especialidad persistence.
	 *
	 * @param especialidadPersistence the especialidad persistence
	 */
	public void setEspecialidadPersistence(
		EspecialidadPersistence especialidadPersistence) {
		this.especialidadPersistence = especialidadPersistence;
	}

	/**
	 * Returns the especialidad finder.
	 *
	 * @return the especialidad finder
	 */
	public EspecialidadFinder getEspecialidadFinder() {
		return especialidadFinder;
	}

	/**
	 * Sets the especialidad finder.
	 *
	 * @param especialidadFinder the especialidad finder
	 */
	public void setEspecialidadFinder(EspecialidadFinder especialidadFinder) {
		this.especialidadFinder = especialidadFinder;
	}

	/**
	 * Returns the municipio local service.
	 *
	 * @return the municipio local service
	 */
	public MunicipioLocalService getMunicipioLocalService() {
		return municipioLocalService;
	}

	/**
	 * Sets the municipio local service.
	 *
	 * @param municipioLocalService the municipio local service
	 */
	public void setMunicipioLocalService(
		MunicipioLocalService municipioLocalService) {
		this.municipioLocalService = municipioLocalService;
	}

	/**
	 * Returns the municipio persistence.
	 *
	 * @return the municipio persistence
	 */
	public MunicipioPersistence getMunicipioPersistence() {
		return municipioPersistence;
	}

	/**
	 * Sets the municipio persistence.
	 *
	 * @param municipioPersistence the municipio persistence
	 */
	public void setMunicipioPersistence(
		MunicipioPersistence municipioPersistence) {
		this.municipioPersistence = municipioPersistence;
	}

	/**
	 * Returns the municipio finder.
	 *
	 * @return the municipio finder
	 */
	public MunicipioFinder getMunicipioFinder() {
		return municipioFinder;
	}

	/**
	 * Sets the municipio finder.
	 *
	 * @param municipioFinder the municipio finder
	 */
	public void setMunicipioFinder(MunicipioFinder municipioFinder) {
		this.municipioFinder = municipioFinder;
	}

	/**
	 * Returns the relacion trabajador despacho local service.
	 *
	 * @return the relacion trabajador despacho local service
	 */
	public RelacionTrabajadorDespachoLocalService getRelacionTrabajadorDespachoLocalService() {
		return relacionTrabajadorDespachoLocalService;
	}

	/**
	 * Sets the relacion trabajador despacho local service.
	 *
	 * @param relacionTrabajadorDespachoLocalService the relacion trabajador despacho local service
	 */
	public void setRelacionTrabajadorDespachoLocalService(
		RelacionTrabajadorDespachoLocalService relacionTrabajadorDespachoLocalService) {
		this.relacionTrabajadorDespachoLocalService = relacionTrabajadorDespachoLocalService;
	}

	/**
	 * Returns the relacion trabajador despacho persistence.
	 *
	 * @return the relacion trabajador despacho persistence
	 */
	public RelacionTrabajadorDespachoPersistence getRelacionTrabajadorDespachoPersistence() {
		return relacionTrabajadorDespachoPersistence;
	}

	/**
	 * Sets the relacion trabajador despacho persistence.
	 *
	 * @param relacionTrabajadorDespachoPersistence the relacion trabajador despacho persistence
	 */
	public void setRelacionTrabajadorDespachoPersistence(
		RelacionTrabajadorDespachoPersistence relacionTrabajadorDespachoPersistence) {
		this.relacionTrabajadorDespachoPersistence = relacionTrabajadorDespachoPersistence;
	}

	/**
	 * Returns the relacion trabajador despacho finder.
	 *
	 * @return the relacion trabajador despacho finder
	 */
	public RelacionTrabajadorDespachoFinder getRelacionTrabajadorDespachoFinder() {
		return relacionTrabajadorDespachoFinder;
	}

	/**
	 * Sets the relacion trabajador despacho finder.
	 *
	 * @param relacionTrabajadorDespachoFinder the relacion trabajador despacho finder
	 */
	public void setRelacionTrabajadorDespachoFinder(
		RelacionTrabajadorDespachoFinder relacionTrabajadorDespachoFinder) {
		this.relacionTrabajadorDespachoFinder = relacionTrabajadorDespachoFinder;
	}

	/**
	 * Returns the relacion usuario consejo local service.
	 *
	 * @return the relacion usuario consejo local service
	 */
	public RelacionUsuarioConsejoLocalService getRelacionUsuarioConsejoLocalService() {
		return relacionUsuarioConsejoLocalService;
	}

	/**
	 * Sets the relacion usuario consejo local service.
	 *
	 * @param relacionUsuarioConsejoLocalService the relacion usuario consejo local service
	 */
	public void setRelacionUsuarioConsejoLocalService(
		RelacionUsuarioConsejoLocalService relacionUsuarioConsejoLocalService) {
		this.relacionUsuarioConsejoLocalService = relacionUsuarioConsejoLocalService;
	}

	/**
	 * Returns the relacion usuario consejo persistence.
	 *
	 * @return the relacion usuario consejo persistence
	 */
	public RelacionUsuarioConsejoPersistence getRelacionUsuarioConsejoPersistence() {
		return relacionUsuarioConsejoPersistence;
	}

	/**
	 * Sets the relacion usuario consejo persistence.
	 *
	 * @param relacionUsuarioConsejoPersistence the relacion usuario consejo persistence
	 */
	public void setRelacionUsuarioConsejoPersistence(
		RelacionUsuarioConsejoPersistence relacionUsuarioConsejoPersistence) {
		this.relacionUsuarioConsejoPersistence = relacionUsuarioConsejoPersistence;
	}

	/**
	 * Returns the relacion usuario consejo finder.
	 *
	 * @return the relacion usuario consejo finder
	 */
	public RelacionUsuarioConsejoFinder getRelacionUsuarioConsejoFinder() {
		return relacionUsuarioConsejoFinder;
	}

	/**
	 * Sets the relacion usuario consejo finder.
	 *
	 * @param relacionUsuarioConsejoFinder the relacion usuario consejo finder
	 */
	public void setRelacionUsuarioConsejoFinder(
		RelacionUsuarioConsejoFinder relacionUsuarioConsejoFinder) {
		this.relacionUsuarioConsejoFinder = relacionUsuarioConsejoFinder;
	}

	/**
	 * Returns the trabajador local service.
	 *
	 * @return the trabajador local service
	 */
	public TrabajadorLocalService getTrabajadorLocalService() {
		return trabajadorLocalService;
	}

	/**
	 * Sets the trabajador local service.
	 *
	 * @param trabajadorLocalService the trabajador local service
	 */
	public void setTrabajadorLocalService(
		TrabajadorLocalService trabajadorLocalService) {
		this.trabajadorLocalService = trabajadorLocalService;
	}

	/**
	 * Returns the trabajador persistence.
	 *
	 * @return the trabajador persistence
	 */
	public TrabajadorPersistence getTrabajadorPersistence() {
		return trabajadorPersistence;
	}

	/**
	 * Sets the trabajador persistence.
	 *
	 * @param trabajadorPersistence the trabajador persistence
	 */
	public void setTrabajadorPersistence(
		TrabajadorPersistence trabajadorPersistence) {
		this.trabajadorPersistence = trabajadorPersistence;
	}

	/**
	 * Returns the trabajador finder.
	 *
	 * @return the trabajador finder
	 */
	public TrabajadorFinder getTrabajadorFinder() {
		return trabajadorFinder;
	}

	/**
	 * Sets the trabajador finder.
	 *
	 * @param trabajadorFinder the trabajador finder
	 */
	public void setTrabajadorFinder(TrabajadorFinder trabajadorFinder) {
		this.trabajadorFinder = trabajadorFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("la.netco.despachos_judiciales.entities.model.Despacho",
			despachoLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"la.netco.despachos_judiciales.entities.model.Despacho");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return Despacho.class;
	}

	protected String getModelClassName() {
		return Despacho.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = despachoPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = CircuitoLocalService.class)
	protected CircuitoLocalService circuitoLocalService;
	@BeanReference(type = CircuitoPersistence.class)
	protected CircuitoPersistence circuitoPersistence;
	@BeanReference(type = CircuitoFinder.class)
	protected CircuitoFinder circuitoFinder;
	@BeanReference(type = ConsejoSeccionalLocalService.class)
	protected ConsejoSeccionalLocalService consejoSeccionalLocalService;
	@BeanReference(type = ConsejoSeccionalPersistence.class)
	protected ConsejoSeccionalPersistence consejoSeccionalPersistence;
	@BeanReference(type = ConsejoSeccionalFinder.class)
	protected ConsejoSeccionalFinder consejoSeccionalFinder;
	@BeanReference(type = DepartamentoLocalService.class)
	protected DepartamentoLocalService departamentoLocalService;
	@BeanReference(type = DepartamentoPersistence.class)
	protected DepartamentoPersistence departamentoPersistence;
	@BeanReference(type = DepartamentoFinder.class)
	protected DepartamentoFinder departamentoFinder;
	@BeanReference(type = DespachoLocalService.class)
	protected DespachoLocalService despachoLocalService;
	@BeanReference(type = DespachoPersistence.class)
	protected DespachoPersistence despachoPersistence;
	@BeanReference(type = DespachoFinder.class)
	protected DespachoFinder despachoFinder;
	@BeanReference(type = DistritoLocalService.class)
	protected DistritoLocalService distritoLocalService;
	@BeanReference(type = DistritoPersistence.class)
	protected DistritoPersistence distritoPersistence;
	@BeanReference(type = DistritoFinder.class)
	protected DistritoFinder distritoFinder;
	@BeanReference(type = EntidadLocalService.class)
	protected EntidadLocalService entidadLocalService;
	@BeanReference(type = EntidadPersistence.class)
	protected EntidadPersistence entidadPersistence;
	@BeanReference(type = EntidadFinder.class)
	protected EntidadFinder entidadFinder;
	@BeanReference(type = EspecialidadLocalService.class)
	protected EspecialidadLocalService especialidadLocalService;
	@BeanReference(type = EspecialidadPersistence.class)
	protected EspecialidadPersistence especialidadPersistence;
	@BeanReference(type = EspecialidadFinder.class)
	protected EspecialidadFinder especialidadFinder;
	@BeanReference(type = MunicipioLocalService.class)
	protected MunicipioLocalService municipioLocalService;
	@BeanReference(type = MunicipioPersistence.class)
	protected MunicipioPersistence municipioPersistence;
	@BeanReference(type = MunicipioFinder.class)
	protected MunicipioFinder municipioFinder;
	@BeanReference(type = RelacionTrabajadorDespachoLocalService.class)
	protected RelacionTrabajadorDespachoLocalService relacionTrabajadorDespachoLocalService;
	@BeanReference(type = RelacionTrabajadorDespachoPersistence.class)
	protected RelacionTrabajadorDespachoPersistence relacionTrabajadorDespachoPersistence;
	@BeanReference(type = RelacionTrabajadorDespachoFinder.class)
	protected RelacionTrabajadorDespachoFinder relacionTrabajadorDespachoFinder;
	@BeanReference(type = RelacionUsuarioConsejoLocalService.class)
	protected RelacionUsuarioConsejoLocalService relacionUsuarioConsejoLocalService;
	@BeanReference(type = RelacionUsuarioConsejoPersistence.class)
	protected RelacionUsuarioConsejoPersistence relacionUsuarioConsejoPersistence;
	@BeanReference(type = RelacionUsuarioConsejoFinder.class)
	protected RelacionUsuarioConsejoFinder relacionUsuarioConsejoFinder;
	@BeanReference(type = TrabajadorLocalService.class)
	protected TrabajadorLocalService trabajadorLocalService;
	@BeanReference(type = TrabajadorPersistence.class)
	protected TrabajadorPersistence trabajadorPersistence;
	@BeanReference(type = TrabajadorFinder.class)
	protected TrabajadorFinder trabajadorFinder;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private DespachoLocalServiceClpInvoker _clpInvoker = new DespachoLocalServiceClpInvoker();
}