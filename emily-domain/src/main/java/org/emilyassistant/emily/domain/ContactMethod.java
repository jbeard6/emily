/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * An abstraction for a means of contacting a {@link Contact}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface ContactMethod {

	/**
	 * Contact the specified {@link Contact}.
	 * 
	 * @param contact
	 *            the contact to be contacted
	 */
	public void contact(Contact contact);

}
