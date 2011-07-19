/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;

/**
 * A {@link Scheduled} object is scheduled for a particular period or periods of
 * time.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Scheduled {

	/**
	 * Returns the {@link Date} at which this {@link Scheduled} begins.
	 * 
	 * @return the beginning date
	 */
	public Date getBeginDate();

	/**
	 * Returns the {@link Date} at which this {@link Scheduled} concludes.
	 * 
	 * @return the ending date
	 */
	public Date getEndDate();

	/**
	 * Returns the {@link RecurrencePattern} of this {@link Scheduled}.
	 * 
	 * @return the recurrence pattern
	 */
	public RecurrencePattern getRecurrencePattern();

}
