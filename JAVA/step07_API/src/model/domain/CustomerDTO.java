//domain 단어는 데이터 주제 의미하기도 함
package model.domain;

public class CustomerDTO {
	private String id;
	private int pw;

	public CustomerDTO() {
		super();//부모 객체가 먼저 생성되게 해주는 필수 문법
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
