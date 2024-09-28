package co.edu.uniquindio.poo;

/**
 * Clase persona la cual es la base de los tipos de usuario de la biblioteca
 */
public class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private String correo;

    /**
     * Metodo constructor de la clase
     * 
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     */
    public Persona(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * Metodos getters y setters de la clase
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", correo=" + correo
                + "]";
    }

}
