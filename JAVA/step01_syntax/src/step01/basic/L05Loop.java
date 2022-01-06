package step01.basic;

import org.junit.Test;

//1~5까지 반복 출력
//1 : 초기치(시작) / 5까지 : 조건 / 1부터 1씩 증가(증가치)

/*
 * - 반복횟수가 나름 제한이 있을 경우 권장
 * - 조건이 true인 경우만실행
 * for (초기치;조건식;증감식){
 * 	true인 경우만 실행되는 블럭
 * }
 * 
 * - 무한 반복시 권장/ 반복횟수가 불명확할 경우 권장
 * - 조건이 true인 경우만실행
 * 초기치;
 * while(조건식){
 * true인 경우만 실행되는 블럭	
 * 증감식;
 * }
 * 
 * - 조건을 떠나서 무조건 한번은 실행 보장해야 할 경우
 * 초기치;
 * do{
 * true인 경우 실행되는 블럭	
 * 증감식;
 * }while(조건식);
 * 
 */
public class L05Loop {
	
	//@Test
	public void forM() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	@Test
	public void WhileM() {
		System.out.println("--- while loop ---");
		int i = 1;
		while(i <= 5) {
			//조건이 true인 경우 실행
			System.out.println(i);
			i++;
		}
	}
	
}
