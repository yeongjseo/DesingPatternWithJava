package structural.flyweight.example;

/*
 * ConcreteFlyweight
 * 
 */
public class CharacterA extends Character {

	public CharacterA() {
		this.symbol = 'A';
		this.height = 100;
		this.width = 120;
		this.ascent = 70;
		this.descent = 0;
	}

	@Override
	public void display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointSize " + this.pointSize + ")"); 
	}

}
