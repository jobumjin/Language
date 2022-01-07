package step01;

public class Parent extends Object{
	String name; //참조타입
	int age; //기본
	
	public Parent() {
		super();
		System.out.println("부모");
	}
	
	void printAll() {
		System.out.println(name); //name.toString() 으로 자동으로 바뀜
		System.out.println(age);
	}
}
