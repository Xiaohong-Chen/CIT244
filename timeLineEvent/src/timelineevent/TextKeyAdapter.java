package timelineevent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TextKeyAdapter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent e) {
        
        if(!(e.getKeyCode()>=KeyEvent.VK_0 && e.getKeyCode()<=KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_BACK_SPACE)){
                     JOptionPane.showMessageDialog(new JFrame(), "Please Input Numeric!");
                     
                }
        
    }

   

    
            
}
