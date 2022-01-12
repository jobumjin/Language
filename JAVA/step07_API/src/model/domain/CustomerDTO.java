//domain 단어는 데이터 주제 의미하기도 함
package model.domain;

public class CustomerDTO {
	private String id;
	private int pw;
	
	/* 자바는 생성자 필수
	 * 코드로 개발을 안 했을 경우 기본 생성자를 자동생성
	 * 필요에 의해서 멤버 변수를 초기화 하는 생성자는 직접 구현
	 *  - 권장 사항 : 기본생성자 개발도 필수
	 *  
	 *  객체 생성 순서
	 *   - 호출은 CustomerDTO 먼저 했으나 내부적으론 Object 객체가 먼저 생성
	 *   CustomerDTO c = new CustomerDTO(); 
	 *   //문자열, 정수 두개의 데이터를 보유 가능한 메모리 생성
	 */
	public CustomerDTO() {
		super();//부모 객체가 먼저 생성되게 해주는 필수 문법
	}

	public CustomerDTO(String id, int pw) {
//		super(); 생략시에도 자동 추가, 단 super([..]) 코딩시에만 자동 적용 불가
		this.id = id;
		this.pw = pw;
	}
	
	//호출할 경우 id 값을 문자열 타입에 맞게 변환
	//호출한 메소드 : caller / 호출되어 실행되는 메소드 : walker
	//getter 메소드
	public String getId() {
		return id;
	}

	public void setId(String id) { //로컬 변수, parameter, argument, 매개변수, 매개인자, 인수..
		this.id = id;  //값 대입, 멤버 변수 초기화
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	/* 주로 domain(값을 표현하는) 클래스들 기반으로 생성되는 객체들을 println() 출력시에
	 * toString() 자동 호출
	 * 개발자 편리성에 의해서 java.lang.Object내의 메소드는 생성된 객체의 주소값 반환
	 * 주소값은 개발시에는 값으로는 사용할 일이 없음
	 * 하위 클래스들이 재정의
	 */
	@Override	//재정의 메소드 선언구 = 옵션
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + "]";
	}
}
