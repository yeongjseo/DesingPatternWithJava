package creational.builder;

/*
 * The Director constructs the object through the Builder's interface. 
 */
public class Director {
    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public void build() {

        builder.buildPart1("part1");
        builder.buildPart2("part2");
    }
}
