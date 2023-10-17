
package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Comida;
import Nutricionista_G32_entidades.Dieta;
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


public class Dieta_Data {
    
     public Dieta_Data() {
        con = Conexion.getConexion();
    }

    private Connection con = null;
    
    private Paciente_Data pD=new Paciente_Data();

    public void guardarDieta(Dieta dieta) {

        String sql = " INSERT INTO dieta ( nombre_dieta, id_paciente, peso_inicial, peso_final, fecha_inicial, fecha_final )"
                + " VALUES (?,?,?,?,?,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, dieta.getNombre_dieta());
            ps.setInt(2, dieta.getPaciente().getId_paciente());
            ps.setDouble(3, dieta.getPeso_incial());
            ps.setDouble(4, dieta.getPeso_final());
            ps.setDate(5, Date.valueOf(dieta.getFecha_inicial()));
            ps.setDate(6, Date.valueOf(dieta.getFecha_final()));
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                dieta.setId_dieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "DIETA AÑADIDA CON EXITO - I.D.: " + dieta.getId_dieta());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }
    }

    public Dieta buscarDietaPorId(int id_dieta) {

        String sql = "SELECT * FROM dieta WHERE id_dieta = ? ";

        Dieta dieta = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_dieta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac=pD.buscarPacientePorId(rs.getInt("id_paciente"));
                dieta.setPaciente(pac);
                dieta.setPeso_incial(rs.getDouble("peso_inicial"));
                dieta.setPeso_final(rs.getDouble("peso_final"));
                dieta.setFecha_inicial(rs.getDate("fecha_inicial").toLocalDate());
                dieta.setFecha_final(rs.getDate("fecha_final").toLocalDate());

            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE LA DIETA CON EL NUMERO INGRESADO ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }

        return dieta;
    }

    public List<Dieta> listarDietasNoFinalizadas() {
        List<Dieta> dietas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dieta WHERE fecha_final > CURRENT_DATE()";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac=pD.buscarPacientePorId(rs.getInt("id_paciente"));
                dieta.setPaciente(pac);
                dieta.setPeso_incial(rs.getDouble("peso_inicial"));
                dieta.setPeso_final(rs.getDouble("peso_final"));
                dieta.setFecha_inicial(rs.getDate("fecha_inicial").toLocalDate());
                dieta.setFecha_final(rs.getDate("fecha_final").toLocalDate());
                dietas.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }
        return dietas;
    }

    public void modificarDieta(Dieta dieta) {
        String sql = "UPDATE dieta SET nombre_dieta=?, id_paciente=?, peso_inicial=?, peso_final=?, fecha_inicial=?, fecha_final=? "
                + " WHERE id_dieta=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre_dieta());
            ps.setInt(2, dieta.getPaciente().getId_paciente());
            ps.setDouble(3, dieta.getPeso_incial());
            ps.setDouble(4, dieta.getPeso_final());
            ps.setDate(5, Date.valueOf(dieta.getFecha_inicial()));
            ps.setDate(6, Date.valueOf(dieta.getFecha_final()));
            ps.setInt(7, dieta.getId_dieta());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "DIETA MODIFICADA EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "LA DIETA NO EXISTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }

    }

    public List<Dieta> listarDietasFinalizadas() {
        List<Dieta> dietas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dieta WHERE fecha_final > CURRENT_DATE() OR fecha_final != null ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac=pD.buscarPacientePorId(rs.getInt("id_paciente"));
                dieta.setPaciente(pac);
                dieta.setPeso_incial(rs.getDouble("peso_inicial"));
                dieta.setPeso_final(rs.getDouble("peso_final"));
                dieta.setFecha_inicial(rs.getDate("fecha_inicial").toLocalDate());
                dieta.setFecha_final(rs.getDate("fecha_final").toLocalDate());
                dietas.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }
        return dietas;
    }
    
    public List<Dieta> listarDietasPorPaciente(int id) {
        List<Dieta> dietas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dieta WHERE id_paciente=? ";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac=pD.buscarPacientePorId(rs.getInt("id_paciente"));
                dieta.setPaciente(pac);
                dieta.setPeso_incial(rs.getDouble("peso_inicial"));
                dieta.setPeso_final(rs.getDouble("peso_final"));
                dieta.setFecha_inicial(rs.getDate("fecha_inicial").toLocalDate());
                dieta.setFecha_final(rs.getDate("fecha_final").toLocalDate());
                dietas.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }
        return dietas;
    }
}
