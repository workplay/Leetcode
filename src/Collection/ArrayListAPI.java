package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.remove(1);
	
		System.out.println(l.toString());
		
		for (Integer i : l) {
			System.out.println(i.intValue());
		}
		
		l.addAll(Arrays.asList(1,2,3,4));
		System.out.println(l);
		
	}

}
