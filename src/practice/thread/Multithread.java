package practice.thread;

public class Multithread {

	public static void main(String[] args) {
		Thread thread = new Thread(new DigitRunnableImpl());
//		thread.start();
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println(c);
		}
		thread.run();
		
//		Thread thread1 = new Thread(new DigitRunnableImpl());
//		Thread thread2 = new Thread(new DigitRunnableImpl());
//		Thread thread3 = new Thread(new AlphabetRunnableImpl());
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
		
		
	}

}
