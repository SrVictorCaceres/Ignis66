
package Ignis66.acessoADatos;

import Ignis66.entidades.Brigada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BrigadaData {
    
    private Connection con;

    public BrigadaData() {
        con = Conexion.getConexion();
    }
    
    public void agregarBrigada(Brigada brigada, int id){
       
    try{    
        String sql = "INSERT Into brigada(nombreBrigada, especialidad, libre, estado, idCuartel) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, brigada.getNombreBrigada());
        ps.setString(2, brigada.getEspecialidad());
        ps.setBoolean(3, brigada.isLibre());
        ps.setBoolean(4, brigada.isActivo());
        ps.setInt(5, id);
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
    
    public ArrayList<Brigada> brigadasLibres(){
        
        ArrayList<Brigada> lista = new ArrayList();
        String sql = "SELECT * FROM brigada WHERE libre = 1";
        
    try{    
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
             lista.add(new Brigada(rs.getInt("idBrigada"), rs.getString("nombreBrigada"), rs.getString("especialidad"), rs.getInt("idCuartel"), rs.getBoolean("libre"), rs.getBoolean("estado")));
        }
        
        ps.close();
        
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, "Error en la busqueda de Brigadas " + sqle.getMessage());
       } 
    
        return lista;
    }
    
    
}
