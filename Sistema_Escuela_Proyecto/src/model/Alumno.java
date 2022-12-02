package model;

public class Alumno {
    private int id;
    private int nivel_id;
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellidos;
    
    //-------------------
    private String nota;
    private String justificada;

    public Alumno(int id, int nivel_id, String usuario, String contraseña, String nombre, String apellidos) {
        this.id = id;
        this.nivel_id = nivel_id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Alumno(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    //-------------------------
    public Alumno(String nombre, String apellidos, String nota){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
    }
    
    public Alumno(String nombre, String apellidos, String nota, String justificada){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
        this.justificada = justificada;
    }
    
    
    public Alumno(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(int nivel_id) {
        this.nivel_id = nivel_id;
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

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }  

    public String getJustificada() {
        return justificada;
    }

    public void setJustificada(String justificada) {
        this.justificada = justificada;
    }
    
    
}
