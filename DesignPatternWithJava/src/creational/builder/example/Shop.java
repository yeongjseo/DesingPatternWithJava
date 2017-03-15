package creational.builder.example;

/*
 * The Director constructs the object through the Builder's interface. 
 */
public class Shop {
    
    public void build(VehicleBuilder builder) {
        builder.buildFrame();
        builder.buildEngine();
        builder.buildWheels();
        builder.buildDoors();
    }
}

