package bank;

public class BankAccount 
{

	private String accountNumber;
	private int balance;
	private String type;

	public BankAccount(String accountNumber, String type, int balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.type = type;
	}

	public String getAccountNumber() 
	{
		return accountNumber;
	}

	public int getBalance() 
	{
		return balance;
	}

	public void withdraw(int amount) 
	{
		balance -= amount;
	}

	public void deposit(int amount) 
	{
		balance += amount;
	}

}
