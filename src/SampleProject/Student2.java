package SampleProject;

public class Student2 extends Person {
	private String schoolName;
	public Student2() {}
	public Student2(String schoolName) {
		System.out.println("Student2 클래스 생성자 호출됨!!");
		this.schoolName = schoolName;
	}
	public Student2(String name, int age, String schoolName) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		System.out.println("Student2 클래스 생성자 호출됨!!");
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + super.getName());
		System.out.println("나이 : " + super.getAge());
		System.out.println("학교 : " + this.getSchoolName());
		System.out.println();
	}
}
