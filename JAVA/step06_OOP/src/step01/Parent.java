package step01;

public class Parent extends Object{
	String name; //����Ÿ��
	int age; //�⺻
	
	public Parent() {
		super();
		System.out.println("�θ�");
	}
	
	void printAll() {
		System.out.println(name); //name.toString() ���� �ڵ����� �ٲ�
		System.out.println(age);
	}
}
