package step01.basic;

public class L02Method {
	
	//생성자 - 객체라는 것을 만들때 필수로 사용되는 요소
	//개발자가 미구현시 컴파일 시점에 자동 생성
	//자바 기반의 객체 지향의 기본
	L02Method(){}
	
	//? 두개의 정수 받으셔서 하나의 정수값 반환, sum()
	//두개의 정수 받으셔서(argument, parameter, 인수, 인자, 매개변수...)
	//하나의 정수값 반환 int / return int 값
	int sum(int v1 ,int v2) {
		return v1 + v2;
	}
	
	int sum2(int v1 ,int v2) {
		int result = v1 + v2;
		return result;
	}
	// 메모리를 가급적 최소화하면..좋다.. 코드의 튜닝 필요 1번이 좋음..
	//result의 변수는 사실성 선언될 의미가 어차피 반환로직으로 한번만 사용됨
	//시스템 자원은 코드 하나하나에서 다 처리 필수
	
	//java L02Method 실행 요청시 해당 클래스의 main메소드를 JRE에서 자동 호출
	//main() 제외한 우리가 개발한 모든 메소드(끼능)들은 직접 코드로 호출
	public static void main(String[] args) {
		//단순 메소드 기능들을 호출해서 사용하기 위해 문법적으로 객체 생성
		//sum() 호출해서 반환받은 결과값을 main()에서 콘솔창에 출력
		//객체 생성 - sum(), sum2() 보유한 클래스로 부터 객체 생성
		//내가  만든 클래스는 자바의 타입으로 사용이 가능
		//java에서의 타입 개수는 제한이 없음 - 무한대 !!!
		//클래스를 기반으로 해서 새로운 데이터가 생성되었다는 객체 생성으로 간주
		// l - 생성된 객체를 참조하는 변수로 주소값 보유, 참조변수(reference변수)
		L02Method l = new L02Method(); // new - 객체 생성 키워드, L02Method() 생성자
		System.out.println(l);
		int r = l.sum(10,20);
		System.out.println("결과 - " + r);
		
		
		
//		int i = 3;
//		String s = "삼";
//		double d = 3.5;
		
	}
}
