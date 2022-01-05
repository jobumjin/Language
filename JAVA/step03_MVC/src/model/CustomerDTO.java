package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class CustomerDTO {
	private String id;
	private int pw;
	private char grade; //g(gold), s(silver) 두 레벨만 OK 가능 가정
	private String job;
	//private로 바꿀 수 없도록 만들어 준다.
	
	// grade값에 유효한 값만 저장 가능한 조건식 적용(유효성 적용)
	// 유효한 데이터만 저장 가능하게 하는 rule
	//- 절대 타입만 맞다고해서 대입 가능한 상황은 금지
	// 변수를 외부에서 호출 불가능하게 막아 놓고 유효성 코드로 검증 후에만 대입
	// 개발 관점 : 변수를 외부에서 차단(private) 
	// 유효성 코드로 검증 메소드는 제한없이 허용(public) 
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's') {
			this.grade = grade;			
		}else {
			System.out.println("무효한 등급");
		}
	}
}
