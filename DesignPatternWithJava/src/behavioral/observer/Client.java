package behavioral.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject("subject1");
        Observer observerA = new ConcreteObserverA("observerA");
        Observer observerB = new ConcreteObserverB("observerB");
        subject.attach(observerA);
        subject.attach(observerB);
        subject.execute();
    }
}
