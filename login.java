import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
class login 
{
  JFrame jf;
  JLabel l1,l2,l3,l4;
  JPanel p1;
  JTextField t1,t2;
  JButton b1,b2,b3;
  login()
  {
    jf=new JFrame("LOGIN WINDOW");
	//set image on frame.
	ImageIcon im=new ImageIcon("C:/Users/sonal/Pictures/coll/pic2.jpg");
	Image im1 = im.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
	ImageIcon im2=new ImageIcon(im1);
	l4=new JLabel("",im2,JLabel.CENTER);
	l4.setBounds(0,0,400,300);
	jf.setVisible(true);
	Border b=BorderFactory.createTitledBorder("");
	Font fo=new Font("Algerian",Font.BOLD,15);
	//set title of all componrnt.
	l1=new JLabel("USER ID");
	l2=new JLabel("PASSWORD");
	l3=new JLabel("NEW USER CLICK ON SIGN UP BUTTON");
	t1=new JTextField("");
	t2=new JTextField("");
	//c.add(t2);
	b1=new JButton("Login");
	b2=new JButton("Cancle");
	b3=new JButton("Sign Up");
	//set font on level button and textfield.
	l1.setFont(fo);
	l2.setFont(fo);
	l3.setFont(fo);
	t1.setFont(fo);
	t2.setFont(fo);
	b1.setFont(fo);
	b2.setFont(fo);
	b3.setFont(fo);
	//set bound of all component.
	l1.setBounds(30,30,100,30);
	l2.setBounds(30,80,100,30);
	t1.setBounds(150,30,180,30);
	t2.setBounds(150,80,180,30);
	l3.setBounds(50,120,240,30);
	b1.setBounds(30,160,80,30);
	b2.setBounds(120,160,100,30);
	b3.setBounds(230,160,100,30);
	// set border on level.
	l3.setBorder(b);
	l1.setBorder(b);
	l2.setBorder(b);
	// set color of all component.
	t1.setBackground(Color.yellow);
	t2.setBackground(Color.yellow);
	t1.setForeground(Color.blue);
	t2.setForeground(Color.blue);
	l1.setForeground(Color.blue);
	l2.setForeground(Color.red);
	l3.setForeground(Color.green);
	b1.setBackground(Color.yellow);
	b2.setBackground(Color.red);
	b2.setForeground(Color.yellow);
	b3.setForeground(Color.green);
	b3.setBackground(Color.blue);
	// add all component on frame.
	jf.add(l1);
	jf.add(l2);
	jf.add(l3);
	jf.add(t1);
	jf.add(t2);
	jf.add(b1);
	jf.add(b3);
	jf.add(b2);
	jf.add(l4);
	jf.setBounds(100,100,400,300);
	jf.setResizable(false);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setLayout(null);
	}
	public static void main(String ar[])
	{
	  new login();
	 }
	}
	
	
  