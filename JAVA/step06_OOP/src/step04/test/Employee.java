package step04.test;

public class Employee extends Person {
	String dept;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", name=" + name + ", age=" + age + "]";
	}
	
}
