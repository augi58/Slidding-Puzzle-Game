package game;

public class GameSettings {
    private static final int gridSize = 3;
    private static final int sizeOfCell = 100;

    public GameSettings() {
    }

    public int getGridSize() {
        return gridSize;
    }

    public static int getSizeOfCell() {
        return sizeOfCell;
    }
}
