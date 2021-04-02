package com.photos.amy.albrecht.services;

import com.photos.amy.albrecht.dao.MariaDBConnector;
import com.photos.amy.albrecht.dao.UserI;

public class UserServices extends MariaDBConnector implements UserI {

	
	
	/* 
	 * Pseudo code for showing edit button for admin vs. regular users.
	 * 
	 * if user is admin {
	 * 	if user is regular {
	 *		if user.userId == photo.userId, show edit button
	 *		} else { 
	 *		don't show edit button
	 *		}
	 * show all edit buttons
	 * 	}
	 * 
	*/
	
}
