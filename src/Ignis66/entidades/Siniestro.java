
package Ignis66.entidades;

import java.time.LocalDateTime;

public class Siniestro {
    private int idSiniestro;
    private String tipo;
    private LocalDateTime fechaSiniestro; 
    private double coordenadaX;
    private double coordenadaY;
    private String detalles;
    private LocalDateTime fechaResolucion; 
    private int puntuacion;
    private int idBrigada;

    public Siniestro() {
    }

    public Siniestro(String tipo, double coordenadaX, double coordenadaY){
        this.tipo = tipo;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }
    
    public Siniestro(String tipo, double coordenadaX, double coordenadaY, String detalles) {
        this.tipo = tipo;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaSiniestro = LocalDateTime.now(); //  fecha y hora actual
    }

     // Constructor crea instancias con todos los atributos (para recuperar de la base de datos  o es la idea)
    public Siniestro(int idSiniestro, String tipo, LocalDateTime fechaSiniestro, double coordenadaX, double coordenadaY, String detalles, LocalDateTime fechaResolucion, int puntuacion, int idBrigada) {
        this.idSiniestro = idSiniestro;
        this.tipo = tipo;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.puntuacion = puntuacion;
        this.idBrigada = idBrigada;
    
}

    public int getIdSiniestro() {
        return idSiniestro;
    }

    public void setIdSiniestro(int idSiniestro) {
        this.idSiniestro = idSiniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDateTime fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDateTime fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }

    
    }