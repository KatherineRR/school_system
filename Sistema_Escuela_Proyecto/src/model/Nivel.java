package model;

public class Nivel {
    private int id;
    private String nivel;
    private String curso;
    private String aula;
    private int cantidad = 0;

    public Nivel(String nivel, String curso, String aula) {
        this.id = cantidad;
        this.nivel = nivel;
        this.curso = curso;
        this.aula = aula;
        cantidad++;
    }

    public Nivel(String nivel) {
        this.nivel = nivel;
    }

    public Nivel() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
    
    
}
