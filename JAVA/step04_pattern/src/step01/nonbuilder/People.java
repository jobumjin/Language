package step01.nonbuilder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter	
public class People {
	private String name;
	private int age;
	
	//기본 생성자 - argument가 없는 생성자 의미
	//생성자가 없는 경우 컴파일러가 생성해주는 생성자
	public People() {}
	
	//생성자 - 객체 생성시 사용자가 저장하고자 하는 값으로 객체 생성
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//상속시에 추가 학습
	/* java 의 모든 클래스의 최상위 root 존재 = java.lang.Object
	 * - 변수와 메소드는 모든 클래스가 상속받아 보유하고 있는 상황
	 * - toString() 메소드만 고려
	 * 		- Object의 toString() 기능 - 생성된 객체명과@위치값을 문자열로 반환
	 * - 단, 자식 클래스에서 
	 * 	: 메소드 재정의(overiding, overide)
	 * 메소드 기능(body) 수정
	 */
	public String toString() {
		return name + " - " + age;	//하나의 String으로 결합되어 반환 
	}
	
	//참조 변수값 출력시에 toString() 자동 호출 즉 toString() 변환값이 출력
	public static void main(String [] args) {
		//? parameter가 있는 생성자 호출하셔서 유재석, 45 저장
		People p = new People();
		p.setName("유재석");
		p.setAge(45);
		
		People p2 = new People("유재석", 45);
		System.out.println(p2);		
		System.out.println(p2.toString());		
		System.out.println(p);		//step01.People@2db0f6b2  >> 유재석 - 45
		
	}
}
