/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;

/**
 * A {@link Project} is an aggregation of other {@link Item Items}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Project extends Item {

	/**
	 * Return the {@link Item Items} that comprise this {@link Project}.
	 * 
	 * @return the items that compose this project
	 */
	public Set<Item> getItems();

}
