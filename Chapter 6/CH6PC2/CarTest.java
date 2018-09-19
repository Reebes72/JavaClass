package CH6PC2;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car test = new Car(2014, "Honda");
		test.accelerate();
		System.out.println(test.getSpeed());
		test.accelerate();
		System.out.println(test.getSpeed());
		test.accelerate();
		System.out.println(test.getSpeed());
		test.accelerate();
		System.out.println(test.getSpeed());
		test.accelerate();
		System.out.println(test.getSpeed());
		test.brake();
		System.out.println(test.getSpeed());
		test.brake();
		System.out.println(test.getSpeed());
		test.brake();
		System.out.println(test.getSpeed());
		test.brake();
		System.out.println(test.getSpeed());
		test.brake();
		System.out.println(test.getSpeed());
	}

}
