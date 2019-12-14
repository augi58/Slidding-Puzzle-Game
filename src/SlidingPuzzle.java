/**
 * SlidingPuzzle
 */
public class SlidingPuzzle {

    private static final int gridSize = 3;

    private Tile[][] setOfTiles;
    private Tile     emptySpace;
    
    public SlidingPuzzle() {
        this.setOfTiles = new Tile[gridSize][gridSize];
    }
    
    String getFace(int row, int col) {
        return setOfTiles[row][col].getNumberOnTile();
    }
    
    public void initTiles() {
        for (int r=0; r<gridSize; r++) {
            for (int c=0; c<gridSize; c++) {
                setOfTiles[r][c] = new Tile(r, c, "" + (r*gridSize+c+1));
            }
        }
        emptySpace = setOfTiles[gridSize-1][gridSize-1];
        emptySpace.setFace(null);
    }

    public void shuffleTiles() {
        for (int r=0; r<gridSize; r++) {
            for (int c=0; c<gridSize;c++) {
                swapTiles(r, c, (int)(Math.random()*gridSize)
                                  , (int)(Math.random()*gridSize));
            }
        }
    }
    
    public boolean tryToMove(int r, int c) {
        return isEmptyTile(r, c, -1, 0) || isEmptyTile(r, c, 1, 0)
            || isEmptyTile(r, c, 0, -1) || isEmptyTile(r, c, 0, 1);
    }
    
    private boolean isEmptyTile(int r, int c, int rdelta, int cdelta) {
        int rNeighbor = r + rdelta;
        int cNeighbor = c + cdelta;
        if (withinBounds(rNeighbor, cNeighbor) && setOfTiles[rNeighbor][cNeighbor] == emptySpace) {
            swapTiles(r, c, rNeighbor, cNeighbor);
            return true;
        }
        return false;
    }
    
    public boolean withinBounds(int r, int c) {
        return r>=0 && r<gridSize && c>=0 && c<gridSize;
    }
    
    private void swapTiles(int r1, int c1, int r2, int c2) {
        Tile temp = setOfTiles[r1][c1];
        setOfTiles[r1][c1] = setOfTiles[r2][c2];
        setOfTiles[r2][c2] = temp;
    }

    public boolean isGameOver() {
        for (int r=0; r<gridSize; r++) {
            for (int c=0; c<gridSize; c++) {
                Tile t = setOfTiles[r][c];
                if(t.getRowPosition() == r && t.getColPosition() == c)
                {
                    return false;
                }
            }
        }
        return true;
    }
}