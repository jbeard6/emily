/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;
import java.util.UUID;

/**
 * @author joseph@josephbeard.net
 * 
 */
public interface Tag {

	/**
	 * Returns the unique identifier of this {@link Tag}.
	 * 
	 * @return the unique identifier
	 */
	public UUID getId();

	/**
	 * Returns the title of this {@link Tag}.
	 * 
	 * @return the title
	 */
	public String getTitle();

	/**
	 * Returns the {@link Item Items} to which this {@link Tag} is assigned.
	 * 
	 * @return the items tagged with this tag
	 */
	public Set<Item> getItems();

}
