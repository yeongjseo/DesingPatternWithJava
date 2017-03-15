package structural.proxy.example;

/*
 * the Proxy would handle the creation of the RealSubject object, 
 * but it will at least have a reference to it 
 * so that it can pass messages along.
 * 
 * 
 */
public class MathProxy implements IMath {
	private IMath math = new Math();

	@Override
	public double add(double x, double y) {
		return math.add(x, y);
	}

	@Override
	public double sub(double x, double y) {
		return math.sub(x, y);
	}

	@Override
	public double mul(double x, double y) {
		return math.mul(x, y);
	}

	@Override
	public double div(double x, double y) {
		return math.div(x, y);
	}
	
	
}
