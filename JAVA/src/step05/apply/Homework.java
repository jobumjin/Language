package step05.apply;

public class Homework {
	int i;
	static int i2;
	
	Homework(){
		i++;
		i2++;
	}
	
	public static void main(String[] args) {
		Homework h = new Homework();
		Homework h1 = new Homework();
		Homework h2 = new Homework();
		System.out.println(h2.i2 + " " + h1.i + " " + i2);
		int a = 3;
		System.out.println(Float.toString((float) a));
		
	}
	
	static {
		System.out.println("��� ��µɱ�?");
	}

}

/* 1�� ���� : ���° �ٿ� "��� ��µɱ�"�� ��µɱ��?
 * �� : ù��° ��
 * 2�� ���� : ��� ����?
 *	public static void main(String[] args) {
 *		Homework h = new Homework();
 *		Homework h1 = new Homework();
 *		Homework h2 = new Homework();
 *		System.out.println(h.i2 + " " + h1.i + " " + i2);
 *	}
 * �� : 3 1 3
 * 3�� ���� : ������ �ٿ� 3�� �־������� "3.0"�� ���ڿ��� ����ϴ� ���
 */



