package com.javaex.problem08;

import java.util.Scanner;

public class BookShop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;	// å ��ȣ �Է�
		boolean b = true;
		Book[] books = new Book[10];
		
		books[0] = new Book(1, "Ʈ���϶���", "�����Ĵϸ��̾�");
		books[1] = new Book(2, "����", "�����Ĵϸ��̾�");
		books[2] = new Book(3, "��Ŭ����", "�����Ĵϸ��̾�");
		books[3] = new Book(4, "�극��ŷ��", "�����Ĵϸ��̾�");
		books[4] = new Book(5, "�Ƹ���", "������");
		books[5] = new Book(6, "�����׵�", "�赿��");
		books[6] = new Book(7, "�����ϱ� û���̴�", "�賭��");
		books[7] = new Book(8, "��õ", "õ��");
		books[8] = new Book(9, "�¹���", "������");
		books[9] = new Book(10, "Ǯ�Ͽ콺", "������");
		
		
		while (b) {
			System.out.println("============================");
			System.out.println("1. �뿩 | 2. �ݳ� | 3. ����");
			System.out.println("============================");
			System.out.print("��ȣ�Է� : ");
			int sw = scanner.nextInt();
			
			switch(sw) {
			case 1:	// �뿩
				System.out.println("*****���� ���� ����ϱ�******");
				displayBookInfo(books);
				System.out.print("�뿩 �ϰ� ���� å�� ��ȣ�� �Է��ϼ��� : ");
				num = scanner.nextInt();
				
				// (1) �Էµ� ��ȣ�� �´� å�� ã�� �뿩 �Ǿ���(�����ڵ�=0)�� üũ �մϴ�.
				for (int i = 0; i < books.length; i++) {
					if (books[i].getBookNo() == num) {
						books[i].rent();
					} 
				}
				break;
			case 2:	// �ݳ�
				System.out.println("*****���� ���� ����ϱ�******");
				displayBookInfo(books);
				System.out.print("�ݳ� �ϰ� ���� å�� ��ȣ�� �Է��ϼ��� : ");
				num = scanner.nextInt();
				
				// (1) �Էµ� ��ȣ�� �´� å�� ã�� �뿩 �Ǿ���(�����ڵ�=0)�� üũ �մϴ�.
				for (int i = 0; i < books.length; i++) {
					if (books[i].getBookNo() == num) {
						books[i].returnBook();
					} 
				}
				break;
			case 3:	// ����
				System.out.println("�����մϴ�.");
				b = false;
			default:
				break;
			}
			
		}
		scanner.close();
	}

	// (2)���޹��� �迭�� ��� ����ϴ� �޼ҵ�
	private static void displayBookInfo(Book[] books) {
		
		for (int i = 0; i < books.length; i++) {
			books[i].print();
		}
	}
}