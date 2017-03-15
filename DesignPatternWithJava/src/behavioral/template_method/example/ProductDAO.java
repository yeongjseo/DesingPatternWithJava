package behavioral.template_method.example;

public class ProductDAO extends DAO { 

	@Override
	public void connect() {
		System.out.println("connect database");
	}
	
	@Override
	public void select() {
		System.out.println("select * from products");
	}
	
	@Override
	public void process() {
		System.out.println("process products");
	}
	
	@Override
	public void disconnect() {
		System.out.println("disconnect database");
	}
	
}
