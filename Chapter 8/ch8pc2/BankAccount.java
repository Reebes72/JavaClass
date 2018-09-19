package ch8pc2;

public class BankAccount {
		private double balance;
		
		public BankAccount(double balance) {
			setBalance(balance);
		}
		public BankAccount() {
			setBalance(0);
		}
		public BankAccount(BankAccount account) {
			setBalance(account.getBalance());
		}
		public void setBalance(double bal) {
			balance = bal;
		}
		public double getBalance() {
			return balance;
		}
}
