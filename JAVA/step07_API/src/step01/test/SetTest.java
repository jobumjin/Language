/* 학습내용 - Set
 * 1. 데이터들 중복 불허
 * 2. 저장 순서에 대한 보장 없음
 * 3. 데이터 하나하나 구분할 수 있는 고유한 index가 없음
 * 4. API를 보니 데이터 하나씩 반환 메소드 없음
 * 	- Iterator API 활용해서 하나씩 반환 가능한 기능
 * 		- boolean hasNext() : 데이터 확인
 * 		- Object next() : 데이터 하나 반환
 */

package step01.test;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("d"); //저장
		set.add("d"); //동일한 친구가 이미 있음 이 경우 저장일까 거부일까? 기존거 삭제 후 저장입니다.
		set.add("c");
		System.out.println(set); // [a, b, c, d]
		
		//set 내부의 데이터값들을 하나씩 착출 가능하게 해주는 객체
		/* hasNext() : 존재 여부 확인 메소드
		 * next() : 데이터 착출(메모리에서 꺼냄 즉 한번만 사용 가능한 객체 동일한객체 꺼낼 수 없음)
		 * 
		 */
		Iterator<String> all = set.iterator();
		String v = null;
		while(all.hasNext()) {
			v = all.next();
			System.out.println(v.charAt(0)); //형변환 없이 String만의 멤버 호출 가능
		}
		
		System.out.println("*** 왜 이럴까요? ***");
		HashSet<String> set2 = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("d"); //저장
		set.add("d"); 
		set.add("c");
		//제네릭 미반영된 구조의 허접한 퀄리티 쩝인 코드로 구현하지 맙시다. !! 
		//제네릭은 all 변수 선언처럼 유지하면서 활용하는 코드 권장
		Iterator<String> all2 = set2.iterator();//Object 타입? String타입?
		
		while(all2.hasNext()) {
			System.out.println(((String)all2.next()).charAt(0));
		}
	}

}
