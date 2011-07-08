/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

/**
 * An element of personal information.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Item extends Identified<UUID>, Annotated, Tagged {
	
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
	 * Returns the {@link Item Items} associated with this {@link Item}.
	 * 
	 * @return the related items
	 */
	public Set<Item> getRelatedItems();

}
