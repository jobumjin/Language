package step02;

public class People {
	//�������� - ���� ��� �����ϰ� �޸𸮿� �����Ǵ� ����? ��ü ����
	//��ü ��ü�� �����ϴ� ������ ��������� �Ѵ�
	String name;	//����
	int age; 	//����
	
	//������
	People(){}
	
	//�޼ҵ� - ����ϴ� �������� ����
	//name������ ���� �Ǵ� �����ϴ� �޼ҵ�
	String getName() {
		return name;	//ȣ��
	}
	//���� ���� newName
	void setName(String newName) {	//����
		name = newName;		//���ȣ�� = ���ú���ȣ��
	}
	
	//? age ������ �ش��ϴ� get/set �޼ҵ� �����ϱ�
	int getAge() {
		return age;		//ȣ��
	}
	//���� ���� newAge
	void setAge(int newAge) {	//����
		age = newAge;	//���ȣ�� = ���ú���ȣ��
	}
	//���� ���� args
	public static void main(String[] args) {
		//��ü ���� - name.age �޸� ���� �ϸ鼭 Peopel �������� ���� 
		//�� �ּҰ����� ������ Ȱ��, �� �ּҰ��� �ƴ� p1 ���������� �ڵ� �󿡼� ���
		//���� ���� p1
		People p1 = new People();
		System.out.println(p1.name);
		
		//���� ȣ��� �� ���� �� Ȯ��
		p1.name = "���缮";
		System.out.println(p1.name);
		
		//�޼ҵ� ȣ��� �� ���� �� Ȯ��
		p1.setName("������");
		System.out.println(p1.getName());
	}
}
