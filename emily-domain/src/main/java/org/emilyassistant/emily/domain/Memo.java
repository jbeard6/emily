/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * A {@link Memo} is a simple note.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Memo extends Item {

	/**
	 * Return the subject of this {@link Memo}.
	 * 
	 * @return the memo subject
	 */
	public String getSubject();

	/**
	 * Returns the body of this {@link Memo}.
	 * 
	 * @return the memo body
	 */
	public String getBody();

}
