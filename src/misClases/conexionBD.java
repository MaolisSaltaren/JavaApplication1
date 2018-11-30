
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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;// para leer el archivo de configuracion del aplicativo 

import javax.swing.JOptionPane;


/**
 *
 * @author maolis_saltaren
 */ 

public class conexionBD {
   
    //metodo para conecion con la bd
   
   //variables publicas
   public static  String driver;
   public static  String db;
   public static  String hostname;
   public static  String port;
   public static  String url;
   public static  String usuario;
   public static  String pass;
   
   
  //metodo que lee el archivo de configuracion de la aplicacion 
   public static void obtenerCadena ()
   {
       //instancia del archvo de propiedades 
       Properties prop= new Properties();
       
       //declara objetos para lectura de archivo
       InputStream isArchivo;
       try
       {
           //abre el archivo
           isArchivo= new FileInputStream("src/config/appConfig.properties");
           //lee el archivo
           prop.load(isArchivo);
           
           //asignando los valores respectivos las variables de  acceso a datos
            driver=prop.getProperty("driver");
            db=prop.getProperty("db");
            hostname=prop.getProperty("hostname");
            port=prop.getProperty("port");
            usuario=prop.getProperty("usuario");
            pass=prop.getProperty("pass");
            url= "jdbc:mysql://" + hostname + ":"+ port +"/"+db +"?useSSL=false";      
            
            
       }
       catch(IOException e ){
           JOptionPane.showMessageDialog(null, "Error= "+e.toString());
           
       }
       
       //JOptionPane.showMessageDialog(null, " base de datos = " +prop.getProperty(""));
   }
   
 
   public  static Connection getConexion()
      {  
          
     obtenerCadena();
          
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
                    //JOptionPane.showMessageDialog(null, "Registro guardado con exito ");
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
