/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Collection;
import java.util.Date;
import java.util.UUID;

/**
 * An {@link Element} of personal information.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Element extends Identified<UUID> {
	
	/**
	 * Returns the {@link ElementType} of this {@link Element}.
	 * 
	 * @return the element type
	 */
	public ElementType getType();

	/**
	 * Returns the subject of this {@link Element}.
	 * 
	 * @return the subject
	 */
	public String getSubject();

	/**
	 * Returns the {@link Date} that this {@link Element} was created.
	 * 
	 * @return the creation date
	 */
	public Date getCreationDate();

	/**
	 * Returns the {@link Date} that this {@link Element} was last modified.
	 * 
	 * @return the date of the most recent modification
	 */
	public Date getLastModifiedDate();

	/**
	 * Returns the {@link Element Elements} associated with this {@link Element}
	 * .
	 * 
	 * @return the related elements
	 */
	public Collection<Element> getRelatedElements();

}
