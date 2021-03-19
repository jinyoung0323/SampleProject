package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    //������ �ۼ�
    public Account() {}
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
	
    public String getAccountNo() {
    	System.out.println(accountNo + " ���°� �����Ǿ����ϴ�.");
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
    //�ʿ��� �޼ҵ� �ۼ�
    
    public void deposit(int money) {
		if(money <= 0) {
			System.out.println("����� �Է��ϼ���.");
		} else {
			this.balance += money;
		}
	}
	public void withdraw(int money) {
		if(money > this.balance) {
			System.out.println("�ܾ��� �����մϴ�.");
		} else {
			this.balance -= money;
		}
	}
	public void showBalance() {
		System.out.println(this.getBalance());
	}
}
