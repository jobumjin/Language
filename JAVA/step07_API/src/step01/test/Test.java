/* . : ������(dot ������)
 * 	- ������ ��ü ���� ������ �ش� ��ü�� ����� ȣ��ÿ� ���
 *  - static���� ����� ����� Ŭ������. ���� ȣ��
 *  - package�� import
 * 
 * ��ü�� ���� ȣ�� ����
 */
package step01.test;

class A extends Object{
	String v1 = "string";
	A(){
		super();
		//������ ��� ������ �Ϻ��ϰ� �޸𸮿� ����
		System.out.println("A");
	}
}

class B extends Object{
	A a = new A();
	int v2 = 10;
	B(){
		super();
		//������ ��� ������ �Ϻ��ϰ� �޸𸮿� ����
		System.out.println("B");
	}
}

class C extends Object{
	B b = new B();
	int v3 = 30;
	C(){
		super();
		//������ ��� ������ �Ϻ��ϰ� �޸𸮿� ����
		System.out.println("C");
	}
}

public class Test {

	public static void main(String[] args) {
		// ������ ȣ���� ��ü ����-��ü ���� �ϼ� : ��� ������ �޸𸮿� ��� �����ϰ� ����
		C c = new C(); 
		//? � ��ü ������ �����Ǵ���? A B C
		//? ���� ���̻��� ��ü ���� ���� v1 ������ ����Ͻÿ�
		/* c.b.a.v1
		 * c : C ��ü
		 * c.b : B ��ü
		 * c.b.a : A��ü
		 * c.b.a.v1 : String ��ü
		 */
		System.out.println(c.b.a.v1);
	}

}
