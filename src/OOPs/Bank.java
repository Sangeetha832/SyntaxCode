package OOPs;

public class Bank {
	 int balance = 5000;
	 
	 int getBalance() {
		 return this.balance = balance;
	 }
	 void deposit(int amount) {
		 balance += amount;
		 System.out.println("success deposit "+amount);
	 }
	 void withdraw(int amount) {
		 int min = 100;
		 if((balance-amount)>min) {
			 System.out.println("success withdraw "+amount);
			 balance-=amount;
		 }
		 else {
			 System.out.println("insufficient amount");
		 }
	 }
	 void checkBalance() {
		 int bal = getBalance();
		 System.out.println(bal+" is current balance");
		 
	 }
	 public static void main(String[] args) {
		Bank bank = new Bank();
		bank.deposit(1000);
		bank.withdraw(600);
		bank.checkBalance();
	}
}
