package structural.bridge;

public abstract class Implementor {
	private String name;
	public Implementor(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
    public abstract void operationImplement();
}
