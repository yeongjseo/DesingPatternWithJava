package creational.builder.example;

/*
 * ConcreteBuilder
 */
public class CarBuilder extends VehicleBuilder {
	
	public CarBuilder() {
		super(new Vehicle("car"));
	}

	@Override
	public void buildFrame() {
		vehicle.setPart("frame", "car frame");
	}
	
	@Override
	public void buildEngine() {
		vehicle.setPart("engine", "2,500cc");
	}

	@Override
	public void buildWheels() {
		vehicle.setPart("wheels", "4");
	}

	@Override
	public void buildDoors() {
		vehicle.setPart("doors", "4");
	}

}
