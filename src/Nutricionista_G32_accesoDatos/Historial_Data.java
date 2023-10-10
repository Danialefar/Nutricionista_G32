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
import java.time.LocalDate;
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

    public void modificarHistorial(Historial historial) {
        String sql = "UPDATE historial SET peso_registro=? , fecha_registro=? "
                + " WHERE id_historial=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, historial.getPeso_registro());
            ps.setDate(2, Date.valueOf(historial.getFecha_registro()));
            ps.setInt(3, historial.getId_historial());

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
            String sql = "DELETE * historial WHERE id_historial=? ";
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
}
