package Ignis66.acessoADatos;

import Ignis66.entidades.Movil;
import Ignis66.entidades.Brigada;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovilData {
    private Connection conexion;

    public MovilData(Connection conexion) {
     
        this.conexion = conexion;
    }

    public void agregarMovil(Movil movil) {
         try {
            String sql = "INSERT INTO movil (tipoVehiculo, patente, añoModelo, tripulantes, estado, idBrigada) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, movil.getTipoVehiculo());
            statement.setString(2, movil.getPatente());
            statement.setInt(3, movil.getAñoModelo());
            statement.setInt(4, movil.getTripulantes());
            statement.setString(5, movil.getEstado());
            statement.setInt(6, movil.getBrigada().getIdBrigada());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
     public void darDeBajaMovil(int idMovil) {
        try {
            String sql = "UPDATE movil SET estado = 'Fuera de servicio' WHERE idMovil = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idMovil);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void modificarEstado(int idMovil, String estado) {
        try {
            String sql = "UPDATE movil SET estado = ? WHERE idMovil = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, estado);
            statement.setInt(2, idMovil);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Movil buscarMovil(int idMovil) {
        Movil movil = null;
        try {
            String sql = "SELECT * FROM movil WHERE idMovil = ?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idMovil);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                movil = new Movil();
                movil.setIdMovil(resultSet.getInt("idMovil"));
                movil.setTipoVehiculo(resultSet.getString("tipoVehiculo"));
                movil.setPatente(resultSet.getString("patente"));
                movil.setAñoModelo(resultSet.getInt("añoModelo"));
                movil.setTripulantes(resultSet.getInt("tripulantes"));
                movil.setEstado(resultSet.getString("estado"));
               
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return movil;
    }

    public List<Movil> listarMoviles() {
        List<Movil> moviles = new ArrayList<>();
        try {
            String sql = "SELECT * FROM movil";
            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Movil movil = new Movil();
                movil.setIdMovil(resultSet.getInt("idMovil"));
                movil.setTipoVehiculo(resultSet.getString("tipoVehiculo"));
                movil.setPatente(resultSet.getString("patente"));
                movil.setAñoModelo(resultSet.getInt("añoModelo"));
                movil.setTripulantes(resultSet.getInt("tripulantes"));
                movil.setEstado(resultSet.getString("estado"));
                
                moviles.add(movil);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return moviles;
    }
}