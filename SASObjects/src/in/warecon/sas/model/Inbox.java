package in.warecon.sas.model;

import java.io.File;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import in.warecon.sas.model.enums.UserType;

public class Inbox {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long msgId;
	private UserType senderType;
	private int senderId;
	private UserType receiverType;
	private int receiverId;
	private String subject;
	private File attachment;
	private String body;

	/**
	 * @return the msgId
	 */
	public long getMsgId() {
		return msgId;
	}

	/**
	 * @param msgId
	 *            the msgId to set
	 */
	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}

	/**
	 * @return the senderType
	 */
	public UserType getSenderType() {
		return senderType;
	}

	/**
	 * @param senderType
	 *            the senderType to set
	 */
	public void setSenderType(UserType senderType) {
		this.senderType = senderType;
	}

	/**
	 * @return the senderId
	 */
	public int getSenderId() {
		return senderId;
	}

	/**
	 * @param senderId
	 *            the senderId to set
	 */
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	/**
	 * @return the receiverType
	 */
	public UserType getReceiverType() {
		return receiverType;
	}

	/**
	 * @param receiverType
	 *            the receiverType to set
	 */
	public void setReceiverType(UserType receiverType) {
		this.receiverType = receiverType;
	}

	/**
	 * @return the receiverId
	 */
	public int getReceiverId() {
		return receiverId;
	}

	/**
	 * @param receiverId
	 *            the receiverId to set
	 */
	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the attachment
	 */
	public File getAttachment() {
		return attachment;
	}

	/**
	 * @param attachment
	 *            the attachment to set
	 */
	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

}
