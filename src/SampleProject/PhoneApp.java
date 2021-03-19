package SampleProject;

public class PhoneApp {

	public static void main(String[] args) {
		TelePhone telePhone = new TelePhone("010-1234-1234");
		telePhone.power(true);
		telePhone.call("010-4321-4321");	// 상대방 전화번호
		
		System.out.println("============================");
		SmartPhone smartPhone = new SmartPhone("010-3456-3456");
		smartPhone.turnOn(true);
		smartPhone.call("010-4311-4311");
		smartPhone.searchInternet("www.naver.com");
		smartPhone.turnOn(false);
		smartPhone.searchInternet("www.naver.com");
	}

}
