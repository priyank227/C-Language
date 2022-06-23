import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.util.regex.*;

class MyActionListener implements ActionListener
{
	First p;
	Main m;
	LoginC lg;
	LoginD p1;
	Item it;
	Dealer de;
	Groccery gr;
	Toys to;
	Beauty be;
	Electronic el;
	Fashion fa;
	Wheat we;
	Salt sa;
	Shoap so;
	Tea ta;
	Sugar su;
	Oil oi;
	Teddy tb;
	Horse hs;
	Doll dl;
	Train tr;
	Bicycle bi;
	Kite ki;
	Payment py;
	Thankyou th;
	Pants pt;
	Tshirt ts;
	Shirt sh;
	Belt bl;
	Watch wc;
	Hairoil ha;
	Shadow zz;
	Lipstick zy;
	Eyeliner zx;
	Blush zw;
	Mayblene zv;
	Foundation zu;
	Fan yz;
	Ac yy;
	Refrigerator yx;
	Oven yw;
	Smartwatch yv;
	Tv yu;
	

	MyActionListener(First f)
	{
		this.p = f;
	}
	MyActionListener(Main a)
	{
		this.m = a;
	}
	MyActionListener(LoginC b)
	{
		this.lg = b;
	}
	MyActionListener(LoginD c)
	{
		this.p1 = c;
	}
	MyActionListener(Item d)
	{
		this.it = d;
	}
	MyActionListener(Dealer e)
	{
		this.de = e;
	}
	MyActionListener(Groccery g)
	{
		this.gr = g;
	}
	MyActionListener(Toys t)
	{
		this.to = t;
	}
	MyActionListener(Beauty u)
	{
		this.be = u;
	}
	MyActionListener(Electronic l)
	{
		this.el = l;
	}
	MyActionListener(Fashion h)
	{
		this.fa = h;
	}
	MyActionListener(Wheat w)
	{
		this.we = w;
	}
	MyActionListener(Salt s)
	{
		this.sa =s;
	}
	MyActionListener(Shoap p)
	{
		this.so = p;
	}
	MyActionListener(Tea t)
	{
		this.ta = t;
	}
	MyActionListener(Oil o)
	{
		this.oi = o;
	}
	MyActionListener(Sugar u)
	{
		this.su = u;
	}
	MyActionListener(Teddy td)
	{
		this.tb = td;
	}
	MyActionListener(Horse h)
	{
		this.hs = h;
	}
	MyActionListener(Doll di)
	{
		this.dl = di;
	}
	MyActionListener(Train ti)
	{
		this.tr = ti;
	}
	MyActionListener(Bicycle bo)
	{
		this.bi = bo;
	}
	MyActionListener(Kite k)
	{
		this.ki = k;
	}
	MyActionListener(Payment pa)
	{
		this.py = pa;
	}
	MyActionListener(Thankyou tn)
	{
		this.th = tn;
	}
	MyActionListener(Pants pl)
	{
		this.pt = pl;
	}
	MyActionListener(Tshirt t)
	{
		this.ts = t;
	}
	MyActionListener(Shirt si)
	{
		this.sh = si;
	}
	MyActionListener(Belt bt)
	{
		this.bl = bt;
	}
	MyActionListener(Watch we)
	{
		this.wc = we;
	}
	MyActionListener(Hairoil h)
	{
		this.ha = h;
	}
	MyActionListener(Shadow z)
	{
		this.zz = z;
	}
	MyActionListener(Lipstick y)
	{
		this.zy = y;
	}
	MyActionListener(Eyeliner x)
	{
		this.zx = x;
	}
	MyActionListener(Blush w)
	{
		this.zw = w;
	}
	MyActionListener(Mayblene v)
	{
		this.zv = v;
	}
	MyActionListener(Foundation u)
	{
		this.zu = u;
	}
	MyActionListener(Fan fn)
	{
		this.yz = fn;
	}
	MyActionListener(Ac ca)
	{
		this.yy = ca;
	}
	MyActionListener(Refrigerator ro)
	{
		this.yx = ro;
	}
	MyActionListener(Oven ne)
	{
		this.yw = ne;
	}
	MyActionListener(Smartwatch ch)
	{
		this.yv = ch;
	}
	MyActionListener(Tv vt)
	{
		this.yu = vt;
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getActionCommand().equals("NEXT"))
		{
			m = new Main();
			m.setVisible(true);
		}
		if(e.getActionCommand().equals("Customer"))
		{
			lg = new LoginC();
			lg.setVisible(true);
		}
		
