package structural.facade;

public class Client {
	public static void main(String[] args){
		Facade facade = new Facade("facade");
		
		System.out.println("Facade does A");
		facade.doA();
		System.out.println();
		System.out.println("Facade does B");
		facade.doB();
	}
}

