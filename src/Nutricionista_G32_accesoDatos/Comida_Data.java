package Nutricionista_G32_accesoDatos;

import Nutricionista_G32_entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Comida_Data {

    public Comida_Data() {
        con = Conexion.getConexion();
    }

    private Connection con = null;

    public void guardarComida(Comida comida) {

        String sql = " INSERT INTO comida ( nombre_comida, detalle_comida, calorias_comida, estado_comida )"
                + " VALUES (?,?,?,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, comida.getNombre_comida());
            ps.setString(2, comida.getDetalle_comida());
            ps.setInt(3, comida.getCalorias_comida());
            ps.setBoolean(4, comida.isEstado_comida());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                comida.setId_comida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "COMIDA AÑADIDA CON EXITO - I.D.: " + comida.getId_comida());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA COMIDA" + ex.getMessage());
        }
    }

    public Comida buscarComidaPorId(int id_comida) {

        String sql = "SELECT * FROM comida WHERE id_comida = ? ";

        Comida comida = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_comida);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                comida = new Comida();
                comida.setId_comida(rs.getInt("id_comida"));
                comida.setNombre_comida(rs.getString("nombre_comida"));
                comida.setDetalle_comida(rs.getString("detalle_comida"));
                comida.setCalorias_comida(rs.getInt("calorias_comida"));
                comida.setEstado_comida(rs.getBoolean("estado_comida"));

            } else {
                JOptionPane.showMessageDialog(null, "NO EXISTE LA COMIDA CON EL NUMERO INGRESADO ");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA COMIDA" + ex.getMessage());
        }

        return comida;
    }

    public List<Comida> listarComidas() {
        List<Comida> comidas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM comida WHERE estado_comida=1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setId_comida(rs.getInt("id_comidas"));
                comida.setNombre_comida(rs.getString("nombre_comida"));
                comida.setDetalle_comida(rs.getString("detalle_comida"));
                comida.setCalorias_comida(rs.getInt("calorias_comida"));
                comida.setEstado_comida(rs.getBoolean("estado_comida"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA COMIDA" + ex.getMessage());
        }
        return comidas;
    }

    public void modificarComida(Comida comida) {
        String sql = "UPDATE comida SET nombre_comida=?, detalle_comida=?, calorias_comida=? "
                + " WHERE id_comida=? ";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre_comida());
            ps.setString(2, comida.getDetalle_comida());
            ps.setInt(3, comida.getCalorias_comida());
            
            ps.setInt(4, comida.getId_comida());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "COMIDA MODIFICADO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(null, "LA COMIDA NO EXISTE");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA COMIDA" + ex.getMessage());
        }

    }

    public void bajaComida(int id_comida) {
        try {
            String sql = " UPDATE comida SET estado_comida=0 WHERE id_comida=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_comida);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "SE DIÓ DE BAJA CON ÉXITO");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACCEDER A LA TABLA COMIDA" + ex.getMessage());
        }

    }

}
