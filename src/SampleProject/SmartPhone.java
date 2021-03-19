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
			System.out.println("���� ��ȭ��ȣ : " + this.number);
			System.out.println("���� ��ȭ��ȣ : " + number + "�� ��ȭ�� �̴ϴ�.");
		} else {
			System.out.println("������ ���� �ֽ��ϴ�.");
		}
		
	}
	public void searchInternet(String url) {
		if(this.power) {
			System.out.println("�������� ���� " + url + "�� �̵��մϴ�.");
		} else {
			System.out.println("������ ���� �ֽ��ϴ�.");
		}
	}
}
