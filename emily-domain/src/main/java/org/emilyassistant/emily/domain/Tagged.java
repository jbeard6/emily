/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;

/**
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
