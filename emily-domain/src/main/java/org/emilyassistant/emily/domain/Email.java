/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Date;
import java.util.Set;

/**
 * @author joseph@josephbeard.net
 *
 */
public interface Email extends Item {

	public String getSubject();

	public Date getReceivedDate();

	public Contact getSender();

	public Email getParent();

	public Set<Email> getChildren();

	public Importance getImportance();

	// TODO Figure out appropriate representation for body parts and attachments

}
