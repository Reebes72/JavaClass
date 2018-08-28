package ch2;

public class Challenge15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int shares = 600;
		double pricePerShare = 21.77;
		double commission = 0.02;
		System.out.println("Transaction amount(No commission): " + "$" + shares * pricePerShare
						+ "\nAmount of Commission: " + "$" + (shares * pricePerShare) * commission
						+ "\nTotal Amount: " + "$" + (shares * pricePerShare) * (commission + 1));
		
	}

}
