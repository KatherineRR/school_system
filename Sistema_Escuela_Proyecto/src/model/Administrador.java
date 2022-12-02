package model;

public class Administrador{
    protected int id;
    protected String usuario;
    protected String contraseña;
    private String correo;

    public Administrador(int id, String usuario, String contraseña, String correo) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public Administrador() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
