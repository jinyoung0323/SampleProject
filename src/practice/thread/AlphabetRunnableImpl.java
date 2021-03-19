package practice.thread;

public class AlphabetRunnableImpl implements Runnable {
	public void run() {
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}
	}
}
