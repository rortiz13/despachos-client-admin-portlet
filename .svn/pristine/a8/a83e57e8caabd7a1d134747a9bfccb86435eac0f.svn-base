package la.netco.despachos_judiciales.publico.business.bean.utilitys;

import java.util.Date;

import javax.faces.FacesWrapper;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.Departamento;
import la.netco.despachos_judiciales.entities.model.Despacho;
import la.netco.despachos_judiciales.entities.model.Distrito;
import la.netco.despachos_judiciales.entities.model.Entidad;
import la.netco.despachos_judiciales.entities.model.Especialidad;
import la.netco.despachos_judiciales.entities.model.Municipio;
import la.netco.despachos_judiciales.entities.model.Trabajador;

public class DespachoWrapper extends la.netco.despachos_judiciales.entities.model.DespachoWrapper implements FacesWrapper<Despacho> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Municipio municipio;
	private Entidad entidad;
	private Especialidad especialiadad;
	private Circuito circuito;
	private Distrito distrito;
	private Trabajador trabajador;
	private Departamento departamento;

	private Despacho wrappedDespacho;

	public DespachoWrapper(Despacho wrappedDespacho, Municipio municipio, Departamento departamento, Entidad entidad, Especialidad especialiadad, Circuito circuito,
			Distrito distrito,Trabajador trabajador) {
		super(wrappedDespacho);
		this.wrappedDespacho = wrappedDespacho;
		this.municipio = municipio;
		this.entidad = entidad;
		this.especialiadad = especialiadad;
		this.circuito = circuito;
		this.distrito = distrito;
		this.trabajador = trabajador;
		this.departamento = departamento;
		
	}

	@Override
	public Despacho getWrapped() {
		return wrappedDespacho;
	}

	@Override
	public String getCodigo() {
		return getWrapped().getCodigo();
	}

	@Override
	public String getAcuerdo() {
		return super.getAcuerdo();
	}

	@Override
	public String getConsecutivo() {
		return getWrapped().getConsecutivo();
	}

	@Override
	public String getCorreo_electronico() {
		return getWrapped().getCorreo_electronico();
	}
	
	@Override
	public String getDireccion() {
		return getWrapped().getDireccion();
	}

	@Override
	public long getEstado() {
		return getWrapped().getEstado();
	}

	@Override
	public String getFax() {
		return getWrapped().getFax();
	}

	@Override
	public Date getFecha_act() {
		return getWrapped().getFecha_act();
	}

	@Override
	public String getHorario_atencion() {
		return getWrapped().getHorario_atencion();
	}

	@Override
	public int getIdDepartamento() {
		return getWrapped().getIdDepartamento();
	}

	@Override
	public int getIdEntidad() {
		return getWrapped().getIdEntidad();
	}

	@Override
	public int getIdEspecialidad() {
		return getWrapped().getIdEspecialidad();
	}

	@Override
	public int getIdMunicipio() {
		return getWrapped().getIdMunicipio();
	};
	

	@Override
	public String getNombre() {
		return getWrapped().getNombre();
	}


	@Override
	public String getTelefonos() {
		return getWrapped().getTelefonos();
	}

	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public Especialidad getEspecialiadad() {
		return especialiadad;
	}

	public void setEspecialiadad(Especialidad especialiadad) {
		this.especialiadad = especialiadad;
	}

	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Despacho getWrappedDespacho() {
		return wrappedDespacho;
	}

	public void setWrappedDespacho(Despacho wrappedDespacho) {
		this.wrappedDespacho = wrappedDespacho;
	}

	public Municipio getMunicipio() {
		return municipio;
	}
	
	

}