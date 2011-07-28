/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;
import java.util.UUID;

/**
 * Abstraction for an {@link Attribute} of an {@link Element}.
 * 
 * @author joseph@josephbeard.net
 * 
 * @param <T>
 *            the type of value contained in this {@link Attribute}
 * 
 */
public interface Attribute<T> extends Identified<UUID> {

	/**
	 * The type of {@link Attribute}.
	 */
	public AttributeType getType();

	/**
	 * Returns the value of this {@link Attribute}.
	 *
	 * @return the attribute value
	 */
	public T getValue();

	/**
	 * Returns the {@link Date} that this {@link Attribute} was created.
	 * 
	 * @return the creation date
	 */
	public Date getCreatedDate();

	/**
	 * Returns the {@link Date} that this {@link Attribute} was last modified.
	 * 
	 * @return the date of the most recent modification
	 */
	public Date getLastModifiedDate();

}
