package practice;

public class Account {
	private String accountNo;
    private String name;
    private String phoneNo;
    public int balance;

    public Account() {}

    public Account(String accountNo, String name, String phoneNo, int balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
    public String toString() {
        return "계좌 : " + this.getAccountNo() 
           + ", 성명 : " + this.getName()
           + ", 연락처 : " + this.getPhoneNo();
    }
    

}

