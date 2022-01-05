package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class CustomerDTO {
	private String id;
	private int pw;
	private char grade; //g(gold), s(silver) �� ������ OK ���� ����
	private String job;
	//private�� �ٲ� �� ������ ����� �ش�.
	
	// grade���� ��ȿ�� ���� ���� ������ ���ǽ� ����(��ȿ�� ����)
	// ��ȿ�� �����͸� ���� �����ϰ� �ϴ� rule
	//- ���� Ÿ�Ը� �´ٰ��ؼ� ���� ������ ��Ȳ�� ����
	// ������ �ܺο��� ȣ�� �Ұ����ϰ� ���� ���� ��ȿ�� �ڵ�� ���� �Ŀ��� ����
	// ���� ���� : ������ �ܺο��� ����(private) 
	// ��ȿ�� �ڵ�� ���� �޼ҵ�� ���Ѿ��� ���(public) 
	public void setGrade(char grade) {
		if(grade == 'g' || grade == 's') {
			this.grade = grade;			
		}else {
			System.out.println("��ȿ�� ���");
		}
	}
}
