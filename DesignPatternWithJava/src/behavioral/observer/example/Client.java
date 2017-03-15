package behavioral.observer.example;

public class Client {
    public static void main(String[] args) {
        AbstractStock stock = new Stock("stock");
        AbstractInvestor investor1 = new Investor("investor1");
        AbstractInvestor investor2 = new Investor("investor2");
        stock.attach(investor1);
        stock.attach(investor2);
        stock.setPrice(10.0);
    }
}
