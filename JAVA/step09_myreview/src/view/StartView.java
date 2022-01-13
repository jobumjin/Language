package view;

import org.junit.Test;
import model.StudentModel;
import model.dto.Student;

public class StartView {

	@Test
	public void getStudent() {
//		StudentController.StudentOne(20163010);
		System.out.println("*** read ***");
		Student s = StudentModel.read(20163010);
		System.out.println(s);

		System.out.println("*** create ***");
		StudentModel.create(19999999, new Student(19999999, "������", "��ǰ�����а�", 3));
		System.out.println(StudentModel.StudentAll());

		System.out.println("*** update ***");
		StudentModel.update(19999999, "������а�");
		System.out.println(StudentModel.StudentAll());

		System.out.println("*** delete ***");
		boolean result = StudentModel.delete(19999999);
		if (result) {
			System.out.println("����");
			System.out.println(StudentModel.StudentAll());
		}

	}

}
