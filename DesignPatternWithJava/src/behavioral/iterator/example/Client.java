package behavioral.iterator.example;

public class Client {
    public static void main(String[] args) {
        ICollection collection = new Collection();
        
        collection.add(new Item("item1"));
        collection.add(new Item("item2"));
        collection.add(new Item("item3"));
        
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            System.out.println(item.getName());
        }
    }
}
 