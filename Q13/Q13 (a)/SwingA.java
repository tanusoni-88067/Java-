
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingA {
    JLabel l;
    SwingA() {
        JFrame f = new JFrame("Swing Frame");
        l = new JLabel("", SwingConstants.CENTER);
        l.setBounds(15, 110, 260, 30);
        f.add(l);
        f.addMouseListener(new MouseAdapter() {
            
            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse Clicked");
            }
            
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse Entered");
            }
           
            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");
            }
        });
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingA();
            }
        });
    }
}