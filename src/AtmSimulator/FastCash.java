package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FastCash extends JFrame implements ActionListener {

	JLabel l1,l2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField t1;
                int id=login.id;
	    
FastCash() {
	super("Fast Cash");
		
        l1 = new JLabel("Select Withdrawl Amount");
        l1.setFont(new Font("System", Font.BOLD, 38));
        
        b1 = new JButton("Rs 100");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("Rs 500");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("Rs 1000");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b4 = new JButton("Rs 2000");
        b4.setFont(new Font("System", Font.BOLD, 18));
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b5 = new JButton("Rs 5000");
        b5.setFont(new Font("System", Font.BOLD, 18));
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b6 = new JButton("Rs 10000");
        b6.setFont(new Font("System", Font.BOLD, 18));
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        
        b7 = new JButton("BACK");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        
        
        l1.setBounds(150,70,500,40);
        add(l1);
        
        b1.setBounds(40,150,300,60);
        add(b1);
        
        b2.setBounds(440,150,300,60);
        add(b2);
        
        b3.setBounds(40,260,300,60);
        add(b3);
        
        b4.setBounds(440,260,300,60);
        add(b4);
        
        b5.setBounds(40,370,300,60);
        add(b5);
        
        b6.setBounds(440,370,300,60);
        add(b6);
        
        b7.setBounds(240,500,300,60);
        add(b7);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,700);
        setLocation(360,10);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    
    public void actionPerformed(ActionEvent ae){
       
            try{        
           
            if(ae.getSource()==b1){
                
                    conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                     rs.next();
                     int balance=rs.getInt("balance");
                    
                     if(balance>100)
                     {
                          balance=balance-100;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	     c1.s.executeUpdate(q1);
                     JOptionPane.showMessageDialog(null, "Rs. "+100+" Debited Successfully");
                     String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+100+"')";
                      c1.s.executeUpdate(q3);
                                       
                        new thankyou().setVisible(true);
                        setVisible(false);
                     }
                     else
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
            }
                
            
            else if(ae.getSource()==b2){
                
                    conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                     rs.next();
                     int balance=rs.getInt("balance");
                    
                     if(balance>500)
                     {
                          balance=balance-500;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	     c1.s.executeUpdate(q1);
                     JOptionPane.showMessageDialog(null, "Rs. "+500+" Debited Successfully");
                     String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+500+"')";
                      c1.s.executeUpdate(q3);
                                       
                        new thankyou().setVisible(true);
                        setVisible(false);
                     }
                     else
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
                }
            else if(ae.getSource()==b3){
                
                    conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                     rs.next();
                     int balance=rs.getInt("balance");
                    
                     if(balance>1000)
                     {
                          balance=balance-1000;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	     c1.s.executeUpdate(q1);
                     JOptionPane.showMessageDialog(null, "Rs. "+1000+" Debited Successfully");
                     String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+1000+"')";
                      c1.s.executeUpdate(q3);
                                       
                        new thankyou().setVisible(true);
                        setVisible(false);
                     }
                     else
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
                    
                }
            else if(ae.getSource()==b4){
                
                    conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                     rs.next();
                     int balance=rs.getInt("balance");
                    
                     if(balance>2000)
                     {
                          balance=balance-2000;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	     c1.s.executeUpdate(q1);
                     JOptionPane.showMessageDialog(null, "Rs. "+2000+" Debited Successfully");
                     String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+2000+"')";
                      c1.s.executeUpdate(q3);
                                       
                        new thankyou().setVisible(true);
                        setVisible(false);
                     }
                     else
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
                    
                }
            else if(ae.getSource()==b5){
                
                   conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                     rs.next();
                     int balance=rs.getInt("balance");
                    
                     if(balance>5000)
                     {
                          balance=balance-5000;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	     c1.s.executeUpdate(q1);
                     JOptionPane.showMessageDialog(null, "Rs. "+5000+" Debited Successfully");
                     String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+5000+"')";
                      c1.s.executeUpdate(q3);
                                       
                        new thankyou().setVisible(true);
                        setVisible(false);
                     }
                     else
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
                    
                    
                }
            else if(ae.getSource()==b6){
                
                    conn c1 = new conn();
                    ResultSet rs = c1.s.executeQuery(" select * from acc_details where user_id='"+id+"' ");
                     rs.next();
                     int balance=rs.getInt("balance");
                    
                     if(balance>10000)
                     {
                          balance=balance-10000;
                     String q1= "update acc_details set balance='"+balance+"' where user_id='"+id+"' ";
	     c1.s.executeUpdate(q1);
                     JOptionPane.showMessageDialog(null, "Rs. "+10000+" Debited Successfully");
                     String q3="insert into logs(user_id,transactions,amount) values('"+id+"','withdrawl','"+10000+"')";
                      c1.s.executeUpdate(q3);
                                       
                        new thankyou().setVisible(true);
                        setVisible(false);
                     }
                     else
                {
                     JOptionPane.showMessageDialog(null, "Insufficient balance");
                }
                    
                }
                
            
            else if(ae.getSource()==b7){
                
                System.exit(0);
                
            }
        }catch(Exception e){
                e.printStackTrace();
                System.out.println("error: "+e);
        }
            
    }
	

	public static void main(String[] args) {
		 new FastCash().setVisible(true);

	}

}

