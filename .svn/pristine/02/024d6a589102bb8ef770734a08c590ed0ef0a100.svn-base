package la.netco.despachos_judiciales.utilitys;

import javax.faces.FacesWrapper;

import la.netco.despachos_judiciales.entities.model.Circuito;
import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.Municipio;

public class MunicipioWrapper extends la.netco.despachos_judiciales.entities.model.MunicipioWrapper implements FacesWrapper<Municipio>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Circuito circuito;
	private Circuito circuitoAdm;
	private Circuito circuitoDisc;
	private ConsejoSeccional consejoSeccional;
	private Municipio municipioWrapper;


	public MunicipioWrapper(Municipio municipio) {
		super(municipio);
		this.municipioWrapper = municipio;
	}
	
	
	
	public MunicipioWrapper(Municipio municipio, Circuito circuito, Circuito circuitoAdm, Circuito circuitoDisc, ConsejoSeccional consejoSeccional) {
		super(municipio);
		this.circuito = circuito;
		this.circuitoAdm = circuitoAdm;
		this.circuitoDisc = circuitoDisc;
		this.consejoSeccional = consejoSeccional;
		this.municipioWrapper = municipio;
	}



	@Override
	public Municipio getWrapped() {
		return municipioWrapper;
	}

	@Override
	public int getCodigo() {
		return super.getCodigo();
	}
	
	public Circuito getCircuito() {
		return circuito;
	}

	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}

	public Circuito getCircuitoAdm() {
		return circuitoAdm;
	}

	public void setCircuitoAdm(Circuito circuitoAdm) {
		this.circuitoAdm = circuitoAdm;
	}

	public Circuito getCircuitoDisc() {
		return circuitoDisc;
	}

	public void setCircuitoDisc(Circuito circuitoDisc) {
		this.circuitoDisc = circuitoDisc;
	}

	public ConsejoSeccional getConsejoSeccional() {
		return consejoSeccional;
	}

	public void setConsejoSeccional(ConsejoSeccional consejoSeccional) {
		this.consejoSeccional = consejoSeccional;
	}
	
	

}
