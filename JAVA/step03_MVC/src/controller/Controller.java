package controller;

import model.CustomerDTO;
import model.Model;
import view.EndView;

public class Controller {
	
	public static void reqRes() {
		CustomerDTO c = Model.getCustomer();
		//Model���� ������ �޾ƿ�
		EndView.print(c);
		//EndView�� ���
	}
}
