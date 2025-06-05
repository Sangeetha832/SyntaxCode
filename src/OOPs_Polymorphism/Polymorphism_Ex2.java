package OOPs_Polymorphism;

class BankAccount {
	double balance;

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	double getBalance() {
		return balance;
	}
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	double deposit(double amount) {
		balance += amount;
		System.out.println("Deposit success");
		return balance;
	}

	void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw success");

	}
}

class SavingAccount extends BankAccount {
	public SavingAccount(double initialBalance) {
		super(initialBalance);
	}

	double minimumBalance = 100;

	@Override
	void withdraw(double amount) {
		if (getBalance() - amount >= minimumBalance) {
			System.out.println("withdraw success");
		} else {
			System.out.println("Insufficient balance");
		}
		balance -= amount;

	}
}

class CheckBalance extends BankAccount {

	public CheckBalance(double initialBalance) {
		super(initialBalance);
	}

	double checkdraft = -50;

	@Override
	void withdraw(double amount) {
		if (getBalance() - amount >= checkdraft) {
			System.out.println("successfull withdraw" + amount);
			balance -= amount;
			if (balance < 0) {
				System.out.println("Overdraft occurred. Current balance: " + balance);
			}
		} else {
			System.out.println("Withdrawal not allowed. Exceeds overdraft limit.");
		}

	}

}

public class Polymorphism_Ex2 {
	public static void main(String[] args) {

		BankAccount[] accout = new BankAccount[2];
		accout[0] = new SavingAccount(200);
		accout[1] = new CheckBalance(50);

		 System.out.println("Performing withdrawals:");
	        for (BankAccount account : accout) {
	            account.withdraw(150);
	            System.out.println("Current balance: " + account.getBalance());
	            System.out.println("--------------------");
	        }
	}
}
