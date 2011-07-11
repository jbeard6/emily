/**
 * 
 */
package org.emilyassistant.emily.domain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.MimeType;

/**
 * A {@link Document} is a file-like resource.
 * 
 * @author joseph@josephbeard.net
 * 
 */
public interface Document extends Item {

	/**
	 * Returns the {@link MimeType} of this {@link Document}.
	 * 
	 * @return the MIME type
	 */
	public MimeType getMimeType();

	/**
	 * Open an {@link InputStream} to read the contents of this {@link Document}
	 * .
	 * 
	 * @return an open {@link InputStream}
	 * @throws IOException
	 *             if an {@link InputStream} can not be opened
	 */
	public InputStream openInput() throws IOException;

	/**
	 * Opens an {@link OutputStream} to write the contents of this
	 * {@link Document}.
	 * 
	 * @return an open {@link OutputStream}
	 * @throws IOException
	 *             if an {@link OutputStream} can not be opened
	 */
	public OutputStream openOutput() throws IOException;

}
