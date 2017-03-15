package behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        Aggregate aggregator = new ConcreteAggregate();
        
        aggregator.add(new Element("element1"));
        aggregator.add(new Element("element2"));
        aggregator.add(new Element("element3"));
        
        Iterator it = aggregator.iterator();
        while (it.hasNext()) {
            Element element = (Element)it.next();
            System.out.println(element.getName());
        }
    }
}
 