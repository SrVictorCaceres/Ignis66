
package Ignis66.acessoADatos;




import Ignis66.acessoADatos.Conexion;
import Ignis66.acessoADatos.Conexion;
import Ignis66.entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author fdicoccoX
 */
public class BomberoData {
    private Connection con=null;
 
    
public BomberoData(){
     con=Conexion.getConexion();
    }
    
public void altaBombero(Bombero bombero){
     String sql = "INSERT INTO bomberos (dni, nombreCompleto, fechaNacimiento, grupoSanguineo, fijo, celular, sexo, correo, tipoBombero, rango, estado, especialidad) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
           
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, bombero.getDni());
            ps.setString(2, bombero.getNombreCompleto());
            ps.setDate(3, Date.valueOf(bombero.getFechaNacimiento()));    
            ps.setString(4, bombero.getGrupoSanguineo());
            ps.setString(5, bombero.getFijo());
            ps.setLong(6, bombero.getCelular());
            ps.setString(7, bombero.getSexo());        
            ps.setString(8, bombero.getCorreo());         
            ps.setString(9, bombero.getTipo());
            ps.setString(10, bombero.getRango());    
            ps.setString(11, bombero.getEstado());                
            ps.setString(12, bombero.getEspecialidad());    
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
                  if (rs.next()){

                    JOptionPane.showMessageDialog(null,"El bombero " +bombero.getNombreCompleto() +" ha sido ingresado correctamente en la Base de Datos");
                  }
                  
                  ps.close();

                  } catch (SQLException ex) {
                  JOptionPane.showMessageDialog(null, "Error!! No se pudo ingresar el bombero " +bombero.getNombreCompleto() +" en la Base de Datos");
                  } catch (NullPointerException nx){
                      JOptionPane.showMessageDialog(null, "Error!! Debe completar todos los campos obligatorios");
                  }
    }

public void bajaBombero(int idBombero){
    
    String sql = "UPDATE bomberos SET estado = ? WHERE idBombero = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        
                        ps.setString(1, "Inactivo");
                        ps.setInt(2, idBombero);
             
             int check = ps.executeUpdate();
             if (check > 0) {
                 JOptionPane.showMessageDialog(null, "El bombero ha sido dado de baja (Estado Inactivo)");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla. No se pudo ejecutar la baja.");
                }
     
     };  // ok en Main , pero no se utiliza por el momento. 

public void modificarDatosBombero(Bombero bombero, int idBombero){
    
    String sql = "UPDATE bomberos SET dni = ?, nombreCompleto = ?, fechaNacimiento = ?, grupoSanguineo = ?, fijo = ?, celular = ?, sexo = ?, correo = ?,"
            + " tipoBombero = ?, rango = ?, estado = ?, especialidad = ?  WHERE idBombero = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1,bombero.getDni());
                        ps.setString(2, bombero.getNombreCompleto());
                        ps.setDate(3, Date.valueOf(bombero.getFechaNacimiento()));    
                        ps.setString(4, bombero.getGrupoSanguineo());
                        ps.setString(5, bombero.getFijo());
                        ps.setLong(6, bombero.getCelular());
                        ps.setString(7, bombero.getSexo());        
                        ps.setString(8, bombero.getCorreo());         
                        ps.setString(9, bombero.getTipo());
                        ps.setString(10, bombero.getRango());         
                        ps.setString(11, bombero.getEstado());         
                        ps.setString(12, bombero.getEspecialidad());   
                        ps.setInt(13,idBombero);
             
             int check = ps.executeUpdate();
             if (check > 0) {
                 JOptionPane.showMessageDialog(null, "Los datos del bombero han sido actualizados!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla. Los datos no han sido modificados");
                }
     
     };  // ok en Main   

 public ArrayList<Bombero> listarBomberos() {
        ArrayList<Bombero> lista = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement("SELECT idBombero, dni, nombreCompleto FROM bomberos")) {
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    
                    lista.add(new Bombero(rs.getInt("idBombero"), rs.getInt("dni"), rs.getString("nombreCompleto")));
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla!!");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla!!");
        }
        
        return lista;
    }  //ok
 
 public Bombero traerDatos(int idBombero){
         String sql = "SELECT nombreCompleto, dni, sexo, fechaNacimiento, grupoSanguineo, celular, fijo, correo, tipoBombero, rango, estado, especialidad FROM bomberos WHERE idBombero = ?";
         Bombero bomber = null;   
         try{
        PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
        ps.setInt(1, idBombero);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            
            bomber = new Bombero();
            bomber.setNombreCompleto(rs.getString("nombreCompleto"));
            bomber.setDni(rs.getInt("dni"));
            bomber.setSexo(rs.getString("sexo"));
            bomber.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            bomber.setGrupoSanguineo(rs.getString("grupoSanguineo"));
            bomber.setCelular(rs.getInt("celular"));
            bomber.setFijo(rs.getString("fijo"));
            bomber.setCorreo(rs.getString("correo"));
            bomber.setTipo(rs.getString("tipoBombero"));
            bomber.setRango(rs.getString("rango"));
            bomber.setEstado(rs.getString("estado"));
            bomber.setEspecialidad(rs.getString("especialidad"));
            
            }else{
                JOptionPane.showMessageDialog(null, "El bombero buscado no existe.");}
            rs.close();
            ps.close();
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Error en la carga de datos ");
        }
        return bomber;
         
                 }

  public void asignarBomberoABrigada(int idBrigada, int idBombero){
      
        String sql = "UPDATE bomberos SET idBrigada = ?  WHERE idBombero = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1,idBrigada);
                        ps.setInt(2,idBombero);
                        
             
             int check = ps.executeUpdate();
             if (check > 0) {
                 JOptionPane.showMessageDialog(null, "Brigada asignada correctamente!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar asignar a una Brigada");
                }
  }
     
   public void quitarBomberoDeBrigada(int idBombero){
         
        String sql = "UPDATE bomberos SET idBrigada = ?  WHERE idBombero = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1,9999);
                        ps.setInt(2,idBombero);
                        
             
             int check = ps.executeUpdate();
             if (check > 0) {
                 JOptionPane.showMessageDialog(null, "El bombero ya no pertenece a ninguna Brigada!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar quitar al bombero de la Brigada");
                } 
                
                
     };  // ok en Main   
      
    public ArrayList<Bombero> listarBomberosPorEspecialidad(String especialidad) {
        ArrayList<Bombero> lista = new ArrayList<>();
        try (PreparedStatement ps = con.prepareStatement("SELECT idBombero, dni, nombreCompleto FROM bomberos WHERE especialidad = ? AND idBrigada = 9999")) {
             
            ps.setString(1, especialidad);
            try (ResultSet rs = ps.executeQuery();) {
                while (rs.next()) {
                    
                    lista.add(new Bombero(rs.getInt("idBombero"), rs.getInt("dni"), rs.getString("nombreCompleto")));
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
