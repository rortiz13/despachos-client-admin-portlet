package la.netco.despachos_judiciales.utilitys;

import javax.faces.FacesWrapper;

import la.netco.despachos_judiciales.entities.model.ConsejoSeccional;
import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;

public class RelacionUsuarioConsejoWrapper extends la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejoWrapper implements FacesWrapper<RelacionUsuarioConsejo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private RelacionUsuarioConsejo relacionUsuarioConsejoWrapped;
	private ConsejoSeccional consejoSeccional;
	
	
	public RelacionUsuarioConsejoWrapper(RelacionUsuarioConsejo relacionUsuarioConsejo) {
		super(relacionUsuarioConsejo);
	}


	@Override
	public RelacionUsuarioConsejo getWrapped() {
		return relacionUsuarioConsejoWrapped;
	}


	public RelacionUsuarioConsejo getRelacionUsuarioConsejoWrapped() {
		return relacionUsuarioConsejoWrapped;
	}


	public void setRelacionUsuarioConsejoWrapped(RelacionUsuarioConsejo relacionUsuarioConsejoWrapped) {
		this.relacionUsuarioConsejoWrapped = relacionUsuarioConsejoWrapped;
	}


	public ConsejoSeccional getConsejoSeccional() {
		return consejoSeccional;
	}

	public void setConsejoSeccional(ConsejoSeccional consejoSeccional) {
		this.consejoSeccional = consejoSeccional;
	}

}
