package com.axelor.module;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class DbModule extends AbstractModule {
	@Provides
	@Singleton
	public EntityManagerFactory provideEntityManagerFactory() {
		return Persistence.createEntityManagerFactory("Guice_JPA");
	}

	@Provides
	public EntityManager provideEntityManager(EntityManagerFactory entityManagerFactory) {
		return entityManagerFactory.createEntityManager();
	}
}
