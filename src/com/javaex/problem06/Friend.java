package com.javaex.problem06;

public class Friend {
	private String name;
	private String phoneNumber;
	private String school;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	
	
	public Friend(String name, String phoneNumber, String school) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.school = school;
	}
	public void show() {
		System.out.println("-------------------------------------------------");
		System.out.print("이름 : " + this.getName() + "\t");
		System.out.print("핸드폰 : " + this.getPhoneNumber() + "\t");
		System.out.print("학교 : " + this.getSchool());
		System.out.println();
	}
	
	
}