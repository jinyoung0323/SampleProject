package practice.arraylist;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue("R");
		queue.enQueue("W");
		queue.enQueue("Q");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
