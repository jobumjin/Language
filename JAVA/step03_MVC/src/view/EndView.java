package view;

import model.CustomerDTO;

public class EndView {

	public static void print(CustomerDTO c) {
		System.out.println(c.getId() + " " + c.getGrade());
		//Id¿Í Grade Ãâ·Â
	}

}
