package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //for action listener


public class login extends JFrame implements ActionListener {
	
JLabel l1,l2,l3;
JTextField tf1;
JPasswordField pf2;
JButton b1,b2;

public static int id;
public static String name;
public static int cust_count;
public static int log_count;
login(){ //constructor
	
super("ATM");
	
    l1 = new JLabel("WELCOME TO ATM");
    l1.setFont(new Font("Osward", Font.BOLD, 38));
    
    l2 = new JLabel("Card No:");
    l2.setFont(new Font("Raleway", Font.BOLD, 28));
    
    l3 = new JLabel("PIN:");
    l3.setFont(new Font("Raleway", Font.BOLD, 28));
    
    tf1 = new JTextField(15);
    pf2 = new JPasswordField(15);
    
    b1 = new JButton("CONTINUE");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    
    b2 = new JButton("CLEAR");
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    
	
    setLayout(null);
	
    l1.setBounds(195,50,450,200);
    add(l1);
    
    l2.setBounds(125,150,375,200);
    add(l2);
    
    tf1.setBounds(300,235,230,30);
    add(tf1);
    
    l3.setBounds(125,225,375,200);
    add(l3);
    
    tf1.setFont(new Font("Arial", Font.BOLD, 14));
   
    
    pf2.setFont(new Font("Arial", Font.BOLD, 14));
    pf2.setBounds(300,310,230,30);
    add(pf2);
    
    b1.setFont(new Font("Arial", Font.BOLD, 14));
    b1.setBounds(300,400,120,30);
    add(b1);
    
    b2.setFont(new Font("Arial", Font.BOLD, 14));
    b2.setBounds(430,400,100,30);
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
			conn c1=new conn();
			String a = tf1.getText();
			String b = new String(pf2.getPassword());
			String q = "select * from acc_details where card_no='"+a+"' and pin = '"+b+"'";
			ResultSet rs=c1.s.executeQuery(q);
                                               
                                              
			if(ae.getSource()==b1)
			{
				if(rs.next())
				{
                                                                    id=rs.getInt("user_id");
                                                                    String q2="select * from user where user_id='"+id+"'";
                                                                     ResultSet rs2=c1.s.executeQuery(q2);
                                                                     rs2.next();
                                                                     int roleid=rs2.getInt("role_id");
                                                                     name=rs2.getString("name");
                                                                        
                                                                        
                                                                        String q4="select count(role_id) from user where role_id=2";
                                                                        ResultSet rs3=c1.s.executeQuery(q4);
                                                                        rs3.next();
                                                                        cust_count=rs3.getInt(1);
                                                                        
                                                                        String q5="select count(*) from logs";
                                                                        ResultSet rs4=c1.s.executeQuery(q5);
                                                                        rs4.next();
                                                                        log_count=rs4.getInt(1);
                                                                        
                                                                        
                                                                        String q3="insert into logs(user_id,transactions,amount) values('"+id+"','login',0)";
                                                                        c1.s.executeUpdate(q3);
                                                                        if(roleid==1)
                                                                        {
                                                                             
                                                                            new adminpanel().setVisible(true); 
					setVisible(false);  
                                                                        }
                                                                        else{
                                                                            
					new Transaction().setVisible(true); //new transaction frame visible
					setVisible(false);                          //current frame not visible
                                                                        
                                                                            
                                                                        }
                                                                }   
                                                                else
				{
                                                                        JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
				}
			}
			else if(ae.getSource()==b2)
			{
				tf1.setText("");
				pf2.setText("");
			}
			
		}catch(HeadlessException | SQLException e) {
			e.printStackTrace();
			System.out.println("error: " + e);
		}
		
	}
		
	public static void main(String[] args){
		new login().setVisible(true);
	}
		
		
	}
