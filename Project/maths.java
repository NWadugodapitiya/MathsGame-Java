import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class maths extends JFrame {

maths(){

JLabel ll = new JLabel ("MATHS GAME");
ll.setBounds(185,50,350,50);
ll.setForeground(Color.RED);
add(ll);
Font Fteb = new Font ("calibri",Font.PLAIN,40);
ll.setFont(Fteb);


JButton b1 = new JButton ("START");
b1.setBounds (220,160,150,40);
add(b1);
Font Ateb = new Font ("calibri",Font.PLAIN,35);
b1.setFont(Ateb);

JButton b2 = new JButton ("Back");
b2.setBounds (15,320,100,20);
add(b2);


b1.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     mathsgame Frame = new mathsgame();
     dispose();
           
      }
  }); 


  b2.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
       Login Frame = new Login();
       dispose();
             
        }
    }); 

setLayout(null);
setSize (600,400);
setTitle("Login Form");
setLocationRelativeTo(null);
setVisible(true);
}

public static void main (String [] args){ 
    maths Frame = new maths();

}
}