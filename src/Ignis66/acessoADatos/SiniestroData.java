
package Ignis66.acessoADatos;

import Ignis66.entidades.Brigada;
import Ignis66.entidades.Siniestro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SiniestroData {
    private Connection conexion;
    private int calificacion;
    private LocalDateTime fechaResolucion;

    public SiniestroData(Connection conexion) {
        this.conexion = conexion;
        
    }

    //metodo para asignar brigadas
    // Método para agregar siniestro a la base de datos
    public void agregarSiniestro(Siniestro siniestro) {
        try {
            String sql = "INSERT INTO siniestros (fechaSiniestro, coordenadaX, coordenadaY, tipo, detalles, idBrigada) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setObject(1, siniestro.getFechaSiniestro());
            statement.setDouble(2, siniestro.getCoordenadaX());
            statement.setDouble(3, siniestro.getCoordenadaY());
            statement.setString(4, siniestro.getTipo());
            statement.setString(5, siniestro.getDetalles());
            statement.setInt(6, siniestro.getIdBrigada());
            statement.executeUpdate();
            
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                siniestro.setIdSiniestro(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Siniestro buscarSiniestroPorId(int idSiniestro) {
        Iterable<Siniestro> siniestros = null;
        for (Siniestro siniestro : siniestros) {
            if (siniestro.getIdSiniestro() == idSiniestro) {
                return siniestro;
            }
        }
        return null; // Si no se encuentra el siniestro, devuelve null
    }

    // Método para marcar un siniestro como que ya está resuelto
    public void marcarSiniestroComoResuelto(Siniestro siniestro, LocalDateTime fechaResolucion, int puntuacion) {
        try {
            String sql = "UPDATE siniestros SET fechaResolucion = ?, puntuacion = ? WHERE idSiniestro = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setObject(1, fechaResolucion);
            statement.setInt(2, puntuacion);
            statement.setInt(3, siniestro.getIdSiniestro());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Método para asignar calificación
    public void asignarCalificacion(int calificacion) {
        if (calificacion >= 1 && calificacion <= 10) {
            this.calificacion = calificacion;
            this.fechaResolucion = LocalDateTime.now(); // Establecer la fecha de resolución al asignar la calificación
        } else {
            // Manejar un valor de calificación inválido
            System.out.println("La calificación debe estar en el rango de 1 a 10.");
        }
    }
    public void asignarBrigada(int idSiniestro, int idBrigada) {
    // Acá aplicamos la lógica que corresponda para asignar una brigada a un siniestro
    // Por ejemplo buscar el siniestro por su ID en una lista o base de datos,
    // y luego asignar la brigada que corresponda.

    Siniestro siniestro = buscarSiniestroPorId(idSiniestro); 
    Brigada brigada = buscarBrigadaPorId(idBrigada); 

    if (siniestro != null && brigada != null) {
        siniestro.setIdBrigada(idBrigada);
        // También see puede poner la fecha de asignación o algo para complementar mass info
    } else {
        // Manejar el caso cuando el siniestro o la brigada no se encuentren
        // o realizar alguna validación, no se se me ocurre
    }
    
   }
    public Brigada buscarBrigadaPorId(int idBrigada) {
        Iterable<Brigada> brigadas = null;
        for (Brigada brigada : brigadas) {
            if (brigada.getIdBrigada() == idBrigada) {
                return brigada;
            }
        }
        return null; // Si no se encuentra la brigada, devuelve null
    }

    // Método para obtener lista de siniestros que ocurrieron entre dos fechas
    public List<Siniestro> obtenerSiniestrosEntreFechas(LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        List<Siniestro> siniestros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM siniestros WHERE fechaSiniestro BETWEEN ? AND ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setObject(1, fechaInicio);
            statement.setObject(2, fechaFin);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Siniestro siniestro = new Siniestro();
                siniestro.setIdSiniestro(resultSet.getInt("idSiniestro"));
                siniestro.setFechaSiniestro(resultSet.getObject("fechaSiniestro", LocalDateTime.class));
                siniestro.setCoordenadaX(resultSet.getDouble("coordenadaX"));
                siniestro.setCoordenadaY(resultSet.getDouble("coordenadaY"));
                siniestro.setTipo(resultSet.getString("tipo"));
                siniestro.setDetalles(resultSet.getString("detalles"));
                siniestro.setFechaResolucion(resultSet.getObject("fechaResolucion", LocalDateTime.class));
                siniestro.setPuntuacion(resultSet.getInt("puntuacion"));
                siniestro.setIdBrigada(resultSet.getInt("idBrigada"));
                siniestros.add(siniestro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return siniestros;
    }
   
}
