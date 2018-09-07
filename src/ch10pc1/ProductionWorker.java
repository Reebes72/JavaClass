package ch10pc1;

public class ProductionWorker extends Employee{
	//fields
	private int workShift;
	private double payRate;
	
	//Constructors
	public ProductionWorker(String name, String number){
		super(name, number);
	}
	public ProductionWorker(String name, String number, String date){
		super(name, number, date);
	}
	public ProductionWorker(String name, String number, int shift, double rate){
		this(name, number);
		this.setShift(shift);
		this.setPayRate(rate);
	}
	public ProductionWorker(String name, String number, String date, int shift, double rate){
		this(name,number,date);
		this.setShift(shift);
		this.setPayRate(rate);
	}
	//Mutators
	public void setShift(int shift) {
		if(shift == 1 || shift == 2) {
			workShift = shift;
		} else {
			workShift = -1;
		}
	}
	public void setPayRate(double rate) {
		if(rate < 0) {
			payRate = 0.0;
		} else {
			payRate = rate;
		}
	}
	//Accessors
	public String getShift() {
		if(workShift == 1) {
			return "Day";
		} else if(workShift == 2) {
			return "Night";
		} else {
			return "Undefined";
		}
	}
	public Double getPayRate() {
		return payRate;
	}
	

}
