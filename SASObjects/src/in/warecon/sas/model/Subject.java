package in.warecon.sas.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Subject {
	@ManyToMany(mappedBy = "subjectsStudying")
	private Collection<Student> studentsList = new ArrayList<Student>();
	@Id
	@Column(unique = true)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long subjectId;
	private String subjectName;
	@OneToMany
	@JoinTable(name = "SUBJECT_BOOKS", joinColumns = @JoinColumn(name = "SUBJECT_ID"), inverseJoinColumns = @JoinColumn(name = "BOOK_ID"))
	private Collection<Book> books = new ArrayList<Book>();

	/**
	 * @return the subjectId
	 */
	public long getSubjectId() {
		return subjectId;
	}

	/**
	 * @param subjectId
	 *            the subjectId to set
	 */
	public void setSubjectId(long subjectId) {
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

	public Collection<Book> getBooks() {
		return books;
	}

	public void setBooks(Collection<Book> books) {
		this.books = books;
	}

}
