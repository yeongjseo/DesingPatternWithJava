package creational.singleton.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * The 'Singleton' class
 * 
 * Singleton pattern as a LoadBalancing object. 
 * Only a single instance (the singleton) of the class can be created 
 * because servers may dynamically come on- or off-line 
 * and every request must go throught the one object 
 * that has knowledge about the state of the (web) farm.
 * 
 */
public class LoadBalancer {    
	private static LoadBalancer instance;
	private List<String> servers = new ArrayList<>();
	private Random random = new Random();
	
	private LoadBalancer() {
		servers.add("Server1");
		servers.add("Server2");
		servers.add("Server3");
	}   
	public static synchronized LoadBalancer getLoadBalancer() {
		if (instance == null) {
			instance = new LoadBalancer();
		}
		return instance;   
	}
	public void operation() {
		System.out.println("operation");
	}
	
	public String getServer() {
		int index = random.nextInt(servers.size());
        return servers.get(index);
	}
}
