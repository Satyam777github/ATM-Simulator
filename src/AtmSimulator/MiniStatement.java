package AtmSimulator;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableCellRenderer;


public class MiniStatement extends JFrame implements ActionListener  {

    JTable t1;
    JButton b1;
    String column[] = {"Remark","Amount"};
    String data[][] = new String[20][2];
    int i=0, j=0;
    int id=login.id;
    JLabel l1;
    
MiniStatement() {
	
        super("Mini Statement");
        setSize(800,700);
        setLocation(360,10);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        	
        try{
         conn c1  = new conn();
         String p="select balance from acc_details where user_id='"+id+"' ";
          ResultSet rs1 = c1.s.executeQuery(p);
          rs1.next();
          int b=rs1.getInt("balance");
          
          l1 = new JLabel("                                       Available balance : "+b);
          l1.setFont(new Font("System", Font.BOLD, 25));
          
       
            String q="select * from logs where user_id='"+id+"' and amount<>0 ";
            ResultSet rs = c1.s.executeQuery(q);
            while(rs.next()){
                         data[i][j++]=rs.getString("transactions");
                         data[i][j++]=rs.getString("amount");
                          i++;
                          j=0;
                          if(i>20)
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
t1.getColumn("Remark").setCellRenderer(dtcr);
t1.getColumn("Amount").setCellRenderer(dtcr);

add(l1,"North");
        b1 = new JButton("Back");
        add(b1,"South");
        b1.addActionListener(this);
	}
	
	 public void actionPerformed(ActionEvent ae){
	        try{
	           new Transaction().setVisible(true);
                           setVisible(false);
	        }catch(Exception e){}
	    }

	public static void main(String[] args) {
		new MiniStatement().setVisible(true);

	}

}
