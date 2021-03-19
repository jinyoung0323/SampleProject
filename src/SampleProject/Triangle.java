package SampleProject;

public class Triangle extends Shape{

	protected int width;
	protected int height;
	
	public Triangle() {}

	public Triangle( int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println(
				 " ����=" + width + " ����=" + height + " �ﰢ���� �׷Ƚ��ϴ�.");
	}

	public double area() {
		return (double)width * height / 2;
	}
	

}
