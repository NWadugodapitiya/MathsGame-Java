import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class grade4in extends JFrame {

grade4in(){


JButton b1 = new JButton ("+");
b1.setBounds (110,30,150,37);
add(b1);
Font Ateb = new Font ("calibri",Font.PLAIN,30);
b1.setFont(Ateb);


b1.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade4 Frame = new grade4();
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
     grade44 Frame = new grade44();
     dispose();
           
      }
  }); 

JButton b3 = new JButton ("*");
b3.setBounds (110,150,150,37);
add(b3);
Font Cteb = new Font ("calibri",Font.PLAIN,30);
b3.setFont(Cteb);

b3.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade444 Frame = new grade444();
     dispose();
           
      }
  }); 

JButton b4 = new JButton ("/");
b4.setBounds (110,210,150,37);
add(b4);
Font Dteb = new Font ("calibri",Font.PLAIN,30);
b4.setFont(Dteb);

b4.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade4444 Frame = new grade4444();
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
setTitle("Maths Game Grade 4");
setLocationRelativeTo(null);
setVisible(true);
}

public static void main (String [] args){ 
    grade4in Frame = new grade4in();

}
}