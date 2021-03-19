package com.javaex.problem08;

public class Book {
	private int 	bookNo;			// ��ȣ
	private String 	title;			// ����
	private String 	author;			// �۰�
	private int 	stateCode;	// �����ڵ�(�뿩����)
	
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = stateCode = 1;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	public void rent() {
		if(this.stateCode == 1) {
			this.stateCode--;
			System.out.println(this.getTitle() + "��(��) �뿩 �ƽ��ϴ�.");
		} else if(this.stateCode == 0) {
			System.out.println(this.getTitle() + "��(��) �뿩�� �Դϴ�.");
		}
	}
	public void returnBook() {
		if(this.stateCode == 0) {
			this.stateCode++;
			System.out.println(this.getTitle() + "��(��) �ݳ� �ƽ��ϴ�.");
		} else if(this.stateCode == 1) {
			System.out.println(this.getTitle() + "��(��) �ݳ������ �ƴմϴ�.");
		}
	}
	public void print() {
		System.out.println(this.bookNo + " å���� : "
						 + this.title + "\t���� : "
						 + this.author + "\t�뿩���� : "
						 + ((this.stateCode == 0) ? "�뿩��" : "�������"));
	}
}
