package com.javaex.problem08;

public class Book {
	private int 	bookNo;			// 번호
	private String 	title;			// 제목
	private String 	author;			// 작가
	private int 	stateCode;	// 상태코드(대여유무)
	
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
			System.out.println(this.getTitle() + "이(가) 대여 됐습니다.");
		} else if(this.stateCode == 0) {
			System.out.println(this.getTitle() + "이(가) 대여중 입니다.");
		}
	}
	public void returnBook() {
		if(this.stateCode == 0) {
			this.stateCode++;
			System.out.println(this.getTitle() + "이(가) 반납 됐습니다.");
		} else if(this.stateCode == 1) {
			System.out.println(this.getTitle() + "은(는) 반납대상이 아닙니다.");
		}
	}
	public void print() {
		System.out.println(this.bookNo + " 책제목 : "
						 + this.title + "\t저자 : "
						 + this.author + "\t대여유무 : "
						 + ((this.stateCode == 0) ? "대여중" : "재고있음"));
	}
}
