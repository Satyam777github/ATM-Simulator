package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class NewAccount3 extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JTextField t1;
	
	
	
	NewAccount3() {
		
	super("New Account Application Form : Page-3");
		
        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l4 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));
    
        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        
       
        
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
      
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(280,20,400,40);
        add(l1); 
        
        l2.setBounds(100,100,200,30);
        add(l2);
        
        r1.setBounds(100,140,150,30);
        add(r1);
        
        r2.setBounds(350,140,300,30);
        add(r2);
        
        r3.setBounds(100,180,250,30);
        add(r3);
        
        r4.setBounds(350,180,250,30);
        add(r4);
        
        l3.setBounds(100,240,200,30);
        add(l3);
        
        l4.setBounds(330,240,250,30);
        add(l4);
        
        l5.setBounds(100,270,200,20);
        add(l5);
        
        l6.setBounds(330,270,500,20);
        add(l6);
        
        l7.setBounds(100,310,200,30);
        add(l7);
        
        l8.setBounds(330,310,200,30);
        add(l8);
        
        l9.setBounds(100,340,200,20);
        add(l9);
        
        l10.setBounds(100,390,200,30);
        add(l10);
        
        c1.setBounds(100,440,200,30);
        add(c1);
        
        c2.setBounds(350,440,200,30);
        add(c2);
        
        c3.setBounds(100,490,200,30);
        add(c3);
        
        c4.setBounds(350,490,200,30);
        add(c4);
        
        c5.setBounds(100,540,200,30);
        add(c5);
        
        c6.setBounds(350,540,200,30);
        add(c6);
        
        c7.setBounds(100,590,600,20);
        add(c7);
        
        b1.setBounds(310,630,100,30);
        add(b1);
        
     
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,720);
        setLocation(360,10);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        b1.addActionListener(this);
       		
	}
	
public void actionPerformed(ActionEvent ae){
        
        
        String a = null;
        if(r1.isSelected()){ 
            a = "Saving Account";
        }
        else if(r2.isSelected()){ 
            a = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            a = "Current Account";
        }else if(r4.isSelected()){ 
            a = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        long first8 = Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        long first4 = Math.abs(first3);
        
        String b = "";
        if(c1.isSelected()){ 
            b = b+" ATM Card";
        }
        if(c2.isSelected()){ 
            b = b+" Internet Banking";
        }
        if(c3.isSelected()){ 
            b = b+" Mobile Banking";
        }
        if(c4.isSelected()){ 
            b = b+" EMAIL Alerts";
        }
        if(c5.isSelected()){ 
            b = b+" Cheque Book";
        }
        if(c6.isSelected()){ 
            b = b+" E-Statement";
        }
        
        try{
            conn c1 = new conn();
            String q = "SELECT user_id FROM user";
            ResultSet rs=c1.s.executeQuery(q);
           rs.last();
           int last_id=rs.getInt("user_id");
           int bal=0;
            if(ae.getSource()==b1){
                
                if(b.equals("")){
                
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                
                }else{
                
                    String q1 = "insert into acc_details  values('"+first8+"','"+last_id+"' ,'"+first4+"','"+bal+"','"+a+"','"+b+"')";  
                  
                    c1.s.executeUpdate(q1);
                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + first8 + "\n Pin:"+ first4);
                    String q3="insert into logs(user_id,transactions,amount) values('"+last_id+"','new account registered',0)";
                    c1.s.executeUpdate(q3);
                    
                    new login().setVisible(true);
                    setVisible(false);
                }
            
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }


	public static void main(String[] args) {
		
		new NewAccount3().setVisible(true);
	}

}
