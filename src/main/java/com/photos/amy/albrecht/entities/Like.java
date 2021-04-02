package com.photos.amy.albrecht.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "like")
public class Like {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "likeId", nullable = false, length = 11)
	int likeId;
	
	//constructors

	public Like() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Like(int likeId) {
		super();
		this.likeId = likeId;
	}
	
	//getters and setters

	public int getLikeId() {
		return likeId;
	}

	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}
	
	//hashCode()

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + likeId;
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
		Like other = (Like) obj;
		if (likeId != other.likeId)
			return false;
		return true;
	}
	
	//toString()

	@Override
	public String toString() {
		return "Like [likeId=" + likeId + "]";
	}

	
	
}

