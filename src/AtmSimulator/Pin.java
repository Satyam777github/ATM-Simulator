package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Pin extends JFrame implements ActionListener {

	  JPasswordField t1,t2,t3;
	  JButton b1,b2;                               
	  JLabel l1,l2,l3,l4;
                  int id=login.id;
	    
	  Pin() {
                         super("Pin Change");
		  
                        l1 = new JLabel("CHANGE YOUR PIN");
	        l1.setFont(new Font("System", Font.BOLD, 35));
	        
	        l2 = new JLabel("Current PIN:");
	        l2.setFont(new Font("System", Font.BOLD, 22));
	        
	        l3 = new JLabel("New PIN:");
	        l3.setFont(new Font("System", Font.BOLD, 22));
	        
	        l4 = new JLabel("Re-Enter New PIN:");
	        l4.setFont(new Font("System", Font.BOLD, 22));
	        
	        t1 = new JPasswordField();
	        t1.setFont(new Font("Raleway", Font.BOLD, 22));
	        
	        t2 = new JPasswordField();
	        t2.setFont(new Font("Raleway", Font.BOLD, 22));
	        
	        t3 = new JPasswordField();
	        t3.setFont(new Font("Raleway", Font.BOLD, 22));
	        
	        b1 = new JButton("SAVE");
	        b1.setFont(new Font("System", Font.BOLD, 18));
	        b1.setBackground(Color.BLACK);
	        b1.setForeground(Color.WHITE);
	    
	        b2 = new JButton("BACK");
	        b2.setFont(new Font("System", Font.BOLD, 18));
	        b2.setBackground(Color.BLACK);
	        b2.setForeground(Color.WHITE);
	        
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        
	        
	        setLayout(null);
	        
	        l1.setBounds(220,130,800,60);
	        add(l1);
	        
	        l2.setBounds(100,240,150,40);
	        add(l2);
	        
	        l3.setBounds(100,300,150,40);
	        add(l3);
	        
	        l4.setBounds(100,360,200,40);
	        add(l4);
	        
	        t1.setBounds(310,240,360,40);
	        add(t1);
	        
	        t2.setBounds(310,300,360,40);
	        add(t2);
	        
	        t3.setBounds(310,360,360,40);
	        add(t3);
	        
	        b1.setBounds(220,460,160,50);
	        add(b1);
	        
	        b2.setBounds(400,460,160,50);
	        add(b2);
	       
	        
	        getContentPane().setBackground(Color.WHITE);
	        
                  setSize(800,700);
                  setLocation(360,10);
                  setVisible(true);
                  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    
	    }
	    
	    public void actionPerformed(ActionEvent ae){
	       
	        try{        
	           
	            if(ae.getSource()==b1){
                        
                                     int a=Integer.parseInt(t1.getText());
                                     int b=Integer.parseInt(t2.getText());
                                     int c=Integer.parseInt(t3.getText());
                        
	                if(t1.getText().equals("")){
	                    
	                    JOptionPane.showMessageDialog(null, "Please Enter Current PIN");
	                }
	                if(t2.getText().equals("")){
	                    
	                    JOptionPane.showMessageDialog(null, "Enter New PIN");
	                }
	                if (t3.getText().equals("")){
	                    
	                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
	                }
	                
	                if(t2.getText().equals(t3.getText())){
	                    
	                    conn c1 = new conn();
                                    String q="select * from acc_details where user_id='"+id+"' ";
                                    ResultSet rs=c1.s.executeQuery(q);
                                    rs.next();
                                    if(a==rs.getInt("pin")){
                                        
                                            String q1 = "update acc_details set pin = '"+b+"' where user_id='"+id+"' ";
                                            c1.s.executeUpdate(q1);
                                             JOptionPane.showMessageDialog(null, "PIN changed successfully");
                                             String q3="insert into logs(user_id,transactions,amount) values('"+id+"','pin change',0)";
                                             c1.s.executeUpdate(q3);
                                             new Transaction().setVisible(true);
                                             setVisible(false);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, " Entered PIN is wrong");
                                    }
                                    
	                }else{
	                    
	                    JOptionPane.showMessageDialog(null, "PIN entered doesn't match");
	                }
	                 
	            }else if(ae.getSource()==b2){
	                
	                new Transaction().setVisible(true);
	                setVisible(false);
	                
	            }
	        }catch(Exception e){
	                    e.printStackTrace();
	                    System.out.println("error: "+e);
	        }
	            
	    }
		  
	public static void main(String[] args) {
		new Pin().setVisible(true);

	}

}
