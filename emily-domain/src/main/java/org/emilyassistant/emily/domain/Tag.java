/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;
import java.util.UUID;

/**
 * A {@link Tag} is an arbitrary metadata that may be applied to another object.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Tag extends Identified<UUID> {

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
