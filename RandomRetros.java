import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RandomRetros extends JPanel
{
    // Instances Variables
    private static final String WINDOW_TITLE = "Random Retro Project!";

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame(WINDOW_TITLE);
        JLabel label = new JLabel("Test Label");

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); 
        frame.setVisible(true);

        panel.setFocusable(true);
        panel.requestFocus();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    // Call a method to handle space bar press
                    System.out.println("Space bar pressed!");
                    // Call a method to get a random image here
                }
            }
        });
    }

 
    public int randomIndex(String [] ar){
        return (int) (Math.random() * ar.length);
    }

    public String generateRandomPicture()
    {
        //array of pictures
        String[] arrOfPictures = {"https://shorturl.at/hlovE", "https://shorturl.at/eimzV", "https://shorturl.at/gkPRY", "https://shorturl.at/puIW0", "https://shorturl.at/oxQ23","https://shorturl.at/sMNQ7", "https://shorturl.at/FIU49", "https://shorturl.at/cknrU"};
        return arrOfPictures[randomIndex(arrOfPictures)];
    }
}