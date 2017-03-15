package structural.proxy.example;

/*
 * 
 */
public class Client {
	public static void main(String[] args) {
		// Create math proxy
		MathProxy proxy = new MathProxy();

		// Do the math
		System.out.println("4 + 2 = " + proxy.add(4, 2));
		System.out.println("4 - 2 = " + proxy.sub(4, 2));
		System.out.println("4 * 2 = " + proxy.mul(4, 2));
		System.out.println("4 / 2 = " + proxy.div(4, 2));
	}
}