		if(e.getActionCommand().equals("Dealer"))
		{
			p1 = new LoginD();
			p1.setVisible(true);
		}

		if(e.getActionCommand().equals("Resistration"))
		{
			if(this.p1.t_name1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter name","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.p1.t_id1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter Email","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.p1.t_city.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter City","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.p1.t_gst.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter Gst","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.p1.t_name1.getText().equals("") || this.p1.t_id1.getText().equals("") || this.p1.t_city.getText().equals("") || this.p1.t_gst.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter Missing Detail","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else
			{
				try
				{
					BufferedWriter bw = new BufferedWriter(new FileWriter("Resistration.txt",true));
					bw.write(this.p1.t_name1.getText()+","+this.p1.t_id1.getText()+","+this.p1.t_city.getText()+","+this.p1.t_gst.getText());
					bw.newLine();
					bw.close();
					de = new Dealer();
					de.setVisible(true);
					p1.setVisible(false);
				}
				catch(Exception eg)
				{
					System.out.println("eg");
				}
				
			}
		}
		if(e.getActionCommand().equals("Add"))
		{
			try
				{
					BufferedWriter bw = new BufferedWriter(new FileWriter("item.txt",true));
					bw.write(this.de.t_name.getText()+","+this.de.t_price.getText()+","+this.de.t_quantity.getText());
					bw.newLine();
					bw.close();
					de.setVisible(false);
				}
				catch(Exception eg)
				{
					System.out.println("eg");
				}
			
		}

		if(e.getActionCommand().equals("login"))
		{
			Pattern p1 = Pattern.compile("^[0-9]{10}");
			Matcher m1 = p1.matcher(this.lg.t_no.getText());
			System.out.println(m1.matches());
			
			Pattern p2 = Pattern.compile("^[A-Z][a-z]{0,10}");
			Matcher m2 = p2.matcher(this.lg.t_name.getText());
			System.out.println(m2.matches());
	
			
			if(this.lg.t_name.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter name","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.lg.t_no.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter No.","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.lg.t_id.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter Email","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else if(this.lg.t_name.getText().equals("") || this.lg.t_no.getText().equals("") || this.lg.t_id.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter Missing Detail","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			else if(m1.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Please enter valid No.","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			else if(m2.matches()==false)
			{
				JOptionPane.showMessageDialog(null, "Please enter valid Name","EMPTY FIELD",JOptionPane.ERROR_MESSAGE);
			}
			
			else
			{
				try
				{
					BufferedWriter bw = new BufferedWriter(new FileWriter("login.txt",true));
					bw.write(this.lg.t_name.getText()+","+this.lg.t_no.getText()+","+this.lg.t_id.getText());
					bw.newLine();
					bw.close();
					it = new Item();
					it.setVisible(true);
					lg.setVisible(false);
				}
				catch(Exception eg)
				{
					
					System.out.println("eg");
				}
			}
		}
		if(e.getActionCommand().equals("Groccery"))
		{
			gr = new Groccery();
			gr.setVisible(true);
		}
		if(e.getActionCommand().equals("Toys"))
		{
			to = new Toys();
			to.setVisible(true);
		}
		if(e.getActionCommand().equals("Beauty Products"))
		{
			be = new Beauty();
			be.setVisible(true);
		}
		if(e.getActionCommand().equals("Electronic item"))
		{
			el = new Electronic();
			el.setVisible(true);
		}
		if(e.getActionCommand().equals("Fashion"))
		{
			fa = new Fashion();
			fa.setVisible(true);
		}
		if(e.getActionCommand().equals("Wheat"))
		{
			we = new Wheat();
			we.setVisible(true);
		}
		if(e.getActionCommand().equals("Tea"))
		{
			ta = new Tea();
			ta.setVisible(true);
		}
		if(e.getActionCommand().equals("sugar"))
		{
			su = new Sugar();
			su.setVisible(true);
		}
		if(e.getActionCommand().equals("Salt"))
		{
			sa = new Salt();
			sa.setVisible(true);
		}
		if(e.getActionCommand().equals("Shoap"))
		{
			so = new Shoap();
			so.setVisible(true);
		}
		if(e.getActionCommand().equals("Oil"))
		{
			oi = new Oil();
			oi.setVisible(true);
		}
		if(e.getActionCommand().equals("Teddy bear"))
		{
			tb = new Teddy();
			tb.setVisible(true);
		}
		if(e.getActionCommand().equals("Rocking horse"))
		{
			hs = new Horse();
			hs.setVisible(true);
		}
		if(e.getActionCommand().equals("Doll"))
		{
			dl = new Doll();
			dl.setVisible(true);
		}
		if(e.getActionCommand().equals("train"))
		{
			tr = new Train();
			tr.setVisible(true);
		}
		if(e.getActionCommand().equals("Bicycle"))
		{
			bi = new Bicycle();
			bi.setVisible(true);
		}
		if(e.getActionCommand().equals("Kite"))
		{
			ki = new Kite();
			ki.setVisible(true);
		}
		if(e.getActionCommand().equals("BUY"))
		{
			py = new Payment();
			py.setVisible(true);
		}
		if(e.getActionCommand().equals("Payment"))
		{	
			th = new Thankyou();
			th.setVisible(true);
			py.setVisible(false);
		}
		if(e.getActionCommand().equals("Pants"))
		{
			pt = new Pants();
			pt.setVisible(true);
		}
		if(e.getActionCommand().equals("T-shirt"))
		{
			ts = new Tshirt();
			ts.setVisible(true);
		}
		if(e.getActionCommand().equals("Shirt"))
		{
			sh = new Shirt();
			sh.setVisible(true);
		}
		if(e.getActionCommand().equals("Belt"))
		{
			bl = new Belt();
			bl.setVisible(true);
		}
		if(e.getActionCommand().equals("Watch"))
		{
			wc = new Watch();
			wc.setVisible(true);
		}
		if(e.getActionCommand().equals("Hair oil"))
		{
			ha = new Hairoil();
			ha.setVisible(true);
		}
		if(e.getActionCommand().equals("Eye shadow"))
		{
			zz = new Shadow();
			zz.setVisible(true);
		}
		if(e.getActionCommand().equals("Lipstick"))
		{
			zy = new Lipstick();
			zy.setVisible(true);
		}
		if(e.getActionCommand().equals("Eyeliner"))
		{
			zx = new Eyeliner();
			zx.setVisible(true);
		}
		if(e.getActionCommand().equals("Blush"))
		{
			zw = new Blush();
			zw.setVisible(true);
		}
		if(e.getActionCommand().equals("Maybelene"))
		{
			zv = new Mayblene();
			zv.setVisible(true);
		}
		if(e.getActionCommand().equals("Foundation"))
		{
			zu = new Foundation();
			zu.setVisible(true);
		}
		if(e.getActionCommand().equals("Fan"))
		{
			yz = new Fan();
			yz.setVisible(true);
		}
		if(e.getActionCommand().equals("A.C"))
		{
			yy = new Ac();
			yy.setVisible(true);
		}
		if(e.getActionCommand().equals("Refrigerator"))
		{
			yx = new Refrigerator();
			yx.setVisible(true);
		}
		if(e.getActionCommand().equals("Oven"))
		{
			yw = new Oven();
			yw.setVisible(true);
		}
		if(e.getActionCommand().equals("Smart Watch"))
		{
			yv = new Smartwatch();
			yv.setVisible(true);
		}
		if(e.getActionCommand().equals("T.V"))
		{
			yu = new Tv();
			yu.setVisible(true);
		}
		
	}
}