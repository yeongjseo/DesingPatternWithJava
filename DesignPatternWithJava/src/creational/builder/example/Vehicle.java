package creational.builder.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Vehicle {
	protected String type;
	protected Map<String, String> parts = new HashMap<>();
	
	public Vehicle(String type) {
		super();
		this.type = type;
	}

	public String getPart(String key) {
		return parts.get(key);
	}

	public void setPart(String key, String value) {
		parts.put(key, value);
	}
	
	public void show() {
		System.out.println("\n---------------------");
		System.out.println("Vehicle type: " + type);
		for (Entry<String, String> entry : parts.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println(String.format("  %s: %s", key, value));
		}
	}
	
}
