package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {}
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
	
    public String getAccountNo() {
    	System.out.println(accountNo + " 계좌가 개설되었습니다.");
    	return accountNo;
    }
    public void setAccountNo(String accountNo) {
    	this.accountNo = accountNo;
    }
    public int getBalance() {
    	return balance;
    }
    public void setBalance(int balance) {
    	this.balance = balance;
    }
    //필요한 메소드 작성
    
    public void deposit(int money) {
		if(money <= 0) {
			System.out.println("양수로 입력하세요.");
		} else {
			this.balance += money;
		}
	}
	public void withdraw(int money) {
		if(money > this.balance) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.balance -= money;
		}
	}
	public void showBalance() {
		System.out.println(this.getBalance());
	}
}
