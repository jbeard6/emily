/**
 * 
 */
package org.emilyassistant.emily.domain.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.emilyassistant.emily.domain.Annotation;
import org.emilyassistant.emily.domain.Item;
import org.emilyassistant.emily.domain.Tag;

/**
 * @author joseph@josephbeard.net
 *
 */
public class ItemBean implements Item, Serializable {

	public ItemBean() {
		this.id = UUID.randomUUID();
	}

	// Invariant: id may never be null
	private UUID id;

	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(UUID id) {
		if (id == null) {
			throw new IllegalArgumentException("id may not be null");
		}
		this.id = id;
	}

	private String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	private Date creationDate;

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	private Set<Item> relatedItems;

	/**
	 * @return the relatedItems
	 */
	public Set<Item> getRelatedItems() {
		return relatedItems;
	}

	/**
	 * @param relatedItems
	 *            the relatedItems to set
	 */
	public void setRelatedItems(Set<Item> relatedItems) {
		this.relatedItems = relatedItems;
	}

	private List<Annotation> annotations;

	/**
	 * @return the annotations
	 */
	public List<Annotation> getAnnotations() {
		return annotations;
	}

	/**
	 * @param annotations
	 *            the annotations to set
	 */
	public void setAnnotations(List<Annotation> annotations) {
		this.annotations = annotations;
	}

	private Set<Tag> tags;

	/**
	 * @return the tags
	 */
	public Set<Tag> getTags() {
		return tags;
	}

	/**
	 * @param tags
	 *            the tags to set
	 */
	public void setTags(Set<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (obj == this) {
			return true;
		} else if (obj.getClass() != ItemBean.class) {
			return false;
		}

		return id.equals(((ItemBean) obj).getId());
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return title;
	}

}
