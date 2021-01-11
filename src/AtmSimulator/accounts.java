package AtmSimulator;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableCellRenderer;

public class accounts extends JFrame implements ActionListener {
    JTable t1;
    JButton b1;
    int count=login.cust_count;
    String column[] = {"User ID","Name","Card Number","Balance"};
    String data[][] = new String[count][4];
    int i=0, j=0;
    JLabel l1;
    

    accounts(){
        super("Accounts");
        setSize(800,700);
        setLocation(360,10);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
                
                
        
        try{
         conn c1  = new conn();
     
            String q="select user.user_id, user.name, acc_details.card_no, acc_details.balance from user inner join acc_details on user.user_id=acc_details.user_id where user.role_id=2 ";
            ResultSet rs = c1.s.executeQuery(q);
            while(rs.next()){
                         data[i][j++]=Integer.toString(rs.getInt("user_id"));
                         data[i][j++]=rs.getString("name");
                         data[i][j++]=String.valueOf(rs.getLong("card_no"));
                         data[i][j++]=Integer.toString(rs.getInt("balance"));
                         
                          i++;
                          j=0;
                          if(i>=count)
                          {
                              break;
                          }
            }
            
             t1 = new JTable(data,column);
             t1.setBounds(100,40,400,400);  
        }catch(Exception e){
            e.printStackTrace();
        }
              
                 
        JScrollPane sp = new JScrollPane(t1);
        add(sp);
        
DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
dtcr.setHorizontalAlignment(SwingConstants.CENTER);
t1.getColumn("User ID").setCellRenderer(dtcr);
t1.getColumn("Name").setCellRenderer(dtcr);
t1.getColumn("Card Number").setCellRenderer(dtcr);
t1.getColumn("Balance").setCellRenderer(dtcr);

        
        b1 = new JButton("Back");
        add(b1,"South");
        b1.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae){
	        try{
	             new adminpanel().setVisible(true);
                             setVisible(false);
	        }catch(Exception e){}
	    }

	public static void main(String[] args) {
		new accounts().setVisible(true);

	}
}
