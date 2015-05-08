package in.warecon.sas.service;

import in.warecon.sas.model.Person;

import java.util.ArrayList;

public interface GenusService {

	public abstract boolean add(Person person);

	public abstract boolean delete(Person person);

	public abstract boolean update(Person person);

	public abstract Person getPerson(int id);

	public abstract ArrayList<Person> getAll();

}