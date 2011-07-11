/**
 * 
 */
package org.emilyassistant.emily.domain;

import javax.mail.internet.InternetAddress;

/**
 * An Internet email address.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface EmailAddress extends ContactMethod {

	/**
	 * Returns the {@link InternetAddress} that represents the actual address.
	 * 
	 * @return the email internet address
	 */
	public InternetAddress getInternetAddress();

}
