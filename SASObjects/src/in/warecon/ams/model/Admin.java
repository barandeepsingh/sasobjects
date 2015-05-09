package in.warecon.ams.model;

import javax.persistence.Entity;

@Entity
public class Admin extends Person {
	private boolean isMarried;
	private int salary;


	/**
	 * @return the isMarried
	 */
	public boolean isMarried() {
		return isMarried;
	}

	/**
	 * @param isMarried
	 *            the isMarried to set
	 */
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
