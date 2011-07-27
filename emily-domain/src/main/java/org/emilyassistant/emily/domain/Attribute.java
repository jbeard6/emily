/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.UUID;

/**
 * Abstraction for an {@link Attribute} of an {@link Item}.
 * 
 * @author joseph@josephbeard.net
 * @param <T> the type of value contained in this {@link Attribute}
 * 
 */
public interface Attribute<T> extends Identified<UUID> {

	/**
	 * The type of {@link Attribute}.
	 *
	 * TODO AttributeType needs defined yet.
	 */
	public String getType();

	/**
	 * Returns the value of this {@link Attribute}.
	 *
	 * @return the attribute value
	 */
	public T getValue();

}
