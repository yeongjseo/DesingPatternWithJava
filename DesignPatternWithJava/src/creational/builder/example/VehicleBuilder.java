package creational.builder.example;

/*
 * Builder
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

