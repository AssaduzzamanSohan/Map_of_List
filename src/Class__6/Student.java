package Class__6;

public class Student {
	private int regNo;
	private String name;
	private String email;

	public Student(int regNo, String name, String email) {
		this.regNo = regNo;
		this.name = name;
		this.email = email;
	}
	
	public int getRegNo() {
		return regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", email=" + email + "]";
	}

}
