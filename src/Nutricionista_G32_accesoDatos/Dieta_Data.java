package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Comida;
import Nutricionista_G32_entidades.Dieta;
import Nutricionista_G32_entidades.Paciente;
import Nutricionista_G32_entidades.Reporte;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Dieta_Data {

    public Dieta_Data() {
        con = Conexion.getConexion();
    }

    private Connection con = null;

    private Paciente_Data pD = new Paciente_Data();

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
                Paciente pac = pD.buscarPacientePorId(rs.getInt("id_paciente"));
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

    public boolean buscarDietaPorPaciente(int id_paciente) {

        String sql = "SELECT COUNT(*) AS CANTIDAD FROM dieta WHERE id_paciente = ? AND fecha_final > CURRENT_DATE(); ";

        boolean resultado = false;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_paciente);
            ResultSet rs = ps.executeQuery();
//            int cantidad = rs.getInt(0);
//            JOptionPane.showMessageDialog(null, cantidad);
            if (rs.next()) {
                int cantidad = rs.getInt(1);
                if (cantidad > 0) {
                    resultado = true;
                }
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }

        return resultado;
    }

    public void finalizarDieta(int id_dieta) {
        String sql = "UPDATE dieta SET fecha_final= CURRENT_DATE()  WHERE id_dieta= ? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_dieta);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "DIETA FINALIZADA EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "LA DIETA NO EXISTE");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "debe ser un número");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }
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
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA DIETA" + ex.getMessage());
        }

    }

    public List<Dieta> listarDietasFinalizadasPorPaciente(int id) {
        List<Dieta> dietas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dieta WHERE id_paciente=? AND fecha_final <= CURRENT_DATE() ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac = pD.buscarPacientePorId(rs.getInt("id_paciente"));
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

    public List<Dieta> listarDietasNOFinalizadasPorPaciente(int id) {
        List<Dieta> dietas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM dieta WHERE id_paciente=? AND fecha_final > CURRENT_DATE() ";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setId_dieta(rs.getInt("id_dieta"));
                dieta.setNombre_dieta(rs.getString("nombre_dieta"));
                Paciente pac = pD.buscarPacientePorId(rs.getInt("id_paciente"));
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

    public List<Reporte> reporteDietasFinalizadasSinExitoBP() {
        List<Reporte> reportes = new ArrayList<>();

        try {
            String sql = " SELECT * FROM dieta, historial "
                    + " WHERE dieta.id_paciente=historial.id_paciente "
                    + " AND fecha_final <= CURRENT_DATE() "
                    + " AND dieta.peso_final < dieta.peso_inicial "
                    + " AND historial.peso_registro >= dieta.peso_final ";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reporte reporte = new Reporte();
                Paciente paciente=new Paciente();
                Paciente_Data pd= new Paciente_Data();
                paciente=pd.buscarPacientePorId(rs.getInt("id_paciente"));
                reporte.setPaciente(paciente);
                reporte.setPesoObjetivo(rs.getDouble("peso_final"));
                reporte.setUltimoPesoRegistro(rs.getDouble("peso_registro"));
                reporte.setDiferencia(Math.abs(Math.round(rs.getDouble("peso_final") - rs.getDouble("peso_registro"))));
                reportes.add(reporte);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA " + ex.getMessage());
        }

        return reportes;
    }
    
    public List<Reporte> reporteDietasFinalizadasSinExitoSP() {
        List<Reporte> reportes1 = new ArrayList<>();

        try {
            String sql = " SELECT * FROM dieta, historial "
                    + " WHERE dieta.id_paciente=historial.id_paciente "
                    + " AND fecha_final <= CURRENT_DATE() "
                    + " AND dieta.peso_final > dieta.peso_inicial "
                    + " AND historial.peso_registro <= dieta.peso_final ";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reporte reporte = new Reporte();
                Paciente paciente=new Paciente();
                Paciente_Data pd= new Paciente_Data();
                paciente=pd.buscarPacientePorId(rs.getInt("id_paciente"));
                reporte.setPaciente(paciente);
                reporte.setPesoObjetivo(rs.getDouble("peso_final"));
                reporte.setUltimoPesoRegistro(rs.getDouble("peso_registro"));
                reporte.setDiferencia(Math.abs(Math.round(rs.getDouble("peso_final") - rs.getDouble("peso_registro"))));
                reportes1.add(reporte);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA " + ex.getMessage());
        }

        return reportes1;
    }

}

