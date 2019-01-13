package Collection;

import java.util.Set;
import java.util.HashSet;

public class HashSetAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Double> s = new HashSet<>();
		s.add(2.5);
		s.remove(2.5);
		System.out.println(s.contains(2.5));
	}

}
