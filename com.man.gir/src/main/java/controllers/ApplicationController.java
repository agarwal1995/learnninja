package controllers;

import ninja.Result;
import ninja.Results;
import javax.persistence.EntityManager;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.persist.Transactional;
import models.CreateUserImpl;

@Singleton
public class ApplicationController {
	
	public Result index() {
		return Results.html();
	}

	public Result helloWorldJson() {
		SimplePojo simplePojo = new SimplePojo();
		simplePojo.content = "Hello World! Hello Json!";
		return Results.json().render(simplePojo);

	}

	public static class SimplePojo {

		public String content;

	}
	
	public Result login() {
		SimplePojo simplePojo = new SimplePojo();
		simplePojo.content = "This is a Page";
		return Results.html().template("/views/ApplicationController/login.ftl.html");
	}

	@Inject
	Provider<EntityManager> entitiyManagerProvider;

	@Inject
	CreateUserImpl cui;

	@Transactional
	public Result performLogin() {
		cui.create();
		return Results.html().template("/views/ApplicationController/performLogin.ftl.html").render("");
	}

}
