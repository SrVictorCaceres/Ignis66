
package Ignis66.acessoADatos;

import Ignis66.entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class BrigadaData {
    
    private Connection con;

    public BrigadaData(Connection con) {
        this.con = con;
    }
    
    public void agregarBrigada(Brigada brigada){
       
    try{    
        String sql = "INSERT Into brigada(nombreBrigada, especialidad, libre, estado, idCuartel) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, brigada.getNombreBrigada());
        ps.setString(2, brigada.getEspecialidad());
        ps.setBoolean(3, brigada.isActivo());
        ps.setBoolean(4, brigada.isLibre());
        ps.setInt(5, brigada.getIdCuartel());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        
        while (rs.next()) {
            JOptionPane.showMessageDialog(null, "La brigada " + brigada.getNombreBrigada() + " fue creada con éxito");
        }
        ps.close();
        
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, "Error al cargar brigada " + sqle.getMessage());
       }
    }
    
    public void brigadasLibres(Brigada brigada){
        
        String sql = "SELECT * FROM brigada WHERE libre = 1";
        
    try{    
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            brigada = new Brigada();
            brigada.setIdBrigada(rs.getInt("idBrigada"));
            brigada.setNombreBrigada(rs.getString("nombreBrigada"));
            brigada.setEspecialidad(rs.getString("especialidad"));
            brigada.setLibre(rs.getBoolean("libre"));
            brigada.setActivo(rs.getBoolean("estado"));
            brigada.setIdCuartel(rs.getInt("idCuartel"));   
        }
        
        ps.close();
        
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, "Error en la busqueda de Brigadas " + sqle.getMessage());
       } 
    }
    
}
