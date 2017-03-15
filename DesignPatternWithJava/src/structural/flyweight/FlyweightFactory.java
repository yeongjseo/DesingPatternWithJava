package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/*
 * FlyweightFactory is responsible for the creation and management of the flyweights, 
 * ensuring that they are shared properly. 
 * 
 * If the desired Flyweight isn't created yet 
 * it will create and return one. 
 * 
 * Otherwise, it will return one from the current pool of flyweights. 
 * 
 * 
 */
public class FlyweightFactory {
	String intrinsicData;
	
	private List<Flyweight> flyweights = new ArrayList<>();
	
	public Flyweight getFlyweight(String intrinsic){
		//check if we've already created a line with this color 
		for (Flyweight flyweight: flyweights) {
			if (flyweight.getIntrinsic().equals(intrinsic)) {
				return flyweight;
			}
		}
		//if not, create one and save it to the poolLine
		Flyweight flyweight = new ConcreteFlyweight(intrinsic);
		flyweights.add(flyweight);
		return flyweight;
	}

}
