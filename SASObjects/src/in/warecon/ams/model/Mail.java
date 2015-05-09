package in.warecon.ams.model;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Mail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mailId;
	private String subject;
	private String body;
	private File attachment;
	private String sender;
	private String replyTo;
	private Collection<String> recipients = new ArrayList<String>();

	/**
	 * @return the mailId
	 */
	public long getMailId() {
		return mailId;
	}

	/**
	 * @param mailId
	 *            the mailId to set
	 */
	public void setMailId(long mailId) {
		this.mailId = mailId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public File getAttachment() {
		return attachment;
	}

	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReplyTo() {
		return replyTo;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public Collection<String> getRecipients() {
		return recipients;
	}

	public void setRecipients(Collection<String> recipients) {
		this.recipients = recipients;
	}

}
