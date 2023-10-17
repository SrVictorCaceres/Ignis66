
package Ignis66;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class BomberoData {
    private Connection con=null;
    private void mensaje(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje);
    }
    
public BomberoData(){
     con=Conexion.getConexion();
    }
    
public void altaBombero(Bombero bombero){
     String sql = "INSERT INTO bomberos (dni, nombreCompleto, fechaNacimiento, grupoSanguineo, fijo, celular, sexo, correo, tipoBombero, rango, estado) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
           
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreCompleto());
            ps.setDate(3, Date.valueOf(bombero.getFechaNacimiento()));    
            ps.setString(4, bombero.getGrupoSanguineo());
            ps.setString(5, bombero.getFijo());
            ps.setString(6, bombero.getCelular());
            ps.setString(7, bombero.getSexo());        
            ps.setString(8, bombero.getCorreo());         
            ps.setString(9, bombero.getTipo());
            ps.setString(10, bombero.getRango());    
            ps.setString(11, bombero.getEstado());                
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
                  if (rs.next()){

                    JOptionPane.showMessageDialog(null,"El bombero " +bombero.getNombreCompleto() +" ha sido ingresado correctamente en la Base de Datos");
                  }
                  
                  ps.close();

                  } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Error!! No se pudo ingresar el bombero " +bombero.getNombreCompleto() +" en la Base de Datos");
         }
    }  
}
