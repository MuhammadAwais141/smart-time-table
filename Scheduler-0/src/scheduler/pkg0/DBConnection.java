package scheduler.pkg0;

//import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class DBConnection {

private static Connection conn ;  

public static Connection init() // method
{
    try
    {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/league?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "") ; 
        System.out.println("connection is successfull");
    }
    catch(Exception ex)
    {
          ex.printStackTrace();
//        System.out.println("");
        JOptionPane.showMessageDialog(null, "Error in Connecting to Database", "Error", JOptionPane.ERROR_MESSAGE) ; 
//        return null ; 
    }
    return conn ; 
} 

static int getting_Club_ID(String club_name)
{
    int clubID = -1 ;
     String query1 ="select Club_id from league.club where name = ?  limit 1 ";
     try
     {
        PreparedStatement stmt1 = DBConnection.init().prepareStatement(query1) ;  // searching Club ID Query 
        stmt1.setString(1 , club_name ) ;
        ResultSet rs = stmt1.executeQuery() ; 
         if( rs.next() )   
            {
                clubID = rs.getInt(1) ;
            }
     }
     catch(Exception ex)
     {
         JOptionPane.showMessageDialog(null, "Error in FInding Key of Club","Connection" , JOptionPane.ERROR_MESSAGE);
     }
     return clubID ;
}
static ResultSet searching_City(String city_name)
{
    ResultSet rs = null;
    String query4 = "select City_id from league.city where name = ? " ;
    try
    {
        PreparedStatement stmt ;
        stmt = DBConnection.init().prepareStatement(query4) ; 
        stmt.setString(1, city_name); 
        rs = stmt.executeQuery() ; 
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null, "Error in Getting Data From City Table","DBConnection Class(M1)",JOptionPane.ERROR_MESSAGE) ;
    }
    return rs ;
}



    
} // main class




