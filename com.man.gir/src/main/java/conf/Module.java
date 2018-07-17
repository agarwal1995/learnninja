package conf;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import models.CreateUser;
import models.CreateUserImpl;
import ninja.utils.NinjaProperties;

@Singleton
public class Module extends AbstractModule {
	private final NinjaProperties ninjaProperties;
	public Module(NinjaProperties ninjaProperties) {
		this.ninjaProperties = ninjaProperties;
	}

	@Override
	protected void configure() {
		bind(CreateUser.class).to(CreateUserImpl.class);
	}
}