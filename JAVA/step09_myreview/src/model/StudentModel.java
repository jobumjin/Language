package model;

import java.util.HashMap;
import model.dto.Student;

public class StudentModel {
	private static HashMap<Integer, Student> Students = new HashMap<>();

	static {
		Students.put(20163010, new Student(20163010, "조범진", "빅데이터공학과", 0));
		Students.put(201521724, new Student(201521724, "이준석", "정보통신공학과", 1));
		Students.put(20183741, new Student(20183741, "홍도희", "빅데이터", 2));
		Students.put(2015134009, new Student(2015134009, "이정훈", "지구시스템과학과", 3));
	}

	public static HashMap<Integer, Student> StudentAll() {
		return Students;
	}

	public static void create(int id, Student newS) {
		Students.put(id, newS);
	}

	public static Student read(int id) {
		for (int index = 0; index < Students.size(); index++) {
			if (Students.get(id).getId() == id) {
				return Students.get(id);
			}
		}
		return null;
	}

	public static boolean update(int id, String department) {
		for (int index = 0; index < Students.size(); index++) {
			if (Students.get(id).getId() == id) {
				Students.get(id).setDepartment(department);
				return true;
			}
		}
		return false;
	}

	public static boolean delete(int id) {
		for (int index = 0; index <= Students.size(); index++) {
			Student e = Students.get(index);
			if (Students.get(id).getId() == id) {
				Students.remove(id);
				return true;
			}
		}
		return false;
	}

	public static Student StudentOne(int id) throws Exception {
		Student b = Students.get(id);
		if (b == null) {
			throw new Exception("니가 요청한 학생이 없다!!!");
		} else {
			return b;
		}
	}
}