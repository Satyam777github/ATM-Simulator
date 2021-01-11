package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class RemoveAccount extends JFrame implements ActionListener {
    
JLabel l1,l2;
JTextField t1;
JButton b,b1;
                   
public RemoveAccount(){
    
    super("Remove Account");
    
     l1 = new JLabel("REMOVE ACCOUNT ");
     l1.setFont(new Font("Raleway", Font.BOLD, 38));
        
     l2 = new JLabel("Enter Card Number of Customer to Remove Account ");
     l2.setFont(new Font("Raleway", Font.BOLD, 25));
     
      t1 = new JTextField(); 
      t1.setFont(new Font("Raleway", Font.BOLD, 20));
      
      b = new JButton("Submit");
      b.setFont(new Font("Raleway", Font.BOLD, 20));
      b.setBackground(Color.BLACK);
      b.setForeground(Color.WHITE);
      
      b1 = new JButton("Back");
      b1.setFont(new Font("Raleway", Font.BOLD, 20));
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      
      setLayout(null);
           	
        l1.setBounds(200,100,400,40);
        add(l1);
        l2.setBounds(75,200,700,40);
        add(l2);
        t1.setBounds(170,300,400,40);
        add(t1);
        b.setBounds(220,400,300,30);
        add(b);
        b1.setBounds(220,450,300,30);
        add(b1);
        
		
        b.addActionListener(this);
        b1.addActionListener(this);
           	
getContentPane().setBackground(Color.WHITE);
		
setSize(800,700);
setLocation(360,10);
setVisible(true);
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
}

public void  actionPerformed(ActionEvent ae){
   
    try {
        
                                                if(ae.getSource()==b){
                                                     if(t1.getText().equals(""))
                                                     {
                                                          JOptionPane.showMessageDialog(null, "Please enter the card number");
                                                     }
                                                     else{
                                                     long a=Long.parseLong(t1.getText());//card no
                                                     conn c1=new conn();
                                                     c1.s.executeQuery("SET FOREIGN_KEY_CHECKS=0");
                                                    
                                                     String q1="select * from acc_details where card_no='"+a+"' ";
                                                     ResultSet rs=c1.s.executeQuery(q1);
                                                    
                                                     
                                                        if(rs.next())
                                                        {
                                                                
				int id=rs.getInt("user_id");
                                                                 String q2=" delete from acc_details where user_id='"+id+"' ";
                                                                 c1.s.executeUpdate(q2);
                                                                 String q3="delete from user where user_id='"+id+"' ";
                                                                 c1.s.executeUpdate(q3);
                                                                 JOptionPane.showMessageDialog(null, "Account is removed successfully");
                                                                 String q4=" insert into logs(user_id,transactions,amount) values('"+id+"','removed account',0) ";
                                                                 c1.s.executeUpdate(q4);
                                                                  c1.s.executeQuery("SET FOREIGN_KEY_CHECKS=1");
                                                        }
                                                        else {
				  JOptionPane.showMessageDialog(null, "Account not found");
                                                                }
                                                         c1.s.executeQuery("SET FOREIGN_KEY_CHECKS=1");
                                                     }
                                                }
                                                else if(ae.getSource()==b1){
                                                     new adminpanel().setVisible(true);
                                                     setVisible(false);
                                                }
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
}
        
public static void main(String[] args) {
		new RemoveAccount().setVisible(true);

	}
}
