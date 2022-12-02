package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Conexion;
import model.MTP;
import model.Nivel;
import model.Profesor;

public class ctrlProfesor implements MTP{
    
    private Connection con;  
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public ArrayList Listar() {
        ArrayList<Profesor> lista = new ArrayList<>();
        String sql = "SELECT * FROM profesor";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Profesor p = new Profesor(rs.getInt("id"),rs.getString("login"), rs.getString("clave"),rs.getString("nombre"), rs.getString("apellidos"), rs.getString("email"), rs.getInt("especialista"));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = " INSERT INTO profesor(login,clave,nombre,apellidos,email,especialista) VALUES (?, ?, ?, ?, ?, ?)";
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
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE profesor set login=?,clave=?,nombre=?,apellidos=?,email=?,especialista=? WHERE id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, o[0]);
            ps.setObject (2, o[1]);
            ps.setObject (3, o[2]);
            ps.setObject (4, o[3]);
            ps.setObject (5, o[4]);
            ps.setObject (6, o[5]);
            ps.setObject (7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM profesor WHERE id=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch(Exception e){
            
        }              
    }
    
    @Override
    public ArrayList buscar(int especialista) {
        ArrayList<Profesor> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT * FROM profesor WHERE especialista=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, especialista);
            rs = ps.executeQuery();
            while(rs.next()){
                Profesor p = new Profesor(rs.getInt("id"),rs.getString("login"), rs.getString("clave"),rs.getString("nombre"), rs.getString("apellidos"), rs.getString("email"), rs.getInt("especialista"));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int validarLogin(String usuario, String contraseña){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM profesor WHERE login=? AND clave=? ";
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
     // SELECT p.nombre, p.apellidos, a.nombre FROM profesor p, asignatura a, alumno h WHERE h.nivel_id = a.nivel_id AND p.id = a.profesor_id AND h.id = 7
    public ArrayList listaProfesAlumno(int alumno_id) {
        ArrayList<Profesor> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT p.nombre as nombre, p.apellidos as apellidos, a.nombre as asignatura FROM profesor p, asignatura a, alumno h WHERE h.nivel_id = a.nivel_id AND p.id = a.profesor_id AND h.id = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno_id);
            rs = ps.executeQuery();
            while(rs.next()){
                Profesor p = new Profesor(rs.getString("nombre"), rs.getString("apellidos"), rs.getString("asignatura"));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList ListarNombres() {
        ArrayList<Profesor> lista = new ArrayList<>();
        String sql = "SELECT CONCAT(nombre,' ', apellidos) Nombres FROM profesor";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Profesor a = new Profesor(rs.getString("Nombres"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int buscarProfeId(String nombre){
        String[] nom = nombre.split(" ");
        int r = 0;
        try {
            String sql = "SELECT id REG FROM profesor WHERE nombre=? AND apellidos=?";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString (1, nom[0]);
            ps.setString (2, nom[1]+ " " +nom[2]);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
    
    public String buscarProfeNombre(int id){
        String r = "";
        try {
            String sql = "SELECT CONCAT(nombre,' ', apellidos) Nombre FROM profesor WHERE id = ?";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt (1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getString("Nombre");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
}
