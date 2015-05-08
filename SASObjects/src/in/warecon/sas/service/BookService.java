package in.warecon.sas.service;

import in.warecon.sas.model.Person;

import java.util.ArrayList;

public interface BookService extends PersonService{

	public abstract boolean add(Person person);

	public abstract boolean delete(Person person);

	public abstract boolean update(Person person);

	public abstract Person getPersonById(int id);

	public abstract ArrayList<Person> getAll();

}