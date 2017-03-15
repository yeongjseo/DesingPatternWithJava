package behavioral.template_method.example;

public class Client {
	public static void main(String[] args) {

		DAO categoryDAO = new CategoryDAO();
		categoryDAO.run();

		System.out.println();
		
		DAO productDAO = new ProductDAO();
		productDAO.run();
	}
}
