package structural.flyweight.example;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 */
public class CharacterFactory {
	String intrinsicData;
	
	private Map<String, Character> characters = new HashMap<>();
	
	public Character getCharacter(String key){
		Character character;
		if (characters.containsKey(key)) {
			character = characters.get(key); 
		} else {
			switch(key.toUpperCase()) {
			case "A": character = new CharacterA(); break;
			case "B": character = new CharacterB(); break;
			default:  character = new CharacterZ(); break;
			}
			characters.put(key, character);
		}
		return character;
	}

}
