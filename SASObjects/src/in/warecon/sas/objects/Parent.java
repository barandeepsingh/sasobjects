package in.warecon.sas.objects;

import java.util.ArrayList;

public class Parent extends Person{
	private int parentId;
	private ArrayList<Student> children;

	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @param parentId
	 *            the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the children
	 */
	public ArrayList<Student> getChildren() {
		return children;
	}

	/**
	 * @param children
	 *            the children to set
	 */
	public void setChildren(ArrayList<Student> children) {
		this.children = children;
	}

}
