/**
 * 
 */
package org.emilyassistant.emily.domain.beans;

import java.util.Set;

import org.emilyassistant.emily.domain.Contact;
import org.emilyassistant.emily.domain.ContactMethod;

/**
 * @author joseph@josephbeard.net
 *
 */
public class ContactBean extends ItemBean implements Contact {

	private String organizationName;

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	private Set<ContactMethod> contactMethods;

	public Set<ContactMethod> getContactMethods() {
		return contactMethods;
	}

	public void setContactMethods(Set<ContactMethod> contactMethods) {
		this.contactMethods = contactMethods;
	}

}
