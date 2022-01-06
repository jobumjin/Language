package step02.builder;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class People {
	private String name;
	private int age;
	

	public static void main(String [] args) {
		
		//다수의 변수중에 name 변수값만 초기화 하면서 객체 생성하는 구조
		/*
		 * People.builder() : PeopleBuilder 객체 반환
		 *  PeopleBuilder 
		 *  	- People 객체 생성해주는 객체
		 *  	- 변수 관련된 메소드를 자동 생성해서 제공
		 *  	- 선별해서 데이터 초기화(값 대입) 가능한 기능
		 *  
		 *  name("유재석") : name 변수에 종속적으로 값 대입되는 메소드
		 *  build() : 실제 해당 객체 생성해주는 메소드
		 *  
		 */
		
		People p = People.builder().name("유재석").build();
		System.out.println(p.name + " " + p.age);
		System.out.println(p);  //p.toString()
		
		
		
//		People p = new People();
//		p.setName("유재석");
//		p.setAge(45);
//		
//		People p2 = new People("유재석", 45);
//		System.out.println(p2);		
//		System.out.println(p2.toString());		
//		System.out.println(p);		//step01.People@2db0f6b2  >> 유재석 - 45
		
	}
}
