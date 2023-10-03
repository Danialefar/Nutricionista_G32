
package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Paciente_Data {
    
    public Paciente_Data() {

        con = Conexion.getConexion();
    }

    private Connection con = null;

    public void guardarPaciente(Paciente paciente) {

        String sql = "INSERT INTO paciente (dni_paciente, apellido_paciente, nombre_paciente, direccion_paciente, telef_paciente, estado_paciente)"
                + "VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni_paciente());
            ps.setString(2, paciente.getApellido_paciente());
            ps.setString(3, paciente.getNombre_paciente());
            ps.setString(4, paciente.getDireccion_paciente());
            ps.setString(5, paciente.getTelef_paciente());
            ps.setBoolean(6, paciente.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                paciente.setId_paciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "PACIENTE AÑADIDO CON EXITO - I.D.: " + paciente.getId_paciente());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA PACIENTE" + ex.getMessage());
        }
    }

    public Paciente buscarPacientePorDni(int dni_paciente) {

        String sql = "SELECT * FROM paciente WHERE dni_paciente = ? ";
        
        Paciente paciente = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni_paciente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setDni_paciente(rs.getInt("dni_paciente"));
                paciente.setApellido_paciente(rs.getString("apellido_paciente"));
                paciente.setNombre_paciente(rs.getString("nombre_paciente"));
                paciente.setDireccion_paciente(rs.getString("direccion_paciente"));
                paciente.setTelef_paciente(rs.getString("telef_paciente"));
                paciente.setEstado(rs.getBoolean("estado_paciente"));

            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE PACIENTE CON EL DNI INGRESADO");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA PACIENTE" + ex.getMessage());
        }

        return paciente;
    }

    public List<Paciente> listarPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM paciente WHERE estado_paciente=1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setDni_paciente(rs.getInt("dni_paciente"));
                paciente.setApellido_paciente(rs.getString("apellido_paciente"));
                paciente.setNombre_paciente(rs.getString("nombre_paciente"));
                paciente.setDireccion_paciente(rs.getString("direccion_paciente"));
                paciente.setTelef_paciente(rs.getString("telef_paciente"));
                pacientes.add(paciente);
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA PACIENTE" + e.getMessage());
        }
        return pacientes;
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET dni_paciente=?, apellido_paciente=?, nombre_paciente=?, direccion_paciente=? , telef_paciente=?, estado_paciente=? "
                + " WHERE id_paciente=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getDni_paciente());
            ps.setString(2, paciente.getApellido_paciente());
            ps.setString(3, paciente.getNombre_paciente());
            ps.setString(4, paciente.getDireccion_paciente());
            ps.setString(5, paciente.getTelef_paciente());
            ps.setBoolean(6, paciente.isEstado());
            ps.setInt(7, paciente.getId_paciente());
                                                       
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "PACIENTE MODIFICADO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "El PACIENTE NO EXISTE");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA PACIENTE" + e.getMessage());
        }

    }

    public void bajaPaciente(int dni) {
        try {
            String sql = "UPDATE paciente SET estado_paciente=0 WHERE dni=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "SE DIÓ DE BAJA AL PACIENTE");
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA PACIENTE" + e.getMessage());
        }

    }
 public Paciente buscarPacientePorId(int id_paciente) {

        String sql = "SELECT * FROM paciente WHERE id_paciente = ? ";
        
        Paciente paciente = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_paciente);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                paciente = new Paciente();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                paciente.setDni_paciente(rs.getInt("dni_paciente"));
                paciente.setApellido_paciente(rs.getString("apellido_paciente"));
                paciente.setNombre_paciente(rs.getString("nombre_paciente"));
                paciente.setDireccion_paciente(rs.getString("direccion_paciente"));
                paciente.setTelef_paciente(rs.getString("telef_paciente"));
                paciente.setEstado(rs.getBoolean("estado_paciente"));

            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE EL PACIENTE CON EL NUMERO INGRESADO ");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA PACIENTE" + ex.getMessage());
        }

        return paciente;
    }
}

