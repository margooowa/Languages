package org.quantag.languages;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

import org.quantag.languages.choice.AllEntities;

/**
 * Get data from database.
 * 
 */
public class DBControl extends Control {

	// private Logger logger = LoggerFactory.getLogger(DBControl.class);

	@Override
	public List<String> getFormats(String baseName) {
		if (baseName == null) {
			throw new NullPointerException();
		}
		return Arrays.asList("db");
	}

	@Override
	public ResourceBundle newBundle(String baseName, Locale locale,	String format, ClassLoader loader, boolean reload)
			throws IllegalAccessException, InstantiationException, IOException {
		if ((baseName == null) || (locale == null) || (format == null)	|| (loader == null)) {
			throw new NullPointerException();
		}
		ResourceBundle bundle = null;
		if (format.equals("db")) {
			bundle = new EfragmentResourceBundle(locale);
		}
		return bundle;
	}

	/**
	 * Our own implementation of a resource bundle inspired on the
	 * ListResourceBundle class with a change so that getting a non existing key
	 * does not result in a MissingResourceException being thrown but, instead,
	 * returning the passed in key.
	 */
	protected class EfragmentResourceBundle extends ListResourceBundle {

		private Locale locale;
		private AllEntities allEntities;
	 
		
		
		/**
		 * ResourceBundle constructor with locale.
		 * @param locale
		 */
		public EfragmentResourceBundle(final Locale locale) {
			this.locale = locale;
		}

		/**
		 * Returns an array in which each item is a pair of objects in an Object
		 * array. The first element of each pair is the key, which must be a
		 * String, and the second element is the value associated with that key.
		 * See the class description for details.
		 * 
		 * @return an array of an Object array representing a key-value pair.
		 */
		@Override
		protected Object[][] getContents() {
			allEntities = new AllEntities();
			Object[][] all = null;
			switch (locale.getLanguage()) {
			case "en":
				all = allEntities.localeEN();
				break;
			case "de":
				all = allEntities.localeDE();
				break;
			case "fr":
				all = allEntities.localeFR();
				break;
			case "es":
				all = allEntities.localeES();
				break;
			case "zn":
				all = allEntities.localeZN();
				break;
			default:
				all = allEntities.localeEN();
				break;
			}

			return all;
		}

		protected void chooseLocale(String locale) {

		}
	}
}
