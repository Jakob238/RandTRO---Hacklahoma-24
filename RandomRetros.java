import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class RandomRetros extends JPanel
{
    // Instances Variables
    private static final String WINDOW_TITLE = "Random Retro Project!";
    private String stringURL = "https://shorturl.at/oxQ23";     // Default 

    public void setStringURL(String stringURL) {
        this.stringURL = stringURL;
    }
    public String getStringURL() {
        return this.stringURL;
    }
    public static void main(String[] args) {
        RandomRetros panel = new RandomRetros();
        JFrame frame = new JFrame(WINDOW_TITLE);
        JLabel label = new JLabel("");

        int width = 1920;
        int height = 1080;
        

        frame.setSize(width, height);
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
                    panel.setStringURL(panel.generateRandomPicture());
                    panel.repaint();
                }
            }
        });
    }

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
        String[] arrOfPictures = {"https://shorturl.at/hlovE", "https://shorturl.at/eimzV", "https://shorturl.at/cvPR3", "https://shorturl.at/egyzB", "https://shorturl.at/inDHN", "https://shorturl.at/vQZ15"};
        return arrOfPictures[randomIndex(arrOfPictures)];
    }
}
