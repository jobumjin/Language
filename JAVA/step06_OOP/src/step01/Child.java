package step01;

public class Child extends Parent{
	String job;
	
	public Child() {
		//Object 객체 -> Parent 객체 생성 완료
		// name/age 메모리 생성
		super(); //생성자 첫 라인에 필수인 코드, 생략시 컴파일러가 자동 추가해줌
		System.out.println("자식");
	}//실행 종료 / job 메모리 생성
	
	@Override
	void printAll() {
//		System.out.println(name); //name.toString() 으로 자동으로 바뀜
//		System.out.println(age);
//		super.printAll(); //부모(super)클래스의 해당 메소드 로직 100% 그대로 적용하는 단일 문장
		System.out.println(job);
	}
	
	@Override
	public String toString() {
		return name + "-" + age + "-" + job;
	}
	
	public static void main(String[] args) {
		/* 생성된 객체
		 * Object -> Parent -> Child
		 * c라는 변수는 어떤 타입? Child 타입이라 함 */
		Child c = new Child();
		System.out.println(c); //step01.Child@7de26db8 toString() null-0-null
		
		c.name = "유재석";
		c.age =20;
		c.job = "선한 영향력의 아이콘";
		
		System.out.println(c.name);
		System.out.println(c); // 유재석-20-선한 영향력의 아이콘
	}

}
