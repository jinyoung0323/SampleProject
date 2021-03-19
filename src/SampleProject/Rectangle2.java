package SampleProject;

public class Rectangle2 {
	private int width;
	private int height;
	public Rectangle2() {}
	public Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public boolean equals(Object obj) {
		Rectangle2 r = ((Rectangle2)obj);
		if(this.hashCode() == r.hashCode()) {
			return true;
		} else if(this.width * this.height == r.width * r.height) {
			return true;
		} else {
			return false;
		}
	}
}
