package com.photos.amy.albrecht.main;

import java.util.List;

import com.photos.amy.albrecht.dao.MariaDBConnector;
import com.photos.amy.albrecht.entities.Comment;
import com.photos.amy.albrecht.entities.Like;
import com.photos.amy.albrecht.entities.Photo;
import com.photos.amy.albrecht.entities.Tag;
import com.photos.amy.albrecht.entities.User;


public class UserPhotoRelationships extends MariaDBConnector {

	public static void main(String[] args) {

			testCreateUser();
			testCreatePhoto();
			//testCreateAlbum();
			//testCreateComment();
			//testCreateTag();
			//testCreateLike();
			
	}


	
	//(int photoId, String photoFileName, String caption, List<Comment> pComments, List<Like> pLikes,
			//List<Tag> pTags)
	private static void testCreatePhoto() {
		connect();
		em.getTransaction().begin();
		em.persist(new Photo(1, "firstPhoto.jpg", "Caption", null, null, null));
		em.getTransaction().commit();
		dispose();			
	}

	//User(int userId, String email, String password, String firstName, String lastName, boolean authLevel,
		//	List<Photo> uPhotos, List<Comment> uComment, List<Like> uLike)
	private static void testCreateUser() {
		connect();
		em.getTransaction().begin();
		em.persist(new User(1, "email@email.com", "passwprd", "Callie", "Albrecht", false, null, null, null));
		em.getTransaction().commit();
		dispose();			
	}
	
	private static void testCreateAlbum() {
		// TODO Auto-generated method stub
		
	}
	
	private static void testCreateComment() {
		// TODO Auto-generated method stub
		
	}
	
	private static void testCreateTag() {
		// TODO Auto-generated method stub
		
	}
	
	private static void testCreateLike() {
		// TODO Auto-generated method stub
		
	}



}
