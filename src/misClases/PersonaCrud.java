/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misClases;
import  java.sql.*;
import javax.swing.JOptionPane;


public class PersonaCrud {

    conexionBD  conexion ;
    
    public PersonaCrud()
    {
        conexion=new conexionBD();
   
    }
  
   ////-----------------------------------------------------
    // METODO PARA INSERTAR DATOS
    
    public  int ejecutarSQL(String insert)
    {
       
    
       int resultado=0;
     
        // ejemplo de vectore en java

            JOptionPane.showMessageDialog(null, ""+insert);
     
      try
        {
            PreparedStatement parametros=conexion.getConexion().prepareStatement(insert);
            
              resultado = parametros.executeUpdate(); //actualiza la bd
   
            if(resultado>0)
            {
                    JOptionPane.showConfirmDialog(null, " se guardo");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "no se guardo el registro");
                        
            }
            
            conexion.getConexion().close();// cierra la conexion con la base de datos
            
        }catch(SQLException e){
           
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        } 
     
        return resultado;
        
          
    }
    
    
    
    

}
