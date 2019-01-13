package Collection;
import java.util.*;

class Descend implements Comparator<Integer>{
	@Override
	public int compare(Integer a, Integer b) {
		return b - a;
	}
}

public class TreeMapAPI {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new Descend());
		tm.put(1, "One");
		tm.put(3, "Three");
		tm.put(2, "Two");
		tm.put(4, "Four");
		tm.put(5, "Five");
		
		
		System.out.println(tm.ceilingEntry(3));
		System.out.println(tm.ceilingKey(3));
		
		System.out.println(tm.firstEntry());
		System.out.println(tm.firstKey());
		
		System.out.println(tm.floorEntry(3));
		System.out.println(tm.floorKey(3));
		
		SortedMap<Integer, String> submap =  tm.subMap(4, true, 2, true);
		
		for (Map.Entry<Integer, String> entry : submap.entrySet()) {
	        Integer key = entry.getKey();
	        String value = entry.getValue();
	        System.out.println(key);
	        System.out.println(value);
	   }
		
		System.out.println(tm);
	}

}
