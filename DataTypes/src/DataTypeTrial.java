
public class DataTypeTrial {

	public static void main(String[] args) {
		System.out.println(bolReturn());
		System.out.println(charReturn());
		System.out.println(shoReturn());
		System.out.println(intReturn());
		System.out.println(lonReturn());
		System.out.println(floReturn());
		System.out.println(douReturn());
		noReturn();

	}
	
	public static boolean bolReturn() {
		return true;
	}
	
	public static char charReturn() {
		return 'S';
	}
	
	public static short shoReturn() {
		return 5;
	}
	
	public static int intReturn() {
		return 5000;
	}
	
	public static long lonReturn() {
		return 200000000l;
	}
	
	public static float floReturn() {
		return 2.3f;
	}
	
	public static double douReturn() {
		return 50.25d;
	}
	
	public static void noReturn() {
		System.out.println("No value was returned!");
	}

}
