/* 1. Object는 모든 클래스의 상위타입
 * 2. 모든 객체 타입 다 수용
 * 3. 다형성 문법으로 생성된 객체들은 하위 타입의 변수에 대입 가능
 *  	= 형변환
 * 4. Object 변수 = "test"; Ok
 */


package step03.test;

public class OOPTest {
	//Object 변수 = "String";
	static Object m1() { //Object 타입으로 형변환 즉 다형성 적용, 상위타입으로 변환되서 반환
		return "String"; //String 객체 생성 및 리턴
	}
	
	//문자열 두개, People 객체 등 다양한 타입의 객체들을 하나의 공간으로 관리
	//이상적인 데이터 타입 선택 - 배열
	//고려사항 - String과 People등은 다 다른 참조 타입
	//서로 연관없는 객체들 참조 타입을 저장 및 관리하기 위해서는 배열 타입은 무슨타입?? Object[]
	/* public int intValue(){
	 *  Integer라는 객체가 보유한 값을 int 기본 타입으로 변환해서 반환하는 메소드
	 * }
	 * 
	 * main메소드에서 m2()호출
	 * 첫번째 출력 : playdata에서 p만 출력
	 * 두번째 출력 : Integer 객체 뽑아서 intValue() 호출 및 출력
	 * 
	 */
	
	static Object[] m2() {
		Object[] o = {"string","playdata",new Integer(3)};
		return o;
	}
	
	
	public static void main(String[] args) {
		System.out.println("--- step02 ---");

		Object[] v = m2(); //m2() 반환타입 Object[]
		String v1 = (String)v[1]; //v[1] = Object(최상위타입) / v1 = String
		System.out.println(v1.charAt(0));
		
		Integer v2 = (Integer)v[2];
		System.out.println(v2.intValue());

		System.out.println("--- step01 ---");
		String s = (String)m1(); //? 단 s는 반드시 String 타입이여야함
		
		//Object 타입의 변수들은 String 자식만의 멤버 호출 불가
		//String으로 형변환 후 String만의 멤버 호출
		//charAt() String 클래스에 존재
		System.out.println(s.charAt(1)); //String 문자열 중 두번째 t만 뽑아서 출력해 주세요
		
		//o 변수는 상속시킨 멤버들에만 access 가능한 변수
		//String 만의 멤버 호출 불가
//		Object o = m1();
//		System.out.println(o.); 안 됨..
	}

}
