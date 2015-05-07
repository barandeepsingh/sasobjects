package in.warecon.sas.model;

import java.util.ArrayList;

import javax.persistence.Entity;
@Entity
public class Subject {
	private int subjectId;
	private String subjectName;
	private ArrayList<Book> books;

	/**
	 * @return the subjectId
	 */
	public int getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId
	 *            the subjectId to set
	 */
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName
	 *            the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return the books
	 */
	public ArrayList<Book> getBooks() {
		return books;
	}

	/**
	 * @param books
	 *            the books to set
	 */
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
