package Ignis66.entidades;

public class Movil {
    private int idMovil;
    private String tipoVehiculo;
    private String patente;
    private int añoModelo;
    private int tripulantes;
    private String estado;
    private Brigada brigada;

    public Movil() {
     
    }

    public Movil(int idMovil, String tipoVehiculo, String patente, int añoModelo, int tripulantes, String estado, Brigada brigada) {
        this.idMovil = idMovil;
        this.tipoVehiculo = tipoVehiculo;
        this.patente = patente;
        this.añoModelo = añoModelo;
        this.tripulantes = tripulantes;
        this.estado = estado;
        this.brigada = brigada;
    }

    
    public int getIdMovil() {
        return idMovil;
    }

    public void setIdMovil(int idMovil) {
        this.idMovil = idMovil;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAñoModelo() {
        return añoModelo;
    }

    public void setAñoModelo(int añoModelo) {
        this.añoModelo = añoModelo;
    }

    public int getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(int tripulantes) {
        this.tripulantes = tripulantes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    
}