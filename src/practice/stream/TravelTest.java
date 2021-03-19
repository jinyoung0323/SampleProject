package practice.stream;

import java.util.ArrayList;

public class TravelTest {

	public static void main(String[] args) {
		TravelCustomer c1 = new TravelCustomer("이순신", 40, 100);
		TravelCustomer c2 = new TravelCustomer("김유신", 20, 100);
		TravelCustomer c3 = new TravelCustomer("홍길동", 13, 50);
	
		ArrayList<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 " + total + "입니다.");
		
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}