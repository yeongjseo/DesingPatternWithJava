package structural.flyweight;

public class Client {
	public static void main(String[] args){
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight flyweight = factory.getFlyweight("intrinsic1");
		flyweight.operation("extrinsic1");
	}
}

