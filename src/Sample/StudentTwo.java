package Sample;

public class StudentTwo extends Teacher {
public void test1() {
	System.out.println("Fail");

}
public static void main(String[] args) {
	StudentTwo s2 = new StudentTwo();
	Student s = new Student();
	s2.study();
	s2.test1();
	
	s.study();
	s.test();
	
	
	
}

}
