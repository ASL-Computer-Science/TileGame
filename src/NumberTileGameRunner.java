
public class NumberTileGameRunner {
	public static void main(String[] args) {
		// Inserting tiles from sample in reverse order, so they fit the
		// way they are drawn in the question.
		TileGame t = new TileGame();
		t.insertTile(new NumberTile(5,9,2,2));
		t.insertTile(new NumberTile(3,2,5,2));
		t.insertTile(new NumberTile(1,2,3,4));
		t.insertTile(new NumberTile(6,4,3,3));
		t.insertTile(new NumberTile(4,3,7,4));

		t.printTiles();

		// This is the test tile from the sample. My code should put it in index 3.
		if (t.insertTile(new NumberTile(4,2,9,2))) {
			System.out.println("The new tile was successfully inserted.");
			System.out.println("Here is the new configuration:");
			t.printTiles();
		}

		// This tile should not fit.
		if (!t.insertTile(new NumberTile(3,2,5,8)))
			System.out.println("This tile could not fit.\n");

		// Let's try a case that requires a rotation.
		if (t.insertTile(new NumberTile(4,2,9,8))) {
			System.out.println("The new tile was successfully inserted.");
			System.out.println("Here is the new configuration:");
			t.printTiles();
		}
	}

}
