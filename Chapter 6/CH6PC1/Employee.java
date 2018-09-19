package CH6PC1;

public class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String name, int id, String dpt, String pos) {
		setName(name);
		setId(id);
		setDepartment(dpt);
		setPosition(pos);
	}
	public Employee(String name, int id) {
		setName(name);
		setId(id);
		setDepartment("");
		setPosition("");
	}
	public Employee() {
		setName("");
		setId(0);
		setDepartment("");
		setPosition("");
	}
	public void setName(String var) {
		this.name = var;
	}
	public void setId(int id) {
		this.idNumber = id;
	}
	public void setDepartment(String dept) {
		this.department = dept;
	}
	public void setPosition(String pos) {
		this.position = pos;
	}
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public String getPosition() {
		return this.position;
	}
	
	public String toString(){
		String var = "Employee: " + this.getName() 
					+ "\nID Number: " + this.getId()
					+ "\nDepartment: " + this.getDepartment()
					+ "\nPosition: " + this.getPosition();
		return var;
	}
}
