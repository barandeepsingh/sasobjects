package in.warecon.sas.objects;

import java.util.ArrayList;

public class Teacher extends Person {
	private int employeeNo;
	private boolean isMarried;
	private boolean isClassTeacher;
	private int salary;
	private ArrayList<Subject> subjects;

	/**
	 * @return the employeeNo
	 */
	public int getEmployeeNo() {
		return employeeNo;
	}

	/**
	 * @param employeeNo
	 *            the employeeNo to set
	 */
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

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
	 * @return the isClassTeacher
	 */
	public boolean isClassTeacher() {
		return isClassTeacher;
	}

	/**
	 * @param isClassTeacher
	 *            the isClassTeacher to set
	 */
	public void setClassTeacher(boolean isClassTeacher) {
		this.isClassTeacher = isClassTeacher;
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

	/**
	 * @return the subjects
	 */
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

}
