/* 학습내용
 * 1. 데이터 타입 학습
 * 2. 데이터 타입이 활용이 되는 문법적인 위치
 * 	1. 멤버, 로컬 변수 선언시 타입
 * 	2. 리턴타입
 * 3. 데이터 타입 종류
 * 	1. 기본타입(내장 타입, built in 타입)
 * 		1. 총 8가지
 * 		2. class가 미존재한 상태로 소문자로 키워드로 타입이 이미 정해져 있음
 * 		3. 형태별로 구분
 * 			문자형/논리형/실수형/정수형
 * 		4. 형태별로 사이즈로도 세분화
 * 			1. 문자형 - Char, 16bit
 * 			2. 논리형 - boolean(true or false)
 * 			3. 실수형 - float, 32bit / double, 64bit
 * 			4. 정수형 - byte 8bit / short 16bit / int 32bit / long 64bit
 * 
 * 	2. 객체 타입(참조 타입, class 타입)
 * 		1. 기본이 아닌 모든 타입 의미
 * 		2. class를 기반으로 타입 생성
 * 		3. API 즉 이미 만들어서 개발자들에게 사용하라 제공하는 library에 다수의 class
 * 			즉 타입 존재
 * 		4. 문자열은 String.java 로 제공되는 클래스
 * 			사용빈도가 높아서 기본 타입처럼 문법을 제시
 * 		5. 객체 생성 문법
 * 			타입 변수 = new 생성자( [..] );
 * 			String 변수 = new String([문자열]);
 *			String 변수 = "문자열"; ""표기만으로 자동으로 String 객체 생성
 *		6. 생성된 객체가 실제 저장되는 메모리 - heap
 *			- heap 메모리 특징
 *				- 객체만 저장
 *				- 생성되는 객체는 보유한 모든 멤버 변수들 공간을 생성 관리
 *				- 객체들 메모리 회수는 garbage collector(GC)
 *			
 */

package step04.datatype;

public class L01DataType {

	String getName() {
		return "재석"; //재석이란 데이터를 보유한 문자열 객체 생성, 반환시엔 주소값 반환
	}

	Person getPerson() {
		Person p = new Person();
		return p;
	}
	
	void setName(String name) {
		String n = "너의 이름은 : " + name;
	}
	
	void setPerson(Person p) {
		Person p2 = p;
	}
	
	public static void main(String[] args) {
		L01DataType l = new L01DataType();
		String n = l.getName();
	}

}
