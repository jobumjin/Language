package step07.exception;

class C{
	static {
		System.out.println("C class �ε�");
	}
}

public class ReviewException {
	
	// ���� 1 : ���࿹�� �����ϱ�
	// ���� 1 : 0 ->�� �ƴ� �ڿ����� �ٲ۴�.
	public static void q1() {
		System.out.println(10/0);
	}
	// ���� 2 : try~catch ��������?
	// ���� 2 : C class �ε�
	public static void q2() {
		try {
			Class.forName("step07.exception.C");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// ���� 3 : "3���� �۽��ϴ�." �� ����ϱ� ���� q3(--)�� --�� ������ ����(0�̻�)�� �Է��ϼ���
	// ���� 3 : 0, 1, 2
	
	public static void q3(int v) throws Exception {
		if(v<3) {
			throw new Exception("3���� �۽��ϴ�");
		}
		System.out.println("3���� �������� �Է��ϼ���.");
	}
	
	// ���� 4 : ���ܹ߻��� �����ϰ� ����� �� �ִ� �ڵ带 �߰��ϼ���
	/* ���� 4 : 
	 * finally {
	 * 		System.out.println("���ܹ߻��� �����ϰ� ���");
	 *	}
	 */
	public static void q4() {
		try {
			Class.forName("step07.exception.C===");
		}catch(ClassNotFoundException e) {
			System.out.println("C �ε��� ���� �߻�");
		}
	}
	
	// ���� 5 : �ݺ����ȿ� �ڵ带 �����Ͽ� �ε����ʰ� ����ó���� �߻����Ѻ��ÿ�.
	// ���� 5 : �������� ������ ����
	
	public static void q5() {
		int arr[] = new int[4];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		q2();
		
		try {
			q3(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
