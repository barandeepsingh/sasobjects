package in.warecon.ams.model;

import in.warecon.ams.model.enums.UserType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WhatsAppMsg {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long msgId;
	private String message;
	private String mobile;
	private int receiverId;
	private UserType receiverType;

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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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

}
