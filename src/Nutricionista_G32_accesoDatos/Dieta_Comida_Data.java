/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Comida;
import Nutricionista_G32_entidades.Dieta;
import Nutricionista_G32_entidades.Dieta_Comida;
import Nutricionista_G32_entidades.Paciente;
import Nutricionista_G32_entidades.TiposComida;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
     
     public List<Dieta_Comida> listarDetalleComidas(int id) {
        List<Dieta_Comida> dietaCom = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dieta_comida, comida, dieta "
                    + "WHERE dieta_comida.id_dieta=? "
                    + "AND dieta.id_dieta=? "
                    + "AND dieta_comida.id_comida=comida.id_comida";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                Dieta dieta =  new Dieta();
                Dieta_Comida dC = new Dieta_Comida();
                Paciente_Data pD = new Paciente_Data();
                
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre_comida(rs.getString("nombre_comida"));
                comida.setDetalle_comida(rs.getString("detalle_comida"));
                comida.setCalorias_comida(rs.getInt("calorias_comida"));
                comida.setEstado_comida(rs.getBoolean("estado_comida"));
                
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac = pD.buscarPacientePorId(rs.getInt("id_paciente"));
                dieta.setPaciente(pac);
                dieta.setPeso_incial(rs.getDouble("peso_inicial"));
                dieta.setPeso_final(rs.getDouble("peso_final"));
                dieta.setFecha_inicial(rs.getDate("fecha_inicial").toLocalDate());
                dieta.setFecha_final(rs.getDate("fecha_final").toLocalDate());
                
                dC.setId_dieta_comida(rs.getInt("id_dieta_comida"));
                dC.setComida(comida);
                dC.setDieta(dieta);
                dC.setTipo_comida(TiposComida.valueOf(rs.getString("tipo_comida")));
                dietaCom.add(dC);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA COMIDA" + ex.getMessage());
        }
        return dietaCom;
    }
}
