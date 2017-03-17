package structural.flyweight.example;

/*
 */
public class CharacterZ extends Character {

	public CharacterZ() {
		this.symbol = 'Z';
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
