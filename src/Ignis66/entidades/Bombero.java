
package Ignis66.entidades;

import Ignis66.entidades.Brigada;
import Ignis66.entidades.Brigada;
import java.time.LocalDate;


public class Bombero {

    private int idBombero;
    private int dni;
    private String nombreCompleto;  /// Concatenación del Nombre y el Apellido ///
    private String grupoSanguineo;  /// Combo Box con las opciones: A+, A- , B+, B- , AB+ , AB-, O+ y O-  //
    private LocalDate fechaNacimiento;
    private String fijo;
    private long celular;
    private String rango;
    /* BOMBERO, CABO, CABO PRIMERO, SARGENTO, SARGENTO 1°, SUBOFICIAL PRINCIPAL, SUBOFICIAL MAYOR, OFICIAL AYUDANTE, OFICIAL INSPECTOR, 
    OFICIAL PRINCIPAL, SUBCOMANDANTE, COMANDANTE, COMANDANTE MAYOR, COMANDANTE GENERAL*/
    private String tipo;  /// Zapador o Voluntario //
    private String sexo;  // Femenino, Masculino o "Otros" //
    private String correo;
    private int idBrigada=9999;
    private String estado;
    private String especialidad;
   

    public Bombero() {
    }

    public Bombero(int dni, String nombreCompleto, String grupoSanguineo, LocalDate fechaNacimiento, long celular, String fijo, String rango, String tipo, String sexo, String correo, String estado, String especialidad) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.grupoSanguineo  = grupoSanguineo;
        this.fechaNacimiento  = fechaNacimiento;
        this.celular  = celular;
        this.fijo  = fijo; 
        this.rango  = rango;
        this.tipo  = tipo;
        this.sexo  = sexo;
        this.correo  = correo;  
        this.estado  = estado;
        this.especialidad  = especialidad;
        


        
    }



    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getIdBombero() {
        return idBombero;
    }

    public Bombero(int idBombero, int dni, String nombreCompleto) {
        this.idBombero = idBombero;
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
    }
    
      public Bombero(int idBombero, String nombreCompleto) {
        this.idBombero = idBombero;
        this.nombreCompleto = nombreCompleto;
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

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
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

    public int getIdBrigada() {
        return idBrigada;
    }

    public void setIdBrigada(int idBrigada) {
        this.idBrigada = idBrigada;
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
