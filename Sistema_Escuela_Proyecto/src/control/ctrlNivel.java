/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Conexion;
import model.Nivel;

/**
 *
 * @author Katherine Rodriguez
 */
public class ctrlNivel {
    
    private Connection con;  
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    
    public ArrayList Listar() {
        ArrayList<Nivel> lista = new ArrayList<>();
        int r = 0;
        String sql = "SELECT nivel FROM nivel";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Nivel a = new Nivel(rs.getString("nivel"));
                lista.add(a);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public int buscarNivelId(String nivel){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM nivel WHERE nivel=?";
            con  = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString (1, nivel);
            rs = ps.executeQuery();
            while(rs.next()){
                r = rs.getInt("REG");
            }
        } catch (Exception e) { 
            
        }
        return r;
    }
    
}
