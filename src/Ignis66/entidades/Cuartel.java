
package Ignis66.entidades;

/**
 *
 * @author GRUPO 66 ULP
 */
public class Cuartel {

    public int idCuartel;
    public String nombreCuartel;
    public String direccion;
   public String Ciudad;
    public String Provincia;
    public String telefono;
    public int coordenadaX;
    public int coodenadaY;
    public String correo;
    public String estado;

    public Cuartel() {
    }

    public Cuartel(int idCuartel, String nombreCuartel, String direccion, String Ciudad, String Provincia, String telefono, int coordenadaX, int coodenadaY, String correo, String estado) {
        this.idCuartel = idCuartel;
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.telefono = telefono;
        this.coordenadaX = coordenadaX;
        this.coodenadaY = coodenadaY;
        this.correo = correo;
        this.estado = estado;
    }

    public Cuartel(String nombreCuartel, String direccion, String Ciudad, String Provincia, String telefono, int coordenadaX, int coodenadaY, String correo, String estado) {
        this.nombreCuartel = nombreCuartel;
        this.direccion = direccion;
        this.Ciudad = Ciudad;
        this.Provincia = Provincia;
        this.telefono = telefono;
        this.coordenadaX = coordenadaX;
        this.coodenadaY = coodenadaY;
        this.correo = correo;
        this.estado = estado;
    }

    public int getIdCuartel() {
        return idCuartel;
    }

    public void setIdCuartel(int idCuartel) {
        this.idCuartel = idCuartel;
    }

    public String getNombreCuartel() {
        return nombreCuartel;
    }

    public void setNombreCuartel(String nombreCuartel) {
        this.nombreCuartel = nombreCuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoodenadaY() {
        return coodenadaY;
    }

    public void setCoodenadaY(int coodenadaY) {
        this.coodenadaY = coodenadaY;
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