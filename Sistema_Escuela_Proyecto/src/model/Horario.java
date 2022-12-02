package model;

public class Horario {
    private int id;
    private int asignatura_id;
    private String dia;
    private String horaInicio;
    private String horaFin;

    public Horario(int id, int asignatura_id, String dia, String horaInicio, String horaFin) {
        this.id = id;
        this.asignatura_id = asignatura_id;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public Horario(String dia, String horaInicio, String horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(int asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    
}