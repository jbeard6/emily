/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * @author joseph@josephbeard.net
 *
 */
public interface EmailAddress extends ContactMethod {

	public String getUser();

	public String getDomain();

}
