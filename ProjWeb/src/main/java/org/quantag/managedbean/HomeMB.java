package org.quantag.managedbean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Managed bean.
 *
 */
@SessionScoped
@ManagedBean
public class HomeMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@PostConstruct
	private void init() {

	}
}
