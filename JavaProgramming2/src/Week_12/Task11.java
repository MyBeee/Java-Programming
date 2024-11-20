package Week_12;

import javax.naming.InsufficientResourcesException;

public class Task11 {
	private long balance;
	
	public Task11() { }
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws InsufficientResourcesException {
		if(balance < money) {
			throw new InsufficientResourcesException("잔고 부족: " + (money-balance) + "모자람");
		}
		balance -= money;
	}
}
