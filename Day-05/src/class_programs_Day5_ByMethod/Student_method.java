package class_programs_Day5_ByMethod;

public class Student_method {
	int rollno;
	String name;
	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	void displayInformation() {
		System.out.println(rollno + " " + name);
	}
}

class Main {
	
public static void main(String[] args) {
		Student_method s1 = new Student_method();
		Student_method s2 = new Student_method();
		s1.insertRecord(111, "Karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();
	}

}
