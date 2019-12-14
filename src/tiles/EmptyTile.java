package tiles;

public class EmptyTile extends Tile {

    public EmptyTile(int row, int col) {
        super(row, col);
    }

    @Override
    public String getNumberOnTile() {
        return null;
    }
}
