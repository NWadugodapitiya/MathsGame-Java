import java.awt.*;
import javax.swing.*;
import java .awt .event.*;

public class Winmsg55 extends JFrame{
Winmsg55(){

JLabel l1= new JLabel("Congratulation !");
l1.setBounds(190,20,200,70);
add(l1);
Font Fteb1 = new Font ("calibri",Font.PLAIN,30);
l1.setFont(Fteb1);

JLabel l2= new JLabel("You Pass The Level 2");
l2.setBounds(160,80,400,70);
add(l2);
Font Fteb2 = new Font ("calibri",Font.PLAIN,30);
l2.setFont(Fteb2);

JButton b1 = new JButton ("Play Again");
b1.setBounds (80,170,120,30);
Font Fteb3 = new Font ("calibri",Font.PLAIN,20);
b1.setFont(Fteb3);
add(b1);

JButton b2 = new JButton ("Play Next");
b2.setBounds (350,170,120,30);
Font Fteb4 = new Font ("calibri",Font.PLAIN,20);
b2.setFont(Fteb4);
add(b2);

b1.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e) {
     grade55 Frame = new grade55();
     dispose();
           
      }
  }); 


  b2.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
       grade5in Frame = new grade5in();
       dispose();
             
        }
    }); 



setLayout(null);
JLabel background;
setDefaultCloseOperation(EXIT_ON_CLOSE);
setSize(600,300);
setTitle("MATHS GAME GRADE 5");
setLocationRelativeTo(null);
setVisible(true);



}




public static void main (String[]Args){
  Winmsg55 Frame = new Winmsg55 ();
}}

