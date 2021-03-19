package SampleProject;

public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		this.name = "";
		this.price = 0;
	}
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		if(price <= 0) {
			System.out.println("가격을 0이하로 세팅할 수 없습니다.");
		} else {			
			this.price = price;
		}
	}
	public int getPrice() {
		return price;
	}
	public void showInfo() {
		System.out.println("상품이름 : " + this.getName());
		System.out.println("가격 : " + this.getPrice());
		System.out.println();
	}
}