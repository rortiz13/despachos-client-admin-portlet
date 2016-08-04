package la.netco.despachos_judiciales.business.bean;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;

import la.netco.despachos_judiciales.entities.model.RelacionUsuarioConsejo;
import la.netco.despachos_judiciales.entities.service.RelacionUsuarioConsejoLocalServiceUtil;
import la.netco.despachos_judiciales.entities.service.persistence.RelacionUsuarioConsejoUtil;
import la.netco.despachos_judiciales.utilitys.ConstantsUtility;
import la.netco.despachos_judiciales.utilitys.LiferayUtiliy;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

@ManagedBean(name = "adminMenu")
@ViewScoped
public class AdminMenu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Log _log = LogFactoryUtil.getLog(AdminMenu.class);

	private Boolean allMenu = false;
	private Boolean userMenu = false;
	

	public AdminMenu() {

	}

	public void preRenderMenu() {
		try {
			
			String userPortal = LiferayUtiliy.getUserPortal();
			if(LiferayUtiliy.containsRol("Administrator")){
				allMenu = true;
				userMenu= false;
			}else{
				RelacionUsuarioConsejo rel = RelacionUsuarioConsejoLocalServiceUtil.findByUsuario(userPortal);
				LiferayUtiliy.setSessionObject(ConstantsUtility.SESSION_ID_CONSEJO, rel.getIdConsejoSec());
				if(rel.getIdConsejoSec() != 0){
					userMenu= true;
					allMenu = false;
				}
			}
		} catch (PortalException e) {
			_log.error("Method error " , e);
		} catch (SystemException e) {
			_log.error("Method error " , e);
		}

	}

	public Boolean getUserMenu() {
		return userMenu;
	}

	public Boolean getAllMenu() {
		return allMenu;
	}

	public void setAllMenu(Boolean allMenu) {
		this.allMenu = allMenu;
	}

	public void setUserMenu(Boolean userMenu) {
		this.userMenu = userMenu;
	}
	

}
