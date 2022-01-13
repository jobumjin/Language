/* �н����� - Set
 * 1. �����͵� �ߺ� ����
 * 2. ���� ������ ���� ���� ����
 * 3. ������ �ϳ��ϳ� ������ �� �ִ� ������ index�� ����
 * 4. API�� ���� ������ �ϳ��� ��ȯ �޼ҵ� ����
 * 	- Iterator API Ȱ���ؼ� �ϳ��� ��ȯ ������ ���
 * 		- boolean hasNext() : ������ Ȯ��
 * 		- Object next() : ������ �ϳ� ��ȯ
 */

package step01.test;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("d"); //����
		set.add("d"); //������ ģ���� �̹� ���� �� ��� �����ϱ� �ź��ϱ�? ������ ���� �� �����Դϴ�.
		set.add("c");
		System.out.println(set); // [a, b, c, d]
		
		//set ������ �����Ͱ����� �ϳ��� ���� �����ϰ� ���ִ� ��ü
		/* hasNext() : ���� ���� Ȯ�� �޼ҵ�
		 * next() : ������ ����(�޸𸮿��� ���� �� �ѹ��� ��� ������ ��ü �����Ѱ�ü ���� �� ����)
		 * 
		 */
		Iterator<String> all = set.iterator();
		String v = null;
		while(all.hasNext()) {
			v = all.next();
			System.out.println(v.charAt(0)); //����ȯ ���� String���� ��� ȣ�� ����
		}
		
		System.out.println("*** �� �̷����? ***");
		HashSet<String> set2 = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("d"); //����
		set.add("d"); 
		set.add("c");
		//���׸� �̹ݿ��� ������ ������ ����Ƽ ���� �ڵ�� �������� ���ô�. !! 
		//���׸��� all ���� ����ó�� �����ϸ鼭 Ȱ���ϴ� �ڵ� ����
		Iterator<String> all2 = set2.iterator();//Object Ÿ��? StringŸ��?
		
		while(all2.hasNext()) {
			System.out.println(((String)all2.next()).charAt(0));
		}
	}

}
