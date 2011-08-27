/**
 * 
 */
package org.emilyassistant.emily.domain;


/**
 * A Java Bean implementation of {@link Identified}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public class IdentifiedBean<T> implements MutableIdentified<T> {

	public IdentifiedBean() {
	}

	public IdentifiedBean(T id) {
		this.id = id;
	}

	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id == null ? 31 : id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!DomainUtils.isEqual(this, obj)) {
			return false;
		}

		// Can't validate the parameterized type
		IdentifiedBean<?> other = (IdentifiedBean<?>) obj;

		return id == null ? other.id == null : id.equals(other.id);
	}

	@Override
	public String toString() {
		return "IdentifiedBean [id=" + id + "]";
	}

}
