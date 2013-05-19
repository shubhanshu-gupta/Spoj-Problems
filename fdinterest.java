import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

class fdinterest {
		JComboBox bank = new JComboBox();
		JLabel label1 = new JLabel("Principal amount/Deposit amount");
		JLabel l1 	= new JLabel("Select bank and enter presesnt interest rate from bank's site");
		JLabel label2 = new JLabel("Interest Rate");
		JLabel label3 = new JLabel("Locking period in months");
		JLabel l 	= new JLabel("if there are any days also");
		JLabel label4 = new JLabel("Total interest receivable");
		JLabel label5 = new JLabel("total maturity amount");
		JLabel label6 = new JLabel("effective yield");
		JTextField f1 = new JTextField(0);
		
		JTextField f2 = new JTextField(0);
		JTextField f3 = new JTextField(0);
		JTextField f = new JTextField(0);
		JTextField f4 = new JTextField(0);
		JTextField f5 = new JTextField(0);
		JTextField f6 = new JTextField(0);
		JButton b1 = new JButton("Submit");
		JButton b2 = new JButton("clear");

public static void openURL(String url)
	{
		String osname = System.getProperty("os.name");
			try
			{
			if(osname.startsWith("Windows"))
			Runtime.getRuntime().exec("rundll32url.dll,FileProtocolHandler" + url);
			else
			{
			String browsers[] = {"chrome","firefox","mozilla","internet","explorer","opera"};
			String browser = null;
			for(int count=0; count<browsers.length&&browser==null ; count++)
				{
			if(Runtime.getRuntime().exec(new String[]{"which",browsers[count]}).waitFor()==0)
			browser = browsers[count];
			Runtime.getRuntime().exec(new String[]{browser,url});
				}
			}
			}
			catch(Exception e)
			{
			JOptionPane.showMessageDialog(null,"error in opening browser");// + ":\n" + e.getLocalisedMessage());
			}
	}
	
	public fdinterest()
		{
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setTitle("calculate interest on your FD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//JPanel panel1 = new JPanel();
	//JPanel panel2 = new JPanel();
	//JPanel panel3 = new JPanel();
	//JPanel panel4 = new JPanel();
	//JPanel panel5 = new JPanel();
	//JPanel panel6 = new JPanel();
		//panel1.setLayout(new BorderLayout());
		//panel1.add(label1 , BorderLayout.NORTH);
		//panel1.setLayout(new BoxLayout(panel1 , BoxLayout.X_AXIS));
		//panel5.setLayout(new BoxLayout(panel5 , BoxLayout.X_AXIS));
		//panel6.setLayout(new BoxLayout(panel6 , BoxLayout.X_AXIS));
		
		/*panel2.add(label2);
		panel2.add(f2);
		panel3.add(label3);
		panel3.add(f3);
		panel4.add(b1);
		panel4.add(b2);*/
		/*panel3.add(label4);
		panel3.add(f4);
		panel3.add(label5);
		panel3.add(f5);
		panel3.add(label6);
		panel3.add(f6);*/
		
		//panel1.add(panel2);
		//panel5.add(panel3);
		//panel6.add(panel4);
		
		//frame.add(panel1);
		//frame.add(panel5);
		//frame.add(panel6); 
	//	frame.add(panel2);
//		frame.add(panel3);    
		bank.addItem("SBI");
		bank.addItem("ICICI");
		
		JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(9, 2));
        p2.add(label1);
        p2.add(f1);
		p2.add(bank);
		p2.add(l1);
		p2.add(label2);
		p2.add(f2);
        p2.add(label3);
        p2.add(f3);
		p2.add(l);
		p2.add(f);
		b1.addActionListener(new listener());
		p2.add(b1);
		b2.addActionListener(new listener());
		p2.add(b2);
		p2.add(label4);
        p2.add(f4);
        p2.add(label5);
        p2.add(f5);
        p2.add(label6);
		p2.add(f6);
		p2.setBackground(Color.gray);
frame.add(p2);
		
		
		}
	
	public static void main(String args[])
		{
		new fdinterest();
		}
	
	class listener implements ActionListener 
		{
		
	public void actionPerformed(ActionEvent e)
		{
	String s = e.getActionCommand();
	String s4 = (String) bank.getSelectedItem();	
			
			if(s.equals("Submit"))
				{
			double p = Double.parseDouble(f1.getText());
			double r = (Double.parseDouble(f2.getText()))/100;
			double m = (Double.parseDouble(f3.getText()))/12;
			double q = (Double.parseDouble(f.getText()))/365;
        	double t = (m+q);
			int n = 4;
			double a = p*(Math.pow((1+ (r/n)),(n*t)));
			String s1 = Double.toString(a);
			String s2 = Double.toString(a-p);
			f5.setText(s1);
			f4.setText(s2);
			double u = ((Math.pow((1 + (r/n)),n)-1)*100);
			String s3 = Double.toString(u);
			f6.setText(s3);
				}
			else if(s4.equalsIgnoreCase("SBI"))
				{
				openURL("http://www.statebankofindia.com/user.htm");
				}
			else if(s4.equalsIgnoreCase("ICICI"))
				{
				openURL("http://www.icicibank.com/interest-rates.html#fd");
				}
			else if(s.equals("clear"))
				{
			f1.setText("0.0");
			f2.setText("0.0");
			f3.setText("0.0");
			f4.setText("0.0");
			f5.setText("0.0");
			f6.setText("0.0");
				}
		
		}
	
	}
	}
