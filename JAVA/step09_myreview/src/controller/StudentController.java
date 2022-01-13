package controller;

import model.StudentModel;
import model.dto.Student;
import view.FailView;
import view.SuccessView;

public class StudentController {
	public static void StudentOne(int id) {
		try {
			Student Student = StudentModel.StudentOne(id);
			SuccessView.printStudent(Student);
		} catch (Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}
	}

}
