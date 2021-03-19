package SampleProject;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int[] i = new int[] {3, 6, 9};
		try {
			System.out.println(i[3]);
		} catch(Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}

}
