/**
 * 
 */
package org.emilyassistant.emily.domain;


/**
 * An {@link Item} that is tied to a particular time period.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface CalendarEvent extends ScheduledItem {

	/**
	 * Returns <code>true</code> if this {@link CalendarEvent} is an all day
	 * event.
	 * 
	 * @return <code>true</code> if this event is an all day event
	 */
	public boolean isAllDay();

}
