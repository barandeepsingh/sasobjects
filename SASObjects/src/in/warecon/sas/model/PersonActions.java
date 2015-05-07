package in.warecon.sas.model;

import java.util.ArrayList;

public interface PersonActions {

	public boolean add(Person person);

	public boolean delete(Person person);

	public boolean update(Person person);

	public Person getPerson(int id);

	public ArrayList<Person> getAll();

}
