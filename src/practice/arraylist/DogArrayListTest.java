package practice.arraylist;

import java.util.ArrayList;

public class DogArrayListTest {

	public static void main(String[] args) {
		ArrayList<Dog> al = new ArrayList<Dog>();
		
		al.add(new Dog("�۸���1", "type1"));
		al.add(new Dog("�۸���2", "type2"));
		al.add(new Dog("�۸���3", "type3"));
		al.add(new Dog("�۸���4", "type4"));
		
		for(Dog dog : al) {
			System.out.println(dog.showDogInfo());
		}
	}

}
