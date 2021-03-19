package com.javaex.problem04;

public abstract class Bird {
	private String name;

	protected void setName(String name) {
		this.name = name;
	}
	protected String getName() {
		return name;
	}
	
	protected abstract void fly();
	protected abstract void sing();
	protected abstract void showName();
}
