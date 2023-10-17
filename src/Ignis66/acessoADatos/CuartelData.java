package Ignis66.acessoADatos;

import Ignis66.entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.WKTReader;*/
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @authors GRUPO 66 ULP
 */
public class CuartelData {

    private Connection con = null;

    private void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public CuartelData() {
        con = Conexion.getConexion();

    }

    public void altaCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel (idCuartel, nombreCuartel,direccion, telefono,,coordenadaX,coordenadaY,correo,estado)"
                + "+ VALUES (?,?,?,?,?,?,?,?)";

        /*                Geometry geometry = new WKTReader().read("POINT(10 20)");*/
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cuartel.getIdCuartel());
            ps.setString(2, cuartel.getNombreCuartel());
            ps.setString(3, cuartel.getDireccion());
            ps.setString(4, cuartel.getTelefono());
            ps.setInt(5, cuartel.getCoordenadaX());
            ps.setInt(6, cuartel.getCoodenadaY());
            ps.setString(7, cuartel.getCorreo());
            ps.setString(8, cuartel.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                mensaje("El cuartel fue ingresado correctamente en la BD");

            }
            ps.close();

        } catch (SQLException ex) {
            mensaje("ERROR, El cuartel no pudo ser ingresado correctamente a la BD");

        }

    }

    ;
    public Cuartel buscarCuartel(int idCuartel) {
        String sql = "SELECT  nombreCuartel,direccion, telefono,,coordenadaX,coordenadaY,correo,estado WHERE idCuartel=?";
        Cuartel cuartel = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCuartel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setIdCuartel(idCuartel);
                cuartel.setNombreCuartel(rs.getString("nombre"));
                cuartel.setDireccion(rs.getString("nombreCuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCoordenadaX(rs.getInt("coordenadaX"));
                cuartel.setCoodenadaY(rs.getInt("coordenadaY"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setEstado(rs.getString("estado"));

            } else {
                mensaje("El cuartel buscado no existe en la BD");

            }
        } catch (SQLException ex) {
            mensaje("Error  al intentar acceder a la tabla Cuartel en la BD");

        }
        return cuartel;
    }
}
