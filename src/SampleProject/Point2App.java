package SampleProject;



public class Point2App {

	public static void main(String[] args) {
		Point2 a = new Point2(2, 3);	// a�� ������� ��ü�� �ּ�
		Point2 b = a;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a.equals(b));
		
	}

}
