/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * Abstraction for a unique key that identifies an object.
 * 
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
