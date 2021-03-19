package SampleProject;

public class TelePhone extends Phone {
	private String number;
	
	public TelePhone() {}
	public TelePhone(String number) {
		super();
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void power(boolean b) {
		if(b) {			
			System.out.println("전원 On...");
		} else {
			System.out.println("전원 Off...");
		}
	}
	@Override
	public void call(String number) {
		System.out.println("나의 전화번호 : " + this.number);
		System.out.println("상대방 전화번호 : " + number + "로 전화를 겁니다.");
	}
	
}
