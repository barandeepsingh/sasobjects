package in.warecon.ams.service;

import in.warecon.ams.model.Person;
import in.warecon.ams.service.commons.LoginActions;

import java.util.ArrayList;

public interface AdminService extends PersonService {

	public abstract boolean add(Person person);

	public abstract boolean delete(Person person);

	public abstract boolean update(Person person);

	public abstract Person getPersonById(int id);

	public abstract ArrayList<Person> getAll();

}