import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mathsgame extends JFrame {

mathsgame(){


JButton b1 = new JButton ("1 Grade");
b1.setBounds (110,30,150,37);
add(b1);
Font Ateb = new Font ("calibri",Font.PLAIN,30);
b1.setFont(Ateb);


b1.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade1in Frame = new grade1in();
     dispose();
           
      }
  }); 

JButton b2 = new JButton ("2 Grade");
b2.setBounds (110,90,150,37);
add(b2);
Font Bteb = new Font ("calibri",Font.PLAIN,30);
b2.setFont(Bteb);

b2.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade2in Frame = new grade2in();
     dispose();
           
      }
  }); 


JButton b3 = new JButton ("3 Grade");
b3.setBounds (110,150,150,37);
add(b3);
Font Cteb = new Font ("calibri",Font.PLAIN,30);
b3.setFont(Cteb);

b3.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade3in Frame = new grade3in();
     dispose();
           
      }
  }); 

JButton b4 = new JButton ("4 Grade");
b4.setBounds (110,210,150,37);
add(b4);
Font Dteb = new Font ("calibri",Font.PLAIN,30);
b4.setFont(Dteb);

b4.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade4in Frame = new grade4in();
     dispose();
           
      }
  }); 

JButton b5 = new JButton ("5 Grade");
b5.setBounds (110,270,150,37);
add(b5);
Font Eteb = new Font ("calibri",Font.PLAIN,30);
b5.setFont(Eteb);

b5.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade5in Frame = new grade5in();
     dispose();
           
      }
  }); 

JButton b6 = new JButton ("Back");
b6.setBounds (15,330,100,20);
add(b6);

b6.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     maths Frame = new maths();
     dispose();
           
      }
  }); 

setLayout(null);
setSize (600,400);
setTitle("Maths Game");
setLocationRelativeTo(null);
setVisible(true);
}

public static void main (String [] args){ 
    mathsgame Frame = new mathsgame();

}
}