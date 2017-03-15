package behavioral.visitor;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor("Visitor1");

        ArrayList<Acceptor> acceptors = new ArrayList<>();
        
        acceptors.add(new ConcreteAcceptor("acceptor1"));
        acceptors.add(new ConcreteAcceptor("acceptor2"));
        
        for (Acceptor acceptor: acceptors) {
        	acceptor.accept(visitor);	
        }
    }
}
