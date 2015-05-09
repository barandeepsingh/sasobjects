package in.warecon.ams.service.commons;

import in.warecon.ams.model.Person;

public interface LoginActions {
	public boolean authenticateUser(Person person);

	public boolean logout();

}
