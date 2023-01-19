package conexion;

/**
 * Nombre de la Clase: VistaClinicas
 * Fecha: 13/06/2021
 * Version: 1.0 
 *  @author Rene Gabriel Hernandez      Carnet: (203020) *  
 */
public class Credenciales {
    
     private String driver;
     private String url;
     private String usuario;
     private String contrasena;

     
     
    public Credenciales() {
        this.driver="com.mysql.jdbc.Driver";
        this.url="jdbc:mysql://localhost:3306/examen3";
        this.usuario="root";
        this.contrasena="";
    }

    
/*
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    */

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
