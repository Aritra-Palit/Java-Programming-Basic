class Student{
	int roll;
	String name;
	
	void getStudnet(int r, String n) {
		roll=r;
		name=n;
	}
	
	void showStudent() {
		System.out.println("Roll of the student="+roll);
		System.out.println("Name of the student="+name);
	}
}
public class TestStudent {
public static void main(String args[]) {
	Student s1;
	s1=new Student();
	
	s1.showStudent();
}
}
