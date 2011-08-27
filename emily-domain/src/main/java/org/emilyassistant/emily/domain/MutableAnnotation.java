/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * An {@link Annotation} with methods to change state.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface MutableAnnotation extends Annotation {

	/**
	 * Sets the text of this {@link Annotation}.
	 * 
	 * @param text
	 *            the annotation text
	 */
	public void setText(String text);

}
