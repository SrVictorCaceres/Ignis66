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
import geolocalizacion.GeolocalizacionEspacial;

public class SiniestroData {
    private Connection conexion;

    public SiniestroData(Connection conexion) {
        this.conexion = conexion;
    }
    
    public double calcularDistanciaEntrePuntos(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2) {
        GeolocalizacionEspacial geolocalizacion = new GeolocalizacionEspacial(conexion);
        return geolocalizacion.calcularDistanciaEntrePuntos(coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2);
    }

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
        try {
            String sql = "SELECT * FROM siniestros WHERE idSiniestro = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idSiniestro);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
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
                return siniestro;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

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

    public Brigada buscarBrigadaPorId(int idBrigada) {
        try {
            String sql = "SELECT * FROM brigadas WHERE idBrigada = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idBrigada);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Brigada brigada = new Brigada();
                brigada.setIdBrigada(resultSet.getInt("idBrigada"));
              
                return brigada;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void asignarBrigadaASiniestro(int idSiniestro, int idBrigada) {
        try {
            Siniestro siniestro = buscarSiniestroPorId(idSiniestro);
            Brigada brigada = buscarBrigadaPorId(idBrigada);

            if (siniestro != null && brigada != null) {
                siniestro.setIdBrigada(idBrigada);

                String sql = "UPDATE siniestros SET idBrigada = ? WHERE idSiniestro = ?";
                PreparedStatement statement = conexion.prepareStatement(sql);
                statement.setInt(1, idBrigada);
                statement.setInt(2, idSiniestro);
                statement.executeUpdate();
            } else {
                System.err.println("No se pudo asignar la brigada al siniestro. Verifique que el siniestro y la brigada existan.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

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