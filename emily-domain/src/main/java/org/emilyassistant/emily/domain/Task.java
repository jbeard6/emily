/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;

/**
 * @author joseph@josephbeard.net
 *
 */
public interface Task extends ScheduledItem {

	public boolean isComplete();

	public Date getCompletedDate();

}
