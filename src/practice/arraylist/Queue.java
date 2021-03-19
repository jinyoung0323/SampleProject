package practice.arraylist;
import java.util.ArrayList;
public class Queue {
	ArrayList<String> arrayListQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayListQueue.add(data);
	}
	public String deQueue() {
		int len = arrayListQueue.size();
		if(len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayListQueue.remove(0);
	}
}
