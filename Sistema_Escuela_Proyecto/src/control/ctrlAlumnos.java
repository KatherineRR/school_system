package control;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Alumno;
import model.Conexion;
import model.Horario;
import model.MTP;
import model.falta_asistencia;


public class ctrlAlumnos implements MTP{
    private Connection con;  
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public ArrayList Listar() {
        ArrayList<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumno";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getInt("id"),rs.getInt("nivel_id"), rs.getString("login"),rs.getString("clave"), rs.getString("nombre"), rs.getString("apellidos"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = " INSERT INTO alumno(nivel_id,login,clave,nombre,apellidos) VALUES (?, ?, ?, ?, ?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, o[0]);
            ps.setObject (2, o[1]);
            ps.setObject (3, o[2]);
            ps.setObject (4, o[3]);
            ps.setObject (5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE alumno set nivel_id=?,login=?,clave=?,nombre=?,apellidos=? WHERE id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, o[0]);
            ps.setObject (2, o[1]);
            ps.setObject (3, o[2]);
            ps.setObject (4, o[3]);
            ps.setObject (5, o[4]);
            ps.setObject (6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM alumno WHERE id=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        }      
        
    }
    
    @Override
    public ArrayList buscar(int nivel) {
        ArrayList<Alumno> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT * FROM alumno WHERE nivel_id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, nivel);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getInt("id"), rs.getInt("nivel_id"), rs.getString("login"),rs.getString("clave"), rs.getString("nombre"), rs.getString("apellidos"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int matricular(int asignatura_id, int alumno_id){
        int r = 0;
        
        try {
            String sql = "SELECT id REG FROM asignatura_has_alumno WHERE asignatura_id=? AND alumno_id=? ";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, asignatura_id);
            ps.setObject (2, alumno_id);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        
        if (r == 0){
            String sql = " INSERT INTO asignatura_has_alumno(asignatura_id, alumno_id) VALUES (?, ?)";
            try {
                con = cn.Conectar();
                ps = con.prepareStatement(sql);
                ps.setObject (1, asignatura_id);
                ps.setObject (2, alumno_id);
                r = ps.executeUpdate();
            } catch (Exception e) {
            }
        }else{
            r = 0;
        }
        
        return r;
    }
    
    public int validarLogin(String usuario, String contraseña){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM alumno WHERE login=? AND clave=? ";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, usuario);
            ps.setObject (2, contraseña);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) {
            
        }
        return r;
    }
    
    public ArrayList listarAlumnos(int profesor_id, int nivel){
        ArrayList<Alumno> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT DISTINCT a.nombre, a.apellidos FROM alumno a JOIN asignatura_has_alumno O ON a.id = O.alumno_id JOIN asignatura E ON o.asignatura_id = e.id WHERE e.profesor_id=? AND E.nivel_id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, profesor_id);
            ps.setInt(2, nivel);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getString("nombre"), rs.getString("apellidos"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int buscarAlumnoId(String nombre, String apellidos){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM alumno WHERE nombre=? AND apellidos=? ";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, nombre);
            ps.setObject (2, apellidos);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
  
    public int asignarFalta(int alumno_id, int asignatura_id, String fecha, String justificada){
        int r = 0;
        String sql = " INSERT INTO falta_asistencia(alumno_id, asignatura_id, fecha, justificada) VALUES (?, ?, ?, ?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, alumno_id);
            ps.setObject (2, asignatura_id);
            ps.setObject (3, fecha);
            ps.setObject (4, justificada);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public ArrayList buscarFaltasAsistencias(int nivel_id, int asignatura_id, String fecha){
        ArrayList<Alumno> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT a.nombre, a.apellidos, h.nombre, n.fecha, n.justificada FROM alumno a, asignatura h, falta_asistencia n, nivel d WHERE a.id = n.alumno_id AND h.nivel_id = d.id AND h.id = n.asignatura_id AND h.nivel_id = ? AND n.asignatura_id = ? AND fecha = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, nivel_id);
            ps.setInt(2, asignatura_id);
            ps.setString(3, fecha);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getString("nombre"), rs.getString("apellidos"), rs.getString("fecha"), rs.getString("justificada"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
   
    public int modificarFaltaAsistencia(String fecha, String justificada, int alumno_id, int asignatura_id) {
        int r = 0;
        String sql = "UPDATE falta_asistencia set fecha = ?, justificada = ? WHERE alumno_id = ? AND asignatura_id = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, fecha);
            ps.setObject (2, justificada);
            ps.setObject (3, alumno_id);
            ps.setObject (4, asignatura_id);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    public ArrayList cantidadFaltas(int asignatura_id){
        ArrayList<Alumno> lista = new ArrayList<>();
        String sql = "SELECT a.nombre, a.apellidos, COUNT(*) REG FROM alumno a, falta_asistencia f WHERE f.asignatura_id = ? AND a.id = f.alumno_id GROUP BY a.nombre, a.apellidos";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt (1, asignatura_id);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getString("nombre"), rs.getString("apellidos"), rs.getString("REG"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public int buscarNivelAlumno(int id){
        int r = 0;
        try {
            String sql = "SELECT nivel_id REG FROM alumno WHERE id = ?";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt (1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
    
    public ArrayList listaCompañeros(int nivel_id, int id){
        ArrayList<Alumno> lista = new ArrayList<>();
        String sql = "SELECT nombre, apellidos FROM alumno WHERE nivel_id = ? AND id != ?";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt (1, nivel_id);
            ps.setInt (2, id);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getString("nombre"), rs.getString("apellidos"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList listaFaltasAlumno(int asignatura_id, int id){
        ArrayList<falta_asistencia> lista = new ArrayList<>();
        String sql = "SELECT fecha, justificada FROM falta_asistencia WHERE asignatura_id = ? AND alumno_id = ?";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt (1, asignatura_id);
            ps.setInt (2, id);
            rs = ps.executeQuery();
            while(rs.next()){
                falta_asistencia a = new falta_asistencia(rs.getString("fecha"), rs.getString("justificada"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList listaHorariosAlumno(int asignatura_id){
        ArrayList<Horario> lista = new ArrayList<>();
        String sql = "SELECT dia, horaInicio, horaFin FROM horario WHERE asignatura_id = ?";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt (1, asignatura_id);
            rs = ps.executeQuery();
            while(rs.next()){
                Horario a = new Horario(rs.getString("dia"), rs.getString("horaInicio"), rs.getString("horaFin"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}
