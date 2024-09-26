package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
/**
 * Clase Estudiante la cual se extiende de persona es un tipo de usuario que contiene la biblioteca
 */
public class Estudiante extends Persona {

    private int idEstudiante;
    private Collection<Prestamo> prestamos;
    /**
     * Metodo constructor de la clase estudiante y inicializacion de listas de la clase
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param idEstudiante
     */
    public Estudiante(String nombre, String cedula, String telefono, String correo, int idEstudiante) {
        super(nombre, cedula, telefono, correo);
        this.idEstudiante = idEstudiante;
        prestamos = new LinkedList<>();

    }
    /**
     * Metodos getters y setter de la clase
     * @return
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "Estudiante [idEstudiante=" + idEstudiante + ", prestamos=" + prestamos + "]";
    }

}
