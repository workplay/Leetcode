package string;

public class StringAPI {

	public static void main(String[] args) {
		String str = "AbCdE";
		System.out.println(str.charAt(1));
		System.out.println(str.equals("AbCdE"));
		System.out.println(str.length());
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,3));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.startsWith("Ab"));
		System.out.println(str.startsWith("bC", 1));
		System.out.println(str.indexOf("Cd"));
	}

}
