/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"jack", "queen", "king", "ace"};
		String[] suits = {"clubs", "hearts", "spades"};
		int[] pointValue = {11, 12, 13, 14};
		Deck d = new Deck(ranks, suits, pointValue);

		System.out.println(d);
		System.out.println(d.isEmpty());
		System.out.println(d.size());
		System.out.println(d.deal());
	}
}
