package practice.stream;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer c1 = new TravelCustomer("�̼���", 40, 100);
		TravelCustomer c2 = new TravelCustomer("������", 20, 100);
		TravelCustomer c3 = new TravelCustomer("ȫ�浿", 13, 50);
	
		ArrayList<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		System.out.println("== �� ��� �߰��� ������� ��� ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("�� ���� ����� " + total + "�Դϴ�.");
		
		System.out.println("== 20�� �̻� �� ��� �����Ͽ� ��� ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
