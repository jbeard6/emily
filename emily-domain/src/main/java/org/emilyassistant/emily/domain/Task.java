/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;

/**
 * A {@link Task} defines an action to be done.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Task extends ScheduledItem {

	/**
	 * Returns <code>true</code> if this {@link Task} is complete.
	 * 
	 * @return <code>true</code> if this task has been completed
	 */
	public boolean isComplete();

	/**
	 * Returns the {@link Date} at which this {@link Task} was completed, or
	 * <code>null</code> if this {@link Task} is incomplete.
	 * 
	 * @return the completion date
	 */
	public Date getCompletedDate();

}
