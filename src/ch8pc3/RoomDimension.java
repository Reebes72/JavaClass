package ch8pc3;

public class RoomDimension {
	private double length;
	private double width;
	
	public RoomDimension(RoomDimension room) {
		this.setLength(room.getLength());
		this.setWidth(room.getWidth());
	}
	public RoomDimension(double length, double width) {
		this.setLength(length);
		this.setWidth(width);
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
		return this.width * this.length;
	}
}
