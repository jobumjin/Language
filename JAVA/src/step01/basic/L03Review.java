/* 학습내용
 * class 내부에 구현해야만 하는 요소들
 * 
 * 1. 변수 선언 및 호출
 * 	- 데이터
 *  - 타입 변수명;
 *  - 타입 변수명 = 값;
 * 
 * 2. 생성자 구현 및 호출
 *  - 클래스명과 동일 ,(){}
 *  - 용도 : 객체 생성
 *  	- new 라는 객체 생성 키워드
 *  	- 객체생성 문법
 *  		new 생성자([값]);
 * 		- 클래스가 보유한 메소드 호출의 첫 단계는 객체 생성후 참조 변수로 메소드 호출
 * 
 * 3. 메소드 구현 및 호출
 * 	- 객체 생성시에 호출되는 생성자와 다름
 *  - 반환타입 메소드명 ( [arguments] ){ [logic] }
 *  
 * =======
 * 사고하는 힘 기르기 질문
 * 1. name과 age 변수 즉 데이터가 실제 저장(사용) 가능하게 시스템에 메모리를 생성하는 시점
 * 		= 객체 생성 시점
 */

package step01.basic;

public class L03Review {
	String name;
	int age;
	
	L03Review(){} // 미구현시 컴파일시점에 자동 추가
	
	//? 백종원 이름 반환하는 getName()
	String getName() {
		return "백종원";
	}
	
	public static void main(String[] args) {
		//name = "백종원"; 메모리 자체가 없다!
		
		L03Review l = new L03Review(); //객체생성, 메모리 생성
		
		System.out.println(l.name); // null
		l.name = "유재석";
		System.out.println(l.name); // 유재석
		
		String n = l.getName();
		System.out.println(n); // 백종원

	}
}
