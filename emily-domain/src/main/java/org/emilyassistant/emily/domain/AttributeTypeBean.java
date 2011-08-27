/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.UUID;

/**
 * A Java Bean implementation of {@link AttributeType}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public class AttributeTypeBean extends IdentifiedBean<UUID> implements
		MutableAttributeType {
	
	public AttributeTypeBean() {
	}

	public AttributeTypeBean(UUID id) {
		super(id);
	}

	public AttributeTypeBean(String name) {
		this.name = name;
	}

	public AttributeTypeBean(UUID id, String name) {
		super(id);
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return DomainUtils.hashCode(super.hashCode(), name);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		AttributeTypeBean other = (AttributeTypeBean) obj;

		return name == null ? other.name == null : name.equals(other.name);
	}

	@Override
	public String toString() {
		return "AttributeTypeBean [name=" + name + ", getId()=" + getId() + "]";
	}

}
