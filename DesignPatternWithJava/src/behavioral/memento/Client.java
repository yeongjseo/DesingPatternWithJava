package behavioral.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("stateA");
        
        Memento memento = originator.createMemento();
        
        originator.setState("stateB");
        
        originator.setMemento(memento);
        
        System.out.println("state is " + originator.getState());
    }
}
