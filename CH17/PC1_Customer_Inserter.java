import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class PC1_Customer_Inserter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DB_URL = "jdbc:derby:CoffeeDB";

		
		//Connect to DB
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			
			//Get Item info
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(inputRow());		
			
			//Setting up for display of table
			ResultSet result = stmt.executeQuery("SELECT * FROM Customer");
			ResultSetMetaData meta = result.getMetaData();
			
			//Display Results of table
			while(result.next())
			{
				for(int i = 1; i <= meta.getColumnCount(); i++)
				{
					System.out.println(result.getString(i));
				}
				System.out.println();
			}
			conn.close();
			
		}
		catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}

		
		

		



				
		
	}
	/**
	 *  Depreciated method that took user input from main and returned it in SQL from. Updated method follows.
	 *  
	 * @param name
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @return
	 */
	 
	public static String customerStatement(String name, 
										  String address, 
										  String city, 
										  String state, 
										  String zip) 
	{
		//Generate random Customer Number
		Random rand = new Random();
		String customerNumber = Integer.toString(rand.nextInt(9999999));
		
		//Return SQL Statement
		return "INSERT INTO Customer " +
				"(CustomerNumber, Name, Address, City, State, Zip) " +
				"VALUES ('" + customerNumber + "', '" 
				+ name + "', '" 
				+ address + "', '" 
				+ city
				+ "', '" 
				+ state + "', '" 
				+ zip + "')";
				
	}
	/**
	 * Formats elements in array into an SQL statement
	 * Returns to calling method
	 * @param input
	 * @return
	 */
	public static String customerStatement(String[] input)
	{
			//Generate random Customer Number
			Random rand = new Random();
			String customerNumber = Integer.toString(rand.nextInt(9999999));

			//Return SQL Statement
			return "INSERT INTO Customer " +
			"(CustomerNumber, Name, Address, City, State, Zip) " +
			"VALUES ('" + customerNumber + "', '" 
			+ input[0] + "', '" 
			+ input[1] + "', '" 
			+ input[2]
			+ "', '" 
			+ input[3] + "', '" 
			+ input[4] + "')";

	}
	/**
	 * Gets information from user about the row entry
	 * Sends to SQL statement method to format it properly
	 * returns the SQL statement formatted properly
	 * @return
	 */
	public static String inputRow() {
		String[] input = new String[5];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter Customer Info");

		System.out.println("Name: ");
		input[0] = keyboard.nextLine();

		System.out.println("Address: ");
		input[1] = keyboard.nextLine();
				
		System.out.println("City: ");
		input[2] = keyboard.nextLine();
		
		System.out.println("State: ");
		input[3] = keyboard.nextLine();
		
		System.out.println("Zip: ");
		input[4] = keyboard.nextLine();
		
		return customerStatement(input);
		
	}
	

}
