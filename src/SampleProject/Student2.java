package SampleProject;

public class Student2 extends Person {
	private String schoolName;
	public Student2() {}
	public Student2(String schoolName) {
		System.out.println("Student2 Ŭ���� ������ ȣ���!!");
		this.schoolName = schoolName;
	}
	public Student2(String name, int age, String schoolName) {
//		super.setName(name);
//		super.setAge(age);
		super(name, age);
		System.out.println("Student2 Ŭ���� ������ ȣ���!!");
		this.schoolName = schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + super.getName());
		System.out.println("���� : " + super.getAge());
		System.out.println("�б� : " + this.getSchoolName());
		System.out.println();
	}
}
