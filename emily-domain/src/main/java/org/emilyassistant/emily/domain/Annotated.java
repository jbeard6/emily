/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.util.List;

/**
 * An {@link Annotated} object contains a {@link List} of {@link Annotation}s.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Annotated {

	/**
	 * Returns the {@link Annotation Annotations}.
	 * 
	 * @return the annotations
	 */
	public List<Annotation> getAnnotations();

}
