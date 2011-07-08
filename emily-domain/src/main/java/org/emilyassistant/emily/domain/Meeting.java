/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;

/**
 * A {@link Meeting} is a {@link CalendarEvent} that is scheduled for a
 * collection of {@link Person People}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Meeting extends CalendarEvent {

	/**
	 * Returns the {@link Person} that is organizing this {@link Meeting}.
	 * 
	 * @return the meeting organizer
	 */
	public Person getOrganizer();

	/**
	 * Returns the {@link Person People} that attend this {@link Meeting}.
	 * 
	 * @return the meeting attendees
	 */
	public Set<Person> getAttendees();

	/**
	 * Returns the subset of the {@link #getAttendees() attendees} that are
	 * required to attend this {@link Meeting}.
	 * 
	 * @return the required meeting attendees
	 */
	public Set<Person> getRequiredAttendees();

	/**
	 * Returns the subset of the {@link #getAttendees() attendees} that may opt
	 * to attend this {@link Meeting}.
	 * 
	 * @return the optional meeting attendees
	 */
	public Set<Person> getOptionalAttendees();

	/**
	 * Returns the subset of {@link #getAttendees() attendees} that want to be
	 * kept "in the loop" about this {@link Meeting} without actually attending.
	 * 
	 * @return the informed meeting attendees
	 */
	public Set<Person> getInformedAttendees();

	/**
	 * Returns a description of where this {@link Meeting} takes place.
	 * 
	 * @return the meeting location
	 */
	public String getLocation();

}
