package in.warecon.sas.service.commons;

import in.warecon.sas.model.Person;

public interface LoginActions {
	public boolean authenticateUser(Person person);

	public boolean logout();

}
