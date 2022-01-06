//step02.Person 배열 활용

package step06.array;

import step02.Person;

public class Array2 {
	
	//Person값들로 배열 생성 및 반환
	public static Person[] getPersonArray() {
		//The constructor Person(String, int) is not visible
	//	Person P = new Person("유재석", 40);
		
		Person p1 = Person.builder().name("유재석").age(40).build();
		Person p2 = Person.builder().name("백종원").age(50).build();
		
		Person [] i = {p1, p2}; //Person배열 타입의 변수
		return i;
	}
	
	
	//Person값들로 구성된 배열 받아서 출력
	//반복문 추가 학습
	public static void printArray(Person[] v) {
		System.out.println(v[0]);
		System.out.println(v[1]);
	}
	
	//eclipse 단축키 - 변수, 메소드 명 수정시 호출한 곳까지 동시에 변경하기 위한 단축키
	//alt + shift + r -> 수정 -> enter
	public static void printArrayFor1(Person[] v) {
		for(int i = 0; i < 2; i++) {
			System.out.println(v[i]);
		}
	}
	
	//length - 생성된 배열에 자동 추가되는 변수(배열 크기값 보유)
	public static void printArrayFor2(Person[] v) {
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	//v[i]
	/* v는 Person[]
	 * v[0] - Person
	 */
	//배열, List 객체들에게 사용되는 반복문
	public static void printArrayForEach(Person[] v) {
		for(Person i : v) {//i 는 배열의 각 요소의 데이터를 보유받게 되는 변수
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
