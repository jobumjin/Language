package model;

public class Model {
	//controller�� ��û���� �Ѹ��� ������ db�� ���� �˻��ؼ�
	//CustomerDTO �����ؼ� ��ȯ
	public static CustomerDTO getCustomer() {
		//? ��ü ����
		//? setXxx() �޼ҵ�� id�� encore/pw =11/grade=g
		//? ��ȯ
		CustomerDTO c = new CustomerDTO();
		//�⺻������ ������ ����ִ� ��ü ����
		
		//��������..
		c.setId("encore");
		c.setPw(11);
		c.setGrade('g');
		
		return c;
		
	}
	
	//...CRUD
}
