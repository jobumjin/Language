package step02.builder;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class People {
	private String name;
	private int age;
	

	public static void main(String [] args) {
		
		//�ټ��� �����߿� name �������� �ʱ�ȭ �ϸ鼭 ��ü �����ϴ� ����
		/*
		 * People.builder() : PeopleBuilder ��ü ��ȯ
		 *  PeopleBuilder 
		 *  	- People ��ü �������ִ� ��ü
		 *  	- ���� ���õ� �޼ҵ带 �ڵ� �����ؼ� ����
		 *  	- �����ؼ� ������ �ʱ�ȭ(�� ����) ������ ���
		 *  
		 *  name("���缮") : name ������ ���������� �� ���ԵǴ� �޼ҵ�
		 *  build() : ���� �ش� ��ü �������ִ� �޼ҵ�
		 *  
		 */
		
		People p = People.builder().name("���缮").build();
		System.out.println(p.name + " " + p.age);
		System.out.println(p);  //p.toString()
		
		
		
//		People p = new People();
//		p.setName("���缮");
//		p.setAge(45);
//		
//		People p2 = new People("���缮", 45);
//		System.out.println(p2);		
//		System.out.println(p2.toString());		
//		System.out.println(p);		//step01.People@2db0f6b2  >> ���缮 - 45
		
	}
}
