package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class thankyou extends JFrame implements ActionListener {

    JLabel l1,l2,l3;
    JButton b1,b2;
    
    thankyou(){
        
        l1=new JLabel("Thankyou for using ATM");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        
        l2=new JLabel("Your Transaction is successfully completed");
        l2.setFont(new Font("Osward", Font.BOLD, 34));
        
        b1 = new JButton("CONTINUE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("EXIT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
    
      
        setLayout(null);
        
        l2.setBounds(30,60,800,50);
        add(l2);
        
        l1.setBounds(175,150,600,50);
        add(l1);
        
        
        b1.setFont(new Font("Arial", Font.BOLD, 25));
        b1.setBounds(250,300,200,40);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 25));
        b2.setBounds(250,400,200,40);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,700);
        setLocation(360,10);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void  actionPerformed(ActionEvent ae)
	{
		try {
			
			if(ae.getSource()==b1)
			{
                            new Transaction().setVisible(true); 
                            setVisible(false); 						
			}
			else if(ae.getSource()==b2)
			{
                            System.exit(0);
			}
			
		}catch(HeadlessException e) {
			e.printStackTrace();
			System.out.println("error: " + e);
		}
		
	}
    
    public static void main(String[] args){
		new thankyou().setVisible(true);
	}
    
}
