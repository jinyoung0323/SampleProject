package practice.arraylist;

public class StudentArrayListTest {

	public static void main(String[] args) {
		Student s1 = new Student(1001, "Kim");
		s1.addSubject("국어", 80);
		s1.addSubject("수학", 100);
		
		Student s2 = new Student(1002, "Lee");
		s2.addSubject("국어", 90);
		s2.addSubject("수학", 80);
		s2.addSubject("영어", 70);
		
		s1.showStudentInfo();
		System.out.println("======================================");
		s2.showStudentInfo();
	}

}