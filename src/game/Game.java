package game;

import javax.swing.JFrame;

/**
 * game.Game
 */
public class Game {

    public static void main(String[] args) {
        JFrame window = new JFrame("Sliding Puzzle");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new UserInterface());
        window.pack();
        window.setVisible(true);
        window.setResizable(false);
    }
}