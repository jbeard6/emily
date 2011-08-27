/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Collection;
import java.util.UUID;

/**
 * An {@link ElementType} with methods for changing state.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface MutableElementType extends ElementType,
		MutableIdentified<UUID> {

	/**
	 * Sets the name of this {@link ElementType}.
	 * 
	 * @param name
	 *            the name of this type of element
	 */
	public void setName(String name);

	/**
	 * Sets the {@link AttributeType}s that are commonly associated with this
	 * {@link ElementType}.
	 * 
	 * @param attributeTypes
	 *            the common types of attributes for this type of element
	 */
	public void setAttributeTypes(Collection<AttributeType> attributeTypes);

}
