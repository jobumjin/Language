//예외 처리 문장 학습
package step07.exception;

class B{
	static{
		System.out.println("B class 로딩");
	}
}

public class Exception2 {
	
	public static void m1() {
		System.out.println("예외 발생 여지가 없는 로직");
	}
	
	//런타임 예외
	public static void m2() {
		System.out.println("예외 발생 여지가 있으나 실행 에외");
		System.out.println(10/0);
		System.out.println("try~catch문장 없었기 때문에 예외 발생시 실행 불가");
	}
	
	//컴파일 예외 - try~catch문장 필수
	public static void m3() {
		try {//로직 단 예외 발생 가능성있는 코드 블록
			
			System.out.println("로딩전");
			Class.forName("step07.exception.B==="); //문제 발생 가능성 있는 라인
			System.out.println("로딩후"); // 예외 발생시 실행 무시
			
		}catch(ClassNotFoundException e) { //실제 예외 발생시 처리하는 블록
			System.out.println("B 로딩시 문제 발생");
		}finally {
			//견고한 필수 로직에 권장하는 블록 : 시스템 자원 반환 로직으로 사용
			System.out.println("예외 발생 여부와 무관하게 99% 실행 보장 블록");
		}
		
		System.out.println("언제나 실행되는 로직");
	}
	
	//예외발생해서 직접 호출한 곳으로 throws 해보기
	//m4() 호출한 곳에서 예외 처리
	//java.lang.Exception 클래스를 활용
	//로직 - 값이 playdata가 아니면 예외 발생
	// ! - 부정연산자, !true -> false, !false -> true
	/* throws - body에서 발생될 수도 있는 예외를 호출한 곳으로 던지기 위해 메소드 선언구에 쓰이는 키워드
	 * throw - 메소드 body에서 실제 상황상 예외를 생성해서 던지는 키워드
	 */
	public static void m4(String v) throws Exception{
		//playdata 가 아닌 경우만 true가 되는 조건식
		//if 조건이 true인 경우 if 블록 즉 예외객체 생성과 던짐 로직으로 메소드 자동 종료
		if(!v.equals("playdata")) {
			//Exception의 message 멤버 변수값 초기화하는 생성자
			throw new Exception("playdata 가 아님 따라서 문제 심각");
		}
		
		System.out.println("playdata인 경우에만 실행되는 로직들");
	}
	
	public static void main(String[] args) {
//		m1();
//		m2(); // 발생에 대한 확인
//		m3();
		try {
			//m4("playdata");
			m4("playdata2");
		} catch (Exception e) {
			System.out.println(e.getMessage()); //예외 객체 생성자에 적용한 parameter값 반환하는 메소드
			e.printStackTrace(); //발생된 문제의 모든 소스상의 히스토리 출력
		}
	}
}


/*문제 4~5개 만들기
 * 
 */


