
public class NumberTile {
	
	private int[] values;
	
	public NumberTile(int up, int right, int down, int left) {
		values = new int[4];
		values[0] = up;
		values[1] = right;
		values[2] = down;
		values[3] = left;
	}
	
	/** Rotates the tile 90 degrees clockwise
	 */
	public void rotate() {
		int temp = values[0];
		values[0] = values[3];
		values[3] = values[2];
		values[2] = values[1];
		values[1] = temp;
	}
	
	/** @return value at left edge of tile
	 */
	public int getLeft() {
		return values[3];
	}
	
	/** @return value at right edge of tile
	 */
	public int getRight() {
		return values[1];
	}
	
	public int getUp() {
		return values[0];
	}
	
	public int getDown() {
		return values[2];
	}

}
