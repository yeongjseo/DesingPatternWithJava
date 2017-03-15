package behavioral.memento.example;

public class Client {
    public static void main(String[] args) {
        SalesPerson person = new SalesPerson("Seo", "010-555-5555", 1000.0);
        System.out.println(person);
        
        Memento memento = person.saveMemento();
        
        person.setName("Kim");
        person.setPhone("010-444-4444");
        person.setBudget(2000.0);
        
        System.out.println(person);
        person.restoreMemento(memento);
        
        System.out.println(person);
    }
}
