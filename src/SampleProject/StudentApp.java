package SampleProject;
public class StudentApp {

	public static void main(String[] args) {
//		Student s1 = new Student("200101", "홍길동", "남자", 3.85);
//		Student s2 = new Student("200102", "홍길순", "여자", 3.45);
//		s2.show();
//		
//		String[] s = new String[3];
		Student[] studentArr = new Student[5];
		for(int i = 0; i < studentArr.length; i++) {
			studentArr[i] = new Student("200101", "홍길동", "남자", (i + 10));
		}
		for(int i = 0; i < studentArr.length; i++) {
			System.out.println("------------------------");
			studentArr[i].show();
		}
	}

}