package controller;

import model.CustomerDTO;
import model.Model;
import view.EndView;

public class Controller {
	
	public static void reqRes() {
		CustomerDTO c = Model.getCustomer();
		//Model에서 정보를 받아옴
		EndView.print(c);
		//EndView로 출력
	}
}
