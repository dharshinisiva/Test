package beantwo;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private String dept;
	private int rank;
	private int total;
	private int mark;

	ArrayList<Subject> subjectList;

	public Student(int id, String name, String dept, ArrayList<Subject> subjectList) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.subjectList = subjectList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + ", rank=" + rank + ", total=" + total
				+ ", mark=" + mark + ", subject=" + subjectList + "]";
	}

}