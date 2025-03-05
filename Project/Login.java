import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {

JRadioButton male;
JRadioButton female;

Login(){

JLabel ll = new JLabel ("Student Registration");
ll.setBounds(175,30,450,40);
ll.setForeground(Color.RED);
add(ll);
Font Fteb = new Font ("calibri",Font.PLAIN,30);
ll.setFont(Fteb);

JLabel l2 = new JLabel ("Name");
l2.setBounds(130,100,200,20);
l2.setForeground(Color.BLACK);
add(l2);

JLabel l3 = new JLabel ("Grade");
l3.setBounds(130,150,200,20);
l3.setForeground(Color.BLACK);
add(l3);

JLabel l4 = new JLabel ("About The Game");
l4.setBounds(100,290,360,20);
l4.setForeground(Color.BLACK);
add(l4);

JTextField t1 = new JTextField();
t1.setBounds (200,100,201,20);
add(t1);

JTextField t2 = new JTextField();
t2.setBounds (200,150,201,20);
add(t2);

JButton b1 = new JButton ("Login");
b1.setBounds (200,200,100,20);
add(b1);

b1.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
   maths Frame = new maths();
   dispose();
    }
}); 

l4.addMouseListener(new MouseAdapter(){
   
public void mouseEntered(MouseEvent e){

l4.setText("Improvement Fo Mathematics Subject In Primary Grades");
l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
}
});

l4.addMouseListener(new MouseAdapter(){
   
public void mouseExited
       (MouseEvent e){
l4.setText("About The Game");

}
});

t1.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t2.requestFocus(true);
   }
  }
});

t2.addKeyListener(new KeyAdapter() {
    public void keyPressed(final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if (keypad == KeyEvent.VK_ENTER){
t2.requestFocus(true);
   }
  }
});

setLayout(null);

Font forme = new Font ("Lucida Handwriting",Font.PLAIN,11);

male = new JRadioButton("Male", true);
male.setForeground(Color.BLACK);

female = new JRadioButton("Female", false);
female.setForeground(Color.BLACK);

male.setBounds(350,180,100,20);
female.setBounds(350,205,100,20);

ButtonGroup nooth = new ButtonGroup();
add(male);
add(female);

nooth.add(male);
nooth.add(female);




setSize (600,400);
setTitle("Student Registrasion");
setLocationRelativeTo(null);
setVisible(true);
}

public static void main (String [] args){ 
    Login Frame = new Login();

}
}