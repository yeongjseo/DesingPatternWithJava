package creational.factory_method.example;

/*
 * Here we see the client making a call to the abstract Creator, 
 * which then uses the factoryMethod() 
 * to get a new instance of the ConcreteProduct, 
 * complete's the anOperation() method and completes.
 * 
 */
public class Client {
    public static void main(String[] args) {
        Document[] documents = new Document[2];
        documents[0] = new Resume();
        documents[1] = new Report();
        		
        for (Document document: documents) {
        	System.out.println("\n" + document.getType() + " ---");
        	for (Page page: document.getPages()) {
        		System.out.println("  " + page.getType());
        	}
        }
    }
}
