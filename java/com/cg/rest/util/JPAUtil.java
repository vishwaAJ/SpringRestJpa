package com.cg.rest.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	
		private static EntityManager em;
		private static EntityManagerFactory emf;
		public static EntityManager getEntityManager() {
			if(em==null || !em.isOpen()) {
				emf = Persistence.createEntityManagerFactory("custentity");
				em = emf.createEntityManager();
			}
			return em;
		}
		
	

	private JPAUtil() {
		
	}
	public static void close() {
		if(emf!=null)
			emf.close();
	}
}
