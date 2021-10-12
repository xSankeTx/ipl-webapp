package dao;

import java.sql.*;
import utility.ConnectionManager;

public class LoginDAO {
    private static final String CHECK_USER = "SELECT * FROM userreg where name=? and pass=?";
    public static boolean validate(String name,String pass){  
        boolean status=false;  
        try( 
            Connection con=ConnectionManager.getConnection();  
            PreparedStatement ps=con.prepareStatement(CHECK_USER);){  
            ps.setString(1,name);  
            ps.setString(2,pass);   
            ResultSet rs=ps.executeQuery();  
            status=rs.next();    
        }
        catch(Exception e){
            System.out.println(e);
        }  
        return status;  
        }
}
