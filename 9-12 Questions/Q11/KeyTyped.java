import java.awt.*; 
import java.awt.event.*;  
public class KeyTyped extends KeyAdapter  {                
 Frame f;     
 Label l;
 
 KeyTyped(){      
  f = new Frame("AWT Keyboard");      
  l = new Label();      
  l.setBounds(25, 35, 200, 100);      
  l.setBackground(Color.LIGHT_GRAY);      
  l.setAlignment(l.CENTER);  
  f.add(l);      
  f.addKeyListener(this);      
  f.setFocusable(true);   
  f.setSize(300,300);      
  f.setVisible(true);           
  f.addWindowListener(new WindowAdapter() {      
  public void windowClosing (WindowEvent e) {       
   f.dispose();      
  }      
  }
  );   
  }
  
  public void keyPressed(KeyEvent e){}   
  public void keyReleased(KeyEvent e){}   
  public void keyTyped(KeyEvent e){      
   char ch = e.getKeyChar();       
   l.setText("Typed character is: "+ch);   
  }    
  public static void main(String snrao[]){      
  new KeyTyped();   
  }                                     
 }     