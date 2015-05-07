package in.warecon.sas.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Student extends Person {

	private int rollNo;
	private Genus genus;// Class
	private int fees;
	private Date lastFeesDate;

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo
	 *            the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}

	/**
	 * @param fees
	 *            the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}

	/**
	 * @return the lastFeesDate
	 */
	public Date getLastFeesDate() {
		return lastFeesDate;
	}

	/**
	 * @param lastFeesDate
	 *            the lastFeesDate to set
	 */
	public void setLastFeesDate(Date lastFeesDate) {
		this.lastFeesDate = lastFeesDate;
	}

	public Genus getGenus() {
		return genus;
	}

	public void setGenus(Genus genus) {
		this.genus = genus;
	}

}
