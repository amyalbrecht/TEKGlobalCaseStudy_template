package com.photos.amy.albrecht.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "photo")
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "photoId", nullable = false, length = 11)
	private int photoId;

	@Column(name = "photoFileName", nullable = false, length = 50)
	private String photoFileName;

	@Column(name = "caption", nullable = true, length = 250)
	private String caption;

	@OneToMany(targetEntity = Comment.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Comment> pComments; //all the comments for a photo

	@OneToMany(targetEntity = Like.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Like> pLikes; //all the likes for a photo

	@OneToMany(targetEntity = Tag.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Tag> pTags; //all the tags for a photo

	//constructors
	
	public Photo() {
		super();
	}

	
	public Photo(int photoId, String photoFileName, String caption, List<Comment> pComments, List<Like> pLikes,
			List<Tag> pTags) {
		super();
		this.photoId = photoId;
		this.photoFileName = photoFileName;
		this.caption = caption;
		this.pComments = pComments;
		this.pLikes = pLikes;
		this.pTags = pTags;
	}



	//getters and setters

	public int getPhotoId() {
		return photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public List<Comment> getpComments() {
		return pComments;
	}

	public void setpComments(List<Comment> pComments) {
		this.pComments = pComments;
	}

	public List<Like> getpLikes() {
		return pLikes;
	}

	public void setpLikes(List<Like> pLikes) {
		this.pLikes = pLikes;
	}

	public List<Tag> getpTags() {
		return pTags;
	}

	public void setpTags(List<Tag> pTags) {
		this.pTags = pTags;
	}


	//hashCode()
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result + ((pComments == null) ? 0 : pComments.hashCode());
		result = prime * result + ((pLikes == null) ? 0 : pLikes.hashCode());
		result = prime * result + ((pTags == null) ? 0 : pTags.hashCode());
		result = prime * result + ((photoFileName == null) ? 0 : photoFileName.hashCode());
		result = prime * result + photoId;
		return result;
	}

	//equals()

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Photo other = (Photo) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (pComments == null) {
			if (other.pComments != null)
				return false;
		} else if (!pComments.equals(other.pComments))
			return false;
		if (pLikes == null) {
			if (other.pLikes != null)
				return false;
		} else if (!pLikes.equals(other.pLikes))
			return false;
		if (pTags == null) {
			if (other.pTags != null)
				return false;
		} else if (!pTags.equals(other.pTags))
			return false;
		if (photoFileName == null) {
			if (other.photoFileName != null)
				return false;
		} else if (!photoFileName.equals(other.photoFileName))
			return false;
		if (photoId != other.photoId)
			return false;
		return true;
	}

	//toString()

	@Override
	public String toString() {
		return "Photo [photoId=" + photoId + ", photoFileName=" + photoFileName + ", caption=" + caption
				+ ", pComments=" + pComments + ", pLikes=" + pLikes + ", pTags=" + pTags + "]";
	}

	

}
