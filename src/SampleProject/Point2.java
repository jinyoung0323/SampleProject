package SampleProject;

public class Point2 {
	private int x;
	private int y;
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point(" + this.x + ", " + this.y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		Point2 p = ((Point2)obj);
		if(this.hashCode() == p.hashCode()) {
			return true;
		} else if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}
