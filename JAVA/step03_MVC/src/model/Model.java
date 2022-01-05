package model;

public class Model {
	//controller의 요청으로 한명의 정보르 db로 부터 검색해서
	//CustomerDTO 생성해서 변환
	public static CustomerDTO getCustomer() {
		//? 객체 생성
		//? setXxx() 메소드로 id는 encore/pw =11/grade=g
		//? 반환
		CustomerDTO c = new CustomerDTO();
		//기본값으로 정보가 들어있는 객체 생성
		
		//정보투입..
		c.setId("encore");
		c.setPw(11);
		c.setGrade('g');
		
		return c;
		
	}
	
	//...CRUD
}
