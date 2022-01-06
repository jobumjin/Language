package step01.basic;

import org.junit.Test;

//1~5���� �ݺ� ���
//1 : �ʱ�ġ(����) / 5���� : ���� / 1���� 1�� ����(����ġ)

/*
 * - �ݺ�Ƚ���� ���� ������ ���� ��� ����
 * - ������ true�� ��츸����
 * for (�ʱ�ġ;���ǽ�;������){
 * 	true�� ��츸 ����Ǵ� ��
 * }
 * 
 * - ���� �ݺ��� ����/ �ݺ�Ƚ���� �Ҹ�Ȯ�� ��� ����
 * - ������ true�� ��츸����
 * �ʱ�ġ;
 * while(���ǽ�){
 * true�� ��츸 ����Ǵ� ��	
 * ������;
 * }
 * 
 * - ������ ������ ������ �ѹ��� ���� �����ؾ� �� ���
 * �ʱ�ġ;
 * do{
 * true�� ��� ����Ǵ� ��	
 * ������;
 * }while(���ǽ�);
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
			//������ true�� ��� ����
			System.out.println(i);
			i++;
		}
	}
	
}
