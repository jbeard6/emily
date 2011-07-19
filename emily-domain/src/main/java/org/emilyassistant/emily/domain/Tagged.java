/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;

/**
 * A {@link Tagged} object may have {@link Tag Tags} applied to it.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Tagged {

	/**
	 * Returns the {@link Tag Tags} that have been assigned.
	 * 
	 * @return the assigned tags
	 */
	public Set<Tag> getTags();

}
