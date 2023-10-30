
package Ignis66.acessoADatos;

import Ignis66.acessoADatos.Conexion;
import Ignis66.entidades.Bombero;
import Ignis66.entidades.Brigada;
import Ignis66.entidades.Cuartel;
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
        ps.setString(3, "LIBRE");
        ps.setString(4, "ACTIVO");
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
        String sql = "SELECT * FROM brigada WHERE libre = LIBRE";
        
    try{    
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
             lista.add(new Brigada(rs.getInt("idBrigada"), rs.getString("nombreBrigada"), rs.getString("especialidad"), rs.getInt("idCuartel"), rs.getString("LIBRE"), rs.getString("ACTIVO")));
        }
        
        ps.close();
        
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, "Error en la busqueda de Brigadas " + sqle.getMessage());
       } 
    
        return lista;
    }
    
     public ArrayList<Brigada> brigadasTodas(){
        
        ArrayList<Brigada> lista = new ArrayList();
        String sql = "SELECT * FROM brigada, cuartel WHERE brigada.idCuartel = cuartel.idCuartel";
        
    try{    
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
             lista.add(new Brigada(rs.getInt("idBrigada"), rs.getString("nombreBrigada"), rs.getString("especialidad"), rs.getInt("idCuartel"), rs.getString("libre"), rs.getString("estado")));
        }
        
        ps.close();
        
       }catch(SQLException sqle){
           JOptionPane.showMessageDialog(null, "Error en la busqueda de Brigadas " + sqle.getMessage());
       } 
    
        return lista;
    }
    
     public String traerNombreCuartel(int idCuartel){
         String nombre = null;
         String sql = "SELECT nombreCuartel FROM cuartel WHERE idCuartel = ?";
         Cuartel cuartel = null;   
         try{
        PreparedStatement ps = Conexion.getConexion().prepareStatement(sql);
        ps.setInt(1, idCuartel);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            
            cuartel = new Cuartel();
            cuartel.setNombreCuartel(rs.getString("nombreCuartel"));
            nombre = rs.getString("nombreCuartel");
            
            }else{
                JOptionPane.showMessageDialog(null, "El Cuartel buscado no existe.");}
            rs.close();
            ps.close();
        }catch(SQLException sqle){
            JOptionPane.showMessageDialog(null, "Error en la carga de datos ");
        }
        return nombre;
         
     }
    
     public void cargarBrigada(Brigada brigada, int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero1 = ?, idBombero2 = ?, idBombero3 = ?, idBombero4 = ?, idBombero5 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, brigada.getBombero1());
                        ps.setInt(2, brigada.getBombero2());
                        ps.setInt(3, brigada.getBombero3());
                        ps.setInt(4, brigada.getBombero4());
                        ps.setInt(5, brigada.getBombero5());
                        ps.setInt(6, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "Los bomberos de la Brigada han sido cargados!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
     
      public Brigada buscarBrigada(int idBrigada) {
        String sql = "SELECT idBrigada, nombreBrigada, especialidad, idBombero1, idBombero2, idBombero3, idBombero4, idBombero5, libre, estado, idCuartel FROM brigada WHERE idBrigada=?";
        Brigada brigada = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idBrigada);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                brigada = new Brigada();
                brigada.setIdBrigada(idBrigada);
                brigada.setNombreBrigada(rs.getString("nombreBrigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setBombero1(rs.getInt("idBombero1"));
                brigada.setBombero2(rs.getInt("idBombero2"));
                brigada.setBombero3(rs.getInt("idBombero3"));
                brigada.setBombero4(rs.getInt("idBombero4"));
                brigada.setBombero5(rs.getInt("idBombero5"));
                brigada.setLibre(rs.getString("libre"));
                brigada.setActivo(rs.getString("estado"));                
                brigada.setIdCuartel(rs.getInt("idCuartel"));


            } else {
                JOptionPane.showMessageDialog(null,"El cuartel buscado no existe en la BD");
        rs.close();
        ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error  al intentar acceder a la tabla Cuartel en la BD");

        }
        return brigada;
    }
     
      public void vaciarBrigada( int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero1 = ?, idBombero2 = ?, idBombero3 = ?, idBombero4 = ?, idBombero5 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, 0);
                        ps.setInt(2, 0);
                        ps.setInt(3, 0);
                        ps.setInt(4, 0);
                        ps.setInt(5, 0);
                        ps.setInt(6, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "La Brigada está vacía!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
      
        public void quitarBombero1DeBrigada( int idBombero ,int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero1 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, 0);
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "El bombero ha salido removido de la Brigada!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
        
        public void quitarBombero2DeBrigada( int idBombero ,int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero2 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, 0);
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "El bombero ha salido removido de la Brigada!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
      
        public void quitarBombero3DeBrigada( int idBombero ,int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero3 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, 0);
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "El bombero ha salido removido de la Brigada!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };

        public void quitarBombero4DeBrigada( int idBombero ,int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero4 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, 0);
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "El bombero ha salido removido de la Brigada!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
        
        public void quitarBombero5DeBrigada( int idBombero ,int idBrigada){
           
    String sql = "UPDATE brigada SET idBombero5 = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setInt(1, 0);
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) {
                JOptionPane.showMessageDialog(null, "El bombero ha salido removido de la Brigada!!");}
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
        
        public void desactivarBrigada( int idBrigada){
           
    String sql = "UPDATE brigada SET estado = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setString(1, "INACTIVA");
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) 
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
        
           public void activarBrigada( int idBrigada){
           
    String sql = "UPDATE brigada SET estado = ? WHERE idBrigada = ? ";
                try {
                        PreparedStatement ps = con.prepareStatement(sql); 
                        ps.setString(1, "ACTIVA");
                        ps.setInt(2, idBrigada);
             
                    
                                    
             int check = ps.executeUpdate();
             if (check > 0) 
             ps.close();
                } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar acceder a la tabla Brigada. Los datos no han sido modificados");
                }
     catch (NumberFormatException ne) {
           JOptionPane.showMessageDialog(null,"Error al intentar guardar el Registro. Intente nuevamente.");
        }catch(NullPointerException np){
           JOptionPane.showMessageDialog(null,"Debe completar correctamente todos los campos obligatorios");}
     };
}
