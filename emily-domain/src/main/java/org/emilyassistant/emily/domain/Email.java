/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * An abstraction of an email message.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Email extends Item {

	/**
	 * Returns the subject of this {@link Email}.
	 * 
	 * @return the email subject
	 */
	public String getSubject();

	/**
	 * Returns the {@link Date} that this {@link Email} was received.
	 * 
	 * @return the email date
	 */
	public Date getReceivedDate();

	/**
	 * Returns the sender of this {@link Email}.
	 * 
	 * @return the email sender
	 */
	public Contact getSender();

	/**
	 * Returns the recipients of this {@link Email}.
	 * 
	 * @return the email recipients
	 */
	public Collection<Contact> getRecipients();

	/**
	 * Returns the subset of {@link #getRecipients() recipients} that are the
	 * primary recipients (i.e.: the To: recipients).
	 * 
	 * @return the primary recipients
	 */
	public Collection<Contact> getPrimaryRecipients();

	/**
	 * Returns the subset of {@link #getRecipients() recipients} that are copied
	 * (i.e.: the CC: recipients).
	 * 
	 * @return the copied recipients
	 */
	public Collection<Contact> getCopiedRecipients();

	/**
	 * Returns the subset of {@link #getRecipients() recipients} that are blind
	 * copied (i.e.: the BCC: recipients).
	 * 
	 * @return the blind copied recipients
	 */
	public Collection<Contact> getBlindCopiedRecipients();

	/**
	 * Returns the {@link Email} to which this {@link Email} is a response.
	 * 
	 * @return the parent email
	 */
	public Email getParent();

	/**
	 * Returns the responses to this {@link Email}.
	 * 
	 * @return the response emails
	 */
	public Set<Email> getChildren();

	/**
	 * Returns the {@link Importance} of this {@link Email}.
	 * 
	 * @return the email importance
	 */
	public Importance getImportance();

	// TODO Figure out appropriate representation for body parts and attachments

}
