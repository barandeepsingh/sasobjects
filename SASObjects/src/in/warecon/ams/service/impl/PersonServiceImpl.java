package in.warecon.ams.service.impl;

import java.util.ArrayList;

import in.warecon.ams.model.Inbox;
import in.warecon.ams.model.Mail;
import in.warecon.ams.model.Person;
import in.warecon.ams.model.Sms;
import in.warecon.ams.service.PersonService;

public class PersonServiceImpl implements PersonService{

	@Override
	public boolean authenticateUser(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Person person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Person> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean sendMail(Mail mail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendMessageToInbox(Inbox inbox) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendSMS(Sms sms) {
		// TODO Auto-generated method stub
		return false;
	}

}
