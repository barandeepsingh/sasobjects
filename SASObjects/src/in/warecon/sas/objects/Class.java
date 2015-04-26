package in.warecon.sas.objects;

import java.util.ArrayList;

public class Class {
	private int classId;
	private String grade;
	private String section;
	/**
	 * @return the classId
	 */
	public int getClassId() {
		return classId;
	}
	/**
	 * @param classId the classId to set
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
	 * @param grade the grade to set
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
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	
	public String toString(){
		return grade+"-"+section;
	}
	
	
	
	public static String getGradeName(int classId) {
		return null;
	}

	public static String getClassName(int classId) {
		return null;
	}

	public static ArrayList<Class> getClasses() {
		return null;
	}

	public static Class getClassById(int classId) {
		return null;
	}

	
}
