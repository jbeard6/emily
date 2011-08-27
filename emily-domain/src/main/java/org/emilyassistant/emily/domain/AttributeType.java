/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.UUID;

/**
 * An abstraction for a type of {@link Attribute}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface AttributeType extends Identified<UUID> {

	/**
	 * Returns the name of this {@link AttributeType}.
	 * 
	 * @return the name of this type of attribute
	 */
	public String getName();

}
