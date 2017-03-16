package creational.factory_method.example;

import java.util.ArrayList;
import java.util.List;

/*
 * Factory
 */
public abstract class Document {
	protected List<Page> pages = new ArrayList<>();

	public Document() {
		this.createPages();
	}
    
	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	public abstract void createPages();
	public abstract String getType();

}
