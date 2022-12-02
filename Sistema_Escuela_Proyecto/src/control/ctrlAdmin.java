/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Conexion;

/**
 *
 * @author Katherine Rodriguez
 */
public class ctrlAdmin {
    
    private Connection con;  
    private Conexion cn = new Conexion();
    private PreparedStatement ps;
    private ResultSet rs;
    
    public int validarLogin(String usuario, String contraseña){
        int r = 0;
        try {
            String sql = "SELECT id REG FROM administrador WHERE login=? AND clave=? ";
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
    
}
