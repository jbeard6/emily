/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;

/**
 * @author joseph@josephbeard.net
 *
 */
public interface Person extends Contact {

	public String getLastName();

	public String getFirstName();

	public String getMiddleName();

	public Date getBirthDate();

	// TBD Add Birth Date as a recurring CalendarEvent?

}
