import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class RandomRetros extends JPanel
{
    // Instances Variables
    private static final String WINDOW_TITLE = "Random Retro Project!";
public static void main(String[] args)
    {
        JPanel panel = new RandomRetros();
        JFrame frame = new JFrame(WINDOW_TITLE);
   





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
}

