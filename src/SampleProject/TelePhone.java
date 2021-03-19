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
			System.out.println("���� On...");
		} else {
			System.out.println("���� Off...");
		}
	}
	@Override
	public void call(String number) {
		System.out.println("���� ��ȭ��ȣ : " + this.number);
		System.out.println("���� ��ȭ��ȣ : " + number + "�� ��ȭ�� �̴ϴ�.");
	}
	
}
