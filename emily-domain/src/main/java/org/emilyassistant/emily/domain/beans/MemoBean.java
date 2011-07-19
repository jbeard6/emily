/**
 * 
 */
package org.emilyassistant.emily.domain.beans;

import org.emilyassistant.emily.domain.Memo;

/**
 * @author joseph@josephbeard.net
 *
 */
public class MemoBean extends ItemBean implements Memo {

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

	private String body;

	public String getBody() {
		return body;
	}

	/**
	 * Sets the body of this {@link Memo}.
	 * 
	 * @param body
	 *            the memo body
	 */
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj == this) {
			return true;
		} else if (obj.getClass() != MemoBean.class) {
			return false;
		}

		return getId().equals(((MemoBean) obj).getId());
	}

}
