package AtmSimulator;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableCellRenderer;

public class logs extends JFrame implements ActionListener{
     JTable t1;
    JButton b1;
    int logcount=login.log_count;
    String column[] = {"Transaction ID","User ID","Transaction","Amount"};
    String data[][] = new String[logcount][4];
    int i=0, j=0;
    
    logs(){
        super("Logs");
        setSize(800,700);
        setLocation(360,10);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        try{
                    conn c1  = new conn();
                    String q="select * from logs ";
            ResultSet rs = c1.s.executeQuery(q);
            while(rs.next()){
                           data[i][j++]=Integer.toString(rs.getInt("serial_no"));
                         data[i][j++]=Integer.toString(rs.getInt("user_id"));
                         data[i][j++]=rs.getString("transactions");
                         data[i][j++]=Integer.toString(rs.getInt("amount"));
                         
                          i++;
                          j=0;
                          if(i>=logcount)
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
t1.getColumn("Transaction ID").setCellRenderer(dtcr);
t1.getColumn("User ID").setCellRenderer(dtcr);
t1.getColumn("Transaction").setCellRenderer(dtcr);
t1.getColumn("Amount").setCellRenderer(dtcr);

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
		new logs().setVisible(true);

	}
}
