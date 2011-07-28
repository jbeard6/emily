/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;

/**
 * An abstraction for a type of {@link Element}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface ElementType {

	/**
	 * Returns the name of this {@link ElementType}.
	 * 
	 * @return the name of this type of element
	 */
	public String getName();

	/**
	 * Returns the {@link AttributeType}s that are commonly associated with this
	 * {@link ElementType}.
	 * 
	 * @return the common types of attributes for this type of element
	 */
	public Set<AttributeType> getAttributeTypes();

}
