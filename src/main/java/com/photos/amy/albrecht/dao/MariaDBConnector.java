package com.photos.amy.albrecht.dao;

//Abstract DAO

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class MariaDBConnector {
	final static String persistenceUnitName = "Photos";
	
	
	protected static EntityManagerFactory emf = null;
	protected static EntityManager em = null;


	
	protected static void connect() {
		emf = Persistence.createEntityManagerFactory(persistenceUnitName);
		em = emf.createEntityManager();
		}
		
	protected static void dispose() {

		
		em.close();
		emf.close();
	}
	}

