package CH6PC2;

public class Car {
	private int yearModel;
	private String make;
	private int speed;
	
	public Car(int year, String make) {
		this.setYear(year);
		this.setMake(make);
	}
	public void setYear(int year) {
		this.yearModel = year;
	}
	public void setMake(String mk) {
		this.make = mk;
	}
	public void setSpeed(int spd) {
		this.speed = spd;
	}
	public int getYear() {
		return this.yearModel;
	}
	public String getMake() {
		return this.make;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void accelerate() {
		setSpeed(this.getSpeed() + 5);
	}
	public void brake() {
		setSpeed(this.getSpeed() - 5);
	}
	
}
