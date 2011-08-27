/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;
import java.util.UUID;

/**
 * An {@link Attribute} that has methods for changing state.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface MutableAttribute<T> extends Attribute<T>,
		MutableIdentified<UUID> {

	/**
	 * Sets the {@link AttributeType} of this {@link Attribute}.
	 * 
	 * @param type
	 *            the attribute type
	 */
	public void setType(AttributeType type);

	/**
	 * Sets the value of this {@link Attribute}.
	 * 
	 * @param value
	 *            the attribute value
	 */
	public void setValue(T value);

	/**
	 * Sets the {@link Date} that this {@link Attribute} was created.
	 * 
	 * @param createdDate
	 *            the creation date
	 */
	public void setCreatedDate(Date createdDate);

	/**
	 * Sets the {@link Date} that this {@link Attribute} was last modified.
	 * 
	 * @param lastModifiedDate
	 *            the date of the most recent modification
	 */
	public void setLastModifiedDate(Date lastModifiedDate);

}
