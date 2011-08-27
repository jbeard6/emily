/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

/**
 * A Java Bean implementation of an {@link Element}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public class ElementBean extends IdentifiedBean<UUID> implements MutableElement {

	private ElementType type;

	public ElementType getType() {
		return type;
	}

	public void setType(ElementType type) {
		this.type = type;
	}

	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	private Date creationDate;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	private Date lastModifiedDate;

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	private Collection<Element> relatedElements;

	public Collection<Element> getRelatedElements() {
		return relatedElements;
	}

	public void setRelatedElements(Collection<Element> relatedElements) {
		this.relatedElements = relatedElements;
	}

	@Override
	public int hashCode() {
		return DomainUtils.hashCode(super.hashCode(), type, subject,
				creationDate, lastModifiedDate, relatedElements);
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}

		// Can't validate the parameterized type
		ElementBean other = (ElementBean) obj;

		return DomainUtils.isEqual(type, other.type)
				&& DomainUtils.isEqual(subject, other.subject)
				&& DomainUtils.isEqual(creationDate, other.creationDate)
				&& DomainUtils
						.isEqual(lastModifiedDate, other.lastModifiedDate)
				&& DomainUtils.isEqual(relatedElements, other.relatedElements);
	}

	@Override
	public String toString() {
		return "ElementBean [type=" + type + ", subject=" + subject
				+ ", creationDate=" + creationDate + ", lastModifiedDate="
				+ lastModifiedDate + ", relatedElements=" + relatedElements
				+ "]";
	}

}
