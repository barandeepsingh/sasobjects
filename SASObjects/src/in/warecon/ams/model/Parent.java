package in.warecon.ams.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Parent extends Person {

	@ManyToMany
	@JoinTable(name = "PARENT_CHILD", joinColumns = @JoinColumn(name = "PARENT_ID"), inverseJoinColumns = @JoinColumn(name = "CHILD_ID"))
	private Collection<Student> children = new ArrayList<Student>();

	/**
	 * @return the parentId
	 */

	public Collection<Student> getChildren() {
		return children;
	}

	public void setChildren(Collection<Student> children) {
		this.children = children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(ArrayList<Student> children) {
		this.children = children;
	}

}
