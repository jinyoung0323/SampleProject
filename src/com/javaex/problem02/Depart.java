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
		System.out.println("�̸� : " + super.getName() + ", ���� : " + super.getSalary() + ", �μ� : " + this.getDepart());
	}
}
