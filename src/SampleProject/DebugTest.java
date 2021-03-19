package SampleProject;

public class DebugTest {

	public void call() {
		System.out.println("Call!!");
	}
	public static void main(String[] args) {
		int arr[] = new int[5];
		DebugTest dt = new DebugTest();
		dt.call();
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(arr[i] = i);
		}
		System.out.println("END");
	}

}
