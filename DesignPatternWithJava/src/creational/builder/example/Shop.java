package creational.builder.example;

/*
 * Director 
 */
public class Shop {
    
    public void build(VehicleBuilder builder) {
        builder.buildFrame();
        builder.buildEngine();
        builder.buildWheels();
        builder.buildDoors();
    }
}

