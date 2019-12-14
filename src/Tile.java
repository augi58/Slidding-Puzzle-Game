/**
 * Title
 */
public class Tile {

private int rowPosition;
private int colPosition;
private String numberOnTile;

public Tile(int row, int col, String numberOnTile) {
    this.rowPosition = row;
    this.colPosition = col;
    this.numberOnTile = numberOnTile;
}

public void setFace(String newFace) {
    numberOnTile = newFace;
}

public String getNumberOnTile() {
    return numberOnTile;
}

public int getRowPosition() {
    return this.rowPosition;
 }

 public int getColPosition() {
     return this.colPosition;
}
}