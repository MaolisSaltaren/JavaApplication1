
package misClases;
public class Personas {
    
    int id;
    String identificacion;
    String nombre;
    String telefono;
    String direccion;
    String email;
    
    public Personas()
    {
    
    }
    
    //getter ad setter de personas
    public String getIdentificacion()
    {
        return identificacion;  
    }
   
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }
    //--------------------------------------------------------------------------
    
    // setter de la clase personas
    
    public void setIdentificacion(String identifi)
    {
        this.identificacion= identifi;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
          
    
}
