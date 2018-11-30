
package misClases;

import static java.lang.Class.forName;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static java.lang.Class.forName;
import java.awt.HeadlessException;
import java.sql.*;

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
      //metodo que lle los datos de una tabla
   public static ResultSet getTabla(String consulta)
   {
       Connection con= getConexion();
       Statement st;
       ResultSet datos =null;
       try
       {
           st = con.createStatement();
           datos=st.executeQuery(consulta);
        
       }
       catch (Exception e )
       {
           JOptionPane.showMessageDialog(null, "Error"+e.toString());
       }
               
       return datos;
   }
   
   // metodo que gaura los  datos en la base de datos 
     public  int ejecutarSQL(String insert)
    {
       
     
       int resultado=0;
     
        // ejemplo de vectore en java

          //  JOptionPane.showMessageDialog(null, ""+insert);
     
      try
        {
            PreparedStatement parametros=getConexion().prepareStatement(insert);
            
              resultado = parametros.executeUpdate(); //actualiza la bd
   
            if(resultado>0)
            {
                    JOptionPane.showMessageDialog(null, "Registro guardado con exito ");
            }
            else
            {
                JOptionPane.showMessageDialog(null, " no se guardo el registro");
                        
            }
            
           getConexion().close();// cierra la conexion con la base de datos
            
        }catch(SQLException e){
           
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        } 
     
        return resultado;
        
          
    }
   
   
   

}
