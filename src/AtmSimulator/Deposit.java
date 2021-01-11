package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {

    JTextField t1;
    JButton b1,b2,b3;
    JLabel l1,l2;
  
     int id=login.id;
	
	 Deposit() {
		
		 super("Deposit");
		 

                         l1 = new JLabel("ENTER AMOUNT YOU WANT");
	        l1.setFont(new Font("System", Font.BOLD, 35));
	        
	        l2 = new JLabel("TO DEPOSIT");
	        l2.setFont(new Font("System", Font.BOLD, 35));
                
	        t1 = new JTextField();
	        t1.setFont(new Font("Raleway", Font.BOLD, 22));
                
	        b1 = new JButton("DEPOSIT");
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
	        
	        l1.setBounds(150,150,800,60);
	        add(l1);
	        
	        l2.setBounds(290,210,800,60);
	        add(l2);
	        
	        t1.setBounds(250,300,300,50);
	        add(t1);
	        
	        b1.setBounds(260,380,125,50);
	        add(b1);
	        
	        b2.setBounds(415,380,125,50);
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
                             balance=balance+amount;
	                if(t1.getText().equals("")){
	                    
	                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
	                
	                }
                             else{
	                        String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	                        c1.s.executeUpdate(q1);
	                    }
	                    
	                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Credited Successfully");
                                      String q3="insert into logs(user_id,transactions,amount) values('"+id+"','deposit','"+amount+"')";
                                       c1.s.executeUpdate(q3);
	                    
	                    new thankyou().setVisible(true);
	                    setVisible(false);
	                    
	                }
	                
	            else if(ae.getSource()==b2){
	                
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
		new Deposit().setVisible(true);
	}

}
