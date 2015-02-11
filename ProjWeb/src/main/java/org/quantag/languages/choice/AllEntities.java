package org.quantag.languages.choice;

import java.util.Iterator;
import java.util.List;

import javax.naming.InitialContext;

import org.quantag.entitiesbean.de.DEFacadeLocal;
import org.quantag.entitiesbean.en.ENFacadeLocal;
import org.quantag.entitiesbean.es.ESFacadeLocal;
import org.quantag.entitiesbean.fr.FRFacadeLocal;
import org.quantag.entitiesbean.zn.ZNFacadeLocal;
import org.quantag.entity.EntityDE;
import org.quantag.entity.EntityEN;
import org.quantag.entity.EntityES;
import org.quantag.entity.EntityFR;
import org.quantag.entity.EntityZN;

/**
 * All locale from db.
 *
 */
public class AllEntities {

	private Object[][] all;
	private InitialContext ic;
	private DEFacadeLocal deFacade;
	private ENFacadeLocal enFacade;
	private ESFacadeLocal esFacade;
	private FRFacadeLocal frFacade;
	private ZNFacadeLocal znFacade;
	

	public Object[][] localeDE() {
		try {
			ic = new InitialContext();
			deFacade = (DEFacadeLocal) ic
					.lookup("java:global/ProjectEar/ProjectEjb-0.0.1-SNAPSHOT/DEFacade!org.quantag.entitiesbean.de.DEFacade");
			List<EntityDE> listLocale = deFacade.findAll();
			all = new Object[listLocale.size()][2];
			int i = 0;
			for (Iterator<EntityDE> it = listLocale.iterator(); it.hasNext();) {
				EntityDE resource = it.next();
				all[i] = new Object[] { resource.getKey(), resource.getValue() };
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}
	
	public Object[][] localeEN() {
		try {
			ic = new InitialContext();
			enFacade = (ENFacadeLocal) ic
					.lookup("java:global/ProjectEar/ProjectEjb-0.0.1-SNAPSHOT/ENFacade!org.quantag.entitiesbean.en.ENFacade");
			List<EntityEN> listLocale = enFacade.findAll();
			all = new Object[listLocale.size()][2];
			int i = 0;
			for (Iterator<EntityEN> it = listLocale.iterator(); it.hasNext();) {
				EntityEN resource = it.next();
				all[i] = new Object[] { resource.getKey(), resource.getValue() };
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}
	
	public Object[][] localeFR() {
		try {
			ic = new InitialContext();
			frFacade = (FRFacadeLocal) ic
					.lookup("java:global/ProjectEar/ProjectEjb-0.0.1-SNAPSHOT/FRFacade!org.quantag.entitiesbean.fr.FRFacade");
			List<EntityFR> listLocale = frFacade.findAll();
			all = new Object[listLocale.size()][2];
			int i = 0;
			for (Iterator<EntityFR> it = listLocale.iterator(); it.hasNext();) {
				EntityFR resource = it.next();
				all[i] = new Object[] { resource.getKey(), resource.getValue() };
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}
	
	public Object[][] localeZN() {
		try {
			ic = new InitialContext();
			znFacade = (ZNFacadeLocal) ic
					.lookup("java:global/ProjectEar/ProjectEjb-0.0.1-SNAPSHOT/ZNFacade!org.quantag.entitiesbean.zn.ZNFacade");
			List<EntityZN> listLocale = znFacade.findAll();
			all = new Object[listLocale.size()][2];
			int i = 0;
			for (Iterator<EntityZN> it = listLocale.iterator(); it.hasNext();) {
				EntityZN resource = it.next();
				all[i] = new Object[] { resource.getKey(), resource.getValue() };
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}
	
	public Object[][] localeES() {
		try {
			ic = new InitialContext();
			esFacade = (ESFacadeLocal) ic 
					.lookup("java:global/ProjectEar/ProjectEjb-0.0.1-SNAPSHOT/ESFacade!org.quantag.entitiesbean.es.ESFacade");
			List<EntityES> listLocale = esFacade.findAll();
			all = new Object[listLocale.size()][2];
			int i = 0;
			for (Iterator<EntityES> it = listLocale.iterator(); it.hasNext();) {
				EntityES resource = it.next();
				all[i] = new Object[] { resource.getKey(), resource.getValue() };
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return all;
	}

}
