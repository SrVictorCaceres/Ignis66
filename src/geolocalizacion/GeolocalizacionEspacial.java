package geolocalizacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GeolocalizacionEspacial {

    private Connection conexion;

    public GeolocalizacionEspacial(Connection conexion) {
        this.conexion = conexion;
    }
// NUNCA CREÍ LLEGAAR ACÁ, NO TENGO IDEA SI ESTOY HACIENDO BIEN O NO, SI LE ESTOY TIRANDO TIERRA AL AGUA
// YA NO ME DA LA CAABEZA, HASTA ACÁ LLEGUE, CAPAZ MODIFICANDO LA BASE DE DATOS DE GEOMETRY A DOUBLE
    // CAPAZZ PASA POR AHÍ EL PROBLEMA MAS GRANDE
    public double calcularDistanciaEntrePuntos(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2) {
        try {
            String sql = "SELECT ST_Distance(Point(?, ?), Point(?, ?)) AS distancia";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setDouble(1, coordenadaX1);
            statement.setDouble(2, coordenadaY1);
            statement.setDouble(3, coordenadaX2);
            statement.setDouble(4, coordenadaY2);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getDouble("distancia");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1; // Si hay un error, devuelve valor negativo
    }

    // Otros métodos relacionados con geolocalización
}