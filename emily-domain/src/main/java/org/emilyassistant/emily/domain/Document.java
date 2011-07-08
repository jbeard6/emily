/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * A {@link Document} is a file-like resource.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Document extends Item {

	public String getMediaType();

	public InputStream openInput() throws IOException;

	public OutputStream openOutput() throws IOException;

}
