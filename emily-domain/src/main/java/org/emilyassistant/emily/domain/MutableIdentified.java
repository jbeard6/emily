/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * An {@link Identified} that exposes methods to change the identity.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface MutableIdentified<T> extends Identified<T> {

	/**
	 * Sets the unique identifier.
	 * 
	 * @param id
	 *            the unique identifier
	 */
	public void setId(T id);

}
