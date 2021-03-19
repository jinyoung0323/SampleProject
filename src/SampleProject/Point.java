package SampleProject;

public class Point implements Drawable {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Point() {}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void showInfo() {
		System.out.println("x = " + this.getX());
		System.out.println("y = " + this.getY());
		System.out.println();
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
