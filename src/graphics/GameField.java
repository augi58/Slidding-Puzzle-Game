package graphics;

import game.SlidingPuzzle;
import settings.GameSettings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class GameField extends JPanel implements MouseListener {

    private static final long serialVersionUID = 1L;

    private SlidingPuzzle puzzle = new SlidingPuzzle();
    private UserInterface userInterface;
    private GameSettings settings = new GameSettings();
    private final int gridSize = settings.getGridSize();

    private final int sizeOfCell = settings.getSizeOfCell();
    private Font number;

    public GameField() {
        number = new Font("ComicSans", Font.BOLD, sizeOfCell / 2);
        this.setPreferredSize(
                new Dimension(sizeOfCell * gridSize, sizeOfCell * gridSize));
        this.setBackground(Color.black);
        this.addMouseListener(this);

        puzzle.initTiles();
        puzzle.shuffleTiles();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int r = 0; r < gridSize; r++) {
            for (int c = 0; c < gridSize; c++) {
                int x = c * sizeOfCell;
                int y = r * sizeOfCell;
                String text = puzzle.getFace(r, c);
                if (text != null) {
                    g.setColor(Color.green);
                    g.fillRect(x + 2, y + 2, sizeOfCell - 4, sizeOfCell - 4);
                    g.setColor(Color.black);
                    g.setFont(number);
                    g.drawString(text, x + 20, y + (3 * sizeOfCell) / 4);
                }
            }
        }
    }

    public void mousePressed(MouseEvent e) {

        int col = e.getX() / sizeOfCell;
        int row = e.getY() / sizeOfCell;

        if (!puzzle.tryToMove(row, col)) {
            Toolkit.getDefaultToolkit().beep();
        }

        this.repaint();

        if (puzzle.isGameOver()) {
            JFrame message = new JFrame();
            JOptionPane.showMessageDialog(message, "You Win!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}
