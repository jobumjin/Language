//step02.Person �迭 Ȱ��

package step06.array;

import step02.Person;

public class Array2 {
	
	//Person����� �迭 ���� �� ��ȯ
	public static Person[] getPersonArray() {
		//The constructor Person(String, int) is not visible
	//	Person P = new Person("���缮", 40);
		
		Person p1 = Person.builder().name("���缮").age(40).build();
		Person p2 = Person.builder().name("������").age(50).build();
		
		Person [] i = {p1, p2}; //Person�迭 Ÿ���� ����
		return i;
	}
	
	
	//Person����� ������ �迭 �޾Ƽ� ���
	//�ݺ��� �߰� �н�
	public static void printArray(Person[] v) {
		System.out.println(v[0]);
		System.out.println(v[1]);
	}
	
	//eclipse ����Ű - ����, �޼ҵ� �� ������ ȣ���� ������ ���ÿ� �����ϱ� ���� ����Ű
	//alt + shift + r -> ���� -> enter
	public static void printArrayFor1(Person[] v) {
		for(int i = 0; i < 2; i++) {
			System.out.println(v[i]);
		}
	}
	
	//length - ������ �迭�� �ڵ� �߰��Ǵ� ����(�迭 ũ�Ⱚ ����)
	public static void printArrayFor2(Person[] v) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	//v[i]
	/* v�� Person[]
	 * v[0] - Person
	 */
	//�迭, List ��ü�鿡�� ���Ǵ� �ݺ���
	public static void printArrayForEach(Person[] v) {
		for(Person i : v) {//i �� �迭�� �� ����� �����͸� �����ް� �Ǵ� ����
			System.out.println(i.getName());
		}
	}
	
	public static void printArrayWhile(Person[] v) {
		int i = 0;
		while(i < v.length) {
			System.out.println(v[i]);
			i++;
		}
	}
	
	public static void main(String[] args) {		
		Person[] v1 = getPersonArray();
		printArray(v1);
		
		System.out.println("--- for ---");
		printArrayFor1(v1);
		
		System.out.println("--- while ---");
		printArrayWhile(v1);
		
		System.out.println("--- forEach ---");
		printArrayForEach(v1);
				
	}
	
}
