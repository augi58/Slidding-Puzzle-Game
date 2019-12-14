package tiles;

public class TileWithGraphics extends Tile {
    private String numberOnTile;

    public TileWithGraphics(int row, int col, String numberOnTile) {
        super(row, col);
        this.numberOnTile = numberOnTile;
    }

    @Override
    public String getNumberOnTile() {
        return numberOnTile;
    }

    public void setNumberOnTile(String numberOnTile) {
        this.numberOnTile = numberOnTile;
    }
}
