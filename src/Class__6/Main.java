package Class__6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static Object keys;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Operation op = new Operation();
		String Dept, Name, Email;
		int RegID, choice;
		List<Student> CSE = new ArrayList<>();
		List<Student> EEE = new ArrayList<>();
		List<Student> Other = new ArrayList<>();
		Map<String, List<Student>> data = new HashMap<String, List<Student>>();

		Collection<List<Student>> stdList1 = data.values();

		do {
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter Dept, ID, Name, Email");
				Dept = sc.next();
				RegID = sc.nextInt();
				Name = sc.next();
				Email = sc.next();

				if (Dept.equals("CSE")) {
					Student st = new Student(RegID, Name, Email);
					CSE.add(st);
					data.put(Dept, CSE);
				} else if (Dept.equals("EEE")) {
					Student st = new Student(RegID, Name, Email);
					EEE.add(st);
					data.put(Dept, EEE);
				} else {
					Student st = new Student(RegID, Name, Email);
					Other.add(st);
					data.put("Other", Other);
				}

			} else if (choice == 2) {

				System.out.println("CSE\n");
				for (Map.Entry<String, List<Student>> entry : data.entrySet()) {

					if (entry.getKey().contentEquals("CSE")) {
						for (Student st : entry.getValue()) {
							System.out.println(st.getRegNo() + " " + st.getName() + " " + st.getEmail());
						}
					}
				}
				
				System.out.println("EEE\n");
				for (Map.Entry<String, List<Student>> entry : data.entrySet()) {

					if (entry.getKey().contentEquals("EEE")) {
						for (Student st : entry.getValue()) {
							System.out.println(st.getRegNo() + " " + st.getName() + " " + st.getEmail());
						}
					}

				}
				
				System.out.println("Other\n");
				for (Map.Entry<String, List<Student>> entry : data.entrySet()) {

					if (entry.getKey().contentEquals("Other")) {
						for (Student st : entry.getValue()) {
							System.out.println(st.getRegNo() + " " + st.getName() + " " + st.getEmail());
						}
					}

				}
			} else if (choice == 3) { // Edit
				op.DeleteStudentDetails(1);
			}

		} while (choice != 10);

//	    Map<String, List<Student>> data = new HashMap<String, List<Student>>();
//		
//		List<Student> s=new ArrayList<>();
//		Student st=new Student(101, "Shohan", "M@gmail.com");
//		Student st1=new Student(102, "Shawon", "n@gmail.com");
//		Student st2=new Student(103, "Tonmoy", "0@gmail.com");
//		Student st3=new Student(104, "Nayon", "p@gmail.com");
//		Student st4=new Student(105, "Jan", "x@gmail.com");
//		s.add(st);
//		s.add(st1);
//		s.add(st2);
//		s.add(st3);
//		s.add(st4);
//		
//		Operation op=new  Operation();
//		
//		op.AddStudentDetails(s);
//		List<Student> studentAll=op.allStudents();
//		op.print();
//		//op.DeleteStudentDetails(101);
//		System.out.println("===========");
//		op.print();
//		System.out.println("===========");
//		op.EditStudentDetails(102, 501);
//		op.print();
//		System.out.println("===========");
//		
//		data.put("Dept1", s);
//		
//		System.out.println(data);
//		
//		Collection<List<Student>> stdList=data.values();
//		
//		for(List<Student> stdlst:stdList)
//		{
//			System.out.println(data.keySet());
//			for(Student std:stdlst) {
//				System.out.println(std.getName());
//			}
//		}

	}

}
