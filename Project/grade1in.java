import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class grade1in extends JFrame {

grade1in(){


JButton b1 = new JButton ("+");
b1.setBounds (110,30,150,37);
add(b1);
Font Ateb = new Font ("calibri",Font.PLAIN,30);
b1.setFont(Ateb);


b1.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade1 Frame = new grade1();
     dispose();
           
      }
  }); 

JButton b2 = new JButton ("-");
b2.setBounds (110,90,150,37);
add(b2);
Font Bteb = new Font ("calibri",Font.PLAIN,30);
b2.setFont(Bteb);

b2.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade11 Frame = new grade11();
     dispose();
           
      }
  }); 

JButton b6 = new JButton ("Back");
b6.setBounds (15,330,100,20);
add(b6);

b6.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     mathsgame Frame = new mathsgame();
     dispose();
           
      }
  }); 

setLayout(null);
setSize (600,400);
setTitle("Maths Game Grade 1");
setLocationRelativeTo(null);
setVisible(true);
}

public static void main (String [] args){ 
    grade1in Frame = new grade1in();

}
}