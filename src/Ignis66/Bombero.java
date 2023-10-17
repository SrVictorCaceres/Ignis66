
package Ignis66;

import java.time.LocalDate;

public class Bombero {
    
    private int idBombero;  
    private int dni;  
    private String nombreCompleto;  /// Concatenación del Nombre y el Apellido ///
    private String grupoSanguineo;  /// Combo Box con las opciones: A+, A- , B+, B- , AB+ , AB-, O+ y O-  //
    private LocalDate fechaNacimiento;
    private String fijo;
    private String celular;
    private String rango;   /* BOMBERO, CABO, CABO PRIMERO, SARGENTO, SARGENTO 1°, SUBOFICIAL PRINCIPAL, SUBOFICIAL MAYOR, OFICIAL AYUDANTE, OFICIAL INSPECTOR, 
    OFICIAL PRINCIPAL, SUBCOMANDANTE, COMANDANTE, COMANDANTE MAYOR, COMANDANTE GENERAL*/
    private String tipo;  /// Zapador o Voluntario //
    private String sexo;  // Femenino, Masculino o No Binario (o cambiar por "Otros") //
    private String correo;
    private Brigada brigada;  
    private String estado;

    public Bombero() {
    }

    public Bombero(int dni, String nombreCompleto, String grupoSanguineo, LocalDate fechaNacimiento, String celular, String fijo, String rango, String tipo, String sexo, String correo, String estado) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.fijo = fijo;
        this.rango = rango;
        this.tipo = tipo;
        this.sexo = sexo;
        this.correo = correo;
        this.estado = estado;
    }
    
    
    
    public int getIdBombero() {
        return idBombero;
    }

    public void setIdBombero(int idBombero) {
        this.idBombero = idBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }



    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



    
    
}


