package structural.flyweight.example;

public class Client {
	public static void main(String[] args) {
		// Build a document with text
		String document = "ABZZZAB";
		char[] chars = document.toCharArray();
		
		CharacterFactory factory = new CharacterFactory();
		
		// extrinsic state
		int pointSize = 10;
		
		// For each character use a flyweight object
		for (char c: chars) {
			Character character = factory.getCharacter(String.valueOf(c));
			character.display(pointSize++);
		}

	}
}

