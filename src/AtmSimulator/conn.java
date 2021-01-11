package AtmSimulator;

import java.sql.*;  

public class conn {
    Connection c;
    Statement s;
    
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/atm","root","");    
            s =c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }
}


