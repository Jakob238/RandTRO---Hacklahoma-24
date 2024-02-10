import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import javax.imageio.ImageIO;

public class RandomRetros extends JPanel
{
    // Instances Variables
    private static final String WINDOW_TITLE = "Random Retro Project!";

    public static void main(String[] args) {

        JPanel panel = new RandomRetros();
        JFrame frame = new JFrame(WINDOW_TITLE);
        JLabel label = new JLabel("Test Label");

        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);
        frame.setVisible(true);


        panel.setFocusable(true); 
        panel.requestFocus(); 
        panel.addKeyListener(new KeyAdapter()
            {
        public void pressKey(KeyEvent e)
        {
            if(e.getKeyCode()== KeyEvent.VK_SPACE)
            {
                //call get method for random image
            }
        }
            });




    }

    public int randomIndex(String [] ar){
        return (int) (Math.random() * ar.length);
    }


}