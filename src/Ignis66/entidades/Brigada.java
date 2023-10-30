package Ignis66.entidades;

public class Brigada {

    private int idBrigada;
    private String nombreBrigada;
    private int bombero1;
    private int bombero2;
    private int bombero3;
    private int bombero4;
    private int bombero5;
    private String especialidad;
    private int idCuartel;
    private Siniestro siniestro;
    private String activo;
    private String libre;

    public Brigada(String nombreBrigada, int b1, int b2, int b3, int b4, int b5, String especialidad, String activo, String libre) {
        this.nombreBrigada = nombreBrigada;
        this.bombero1 = b1;
        this.bombero2 = b2;
        this.bombero3 = b3;
        this.bombero4 = b4;
        this.bombero5 = b5;
        this.especialidad = especialidad;
        this.activo = activo;
        this.libre = libre;
    }

    public Brigada(int idBrigada, String nombreBrigada, String especialidad, int idCuartel, Siniestro siniestro, String activo, String libre) {
        this.idBrigada = idBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.idCuartel = idCuartel;
        this.siniestro = siniestro;
        this.activo = activo;
        this.libre = libre;
    }

    public Brigada(int idBrigada, String nombreBrigada, String especialidad, int idCuartel, String activo, String libre) {
        this.idBrigada = idBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.idCuartel = idCuartel;
        this.activo = activo;
        this.libre = libre;
    }

    public Brigada() {
    }

    public Brigada(int idBrigada, String nombreBrigada) {
        this.idBrigada = idBrigada;
        this.nombreBrigada = nombreBrigada;
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

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getLibre() {
        return libre;
    }

    public void setLibre(String libre) {
        this.libre = libre;
    }

    public int getBombero1() {
        return bombero1;
    }

    public void setBombero1(int bombero1) {
        this.bombero1 = bombero1;
    }

    public int getBombero2() {
        return bombero2;
    }

    public void setBombero2(int bombero2) {
        this.bombero2 = bombero2;
    }

    public int getBombero3() {
        return bombero3;
    }

    public void setBombero3(int bombero3) {
        this.bombero3 = bombero3;
    }

    public int getBombero4() {
        return bombero4;
    }

    public void setBombero4(int bombero4) {
        this.bombero4 = bombero4;
    }

    public int getBombero5() {
        return bombero5;
    }

    public void setBombero5(int bombero5) {
        this.bombero5 = bombero5;
    }

    @Override
    public String toString() {
        return "Brigada{" +
                "idBrigada=" + idBrigada +
                ", nombreBrigada='" + nombreBrigada + '\'' +
                ", bombero1=" + bombero1 +
                ", bombero2=" + bombero2 +
                ", bombero3=" + bombero3 +
                ", bombero4=" + bombero4 +
                ", bombero5=" + bombero5 +
                ", especialidad='" + especialidad + '\'' +
                ", idCuartel=" + idCuartel +
                ", siniestro=" + siniestro +
                ", activo='" + activo + '\'' +
                ", libre='" + libre + '\'' +
                '}';
    }
}