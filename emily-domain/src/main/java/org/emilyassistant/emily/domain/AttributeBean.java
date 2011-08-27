/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;
import java.util.UUID;

/**
 * A Java Bean implementation of an {@link Attribute}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public class AttributeBean<T> extends IdentifiedBean<UUID> implements
		MutableAttribute<T> {

	public AttributeBean() {
	}

	public AttributeBean(UUID id) {
		super(id);
	}

	private AttributeType type;

	public AttributeType getType() {
		return type;
	}

	public void setType(AttributeType type) {
		this.type = type;
	}

	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	private Date lastModifiedDate;

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	@Override
	public int hashCode() {
		return DomainUtils.hashCode(super.hashCode(), type, value, createdDate,
				lastModifiedDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		// Can't validate the parameterized type
		AttributeBean<?> other = (AttributeBean<?>) obj;

		return DomainUtils.isEqual(type, other.type)
				&& DomainUtils.isEqual(value, other.value)
				&& DomainUtils.isEqual(createdDate, other.createdDate)
				&& DomainUtils
						.isEqual(lastModifiedDate, other.lastModifiedDate);
	}

	@Override
	public String toString() {
		return "AttributeBean [type=" + type + ", value=" + value
				+ ", createdDate=" + createdDate + ", lastModifiedDate="
				+ lastModifiedDate + "]";
	}

}
