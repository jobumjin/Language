/* 학습 내용 : Map
 * 1. 고유한 구분자(key)로 값(value) 관리 및 활용하는 구조
 * 2. 객체 타입만 활용
 * 3. key는 중복 불허/value 중복 가능
 * 
 */
package step01.test;

import java.util.ArrayList;
import java.util.HashMap;
import model.domain.Employee;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> maps = new HashMap<String, String>();
		maps.put("a","유재석"); //저장
		maps.put("b","백종원"); //저장
		maps.put("c","유관순"); //저장 단 a라는 key로 이미 존재하는 객체는 삭제 후 저장
		
		//재정의된 toString() 반환값 단순 출력
		System.out.println(maps); //{a=유관순, b=백종원}
		
		//고유한 key로 데이터 하나 뽑아서 출력
		String v = maps.get("a");
		System.out.println(v);
		
		HashMap<String, Employee> maps2 = new HashMap<String, Employee>();
		maps2.put("11",new Employee("11","smith",10));
		maps2.put("22",new Employee("22","master",10));
		
		//? smith 이름만 출력해보기
		System.out.println(maps2.get("11").getEname()); //smith
		
		/* 부서별로 직원 저장(ArrayList) -> 부서를 구분자로 모든 직원들을 저장(HashMap)
		 */
		System.out.println("*** Map에 List 저장 및 활용 ***");
		
		ArrayList<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee("11","emp01",10));
		emps.add(new Employee("22","emp02",10));
		emps.add(new Employee("33","emp03",10));
		
		HashMap<String, ArrayList<Employee>> all = new HashMap<String, ArrayList<Employee>>();
		all.put("총무부", emps);
		
		//? emp03이라는 직원의 이름 출력
		System.out.println(all.get("총무부").get(2).getEname());
		
		//? emp02 -> 김혜경 으로 변경 -> 출력(확인)
		all.get("총무부").get(1).setEname("김혜경");
		System.out.println(all.get("총무부").get(1).getEname());
		
	}

}
