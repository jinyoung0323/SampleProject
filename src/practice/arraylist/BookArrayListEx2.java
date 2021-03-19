package practice.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class BookArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("책과 작가를 4개씩 입력하세요.");
		for(int i = 0; i < 4; i++) {
			String s = sc.nextLine();
			String[] sArr = s.split(",");
			library.add(new Book(sArr[0], sArr[1]));
		}
		
		for(Book book : library) {
			book.showInfo();
		}
//		for(int i = 0; i < library.size(); i++) {
//			Book book = library.get(i);
//			book.showInfo();
//		}
		System.out.println();
		
		sc.close();
	}

}
