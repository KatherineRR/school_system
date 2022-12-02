package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Alumno;
import model.Conexion;
import model.MTP;
import model.Asignatura;
import model.Nota;

public class ctrlAsignatura implements MTP{
    
    private Connection con;  
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;

    @Override
    public ArrayList Listar() {
        ArrayList<Asignatura> lista = new ArrayList<>();
        String sql = "SELECT * FROM asignatura";
        try {
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Asignatura a = new Asignatura(rs.getInt("id"),rs.getInt("nivel_id"), rs.getInt("profesor_id"),rs.getString("nombre"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO asignatura(nivel_id,profesor_id,nombre) VALUES (?, ?, ?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, o[0]);
            ps.setObject (2, o[1]);
            ps.setObject (3, o[2]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE asignatura set nivel_id=?,profesor_id=?,nombre=? WHERE id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, o[0]);
            ps.setObject (2, o[1]);
            ps.setObject (3, o[2]);
            ps.setObject (4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM asignatura WHERE id=?";
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
        ArrayList<Asignatura> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT * FROM asignatura WHERE nivel_id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, nivel);
            rs = ps.executeQuery();
            while(rs.next()){
                Asignatura a = new Asignatura(rs.getInt("id"),rs.getInt("nivel_id"), rs.getInt("profesor_id"),rs.getString("nombre"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public ArrayList buscarAsigProfe(int profesor_id, int alumno_id) {
        ArrayList<Asignatura> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT a.nombre FROM asignatura a JOIN asignatura_has_alumno O ON a.id = O.asignatura_id JOIN profesor E ON a.profesor_id = e.id JOIN alumno al ON al.id = o.alumno_id WHERE e.id = ? AND al.id = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, profesor_id);
            ps.setInt(2, alumno_id);
            rs = ps.executeQuery();
            while(rs.next()){
                Asignatura a = new Asignatura(rs.getString("nombre"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    } 
    
    public int buscarAsignaturaIdMa(int nivel, String nombre){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM asignatura WHERE nivel_id=? AND nombre=?";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, nivel);
            ps.setObject (2, nombre);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
    
   public int buscarAsignaturaId(int profesor_id, int nivel_id, String nombre){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM asignatura WHERE profesor_id=? AND nivel_id=? AND nombre=?";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, profesor_id);
            ps.setObject (2, nivel_id);
            ps.setObject (3, nombre);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
   
   public int ingresarNota(int alumno_id, int asignatura_id, int trimestre, String nota){
       Double notaD = Double.parseDouble(nota);
       int r = 0;
        String sql = "INSERT INTO nota(asignatura_has_alumno_alumno_id,asignatura_has_alumno_asignatura_id,trimestre, nota) VALUES (?, ?, ?, ?)";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, alumno_id);
            ps.setObject (2, asignatura_id);
            ps.setObject (3, trimestre);
            ps.setObject (4, notaD);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
   }
   
   public ArrayList ListarAsigProfeDa(int profesor_id) {
        ArrayList<Asignatura> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT DISTINCT nombre FROM asignatura WHERE profesor_id=?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, profesor_id);
            rs = ps.executeQuery();
            while(rs.next()){
                Asignatura a = new Asignatura(rs.getString("nombre"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    } 
   
    
   public ArrayList BuscarAlumnosNotas(int profesor_id, String nombre, int nivel_id, String trimestre) {
        ArrayList<Alumno> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT a.nombre, a.apellidos, n.nota FROM alumno a, nota n JOIN asignatura h ON h.id = n.asignatura_has_alumno_asignatura_id AND h.profesor_id = ? AND h.nombre = ? WHERE n.asignatura_has_alumno_alumno_id = a.id AND a.nivel_id = ? AND n.trimestre = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, profesor_id);
            ps.setObject(2, nombre);
            ps.setObject(3, nivel_id);
            ps.setObject(4, trimestre);
            rs = ps.executeQuery();
            while(rs.next()){
                Alumno a = new Alumno(rs.getString("nombre"), rs.getString("apellidos"), rs.getString("nota"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }  
   // 
   public int modificarNota(String nota, int alumno_id, String nombre, String apellidos, int profesor_id, int asignatura_id) {
        int r = 0;
        String sql = "UPDATE nota n, alumno a, asignatura h SET n.nota = ? WHERE n.asignatura_has_alumno_alumno_id = ? AND a.nombre = ? AND a.apellidos = ? AND n.asignatura_has_alumno_alumno_id = a.id AND h.id = n.asignatura_has_alumno_asignatura_id AND h.profesor_id = ? AND h.id = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject (1, nota);
            ps.setObject (2, alumno_id);
            ps.setObject (3, nombre);
            ps.setObject (4, apellidos);
            ps.setObject (5, profesor_id); 
            ps.setObject (6, asignatura_id);
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
   
   public ArrayList ListarAsigAlumno(int nivel) {
        ArrayList<Asignatura> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT nombre FROM asignatura WHERE nivel_id = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, nivel);
            rs = ps.executeQuery();
            while(rs.next()){
                Asignatura a = new Asignatura(rs.getString("nombre"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    } 
   
   public ArrayList ListarNotasAlumno(int asignatura_id) {
        ArrayList<Nota> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT trimestre, nota FROM nota WHERE asignatura_has_alumno_asignatura_id = ?";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, asignatura_id);
            rs = ps.executeQuery();
            while(rs.next()){
                Nota a = new Nota(rs.getInt("trimestre"), rs.getDouble("nota"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }    
}
