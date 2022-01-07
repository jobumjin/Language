/* 1. Object�� ��� Ŭ������ ����Ÿ��
 * 2. ��� ��ü Ÿ�� �� ����
 * 3. ������ �������� ������ ��ü���� ���� Ÿ���� ������ ���� ����
 *  	= ����ȯ
 * 4. Object ���� = "test"; Ok
 */


package step03.test;

public class OOPTest {
	//Object ���� = "String";
	static Object m1() { //Object Ÿ������ ����ȯ �� ������ ����, ����Ÿ������ ��ȯ�Ǽ� ��ȯ
		return "String"; //String ��ü ���� �� ����
	}
	
	//���ڿ� �ΰ�, People ��ü �� �پ��� Ÿ���� ��ü���� �ϳ��� �������� ����
	//�̻����� ������ Ÿ�� ���� - �迭
	//������� - String�� People���� �� �ٸ� ���� Ÿ��
	//���� �������� ��ü�� ���� Ÿ���� ���� �� �����ϱ� ���ؼ��� �迭 Ÿ���� ����Ÿ��?? Object[]
	/* public int intValue(){
	 *  Integer��� ��ü�� ������ ���� int �⺻ Ÿ������ ��ȯ�ؼ� ��ȯ�ϴ� �޼ҵ�
	 * }
	 * 
	 * main�޼ҵ忡�� m2()ȣ��
	 * ù��° ��� : playdata���� p�� ���
	 * �ι�° ��� : Integer ��ü �̾Ƽ� intValue() ȣ�� �� ���
	 * 
	 */
	
	static Object[] m2() {
		Object[] o = {"string","playdata",new Integer(3)};
		return o;
	}
	
	
	public static void main(String[] args) {
		System.out.println("--- step02 ---");

		Object[] v = m2(); //m2() ��ȯŸ�� Object[]
		String v1 = (String)v[1]; //v[1] = Object(�ֻ���Ÿ��) / v1 = String
		System.out.println(v1.charAt(0));
		
		Integer v2 = (Integer)v[2];
		System.out.println(v2.intValue());

		System.out.println("--- step01 ---");
		String s = (String)m1(); //? �� s�� �ݵ�� String Ÿ���̿�����
		
		//Object Ÿ���� �������� String �ڽĸ��� ��� ȣ�� �Ұ�
		//String���� ����ȯ �� String���� ��� ȣ��
		//charAt() String Ŭ������ ����
		System.out.println(s.charAt(1)); //String ���ڿ� �� �ι�° t�� �̾Ƽ� ����� �ּ���
		
		//o ������ ��ӽ�Ų ����鿡�� access ������ ����
		//String ���� ��� ȣ�� �Ұ�
//		Object o = m1();
//		System.out.println(o.); �� ��..
	}

}
