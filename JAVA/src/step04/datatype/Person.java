//Generate 사용..
//사람 정보를 보유 및 수정 즉 사람 데이터 전담 클래스
package step04.datatype;

public class Person {
	String name;
	int age;
	
	public Person() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// this - 로컬변수와 멤버변수의 이름이 동일한 경우에 멤버 변수를 지정하게 되는 키워드
		// 자기자신의 객체를 참조하는 특별한 키워드
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
}
