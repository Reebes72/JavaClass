package ch8pc2;

public class CopyConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BankAccount original = new BankAccount(100);
			System.out.println("First class: \t" + original.getBalance());
			BankAccount copy = new BankAccount(original);
			System.out.println("Second class: \t" + copy.getBalance());
	}

}
