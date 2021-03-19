package practice.arraylist;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("A");
		stack.push("B");
		stack.push("G");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
