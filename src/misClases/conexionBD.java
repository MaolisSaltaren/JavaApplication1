
package misClases;

import static java.lang.Class.forName;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author maolis_saltaren
 */ 

public class conexionBD {
   
    //metodo para conecion con la bd
   
   //variables publicas
   public static final String driver="com.mysql.jdbc.Driver";
   public static final String db="bd_flores";
   public static final String hostname="localhost";
   public static final String port="3306";
   public static final String url="jdbc:mysql://" + hostname + ":"+ port +"/"+db +"?useSSL=false";
   public static final String usuario="root";
   public static final String pass="123456";
   

 
   public  static Connection getConexion()
      {      
     Connection conn= null;
     try  
       {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,usuario,pass);
       
           //JOptionPane.showMessageDialog(null, " conecion  establecida");
           
       }
       catch (HeadlessException | ClassNotFoundException | SQLException ex ){
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "coneccion fallida");
       }
       return conn;
   }

}
