package AtmSimulator;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;  //for random number 

public class NewAccount extends JFrame implements ActionListener {

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b;
	JComboBox c1,c2,c3;
                   

	
public NewAccount(){ //constructor
		
         super("New Account Application Form");
		
        l1 = new JLabel("NEW ACCOUNT REGISTRATION");
        l1.setFont(new Font("Raleway", Font.BOLD, 26));
        
        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        
        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        t1 = new JTextField(); //name
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        
       
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);
        
        
     
        String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020",};
        c3 = new JComboBox(year);
        c3.setBackground(Color.WHITE);
	
		setLayout(null);
               
		
		l1.setBounds(200,10,600,40);
		add(l1);
		l2.setBounds(270,50,400,30);
		add(l2);
		l3.setBounds(100,100,100,30);
		add(l3);
		
		t1.setBounds(300,100,400,30);
		add(t1);
		
		l4.setBounds(100,150,200,30);
		add(l4);
		
		t2.setBounds(300,150,400,30);
		add(t2);
		
		l5.setBounds(100,200,200,30);
		add(l5);
		
		l13.setBounds(300,200,40,30);
		add(l13);
		
		c1.setBounds(340,200,60,30);
		add(c1);
		
		l14.setBounds(410,200,50,30);
		add(l4);
		
		c2.setBounds(460,200,100,30);
		add(c2);
		
		l15.setBounds(570,200,40,30);
		add(l15);
		
		c3.setBounds(610,200,90,30);
		add(c3);
		
		l6.setBounds(100,250,300,30);
		add(l6);
		
		r1.setBounds(300,250,60,30);
		add(r1);
		
		r2.setBounds(450,250,90,30);
		add(r2);
		
		l7.setBounds(100,300,200,30);
		add(l7);
		
		t3.setBounds(300,300,400,30);
		add(t3);
		
		l8.setBounds(100,350,200,30);
		add(l8);
		
		r3.setBounds(300,350,100,30);
		add(r3);
		
		r4.setBounds(450,350,100,30);
		add(r4);
		
		r5.setBounds(635,350,100,30);
		add(r5);
		
		l9.setBounds(100,400,200,30);
		add(l9);
		
		t4.setBounds(300,400,400,30);
		add(t4);
		
		l10.setBounds(100,450,200,30);
		add(l10);
		
		t5.setBounds(300,450,400,30);
		add(t5);
		
		l11.setBounds(100,500,200,30);
		add(l11);
		
		t6.setBounds(300,500,400,30);
		add(t6);
		
		l12.setBounds(100,550,200,30);
		add(l12);
		
		t7.setBounds(300,550,400,30);
		add(t7);
		
		b.setBounds(620,620,80,30);
		add(b);
		
		b.addActionListener(this);
                
                                    
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,720);
                                     setLocation(360,10);
		setVisible(true);
                                    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		}
	
	public void  actionPerformed(ActionEvent ae) {
		
		String a=t1.getText();	//name
		String b=t2.getText();  //father's name
		
		//DOB
		String ac=(String)c1.getSelectedItem() +"/"+ (String)c2.getSelectedItem() +"/"+ (String)c3.getSelectedItem() ; //getselecteditem returns object so it is typecasted to string 
		
		
		//Gender
		String d=null;
		if(r1.isSelected())
		{
			d="Male";
		}
		else if(r2.isSelected())
		{
			d="Female";
		}
		
		//Email
		String e=t3.getText();
		
		//Marital Status
		String f=null;
		if(r3.isSelected())
		{
			f="Married";
		}
		else if(r4.isSelected())
		{
			f="Unmarried";
		}
		else if(r5.isSelected())
		{
			f="Other";
		}
		
		String g=t4.getText(); //address   
		String h=t5.getText(); //city
		String i=t6.getText(); //pincode
		String j=t7.getText();//state
		
		try {
			if(t1.getText().equals("")||t4.getText().equals("")||t6.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Fill all the Fields");
			}
			else {
				
				conn c1=new conn();
				String q1="insert into user(role_id,name,father_name,dob,gender,email_address,marital_status,address,city,pincode,state,religion,category,income,education_qualification,occupation,pan_no,aadhaar_no) values(2,'"+a+"','"+b+"','"+ac+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','n','n','n','n','n','n','n')";
				c1.s.executeUpdate(q1);
				
				new NewAccount2().setVisible(true);
				setVisible(false);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	
	}
        
	public static void main(String[] args) {
		new NewAccount().setVisible(true);

	}

}

