package Collection;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.Arrays;

class CompareByLen implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class TreeSetAPI {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new CompareByLen());
		ts.add("abcde");
		ts.addAll(Arrays.asList("a","bcd","cd","abcd"));
		System.out.println(ts);
		
		for (String str : ts.descendingSet()) {
			System.out.println(str);
		}
		
	}

}
