package managedbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User implements Serializable {  


	 private static final long serialVersionUID = 1L;

	 private String name;
	 private String password;

	

	 public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
// bu sekılde fonk. olusturup dırek sayfayada yonlendırebılırız.

//	public String gonder() {
//	  return ("sayfa1?faces-redirect=true");
//	 }
//	<h:commandButton value="giris yap" action="#{personel.gonder}" />
}  