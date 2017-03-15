package creational.builder.example;

public class Client {
	public static void main(String[] args) {
		VehicleBuilder builder = new CarBuilder();
		Shop shop = new Shop();
		shop.build(builder);
		builder.getVehicle().show();

		builder = new ScooterBuilder();
		shop.build(builder);
		builder.getVehicle().show();

	}
}
