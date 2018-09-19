package ch8pc4;

public class LandTract {
	private double length;
	private double width;
	
	public LandTract(double length, double width) {
		this.setLength(length);
		this.setWidth(width);
	}
	public LandTract(LandTract tract) {
		this.setLength(tract.getLength());
		this.setWidth(tract.getWidth());
	}
	
	public void setLength(double len) {
		this.length = len;
	}
	public void setWidth(double wid) {
		this.width = wid;
	}
	
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getArea() {
		return this.getLength() * this.getWidth();
	}
	public String toString() {
		String var = "Length: " + this.getLength() 
					+ "\nWidth: " + this.getWidth()
					+ "\nArea: " + this.getArea();
		return var;
	}
	public boolean equals(LandTract tract) {
		if(this.length == tract.getLength() &&
			this.width == tract.getWidth() &&
			this.getArea() == tract.getArea()) 
		{
			return true;
		} 	else {
			return false;
		}
	}
	
	}
