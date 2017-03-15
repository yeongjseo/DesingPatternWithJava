package behavioral.template_method.example;

public class CategoryDAO extends DAO { 

	@Override
	public void connect() {
		System.out.println("connect database");
	}
	
	@Override
	public void select() {
		System.out.println("select * from category");
	}
	
	@Override
	public void process() {
		System.out.println("process category");
	}
	
	@Override
	public void disconnect() {
		System.out.println("disconnect database");
	}
	
}
