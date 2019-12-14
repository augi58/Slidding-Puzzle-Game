package graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JPanel {

    private static final long serialVersionUID = 1L;
    private GameField canvas;

    public UserInterface() {

        canvas = new GameField();

        JButton resetButton = new JButton("Shuffle Tiles");
        resetButton.addActionListener(new ResetGame());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        controlPanel.add(resetButton);

        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.SOUTH);

    }

    public class ResetGame implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // TODO game reset actions goes here
        }
    }

}