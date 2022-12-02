package model;

public class Asignatura {
    private int id;
    private int nivel_id;
    private int profesor_id;
    private String nombre;

    public Asignatura(int id, int nivel_id, int profesor_id, String nombre) {
        this.id = id;
        this.nivel_id = nivel_id;
        this.profesor_id = profesor_id;
        this.nombre = nombre;
    }

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }
    
    public Asignatura() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel_id() {
        return nivel_id;
    }

    public void setNivel_id(int nivel_id) {
        this.nivel_id = nivel_id;
    }

    public int getProfesor_id() {
        return profesor_id;
    }

    public void setProfesor_id(int profesor_id) {
        this.profesor_id = profesor_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
}
