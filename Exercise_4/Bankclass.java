/*	Create a class BankAccount with the data members accountNumber, balance, and interestRate, and a method deposit() to add an amount to the 
 * 	balance. Create a subclass SavingsAccount that extends BankAccount, adds a data member minimumBalance, and a method withdraw() to deduct
 *  an amount from the balance while maintaining the minimum balance. Create an object of BankAccount and invoke the deposit() method. 
 *  Create an object of SavingsAccount and invoke both the deposit() and withdraw() methods 
 */

package exercise4;

class  BankAccount{
	double accountNumber;
	float balance;
	int interestRate;
	
	void deposit(float amount){
		balance+=amount;
		System.out.println("Deposited: " + amount);
		System.out.println("Balance: " + balance);
	}
}

class SavingsAccount extends BankAccount{
	float minimumBalance;
	
	void withdraw(float amount){
		if(balance-amount>minimumBalance) {
			balance-=amount;
			System.out.println("Withdrawn: " + amount);
			System.out.println("Balance: " + balance);
		}else {
			System.out.println("Withdrawal not possible. Minimum balance should be maintained.");
		}
	}
}

public class Bankclass{

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.deposit(1000);
		
		SavingsAccount s = new SavingsAccount();
		s.minimumBalance=100;
		s.deposit(500);
		s.withdraw(50);
	}

}
