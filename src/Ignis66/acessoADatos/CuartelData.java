package Ignis66.acessoADatos;

import Ignis66.acessoADatos.Conexion;
import Ignis66.entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
/*import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.io.WKTReader;*/
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String sql = "INSERT INTO Cuartel (nombreCuartel,direccion, Ciudad,Provincia,telefono,coordenadaX,coordenadaY,correo,estado) VALUES (?,?,?,?,?,?,?,?,?)";

        /*                Geometry geometry = new WKTReader().read("POINT(10 20)");*/
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
          /*ps.setInt(1, cuartel.getIdCuartel());*/
            ps.setString(1, cuartel.getNombreCuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setString(3, cuartel.getCiudad());
            ps.setString(4, cuartel.getProvincia());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCoordenadaX());
            ps.setString(7, cuartel.getCoordenadaY());
            ps.setString(8, cuartel.getCorreo());
            ps.setString(9, cuartel.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {

                mensaje("El cuartel " +cuartel.getNombreCuartel()+ " fue ingresado correctamente en la BD");
             ps.close();
            }else{
            mensaje("No hay datos para grabar en la BD, complete todos los campos obligatorios");
            }
          
        
        } catch (SQLException ex) {
            mensaje("ERROR, El cuartel " +cuartel.getNombreCuartel()+ " no pudo ser ingresado correctamente a la BD");

        }    catch (NullPointerException nx){
                      mensaje("Error!! Debe completar todos los campos obligatorios");
        }
    };
    
  /*  public void bajaCuartel(int idCuartel){
    
    String sql = "UPDATE Cuartel SET estado = 'INACTIVO' WHERE idCuartel = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        
                        ps.setString(1, "INACTIVO");
                        ps.setInt(2, idCuartel);
             
             int check = ps.executeUpdate();
             if (check > 0) {
               mensaje( "El Cuartel ha sido dado de baja (Estado Inactivo)");}
             ps.close();
                } catch (SQLException ex) {
            mensaje("Error al intentar acceder a la tabla. No se pudo ejecutar la baja.");
                }
     
     };*/
    
     public void eliminaCuartel(Cuartel cuartel, int idCuartel){
    
    String sql = "UPDATE Cuartel SET estado = 'INACTIVO' WHERE idCuartel = ?";
          
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                         ps.setInt(1, idCuartel);
                        int check = ps.executeUpdate();
             if (check > 0) {
               mensaje( "El Cuartel ha sido dado de baja (Estado Inactivo)");}
             ps.close();
                        
                }catch (Exception e){
              
                    JOptionPane.showMessageDialog(null,e + " No fue Posible Eliminar el cuartel seleccionado");
                }
     }   
    
    public Cuartel buscarCuartel(int idCuartel) {
        String sql = "SELECT  idCuartel,nombreCuartel,direccion,Ciudad,Provincia, telefono,coordenadaX,coordenadaY,correo,estado FROM cuartel WHERE idCuartel=?";
        Cuartel cuartel = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCuartel);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setIdCuartel(idCuartel);
                cuartel.setNombreCuartel(rs.getString("nombreCuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCiudad(rs.getString("Ciudad"));
                cuartel.setProvincia(rs.getString("Provincia"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCoordenadaX(rs.getString("coordenadaX"));
                cuartel.setCoordenadaY(rs.getString("coordenadaY"));
                cuartel.setCorreo(rs.getString("correo"));
                cuartel.setEstado(rs.getString("estado"));

            } else {
                mensaje("El cuartel buscado no existe en la BD");
rs.close();
ps.close();
            }
        } catch (SQLException ex) {
            mensaje("Error  al intentar acceder a la tabla Cuartel en la BD");

        }
        return cuartel;
    }
public void modificarCuartel(Cuartel cuartel, int idCuartel){
    
    String sql = "UPDATE cuartel SET NombreCuartel = ?, Direccion = ?, Ciudad = ?, Provincia = ?, Telefono = ?, CoordenadaX = ?, CoordenadaY = ?, correo = ?,"
            + " estado = ? WHERE idCuartel = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql);
                     
                        ps.setString(1,cuartel.getNombreCuartel());
                        ps.setString(2, cuartel.getDireccion());    
                        ps.setString(3, cuartel.getCiudad());
                        ps.setString(4, cuartel.getProvincia());
                        ps.setString(5,  cuartel.getTelefono());
                        ps.setString(6, cuartel.getCoordenadaX());        
                        ps.setString(7, cuartel.getCoordenadaY());         
                        ps.setString(8, cuartel.getCorreo());
                        ps.setString(9, cuartel.getEstado());         
                          ps.setInt(10,idCuartel);           
             int check = ps.executeUpdate();
             if (check > 0) {
                mensaje( "Los datos del cuartel, han sido actualizados!!");}
             ps.close();
                } catch (SQLException ex) {
            mensaje( "Error al intentar acceder a la tabla cuartel. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
            mensaje("Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           mensaje("Debe completar correctamente todos los campos obligatorios");}
     };
    
  public ArrayList<Cuartel> listarCuartel() {
        ArrayList<Cuartel> lista = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement("SELECT idCuartel,nombreCuartel,direccion,Ciudad,estado FROM cuartel")) {
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    
                    lista.add(new Cuartel(rs.getInt("idCuartel"),rs.getString("nombreCuartel"),rs.getString("direccion"),rs.getString("Ciudad"),rs.getString("estado")));
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla!!");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla!!");
        }
        
        return lista;
    }  //ok
}
