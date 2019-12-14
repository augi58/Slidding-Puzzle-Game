/**
 * Title
 */

package tiles;

public class Tile {

    private int rowPosition;
    private int colPosition;

    public Tile(int row, int col) {
        this.rowPosition = row;
        this.colPosition = col;
    }

    public void setFace(String newFace) {
    }

    public int getRowPosition() {
        return this.rowPosition;
    }

    public int getColPosition() {
        return this.colPosition;
    }

    public String getNumberOnTile() {
        return null;
    }
}