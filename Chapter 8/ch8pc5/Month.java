package ch8pc5;

public class Month {
	private int monthNumber;
	private enum month { January, Feburary, March, April, June, July, August, Semptember, October, November, December }
	private month monthString;
	
	public Month(){
		this.setMonthNumber(1);
	}
	public Month(int month) {
		if(month > 0 && month < 13)
		this.setMonthNumber(month);
		else
		this.setMonthNumber(1);
	}
	public Month(month month) {
		this.setMonthNumber(monthString.ordinal() + 1);
	}
	
	
	public void setMonthNumber(int mon) {
		if(mon > 0 && mon < 13)
		this.monthNumber = mon;
		else
			this.monthNumber = 1;
	}
	public int getMonthNumber() {
		return this.monthNumber;
	}
	public String getMonthName() {
		return this.monthString.name();
	}
	public String toString() {
		return this.monthString.name();
	}
	public boolean equals(Month mon) {
		if(this.getMonthNumber() == mon.getMonthNumber() &&
				this.getMonthName() == mon.getMonthName()) {
			return true;
		}
			else {
			return false;
		}
		
	}
	public boolean greaterThan(Month mon) {
		if(this.getMonthNumber() > mon.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}
	public boolean lessThan(Month mon) {
		if(this.getMonthNumber() < mon.getMonthNumber()) {
			return true;
		} else {
			return false;
		}
	}
}
