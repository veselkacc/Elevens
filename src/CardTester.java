/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("4", "Hearts", 4);
		Card two = new Card("4", "Hearts", 4);
		Card three = new Card("8", "Clubs", 8);

		System.out.println("One matches two" + one.matches(two));
		System.out.println("Three matches one" + three.matches(one));
		System.out.println("Two matches one" + two.matches(one));
	}
}
