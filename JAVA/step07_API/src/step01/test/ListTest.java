/* list 자료구조 API
 * 1. Object[] 배열과 흡사
 * 2. index로 관리
 * 3. 배열과의 차이점
 * 		- class로 기능이 제공
 * 		- 데이터들을 메소드로 활용
 * 		- 배열은 한번 생성된 크기가 변경 불가
 * 		- list는 동적으로 메모리 크기 변경
 * 
 * 4. 특징 - 객체 타입들만 저장 가능
 *  - 가령 3이라는 숫자값만 저장하고 싶은 경우 해결책
 *  	- 기본값들을 객체처럼 표현 가능하게 해주는 8가지 도우미 클래스들 존재
 *  	- int : Integer(클래스, 참조 타입) / byte : Byte(클래스, 참조 타입) 등
 *  	- wrapper class들 존재(8가지)
 *  		- 기본 타입을 객체 처럼 사용 가능하게 support해주는 클래스
 * 
 * 5. 주요 API
 * 	1. 저장/활용(반환)/삭제
 * 		- add(Object)/get(int)/remove(int)
 * 	2. 저장된 데이터 개수 확인
 * 		- size()
 * 
 * 6. 다른 관점에서의 list
 * 	- 속도
 * 		데이터 증가시 메모리 증가/데이터 삭제시 삭제된 이후의 데이터 re index
 * 		- 실행 속도 측면에서는 배열보다 더.디.다.
 * 
 * 	- 혹여 다수의 데이터들을 실시간 저장 삭제시에는 배열보다 권장하나
 * 		삭제하는 데이터가 배열 중간에 포함되어 있다면 비추
 * 		삭제하는 데이터들이 마지막 부분에 저장되어 있다면 권장
 * 
 * 
 */
package step01.test;

import java.util.ArrayList;

import model.domain.CustomerDTO;

public class ListTest {

	// 정통 문법 - 객체 타입인 경우 무조건 모두 다 저장
	public static void m() {
		// 데이터 저장 가능한 메모리 생성
		ArrayList al = new ArrayList();// 10개의 메모리 공간을 보유한 객체 생성

		// 데이터를 2개 저장 - String, Integer 타입은 서로 연관성 없음/ 단 Object 타입
		// public boolean add(Object o) {parameter로 유입된 데이터를 ArrayList에 저장)
		al.add("문자열"); // 0번째로 저장
		al.add(new Integer(3)); // al.add(3); 컴파일시 al.add(new Integer(3))으로 자동 변경
		al.add("문자열2"); 
		al.add(new Integer(3)); 

		// 저장된 데이터 개수 확인 - 메모리 개수 확인
		System.out.println(al.size()); 
		
		//모든 데이터 단순 출력
		System.out.println(al); //al.toString() 재정의 : 보유된 모든 데이터값 하나의 문자열로 반환
		
		//index 2번째의 문자열2 삭제 후 size()호출
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
	}
	
	//저장(add) 활용(get)
	/* public boolean add(Object o){}
	 * public Object remove(int index){}
	 * public Object get(int index){ 해당 index의 저장되어 있는 데이터 반환 }
	 * 
	 */
	public static void m2() {
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		System.out.println(al.get(2)); //3
		al.remove(2); //해당 index 삭제 하면서 뒤에 저장되어 있던 데이터들 index 재 정렬
		System.out.println(al.get(2)); //4
		
	}
	
	public static void m3() {
		//초기 생성되는 메모리 개수 + 증가치 메모리 개수
		ArrayList al = new ArrayList(5);//5개 메모리 생성 의미 / () 10개의 메모리 생성 의미 / 동적 메모리
		al.add("1");
		al.add("2");
		System.out.println(al.size()); //2
		al.add("3");
		al.add("4");
		al.add("5");
		System.out.println(al.size()); //5
		//5개 이상의 메모리를 필요로 할 경우 6번째 데이터 저장시 메모리를 5개씩 증가
		al.add("6");
		System.out.println(al.size()); //6
		al.add("7");
		al.add("8");
		
		String s = (String)al.get(0);
		System.out.println(s.charAt(0)); //String 메소드 호출을 위해 형변환 필수
		
		System.out.println(al.size()); //8
	}
	
	// 타입을 제한할 수 있는 jdk1.5부터 제시된 제네릭 문법
	//향후 개발시에는 자료구조 API로 데이터 관리시에 대부분 동일한 데이터 관리
	//타입 제한 기술인 제네릭 사용시 장점
	//타입이 명확해지고, 형변환 없이 API를 사용 가능
	public static void m4() {
		//String만 저장 가능한 동적 배열 구조 생성
		//String[] 타입으로 간주 단, 메모리 크기 제한없음
		ArrayList<String> al = new ArrayList<String>();
		al.add("1");
		al.add("2");
		al.add("3");
		String s = al.get(0);
		System.out.println(s.charAt(0));
	}
	
	//고객의 모든 정보를 관리자 화면에 출력을 위해 db로 select -> 
	//CustomerDTO 객체들 생성 -> ArrayList에 저장 -> 반환
	public static ArrayList<CustomerDTO> getCustomers(){
		
		ArrayList<CustomerDTO> all = new ArrayList<CustomerDTO>(); //10개의 메모리 생성
		
		all.add(new CustomerDTO("u1",11)); //0번째 저장
		all.add(new CustomerDTO("u2",22)); //1번째 저장
		
		return all;
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<CustomerDTO> all = getCustomers();
		System.out.println(all.get(1).getId());
		
		
//		m();
//		m2();
//		m3();
//		m4();
	}

}
