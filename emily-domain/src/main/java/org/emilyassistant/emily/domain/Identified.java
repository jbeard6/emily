/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * @author joseph@josephbeard.net
 *
 */
public interface Identified<T> {

	/**
	 * Returns the unique identifier.
	 * 
	 * @return the unique identifier
	 */
	public T getId();

}
