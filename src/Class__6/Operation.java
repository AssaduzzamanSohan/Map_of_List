package Class__6;

import java.util.List;

public class Operation {
	List<Student> st;

	public void AddStudentDetails(List<Student> stu) {
		this.st = stu;
	}
	public void DeleteStudentDetails(int ID) {
		for (Student s : st) {
			if (ID == s.getRegNo()) {
				st.remove(s);
				break;
			}
		}
	}

	public void EditStudentDetails(int Old_ID, int New_ID) {
		for (Student s : st) {
			if (Old_ID == s.getRegNo()) {
				s.setRegNo(New_ID);
				break;
			}
		}
	}

	public void print() {
		for (Student s : st) {
			System.out.println(s.getRegNo() + "  " + s.getName() + " " + s.getEmail());

		}
	}

	List<Student> allStudents() {
		return st;
	}
}
