package SampleProject;

public class SmartPhone extends Phone {
	private String number;
	private boolean power;
	
	public SmartPhone() {}
	public SmartPhone(String number) {
		super();
		this.number = number;
	}
	
	
	public void turnOn(boolean on) {			
		this.power = on;	
	}
	
	
	@Override
	public void call(String number) {
		if(this.power) {
			System.out.println("나의 전화번호 : " + this.number);
			System.out.println("상대방 전화번호 : " + number + "로 전화를 겁니다.");
		} else {
			System.out.println("전원이 꺼져 있습니다.");
		}
		
	}
	public void searchInternet(String url) {
		if(this.power) {
			System.out.println("브라우저를 열고 " + url + "로 이동합니다.");
		} else {
			System.out.println("전원이 꺼져 있습니다.");
		}
	}
}
