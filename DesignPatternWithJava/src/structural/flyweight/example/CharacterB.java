package structural.flyweight.example;

/*
 * ConcreteFlyweight 
 */
public class CharacterB extends Character {

	public CharacterB() {
		this.symbol = 'B';
		this.height = 100;
		this.width = 140;
		this.ascent = 72;
		this.descent = 0;
	}

	@Override
	public void display(int pointSize) {
		this.pointSize = pointSize;
		System.out.println(this.symbol + " (pointSize " + this.pointSize + ")"); 
	}

}
