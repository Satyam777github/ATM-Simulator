package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener {

	 JTextField t1,t2;
	 JButton b1,b2,b3;
	 JLabel l1,l2,l3,l4;
                 int id=login.id;
                 int wlimit=adminpanel.wlimit;
	    
	Withdrawl() {
		
        super("Withdrawl");
		
        l1 = new JLabel("MAXIMUM DAILY WITHDRAWAL");
        l1.setFont(new Font("System", Font.BOLD, 40));
        
        l2 = new JLabel("IS "+wlimit);
        l2.setFont(new Font("System", Font.BOLD, 40));
        
        l3 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l3.setFont(new Font("System", Font.BOLD, 35));
        
       
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        
        b1 = new JButton("WITHDRAW");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("BACK");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("EXIT");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        
        
        l1.setBounds(90,100,800,60);
        add(l1);
        
        l2.setBounds(270,160,800,60);
        add(l2);
        
        l3.setBounds(120,260,800,60);
        add(l3);
        
        t1.setBounds(210,340,360,50);
        add(t1);
        
        b1.setBounds(220,400,160,50);
        add(b1);
        
        b2.setBounds(400,400,160,50);
        add(b2);
        
        b3.setBounds(300,550,200,50);
        add(b3);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,700);
        setLocation(360,10);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

public void actionPerformed(ActionEvent ae){
	       
        try{        
           
            
            if(ae.getSource()==b1){
                
                 int amount=Integer.parseInt(t1.getText());
                conn c1 = new conn();
	ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                rs.next();
                
                int balance=rs.getInt("balance");
                
                if(t1.getText().equals("")){
                    
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                }
                else if(amount>wlimit)
                {
                     JOptionPane.showMessageDialog(null, "Please withdraw amount under maximum limit");
                }
                else if(amount>balance)
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
                else{
                     balance=balance-amount;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	                        c1.s.executeUpdate(q1);
                                 JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                                 String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+amount+"')";
                                 c1.s.executeUpdate(q3);
                                       
                    new thankyou().setVisible(true);
                    setVisible(false);
                    }
                    
                    
            }else if(ae.getSource()==b2){
                
                new Transaction().setVisible(true);
                setVisible(false);
                
            }else if(ae.getSource()==b3){
                
                System.exit(0);
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }
	
	public static void main(String[] args) {
		 new Withdrawl().setVisible(true);

	}

}
