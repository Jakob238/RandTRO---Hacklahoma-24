import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class RandomRetros extends JPanel
{
    // Instances Variables
    private static final String WINDOW_TITLE = "RandTRO Project";
    private String stringURL = "https://is.gd/DlUGc3";     // Home Image


    // setters and getters
    public void setStringURL(String stringURL) {
        this.stringURL = stringURL;
    }
    public String getStringURL() {
        return this.stringURL;
    }

    // Main Method Output
    public static void main(String[] args) {
        int width = 1920;       // 16:9 Default Width
        int height = 1080;      // 16:9 Default Height

        RandomRetros panel = new RandomRetros();    // RandomRetro Object

        JFrame frame = new JFrame(WINDOW_TITLE);
        // JLabel label = new JLabel("");

        // Properties for the Image Framework
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel); 
        frame.setVisible(true);

        // keyPressed Method 
        // Changes the image from the panel when the SPACE Keybind is pressed.
        panel.setFocusable(true);
        panel.requestFocus();
        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    // Call a method to handle space bar press
                    System.out.println("Space bar pressed!");
                    // Call a method to get a random image here
                    panel.setStringURL(panel.generateRandomPicture());
                    panel.repaint();
                }
            }
        });
    }

    // paintComponent Method
    // Creates various graphics changes by receiving a new Image URL and drawing the image onto the Panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            Image image = new ImageIcon(new URL(stringURL)).getImage();
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
 
    // Returns an int value between 0 and the length of the array.
    // Multiplies the length of the paramaterized array with the Math.random() to receive the index value
    public int randomIndex(String [] ar){
        return (int) (Math.random() * ar.length);
    }


    // Returns a random link that will be used to display the image on the JPanel
    // Using the randomIndex method with the parameter String[] ar for an array.
    public String generateRandomPicture()
    {  
        String[] arrOfPictures = {"https://shorturl.at/hlovE", "https://is.gd/jjtGRv", "https://shorturl.at/cvPR3", "https://shorturl.at/egyzB", "https://is.gd/6KXSKM", "https://shorturl.at/vQZ15","https://shorturl.at/wGOVZ","https://shorturl.at/gnxyE","https://shorturl.at/cgCQ5"};
        return arrOfPictures[randomIndex(arrOfPictures)];
    }
}
