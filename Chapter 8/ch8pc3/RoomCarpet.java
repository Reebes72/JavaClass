package ch8pc3;

public class RoomCarpet {
	private RoomDimension room;
	private double carpetCostPerSqFoot;
	
	public RoomCarpet(RoomDimension room, double cost) {
		setRoomDimension(room);
		setCarpetCost(cost);
	}
	public RoomCarpet(double len, double wid, double cost) {
		setRoomDimension(len, wid);
		setCarpetCost(cost);
	}
	
	public void setRoomDimension(RoomDimension var) {
		this.room = new RoomDimension(var);
	}
	public void setRoomDimension(double wid, double len) {
		this.room = new RoomDimension(wid, len);
	}
	public void setCarpetCost(double cost) {
		this.carpetCostPerSqFoot = cost;
	}
	public RoomDimension getRoom() {
		return new RoomDimension(room);
	}
	public double getCarpetCost() {
		return this.carpetCostPerSqFoot;
	}
	public double getTotalCarpetCost() {
		return this.room.getArea() * this.getCarpetCost();
	}
	
	public String toString() {
		String var = "Width: \t\t\t" + this.room.getWidth() + "\n" +
					 "Length: \t\t" + this.room.getLength() + "\n" +
					 "Area: \t\t\t" + this.room.getArea() + "\n" +
					 "Cost Per Square Foot: \t" + this.getCarpetCost() + "\n" +
					 "Total Carpet Cost: \t" + this.getTotalCarpetCost();
		return var;
					
	}
}
