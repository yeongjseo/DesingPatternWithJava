package structural.bridge.example;

/*
 * Implementor
 */
public abstract class Data {
	public abstract void nextRecord();
	public abstract void beforeRecord();
	public abstract void addRecord(String name);
	public abstract void deleteRecord(String name);
	public abstract void showRecord();
	public abstract void showAllRecords();
}
