package in.warecon.sas.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
// Genus is synonym for Class.Class is a reserved word in Java and SQL so can
// cause issues
public class Genus {
	private int classId;
	private String grade;
	private String section;
	@OneToOne(mappedBy="isClassTeacherOf")
	private Teacher teacherOfGenus; 
	@ManyToMany(mappedBy = "genusList")
	private Collection<Book> booksList = new ArrayList<Book>();

	/**
	 * @return the classId
	 */
	public int getClassId() {
		return classId;
	}

	/**
	 * @param classId
	 *            the classId to set
	 */
	public void setClassId(int classId) {
		this.classId = classId;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section
	 *            the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	public String toString() {
		return grade + "-" + section;
	}

}
