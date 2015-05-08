package in.warecon.sas.service.commons;

import in.warecon.sas.model.Person;

import java.util.ArrayList;

public interface BasicUserActions {
	public abstract boolean add(Person person);

	public abstract boolean delete(Person person);

	public abstract boolean update(Person person);

	public abstract Person getPersonById(int id);
	
	public abstract ArrayList<Person> getAll();
}
