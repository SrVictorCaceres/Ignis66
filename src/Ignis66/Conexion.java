
package Ignis66;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    public static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="gestionbomberos";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection cn;
            
            private Conexion(){}
            
            public static Connection getConexion(){
                
            if(cn==null){
                try{
            Class.forName("org.mariadb.jdbc.Driver");
            cn=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
            JOptionPane.showMessageDialog(null,"Conectado a la BD "+DB);
            
            }catch(ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null,"Error al cargar los drivers ");
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + ex.getMessage());
        }
                }
            
            return cn;
            }
}
