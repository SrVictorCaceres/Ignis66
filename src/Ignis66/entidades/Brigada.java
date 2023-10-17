
package Ignis66.entidades;


public class Brigada {
    
    private int idBrigada;  
    private String nombreBrigada;  
    private Bombero bombero;  
    private String especialidad;
    private int idCuartel;
    private Siniestro siniestro;
    private boolean activo;  
    private boolean libre;

    public Brigada(String nombreBrigada, Bombero b1, Bombero b2, Bombero b3, Bombero b4, Bombero b5, String especialidad, boolean activo, boolean libre){
        this.nombreBrigada = nombreBrigada;
        this.bombero = b1;
        this.bombero = b2;
        this.bombero = b3;
        this.bombero = b4;
        this.bombero = b5;
        this.especialidad = especialidad;
        this.activo = activo;
        this.libre = libre;
    }
    
    public Brigada(int idBrigada, String nombreBrigada, String especialidad, int idCuartel, Siniestro siniestro, boolean activo, boolean libre) {
        this.idBrigada = idBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.idCuartel = idCuartel;
        this.siniestro = siniestro;
        this.activo = activo;
        this.libre = libre;
    }

    public Brigada(int idBrigada, String nombreBrigada, String especialidad, int idCuartel, boolean activo, boolean libre) {
        this.idBrigada = idBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.idCuartel = idCuartel;
        this.activo = activo;
        this.libre = libre;
    }

    public Brigada() {
    }
    
    

    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public Bombero getBombero() {
        return bombero;
    }

    public void setBombero(Bombero bombero) {
        this.bombero = bombero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getIdCuartel() {
        return idCuartel;
    }

    public void setIdCuartel(int idCuartel) {
        this.idCuartel = idCuartel;
    }

    public Siniestro getSiniestro() {
        return siniestro;
    }

    public void setSiniestro(Siniestro siniestro) {
        this.siniestro = siniestro;
    }
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
    
   
    
}
