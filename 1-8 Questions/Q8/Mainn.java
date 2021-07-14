import java.awt.*;
import java.awt.event.*;
public class Mainn extends Frame implements MouseListener {
    final int length = 100;
    final int breadth = 100;
    Mainn() {
        super("AWT Frame");
        this.setSize(this.length, this.breadth);
        this.setLayout(null);
        this.setVisible(true);
        this.addMouseListener(this);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new Mainn();
    }
    
    public void mouseClicked(MouseEvent e) {
        this.setSize(this.length, this.breadth);
    }
    
    public void mousePressed(MouseEvent e) {
    }
    
    public void mouseReleased(MouseEvent e) {
    }
    
    public void mouseEntered(MouseEvent e) {
        this.setSize(3 * this.length, 3 * this.breadth);
    }
    
    public void mouseExited(MouseEvent e) {
        this.dispose();
    }
}
