/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;

/**
 * @author joseph@josephbeard.net
 *
 */
public interface ScheduledItem extends Item {

	/**
	 * Returns the {@link Date} at which this {@link CalendarEvent} begins.
	 * 
	 * @return the beginning date
	 */
	public Date getBeginDate();

	/**
	 * Returns the {@link Date} at which this {@link CalendarEvent} concludes.
	 * 
	 * @return the ending date
	 */
	public Date getEndDate();

	/**
	 * Returns the {@link RecurrencePattern} of this {@link CalendarEvent}.
	 * 
	 * @return the recurrence pattern
	 */
	public RecurrencePattern getRecurrencePattern();

}
