package comparing;
import java.util.*;

public class AnimalCompare implements Comparator<Animal>{

	public int compare(Animal a1, Animal a2) {
		if(a1.name.compareTo(a2.name)== a2.name.compareTo(a1.name)) {
			return Integer.compare(a1.legs,  a2.legs);
		}
		return a1.name.compareTo(a2.name);
	}
}
