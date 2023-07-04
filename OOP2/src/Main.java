
public class Main {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.numberOfSeats=3;
		vehicle.numberOfWheels=2;
		
		vehicle.starts();
		
		Car car1= new Car();
		car1.numberOfSeats=2;
		car1.numberOfWheels=4;
		car1.starts();
		
		Vehicle vehicle2 = new Car();
		Engine engine = new Car();
		
		engine.starts();
		engine.stop();
				

	}

}
