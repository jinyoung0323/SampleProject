package SampleProject;

public class Student {
	private String studentID;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public double getStudentCredit() {
		return studentCredit;
	}

	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}

	
	
	public Student(String studentID, String studentName, String studentGender, double studentCredit) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentCredit = studentCredit;
	}
	
	public void show() {
		System.out.println("학생번호 : " + getStudentID());
		System.out.println("학생이름 : " + getStudentName());
		System.out.println("학생성별 : " + getStudentGender());
		System.out.println("학생학점 : " + getStudentCredit());
	}
	
}
