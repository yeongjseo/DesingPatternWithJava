package creational.factory_method.example;

/*
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
