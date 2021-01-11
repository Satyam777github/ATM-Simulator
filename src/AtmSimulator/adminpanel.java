package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adminpanel  extends JFrame implements ActionListener{
    
    JLabel l1;
    JButton b1,b2,b4,b5,b6,b7;
    String name=login.name;
    public static int wlimit=10000;
    
    adminpanel(){
        super("Admin Panel");
        
         l1 = new JLabel("Welcome "+name);
         l1.setFont(new Font("Osward", Font.BOLD, 30));
        
          b1 = new JButton("Add New Account");
          b1.setBackground(Color.BLACK);
          b1.setForeground(Color.WHITE);
          
          b2 = new JButton("Remove an Account");
          b2.setBackground(Color.BLACK);
          b2.setForeground(Color.WHITE);
          
          b4 = new JButton("Logs");
          b4.setBackground(Color.BLACK);
          b4.setForeground(Color.WHITE);
          
          b5 = new JButton("Set Withdrawl Limit");
          b5.setBackground(Color.BLACK);
          b5.setForeground(Color.WHITE);
          
          b6 = new JButton("Show Accounts");
          b6.setBackground(Color.BLACK);
          b6.setForeground(Color.WHITE);
          
          b7 = new JButton("Exit");
          b7.setBackground(Color.BLACK);
          b7.setForeground(Color.WHITE);
          
          setLayout(null);
          
         l1.setBounds(40,70,400,40);
          add(l1);
            
             
         b1.setFont(new Font("Arial", Font.BOLD, 18));
         b1.setBounds(130,150,500,60);
          add(b1);
         b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.setBounds(130,230,500,60);
          add(b2);
         b4.setFont(new Font("Arial", Font.BOLD, 18));
          b4.setBounds(130,310,500,60);
          add(b4);
         b5.setFont(new Font("Arial", Font.BOLD, 18));
         b5.setBounds(130,390,500,60);
          add(b5);
         b6.setFont(new Font("Arial", Font.BOLD, 18));
         b6.setBounds(130,470,500,60);
          add(b6);
          b7.setFont(new Font("Arial", Font.BOLD, 18));
          b7.setBounds(130,550,500,60);
        add(b7);
          
          b1.addActionListener(this);
          b2.addActionListener(this);
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
    
    public void  actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
        new NewAccount().setVisible(true);
        setVisible(false); 
    }
    else if(ae.getSource()==b2)
    {
        new RemoveAccount().setVisible(true);
        setVisible(false); 
    }
    
    else if(ae.getSource()==b4)
    {
        new logs().setVisible(true);
        setVisible(false); 
    }
    else if(ae.getSource()==b5)
    {
        JOptionPane.showMessageDialog(null, "Current withdrawl limit is "+ wlimit);
       String t=JOptionPane.showInputDialog(null,"Set maximum withdrawl limit");   
       if(t==null){
           
       }
       else{
       wlimit=Integer.parseInt(t);  
       JOptionPane.showMessageDialog(null, "Maximum limit changed Successfully");
    }
    }
    else if(ae.getSource()==b6)
    {
        new accounts().setVisible(true);
        setVisible(false); 
    }
    else if(ae.getSource()==b7)
    {
         new login().setVisible(true);
         setVisible(false); 
    }
   
}
    
    public static void main(String[] args){
		new adminpanel().setVisible(true);
	}
}
