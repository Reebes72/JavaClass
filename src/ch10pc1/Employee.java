package ch10pc1;


public class Employee {
	//fields
		private String employeeName;
		private String employeeNumber;
		private String hireDate;
	//Constructors	
		public Employee(String name, String number) {
			setName(name);
			setNumber(number);
			
		}		
		public Employee(String name, String number, String date) {
			this(name, number);
			setDate(date);
		}
		
	//Mutators
		public void setDate(String date) {
			hireDate = date;
		}
		public void setName(String name) {
			employeeName = name;
		}
		public void setNumber (String number) {
			employeeNumber = number;
		}
		
	//Accessors
		public String getDate() {
			return hireDate;
		}
		public String getName() {
			return employeeName;
		}
		public String getNumber() {
			return employeeNumber;
		}
		
		
		
}
