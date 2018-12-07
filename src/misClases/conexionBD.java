
package misClases;

// la programacion  utilizada en este proyecto es   programacion orientado a objetos
// en esta clase se encuentran los metodos principales que permite a java conectarse al servidor mysq y tener accco a
// los tados 


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
       //1.instancia del archvo de propiedades 
       Properties prop= new Properties();
       
       //2.declara objetos para lectura de archivo
       InputStream isArchivo;
       try
       {
           //3.abre el archivo
           isArchivo= new FileInputStream("src/config/appConfig.properties");
           //4.lee el archivo
           prop.load(isArchivo);
           
          //5.captura del archivo  llamado appConfig.properties toda la coniguracion de conexion con la base de datos
          // de esta manera se facilita el cambio de usuario y contraseña de forma muy rapida y segura 
          // solo hay que abrir el archivo en cuestion y realizar los respectivos ajustes
          
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
   
 // esta funcion obtiene la conexion  hacia la base de datos mysql
   public  static Connection getConexion()
      {  
          
     obtenerCadena();// llama al metodo  que contiene todos los parametros de conexion con la base de datos 
     
          
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
   
      //metodo que lle los datos de una tabla la cual se le puede mandar una  consulta  sql o un procedimiento almacenado
   
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
   
   // metodo que guarda datod en la base de  datos 
   // recibe por parametro un  un string el cual contiene el procedimiento almacenado  que se encuentra en la base de datos 
   
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
                    JOptionPane.showMessageDialog(null, "Operacion exitosa :) ");
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
     
     //--------------------------------------------------------------------------------------------------
    // metodo especifico para guardar los detalles del pedido
     
         public  int InsertarDetallePedi(String insert)
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
                    //JOptionPane.showMessageDialog(null, "Operacion exitosa :) ");
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
