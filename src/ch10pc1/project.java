package ch10pc1;
import java.util.ArrayList;

public class project {

	public static void main(String[] args) {
			ProductionWorker worker1 = new ProductionWorker("Lonnie Vance", "123-A", "04-01-2004", 1, 12.50);
			ProductionWorker worker2 = new ProductionWorker("Harold Stephens", "232-F", "03-21-2014");
			ProductionWorker worker3 = new ProductionWorker("Max Francisco", "777-G", "05-11-2018" , 2, -4.00);
			ProductionWorker worker4 = new ProductionWorker("Cheryl Clements", "923-K", "07-28-2016", 2, 24);
			ProductionWorker worker5 = new ProductionWorker("Alisha Meadows", "887-A", "08-08-2008", 1, 20.3333333);
			
			ArrayList<Employee> list = new ArrayList<>();
			
			list.add(worker1);
			list.add(worker2);
			list.add(worker3);
			list.add(worker4);
			list.add(worker5);

			for(Employee var: list) {
				System.out.println("Worker: ");
				System.out.println("Name: " + var.getName());
				System.out.println("Employee Number: " + var.getNumber());
				System.out.println("Hire Date: " + var.getDate());
				System.out.println("Work Shift: " + ((ProductionWorker) var).getShift());
				System.out.printf("Pay Rate: %,.2f\n", ((ProductionWorker) var).getPayRate());
			}
			
					
	}

}

