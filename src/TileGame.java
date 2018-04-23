import java.util.ArrayList;

public class TileGame {
	/** represents the game board; guaranteed never to be null */
	private ArrayList<NumberTile> board;

	public TileGame() {
		board = new ArrayList<NumberTile>(); 
	}

	/** Determines where to insert tile, in its current orientation, into game board
	 * @param tile the tile to be placed on the game board
	 * @return the position of tile where tile is to be inserted:
	 * 			0 if the board is empty;
	 * 			-1 if tile does not fit in front, at end, or between any existing tiles;
	 * 			otherwise, 0 <= position returned <= board.size()
	 */
	private int getIndexForFit(NumberTile tile) {
		//TODO: Complete part A
		return 0;	
	}
	/** Places tile on the game board if it fits (checking all possible tile orientations if necessary).
	 * If there are no tiles on the game board, the tile is places at position 0.
	 * The tile should be placed at most 1 time.
	 * Precondition: board is not null 
	 * @param tile the tile to be placed on the game board
	 * @return true if the tile is places successfully; false otherwise
	 * Postcondition: the orientations of the other tiles on the board are not changed
	 * Postcondition: the order of the other tiles on the board relative to each other is not changed
	 */
	public boolean insertTile(NumberTile tile) {
		//TODO Complete part B
		return false;
	}

	public void printTiles() {
		// Prints out first row, with each up value.
		for (int i=0; i<board.size(); i++) {
			System.out.print("  "+board.get(i).getUp()+"   ");
		}
		System.out.println();

		// Prints out second row, with each left and right value.
		for (int i=0; i<board.size(); i++) {
			System.out.print(board.get(i).getLeft()+"   "+board.get(i).getRight()+" ");
		}
		System.out.println();

		// Prints last row with each down value, and skips a line.
		for (int i=0; i<board.size(); i++) {
			System.out.print("  "+board.get(i).getDown()+"   ");
		}
		System.out.println();
		System.out.println();

	}
}
