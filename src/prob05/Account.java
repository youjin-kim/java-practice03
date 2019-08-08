package prob05;

public class Account{
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		balance = 0;
		System.out.println(accountNo + "계좌가 개설되었습니다.");
	}

	public String getAccountNo()
	{
		return accountNo;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void save(int money)
	{
		System.out.println(accountNo + "계좌에 " + money + "만원이 입금되었습니다.");
		balance += money;
	}
	
	public void deposit(int money)
	{
		System.out.println(accountNo + "계좌에 " + money + "만원이 출금되었습니다.");
		balance -= money;
	}

}
