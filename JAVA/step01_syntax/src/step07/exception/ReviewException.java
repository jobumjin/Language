package step07.exception;

class C{
	static {
		System.out.println("C class 로딩");
	}
}

public class ReviewException {
	
	// 문제 1 : 실행예외 수정하기
	// 정답 1 : 0 ->이 아닌 자연수로 바꾼다.
	public static void q1() {
		System.out.println(10/0);
	}
	// 문제 2 : try~catch 실행결과는?
	// 정답 2 : C class 로딩
	public static void q2() {
		try {
			Class.forName("step07.exception.C");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 문제 3 : "3보다 작습니다." 를 출력하기 위해 q3(--)중 --에 들어가야할 숫지(0이상)을 입력하세요
	// 정답 3 : 0, 1, 2
	
	public static void q3(int v) throws Exception {
		if(v<3) {
			throw new Exception("3보다 작습니다");
		}
		System.out.println("3보다 작은수를 입력하세요.");
	}
	
	// 문제 4 : 예외발생과 무관하게 출력할 수 있는 코드를 추가하세요
	/* 정답 4 : 
	 * finally {
	 * 		System.out.println("예외발생과 무관하게 출력");
	 *	}
	 */
	public static void q4() {
		try {
			Class.forName("step07.exception.C===");
		}catch(ClassNotFoundException e) {
			System.out.println("C 로딩시 문제 발생");
		}
	}
	
	// 문제 5 : 반복문안에 코드를 수정하여 인덱스초과 예외처리를 발생시켜보시오.
	// 정답 5 : 여러가지 정답이 있음
	
	public static void q5() {
		int arr[] = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		q2();
		
		try {
			q3(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
