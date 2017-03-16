package creational.builder.example;

/*
 * ConcreteBuilder  
 */
public class ScooterBuilder extends VehicleBuilder {
	
	public ScooterBuilder() {
		super(new Vehicle("scooter"));
	}

	@Override
	public void buildFrame() {
		vehicle.setPart("frame", "scooter frame");
	}
	
	@Override
	public void buildEngine() {
		vehicle.setPart("engine", "500cc");
	}

	@Override
	public void buildWheels() {
		vehicle.setPart("wheels", "2");
	}

	@Override
	public void buildDoors() {
		vehicle.setPart("doors", "0");
	}

}
