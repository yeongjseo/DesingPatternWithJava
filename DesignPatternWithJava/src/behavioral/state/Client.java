package behavioral.state;

public class Client {
    public static void main(String[] args) {
    	Context context = new Context(new ConcreteState1("state1"));
    	context.request("message1");
    	
    	context.request("message2");
    	
    }
}
