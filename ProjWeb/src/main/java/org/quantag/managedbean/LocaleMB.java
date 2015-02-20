package org.quantag.managedbean;

import java.io.Serializable;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import org.apache.log4j.BasicConfigurator;

/**
 * Locale managed bean.
 *
 */
@ManagedBean
@SessionScoped
public class LocaleMB implements Serializable {

	private static final long serialVersionUID = 1L;
	private Locale locale;
	private String language;

	@PostConstruct
	private void init() {
		UIViewRoot viewRoot = new UIViewRoot();
		locale = viewRoot.getLocale();

	}

	public Locale getLocale() {
		return locale;
	}

	public void changeLanguage(String language) {
		locale = new Locale(language);
		BasicConfigurator.configure();
		FacesContext.getCurrentInstance().getViewRoot()
				.setLocale(new Locale("en_GB"));
	}

	public String getLanguage() {
		return locale.getLanguage();
	}

	public void setLanguage(String language) {
		changeLanguage(language);
	}
	
	
}

