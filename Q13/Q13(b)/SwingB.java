
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingB {
    JLabel l;
    SwingB() {
        JFrame f = new JFrame("Swing Pink");
        l = new JLabel("This is a java Program.", SwingConstants.CENTER);
        l.setBounds(15, 15, 260, 30); 
        f.add(l);
        f.getContentPane().setBackground(Color.PINK);
        f.setSize(300, 100);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingB();
            }
        });
    }
}