package in.warecon.ams.service.commons;

import in.warecon.ams.model.Inbox;
import in.warecon.ams.model.Mail;
import in.warecon.ams.model.Person;
import in.warecon.ams.model.Sms;

import java.util.ArrayList;

public interface BasicUserActions {
	public abstract boolean add(Person person);

	public abstract boolean delete(Person person);

	public abstract boolean update(Person person);

	public abstract Person getPersonById(int id);

	public abstract ArrayList<Person> getAll();

	public abstract boolean sendMail(Mail mail);

	public abstract boolean sendMessageToInbox(Inbox inbox);

	public abstract boolean sendSMS(Sms sms);
}
