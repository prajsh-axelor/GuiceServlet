package com.axelor.dao;

import javax.persistence.EntityManager;
import com.google.inject.persist.Transactional;
import com.axelor.db.Contact;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ContactDao {

		protected EntityManager entityManager;
//		
//		@Inject
//		public ContactDao(EntityManager entityManager) {
//			this.entityManager = entityManager;
//		}
	
	@Inject
	Provider<EntityManager> entityManagerProvider;
		@Transactional
		public void saveContact(Contact contact) {
//			entityManager.getTransaction().begin();
			entityManager = entityManagerProvider.get();
			entityManager.persist(contact);
//			entityManager.getTransaction().commit();
		}
}
