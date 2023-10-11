package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Historial;
import Nutricionista_G32_entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Historial_Data {

    public Historial_Data() {

        con = Conexion.getConexion();
    }

    private Connection con = null;

    private Paciente_Data PD = new Paciente_Data();

    public void guardarHistorial(Historial historial) {

        String sql = "INSERT INTO historial (id_paciente, peso_registro, fecha_registro) "
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, historial.getPaciente().getId_paciente());
            ps.setDouble(2, historial.getPeso_registro());
            ps.setDate(3, Date.valueOf(historial.getFecha_registro()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                historial.setId_historial(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "REGISTRO AÑADIDO CON EXITO - I.D.: " + historial.getId_historial());
            }
            ps.close();

        } catch (SQLException ex) {
            if (ex instanceof SQLIntegrityConstraintViolationException) {
                JOptionPane.showMessageDialog(null, "EL REGISTRO QUE SE INTENTA GENERAR YA EXISTE, NO PUEDE VOLVER A INGRESARLO ");

            } else {
                JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA HISTORIAL" + ex.getMessage());
            }
        }
    }

    public void modificarHistorial(double peso, int id) {
        String sql = " UPDATE historial SET peso_registro=?  WHERE id_historial=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, peso);
            ps.setInt(2, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "REGISTRO MODIFICADO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "El REGISTRO NO EXISTE");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA HISTORIAL" + e.getMessage());
        }

    }

    public void eliminarRegistro(int id_registro) {
        try {
            String sql = " DELETE FROM historial WHERE id_historial=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_registro);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "SE DIÓ DE BAJA EL REGISTRO");
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA HISTORIAL" + e.getMessage());
        }
    }
    
    public List <Historial>  cargarTabla(int id){
        List <Historial> historiales = new ArrayList <>();
        Historial historial= null;
        String sql = " SELECT id_historial, fecha_registro, peso_registro FROM historial WHERE id_paciente = ? "
                + "ORDER BY fecha_registro DESC ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            historial= new Historial ();
            historial.setId_historial(rs.getInt("id_historial"));
            historial.setPeso_registro(rs.getDouble("peso_registro"));
            historial.setFecha_registro(rs.getDate("fecha_registro").toLocalDate());
            historiales.add(historial);
            }
            ps.close();
        } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA HISTORIAL" + ex.getMessage());   
        }
                
        return historiales;
    
    }
}
