  
package practice.arraylist;

import java.util.ArrayList;

public class DogArrayListTest {

	public static void main(String[] args) {
		ArrayList<Dog> al = new ArrayList<Dog>();
		
		al.add(new Dog("멍멍이1", "type1"));
		al.add(new Dog("멍멍이2", "type2"));
		al.add(new Dog("멍멍이3", "type3"));
		al.add(new Dog("멍멍이4", "type4"));
		
		for(Dog dog : al) {
			System.out.println(dog.showDogInfo());
		}
	}

}
