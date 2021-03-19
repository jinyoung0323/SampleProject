package com.javaex.problem02;

public class Friend {
	private String name;
	private String number;
	private String school;
	public Friend() {}
	public Friend(String name, String number, String school) {
		this.name = name;
		this.number = number;
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void showAllFriend() {
		System.out.print("이름 : " + this.getName());
		System.out.print(", 핸드폰 : " + this.getNumber());
		System.out.print(", 학교 : " + this.getSchool());
		System.out.println();
	}
	
}