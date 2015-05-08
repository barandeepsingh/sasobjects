package in.warecon.sas.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student extends Person {

	private Date doj;// Date of joining
	private Date dol;// Date of leaving
	@ManyToMany(mappedBy="children")
	private Collection<Parent> parents = new ArrayList<Parent>();
	private int rollNo;
	private Genus genus;// Class
	private int fees;
	private Date lastFeesDate;
	@ManyToMany
	@JoinTable(name = "STUDENT_SUBJECT", joinColumns = @JoinColumn(name = "STUDENT_ID"), inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID"))
	private Collection<Subject> subjectsStudying = new ArrayList<Subject>();

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

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDol() {
		return dol;
	}

	public void setDol(Date dol) {
		this.dol = dol;
	}

}
