import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class PC1_Customer_Inserter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DB_URL = "jdbc:derby:CoffeeDB";
		String name;
		String address;
		String city;
		String state;
		String zip;
		
		//Connect to DB
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			
			//Get Item info
			System.out.println("Enter Customer Info");
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Name: ");
			name = keyboard.nextLine();

			System.out.println("Address: ");
			address = keyboard.nextLine();
					
			System.out.println("City: ");
			city = keyboard.nextLine();
			
			System.out.println("State: ");
			state = keyboard.nextLine();
			
			System.out.println("Zip: ");
			zip = keyboard.nextLine();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(customerStatement(name, address, city, state, zip));
			
			ResultSet result = stmt.executeQuery("SELECT * FROM Customer");
			ResultSetMetaData meta = result.getMetaData();
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
	public static String customerStatement(String name, String address, String city, String state, String zip) {
		Random rand = new Random();
		String customerNumber = Integer.toString(rand.nextInt(9999999));
		
		return "INSERT INTO Customer " +
				"(CustomerNumber, Name, Address, City, State, Zip) " +
				"VALUES ('" + customerNumber + "', '" + name + "', '" + address + "', '" + city
				+ "', '" + state + "', '" + zip + "')";
				
	}

}
