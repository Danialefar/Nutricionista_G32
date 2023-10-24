/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Dieta;
import Nutricionista_G32_entidades.Dieta_Comida;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Dieta_Comida_Data {
    
    public Dieta_Comida_Data() {
        con = Conexion.getConexion();
    }

    private Connection con = null;
    
     public void guardarDietaComida(Dieta_Comida dieta_comida) {

        String sql = " INSERT INTO dieta_comida ( id_comida, id_dieta, tipo_comida )"
                + " VALUES (?,?,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dieta_comida.getComida().getId_comida());
            ps.setInt(2, dieta_comida.getDieta().getId_dieta());
            ps.setString(3, dieta_comida.getTipo_comida().name());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dieta_comida.setId_dieta_comida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "DIETA_COMIDA AÑADIDA CON EXITO - I.D.: " + dieta_comida.getId_dieta_comida());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA_COMIDA" + ex.getMessage());
        }
    }
}
