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
@Table(name = "album")
public class Album {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "albumId", nullable = false, length = 11)
	int albumId;
	
	@Column(name = "albumName", nullable = false, length = 50)
	String albumName;
	
	@OneToMany(targetEntity = Photo.class, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<Photo> aPhotos; //all the photos in an album
	
	//constructors
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(int albumId, String albumName) {
		super();
		this.albumId = albumId;
		this.albumName = albumName;
	}
	
	//getters and setters

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	//hashCode()
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + albumId;
		result = prime * result + ((albumName == null) ? 0 : albumName.hashCode());
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
		Album other = (Album) obj;
		if (albumId != other.albumId)
			return false;
		if (albumName == null) {
			if (other.albumName != null)
				return false;
		} else if (!albumName.equals(other.albumName))
			return false;
		return true;
	}

	//toString()
	
	@Override
	public String toString() {
		return "album [albumId=" + albumId + ", albumName=" + albumName + "]";
	}
	
	
}
