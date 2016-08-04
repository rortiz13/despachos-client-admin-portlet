package la.netco.despachos_judiciales.utilitys;

import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.swing.text.StyledEditorKit.BoldAction;

import la.netco.despachos_judiciales.business.bean.AdminMenu;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;

public class LiferayUtiliy {

	private static Log _log = LogFactoryUtil.getLog(LiferayUtiliy.class);
	
	public static String getUserPortal() throws PortalException, SystemException{
		User user = (User)((PortletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getAttribute(WebKeys.USER);
		String usuario = user.getLogin();
		return usuario.split("@")[0];
	}
	
	public static Long getUserIdPortal(){
		User user = (User)((PortletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getAttribute(WebKeys.USER);
		return user.getUserId();
	}
	
	public static Boolean containsRol(String nameRol) throws SystemException{
		User user = (User)((PortletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getAttribute(WebKeys.USER);
		for (Role rol : user.getRoles()) {
			if(rol.getName().equals(nameRol))
					return true;
		}
		return false;
	}
	
	public static Object getSessionObject(String key){
		PortletRequest request = (PortletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		return request.getPortletSession().getAttribute(key,PortletSession.PORTLET_SCOPE);
	}
	
	public static void setSessionObject(String key,Object obj){
		PortletRequest request = (PortletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		request.getPortletSession().setAttribute(key, obj);
	}
	
}
