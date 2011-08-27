/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

/**
 * An {@link Element} that contains methods for changing state.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface MutableElement extends Element, MutableIdentified<UUID> {

	/**
	 * Sets the {@link ElementType} of this {@link Element}.
	 * 
	 * @param type
	 *            the element type
	 */
	public void setType(ElementType type);

	/**
	 * Sets the subject of this {@link Element}.
	 * 
	 * @param subject
	 *            the subject
	 */
	public void setSubject(String subject);

	/**
	 * Sets the {@link Date} that this {@link Element} was created.
	 * 
	 * @param creationDate
	 *            the creation date
	 */
	public void setCreationDate(Date creationDate);

	/**
	 * Sets the {@link Date} that this {@link Element} was last modified.
	 * 
	 * @param lastModifiedDate
	 *            the date of the most recent modification
	 */
	public void setLastModifiedDate(Date lastModifiedDate);

	/**
	 * Sets the {@link Element Elements} associated with this {@link Element}.
	 * 
	 * @param relatedElements
	 *            the related elements
	 */
	public void setRelatedElements(Collection<Element> relatedElements);

}
