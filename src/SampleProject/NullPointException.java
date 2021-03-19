package SampleProject;

public class NullPointException {

	public static void main(String[] args) {
		String str = new String("hello");
				
		str = null;
		
		try {			
			System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}

}