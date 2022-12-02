package model;

public class Profesor{
    private int id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellidos;
    private String correo;
    private int especilista;

    public Profesor(int id, String usuario, String contraseña, String nombre, String apellidos, String correo, int especilista) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.especilista = especilista;
    }
    
    public Profesor(String nombre, String apellidos, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public Profesor() {
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
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEspecilista() {
        return especilista;
    }

    public void setEspecilista(int especilista) {
        this.especilista = especilista;
    }
}
