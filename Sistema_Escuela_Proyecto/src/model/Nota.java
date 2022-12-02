/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Katherine Rodriguez
 */
public class Nota {
    	
    private int id;
    private int asignatura_has_alumno_alumno_id;
    private int asignatura_has_alumno_asignatura_id;
    private int trimestre;
    private double nota;

    public Nota(int id, int asignatura_has_alumno_alumno_id, int asignatura_has_alumno_asignatura_id, int trimestre, double nota) {
        this.id = id;
        this.asignatura_has_alumno_alumno_id = asignatura_has_alumno_alumno_id;
        this.asignatura_has_alumno_asignatura_id = asignatura_has_alumno_asignatura_id;
        this.trimestre = trimestre;
        this.nota = nota;
    }

    public Nota(int trimestre, double nota) {
        this.trimestre = trimestre;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAsignatura_has_alumno_alumno_id() {
        return asignatura_has_alumno_alumno_id;
    }

    public void setAsignatura_has_alumno_alumno_id(int asignatura_has_alumno_alumno_id) {
        this.asignatura_has_alumno_alumno_id = asignatura_has_alumno_alumno_id;
    }

    public int getAsignatura_has_alumno_asignatura_id() {
        return asignatura_has_alumno_asignatura_id;
    }

    public void setAsignatura_has_alumno_asignatura_id(int asignatura_has_alumno_asignatura_id) {
        this.asignatura_has_alumno_asignatura_id = asignatura_has_alumno_asignatura_id;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
}
