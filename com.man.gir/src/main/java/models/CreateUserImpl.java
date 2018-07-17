package models;

import javax.persistence.EntityManager;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import entity.AppUser;

public class CreateUserImpl implements CreateUser{
	@Inject 
	Provider<EntityManager> entitiyManagerProvider;	

	@Override
	@Transactional
	public void create() {
		EntityManager entityManager = entitiyManagerProvider.get();
		AppUser app = new AppUser();
    	app.setname("Rahul");
    	entityManager.persist(app);
   }
}