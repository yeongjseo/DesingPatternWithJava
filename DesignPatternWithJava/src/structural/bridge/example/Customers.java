package structural.bridge.example;

/*
 * Bridge
 */
public class Customers {
    private Data data;
    private String group;
    public Customers(String group) {
        this.group = group;
    }
	public void setData(Data data) {
		this.data = data;
	}

	public void next() {
		data.nextRecord();
	}
	
	public void before() {
		data.beforeRecord();
	}
	
	public void add(String customer) {
		data.addRecord(customer);
	}
	
	public void delete(String customer) {
		data.deleteRecord(customer);
	}
	
	public void show() {
		data.showRecord();
	}
	
	public void showAll() {
		System.out.println("Customer Group: " + group + " ----");
		data.showAllRecords();
	}
}
