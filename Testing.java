import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Testing extends JPanel {
    private static final String WINDOW_TITLE = "Random Retro Project!";

public static void main(String[] args) {
        RandomRetros panel = new RandomRetros();
        JFrame frame = new JFrame(WINDOW_TITLE);
        JLabel label = new JLabel("Test Label");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); // Add the panel to the frame, not the label
        frame.setVisible(true);

        panel.setFocusable(true);
        panel.requestFocus();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    // Call a method to handle space bar press
                    System.out.println("Space bar pressed!");
                    // Call your method to get a random image here
                }
            }
        });
    }
}

