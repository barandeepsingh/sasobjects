package in.warecon.sas.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Teacher extends Person {
	private Date doj;// Date of joining
	private Date dol;// Date of leaving
	private int employeeNo;
	private boolean isMarried;
	private boolean isClassTeacher;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "TEACHER_GENUS", joinColumns = @JoinColumn(name = "TEACHER_ID"), inverseJoinColumns = @JoinColumn(name = "GENUS_ID"))
	private Collection<Genus> classesTaught = new ArrayList<Genus>();
	@OneToOne
	@JoinTable(name = "TEACHER_GENUS")
	private Genus isClassTeacherOf;
	private int salary;
	@ManyToMany
	private Collection<Subject> subjects = new ArrayList<Subject>();

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
	public Collection<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
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

	public Collection<Genus> getClassesTaught() {
		return classesTaught;
	}

	public void setClassesTaught(Collection<Genus> classesTaught) {
		this.classesTaught = classesTaught;
	}

	public Genus getIsClassTeacherOf() {
		return isClassTeacherOf;
	}

	public void setIsClassTeacherOf(Genus isClassTeacherOf) {
		this.isClassTeacherOf = isClassTeacherOf;
	}

	public void setSubjects(Collection<Subject> subjects) {
		this.subjects = subjects;
	}

}
