/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Collection;
import java.util.UUID;

/**
 * A Java Bean implementation of an {@link ElementType}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public class ElementTypeBean extends IdentifiedBean<UUID> implements
		MutableElementType {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Collection<AttributeType> attributeTypes;

	public Collection<AttributeType> getAttributeTypes() {
		return attributeTypes;
	}

	public void setAttributeTypes(Collection<AttributeType> attributeTypes) {
		this.attributeTypes = attributeTypes;
	}

}
