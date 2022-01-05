/* 학습내용
 * 
 * 1. API 응용
 * 	- Application Programming Interface
 *  - 이미 구현되서 사용 가능하게 제공해주는 코드들
 *  	클래스/변수/생성자/메소드
 *  - library 라고도 함
 *  
 * 2. tip 함축 표현
 * 	1. src - source
 * 	2. lib - library
 * 	3. bin - binary
 * 
 * 3. API 활용 문법
 * 	1. 변수/생성자/메소드 호출 문법
 * 	2. 호출 문법
 * 		1. 객체 생성 직후에 호출
 * 			- instance 변수와 instance 메소드
 * 		2. 객체 생성 없이 호출
 * 			- static 변수와 static 메소드
 * 	3. 외부 package 사용 문법
 * 		- import package명.class명;
 * 		- java.lang package만 유일하게 import 생략 가능
 * 
 */

package step05.apply;

public class L01APITest {

	public static void main(String[] args) {
		//? java.lang.Math 클래스의 메소드 활용
		// -3 값 주고 절대값(abs) 반환 int 주고 int 반환 받아 출력		
		System.out.println(Math.abs(-3));
		
		//? 저 문자열에서 기 하나만 출력
		//힌트 - 문자열 하나하나의 글자에 번호 부여, 0 부터 시작
		//기 - 0번째 글자
		/* API 개발자 관점
		 * 문자열(String 객체)데이터는 존재하는 전제
		 * 순자받아서(argument) 해당 숫자 위치값의 글자 하나(char)를 뽑음
		 * 	-> 반환
		 * 
		 * char charAt(int index){
		 * 		문자열 객체에서 index 내의 해당 char 착출 및 반환
		 * }
		 * static 하면 xxx
		 * 경우의 수 고려해 보기
		 * - 호출시 class 명으로만 호출 가능 단, index로 데이터 뽑을 수 있는 데이터가 없음
		 * - 논리적으로 문제 발생
		 * - 이런식의 개발은 안.된.다.
		 * static char charAt(int index){
		 * 		문자열 객체에서 index 내의 해당 char 착출 및 반환
		 * }
		 * System.out.println(static.charAt(0));
		 * 
		 * 만일 부득이 하게 static으로 선언을 하고 싶다면 해결책?
		 * static char charAt(String data, int index){
		 * 		parameter로 받은 문자열 객체에서 index 내의 해당 char 착출 및 반환
		 * }
		 */
		String data = "기술이 지적자산 가치 뽐뿌 - 기원";
		System.out.println(data.charAt(0));
	
		/* java.lang.Integer 라는 클래스의 메소드 사용
		 * "3" -> 3으로 변경해서 출력
		 * int ? (String v){}
		 * 
		 */
		System.out.println(Integer.parseInt("3")); //3
		/*	int로 변환 불가 포맷
		 *	차후에 Exception 즉 처리 가능한 경미한 에러	고려도 학습 필수
		 * 
		 */
		System.out.println(Integer.parseInt("삼")); 
		
		
	}
}
