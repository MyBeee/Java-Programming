package Week_12;

import javax.naming.InsufficientResourcesException;

public class Task12 {

	public static void main(String[] args) {
		Task11 account = new Task11();
		
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch(InsufficientResourcesException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}
}
