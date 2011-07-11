/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * An enumeration of the email importance indicators.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public enum Importance {

	LOW, NORMAL, HIGH;

	/**
	 * Return the equivalent {@link Importance} by performing a case insensitive
	 * comparison.
	 * 
	 * @param importance
	 *            the importance value
	 * @return the importance enum with an equivalent value
	 */
	public static Importance get(String importance) {
		return Importance.valueOf(importance.toUpperCase());
	}

}
