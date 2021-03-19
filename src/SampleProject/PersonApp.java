package SampleProject;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("정우성", 45);
		p.showInfo();
		Student2 s1 = new Student2("서울고등학교");
		s1.showInfo();
		Student2 s2 = new Student2("이정재", 45, "한국고등학교");
		s2.showInfo();
		
	}

}
