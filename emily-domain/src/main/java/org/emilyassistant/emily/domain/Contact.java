/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Set;

/**
 * An encapsulation of a person or business.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Contact extends Item {

	/**
	 * Returns the name of the organization to which this {@link Contact} is
	 * affiliated.
	 * 
	 * @return the organization name
	 */
	public String getOrganizationName();

	/**
	 * Returns the {@link ContactMethod}s for this {@link Contact}.
	 * 
	 * @return the contact methods
	 */
	public Set<ContactMethod> getContactMethods();

}
