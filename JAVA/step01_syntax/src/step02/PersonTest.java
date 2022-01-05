package step02;

public class PersonTest {

	public static void main(String[] args) {
		//김민기, 김민준 두분의 정보로 Person 객체 생성
		Person p1 = new Person();
		p1.setName("민기");
		
		Person p2 = new Person();
		p2.setName("민준");
		
		//참조변수로 관리되는 객체의 데이터들은
		//개별 객체들을 명확히 괄리할 수 있음
		//데이터 혼용 안됨을 보장
		
		p1.setAge(10);
		p2.setAge(10);

		System.out.println(p1.getName() + " " + p2.getName());
	}

}
