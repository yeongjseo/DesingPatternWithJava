package creational.singleton.example;

public class Client {
	public static void main(String[] args) {
		// Load balance 15 server requests
		LoadBalancer balancer = LoadBalancer.getLoadBalancer();
		for (int j = 0; j < 3; j++) {
			String server = balancer.getServer();
			System.out.println("Dispatch Request to: " + server);
		}
	}
}
