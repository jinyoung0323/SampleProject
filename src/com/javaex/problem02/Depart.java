package com.javaex.problem02;

public class Depart extends Employee {
	private String depart;
	
	
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
		/*
		 * super.setName(name);
		 * super.setSalary(salary);
		 * this.setDepart(depart);
		 */
	}
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	@Override
	public void getInformation() {
		System.out.println("이름 : " + super.getName() + ", 연봉 : " + super.getSalary() + ", 부서 : " + this.getDepart());
	}
}
