package creational.builder;

/*
 * The Builder provides an interface for creating the parts that make up a Product,
 */
public abstract class Builder {
    public abstract void buildPart1(String part);
    public abstract void buildPart2(String part);
}
