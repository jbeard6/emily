/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/**
 * An element of personal information.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Item {

	/**
	 * Returns the unique identifier of this {@link Item}.
	 * 
	 * @return the unique identifier
	 */
	public UUID getId();
	
	/**
	 * Returns the title of this {@link Item}.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Returns the {@link Date} that this {@link Item} was created.
	 * 
	 * @return the creation date
	 */
	public Date getCreationDate();

	/**
	 * Returns the {@link Tag Tags} that have been assigned to this {@link Item}
	 * .
	 * 
	 * @return the assigned tags
	 */
	public Set<Tag> getTags();

	/**
	 * Returns the {@link Item Items} associated with this {@link Item}.
	 * 
	 * @return the related items
	 */
	public Set<Item> getRelatedItems();

	/**
	 * Returns the {@link Annotation Annotations} added to this {@link Item}.
	 * 
	 * @return the annotations
	 */
	public List<Annotation> getAnnotations();

}
