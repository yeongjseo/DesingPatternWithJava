package structural.bridge;

/*
 * Bridge
 */
public class Bridge {
    private Implementor implementor;
    public Bridge(Implementor implementor) {
        this.implementor = implementor;
    }
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	public void operation() {
    	implementor.operationImplement();
    }
}
