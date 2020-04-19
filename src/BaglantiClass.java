
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Taha
 */
public class BaglantiClass {
    
    public BaglantiClass() throws SQLException
    {
        try{
         
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Bağlantı sınıfı aranıyor..");          
           }
        catch(ClassNotFoundException e)
        {
             System.err.println("SQL bulunamadı");
             System.err.println("HATA"+e);
             return;
        }
        Connection con= null;
        try
        {
        con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/HayvanatBahcesii","root","1234");
            Statement myStat = con.createStatement();
            ResultSet myRs = myStat.executeQuery("select * from personelbilgi");
        }
        catch(SQLException e){
        e.printStackTrace();
        System.err.println("HATA BAĞLANILAMADI");
        System.err.println("HATA"+e);
        }
  
    }
}
