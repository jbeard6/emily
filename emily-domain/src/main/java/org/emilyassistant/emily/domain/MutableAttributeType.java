/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.UUID;

/**
 * An {@link AttributeType} that has methods for changing state.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface MutableAttributeType extends AttributeType,
		MutableIdentified<UUID> {

	/**
	 * Sets the name of this {@link AttributeType}.
	 * 
	 * @param name
	 *            the name of this type of attribute
	 */
	public void setName(String name);

}
