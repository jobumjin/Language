package model.dto;

public class Student {
	private int id;
	private String name;
	private String department;
	private int num;

	public Student() {
	}

	public Student(int id, String name, String department, int num) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.num = num;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", num=" + num + "]";
	}

}
