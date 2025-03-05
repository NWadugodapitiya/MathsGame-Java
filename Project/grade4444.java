import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class grade4444 extends JFrame {

grade4444(){

JLabel ll = new JLabel ("Marks");
ll.setBounds(25,30,80,40);
ll.setForeground(Color.BLACK);
add(ll);
Font Fteb = new Font ("calibri",Font.PLAIN,25);
ll.setFont(Fteb);

JLabel l2 = new JLabel ("00");
l2.setBounds(90,30,80,40);
l2.setForeground(Color.BLACK);
add(l2);
Font Ateb = new Font ("calibri",Font.PLAIN,25);
l2.setFont(Ateb);

JLabel l3 = new JLabel(" ");
l3.setBounds(260,120,80,40);
l3.setForeground(Color.BLACK);
add(l3);
Font Fteb1 = new Font ("calibri",Font.PLAIN,30);
l3.setFont(Fteb1);
l3.setText(String.valueOf(grade444.generate(1,36)));

JLabel l4 = new JLabel ("/");
l4.setBounds(240,150,40,40);
l4.setForeground(Color.BLACK);
add(l4);
Font Dteb = new Font ("calibri",Font.PLAIN,30);
l4.setFont(Dteb);

JLabel l5 = new JLabel(" ");
l5.setBounds(260,150,80,40);
l5.setForeground(Color.BLACK);
add(l5);
Font Fteb2 = new Font ("calibri",Font.PLAIN,30);
l5.setFont(Fteb2);
l5.setText(String.valueOf(grade4444.generate(2,6)));

JTextField t1 = new JTextField();
t1.setBounds (230,180,80,35);
add(t1);
Font Eteb = new Font ("calibri",Font.PLAIN,30);
t1.setFont(Eteb);

JLabel l6 = new JLabel("Type Your Answer and Press Enter Button");
l6.setBounds(65,240,500,40);
add(l6);
Font Gteb = new Font ("calibri",Font.PLAIN,25);
l6.setFont(Gteb);

 


t1.addKeyListener(new KeyAdapter(){
    public void keyPressed (final KeyEvent ke){
    int keypad = ke.getKeyCode();
    if(keypad == KeyEvent.VK_ENTER){
  
      if(t1.getText().isEmpty()){
      l6.setText("Type the Answer");
      l6.setForeground(Color.RED);
     }
     else{
  
  
  
  int v1 = Integer.parseInt(l3.getText());
  int v2 = Integer.parseInt(l5.getText());
  
  int tot = v1/v2;
  int ans = Integer.parseInt(t1.getText());
         if(tot==ans){
            l6.setText("Correct answer");
            int mm = Integer.parseInt(l2.getText());
            int mar = mm+10;
            l2.setText(String.valueOf(mar));
            l6.setForeground(Color.GREEN);
            l3.setText(String.valueOf(grade4444.generate(1,36)));
            l5.setText(String.valueOf(grade4444.generate(2,6)));
            t1.setText("");
  
         }else{
            l6.setText("Wrong Answer correct answer is "+ tot);
            int mm = Integer.parseInt(l2.getText());
            int mar = mm-05;
            l2.setText(String.valueOf(mar));
            l6.setForeground(Color.RED);
            l3.setText(String.valueOf(grade4444.generate(1,36)));
            l5.setText(String.valueOf(grade4444.generate(2,6)));
            t1.setText("");
  
         }
  int mm = Integer.parseInt(l2.getText());      
         if(mm >= 150){
         Winmsg4444 Frame = new Winmsg4444();
         dispose();
         }
  
      }
    }
  }
  
  });


setLayout(null);
setSize (600,400);
setTitle("Maths Game Grade 4");
setLocationRelativeTo(null);
setVisible(true);
}

public static void main (String [] args){ 
    grade4444 Frame = new grade4444();

System.out.println(String.valueOf(grade4444.generate(1,36)));

    
      }
          public static int generate(int min, int max)
          {
          return min +(int)(Math.random()* ((max - min)+1));
          }
      }