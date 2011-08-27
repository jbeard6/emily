/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * A Java Bean implementation of an {@link Annotation}.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public class AnnotationBean implements MutableAnnotation {

	public AnnotationBean() {
	}

	public AnnotationBean(String text) {
		this.text = text;
	}

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		return text == null ? 31 : text.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!DomainUtils.isEqual(this, obj)) {
			return false;
		}

		AnnotationBean other = (AnnotationBean) obj;

		return text == null ? other.text == null : text.equals(other.text);
	}

	@Override
	public String toString() {
		return "AnnotationBean [text=" + text + "]";
	}

}
