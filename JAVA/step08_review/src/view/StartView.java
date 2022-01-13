package view;

import org.junit.Test;

import controller.BookController;

public class StartView {
	
	@Test
	public void getBook() {
		BookController.bookOne("01a"); 
	}
	//"01a" 라는 isbn를 가진 책정보 호출
}
