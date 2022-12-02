package model;

public class falta_asistencia {
    private int id;
    private int alumno_id;
    private int asignatura_id;
    private String fecha;
    private String justificada;

    public falta_asistencia(int id, int alumno_id, int asignatura_id, String fecha, String justificada) {
        this.id = id;
        this.alumno_id = alumno_id;
        this.asignatura_id = asignatura_id;
        this.fecha = fecha;
        this.justificada = justificada;
    }

    public falta_asistencia(String fecha, String justificada) {
        this.fecha = fecha;
        this.justificada = justificada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlumno_id() {
        return alumno_id;
    }

    public void setAlumno_id(int alumno_id) {
        this.alumno_id = alumno_id;
    }

    public int getAsignatura_id() {
        return asignatura_id;
    }

    public void setAsignatura_id(int asignatura_id) {
        this.asignatura_id = asignatura_id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getJustificada() {
        return justificada;
    }

    public void setJustificada(String justificada) {
        this.justificada = justificada;
    }
}
