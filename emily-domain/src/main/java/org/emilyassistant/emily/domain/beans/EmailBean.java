/**
 * 
 */
package org.emilyassistant.emily.domain.beans;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import org.emilyassistant.emily.domain.Contact;
import org.emilyassistant.emily.domain.Email;
import org.emilyassistant.emily.domain.EmailAddress;
import org.emilyassistant.emily.domain.Importance;

/**
 * @author joseph@josephbeard.net
 *
 */
public class EmailBean extends ItemBean implements Email {

	private String subject;

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	private Date receivedDate;

	/**
	 * @return the receivedDate
	 */
	public Date getReceivedDate() {
		return receivedDate;
	}

	/**
	 * @param receivedDate
	 *            the receivedDate to set
	 */
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	private Contact sender;

	/**
	 * @return the sender
	 */
	public Contact getSender() {
		return sender;
	}

	/**
	 * @param sender
	 *            the sender to set
	 */
	public void setSender(Contact sender) {
		this.sender = sender;
	}

	private Collection<EmailAddress> recipients;

	/**
	 * @return the recipients
	 */
	public Collection<EmailAddress> getRecipients() {
		return recipients;
	}

	/**
	 * @param recipients
	 *            the recipients to set
	 */
	public void setRecipients(Collection<EmailAddress> recipients) {
		this.recipients = recipients;
	}

	private Collection<EmailAddress> primaryRecipients;

	/**
	 * @return the primaryRecipients
	 */
	public Collection<EmailAddress> getPrimaryRecipients() {
		return primaryRecipients;
	}

	/**
	 * @param primaryRecipients
	 *            the primaryRecipients to set
	 */
	public void setPrimaryRecipients(Collection<EmailAddress> primaryRecipients) {
		this.primaryRecipients = primaryRecipients;
	}

	private Collection<EmailAddress> copiedRecipients;

	/**
	 * @return the copiedRecipients
	 */
	public Collection<EmailAddress> getCopiedRecipients() {
		return copiedRecipients;
	}

	/**
	 * @param copiedRecipients
	 *            the copiedRecipients to set
	 */
	public void setCopiedRecipients(Collection<EmailAddress> copiedRecipients) {
		this.copiedRecipients = copiedRecipients;
	}

	private Collection<EmailAddress> blindCopiedRecipients;

	/**
	 * @return the blindCopiedRecipients
	 */
	public Collection<EmailAddress> getBlindCopiedRecipients() {
		return blindCopiedRecipients;
	}

	/**
	 * @param blindCopiedRecipients
	 *            the blindCopiedRecipients to set
	 */
	public void setBlindCopiedRecipients(
			Collection<EmailAddress> blindCopiedRecipients) {
		this.blindCopiedRecipients = blindCopiedRecipients;
	}

	private Email parent;

	/**
	 * @return the parent
	 */
	public Email getParent() {
		return parent;
	}

	/**
	 * @param parent
	 *            the parent to set
	 */
	public void setParent(Email parent) {
		this.parent = parent;
	}

	private Set<Email> children;

	/**
	 * @return the children
	 */
	public Set<Email> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(Set<Email> children) {
		this.children = children;
	}

	private Importance importance;

	/**
	 * @return the importance
	 */
	public Importance getImportance() {
		return importance;
	}

	/**
	 * @param importance
	 *            the importance to set
	 */
	public void setImportance(Importance importance) {
		this.importance = importance;
	}

}
