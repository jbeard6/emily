/**
 * 
 */
package org.emilyassistant.emily.domain;

/**
 * Utilities for operating on the Emily domain objects.
 * 
 * @author joseph@josephbeard.net
 * 
 */
abstract class DomainUtils {

	public static boolean isEqual(Object left, Object right) {
		if (left == right) {
			return true;
		} else if (left == null || right == null) {
			return false;
		} else if (left.getClass() != right.getClass()) {
			// Compare to specific class to keep transitive property in tact
			return false;
		}

		// Good so far
		return true;
	}

	public static int hashCode(int initial, Object... fields) {
		// Internal use -- we demand arguments!
		assert fields != null : "fields is null";

		final int prime = 31;

		int result = initial;
		for (Object field : fields) {
			result = prime * result + ((field == null) ? 0 : field.hashCode());
		}

		return result;
	}

}
