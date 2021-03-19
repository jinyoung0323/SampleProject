package practice.arraylist;

public class SimpleArrayListTest {

	public static void main(String[] args) {
		SimpleArrayList<Integer> list = new SimpleArrayList<Integer>();
		SimpleArrayList<String> l = new SimpleArrayList<String>();

        list.add(50);
        l.add("ABC");

        int value1 = list.get(0);
        String value2 = l.get(0);

        System.out.println(value1 + value2);
	}

}
