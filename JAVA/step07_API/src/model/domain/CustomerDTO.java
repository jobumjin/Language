//domain �ܾ�� ������ ���� �ǹ��ϱ⵵ ��
package model.domain;

public class CustomerDTO {
	private String id;
	private int pw;

	public CustomerDTO() {
		super();//�θ� ��ü�� ���� �����ǰ� ���ִ� �ʼ� ����
	}

	public CustomerDTO(String id, int pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", pw=" + pw + "]";
	}
}
