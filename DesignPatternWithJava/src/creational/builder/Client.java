package creational.builder;

public class Client {
    public static void main(String[] args) {
    	
    	ConcreteBuilderA builderA = new ConcreteBuilderA();
    	Director director = new Director(builderA);
    	director.build();
    	System.out.println(builderA.getResult());
    	
    	
    	ConcreteBuilderB builderB = new ConcreteBuilderB();
    	director = new Director(builderB);
    	director.build();
    	System.out.println(builderB.getResult());
    	
    }
}
