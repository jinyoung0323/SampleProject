package SampleProject;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("x = " + super.getX());
		System.out.println("y = " + super.getY());
		System.out.println("color = " + this.getColor());
		System.out.println();
	}
	
	
}
