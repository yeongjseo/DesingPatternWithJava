package creational.builder.example;

/*
 * The Builder provides an interface for creating the parts that make up a Product,
 */
public abstract class VehicleBuilder {
	
	protected Vehicle vehicle;

	public VehicleBuilder(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public abstract void buildFrame();
	public abstract void buildEngine();
	public abstract void buildWheels();
	public abstract void buildDoors();
	
	
}

