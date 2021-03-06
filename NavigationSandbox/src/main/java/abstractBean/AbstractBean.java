package abstractBean;

import java.io.Serializable;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

public abstract class AbstractBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
	        .getRequest();
	
	private String customer = request.getParameter("customer");

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	

}
