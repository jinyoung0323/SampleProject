package SampleProject;

public class Rectangle2App {

	public static void main(String[] args) {
		Rectangle2 a = new Rectangle2(6, 4);
		Rectangle2 b = new Rectangle2(2, 12);
		Rectangle2 c = new Rectangle2(3, 3);
		Rectangle2 d = c;
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
	}

}
