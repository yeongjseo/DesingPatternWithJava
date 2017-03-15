package structural.facade.example;

public class Client {
	public static void main(String[] args){
		Mortgage mortgage = new Mortgage("mortgage");
		Customer seo = new Customer("Seo", 1000, 2, 10);
		Customer kim = new Customer("Kim", 2000, 10, 2);
		
		mortgage.apply(seo, 500);
		mortgage.apply(kim, 500);
		
	}
}

