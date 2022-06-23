import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;


 class First extends JFrame
{
	JLabel l_welcome,l_head;
	JButton b_next;
	MyActionListener p = new MyActionListener(this);
	
	First()
	{
		super("Welcome");
		setLayout(null);
		setBounds(0,0,1100,1100);
        setContentPane(new JLabel(new ImageIcon("D:\\SEM 2\\OOPS JAVA\\wp7771290-amazon-logo-wallpapers.jpg")));
		l_welcome = new JLabel("Welcome");
		l_head = new JLabel("Amazon");
		b_next = new JButton("NEXT");
		
		add(l_welcome);
		add(l_head);
		add(b_next);
		
		l_head.setBounds(350,0,400,100);
		l_head.setBounds(350,0,400,100);
		l_welcome.setBounds(300,100,300,100);
		b_next.setBounds(800,900,200,70);
		
		Font f1 = new Font("Arial",Font.BOLD,50);
		l_welcome.setFont(f1);
		l_head.setFont(f1);
		b_next.setFont(f1);
		
		b_next.addActionListener(p);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					//System.exit(0);
					dispose();
				}
			});
	}
	public static void main(String s[])
	{
		First p = new First();
		p.setVisible(true);
	}
}