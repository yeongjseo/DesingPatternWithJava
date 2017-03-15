package behavioral.strategy.example;

import java.util.List;

/*
 * The Strategy is simply implemented as an interface, 
 * so that we can swap ConcreteStrategys in and out 
 * without effecting our Context.
 * 
 */
public interface Sort {
    public void sort(List<String> list);
}
