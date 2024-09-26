package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
/**
 * Clase bibliotecario la se extiende de persona
 */
public class Bibliotecario extends Persona {

    private double salario;
    private Biblioteca biblioteca;
    private int antiguedadEnAnios;
    private Collection<Prestamo> prestamos;
    /**
     * Metodo constructor de la clase bibliotecario
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param salario
     * @param antiguedadEnAnios
     */
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario,
            int antiguedadEnAnios) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.antiguedadEnAnios = antiguedadEnAnios;
        prestamos = new LinkedList<>();

    }
    /**
     * Metodos setters y getters de la clase
     * @return
     */
    public double getSalario() {
        return salario;
    }

    public int getAntiguedadEnAnios() {
        return antiguedadEnAnios;
    }

    public void setAntiguedadEnAnios(int antiguedadEnAnios) {
        this.antiguedadEnAnios = antiguedadEnAnios;
    }

    public void setSalarario(double salario) {
        this.salario = salario;
    }
    /**
     * Metodo que deja al bibliotecario actulizar la cantidad de un libro a partir de un isbn y el nuevo stock que se quiera poner
     */
    public void actulizarCantidadLibro(String isbn, int stock) {
        for (Libro libro : biblioteca.getListaLibros()) {
            if (libro.getIsbn().equals(isbn)) {
                libro.setStock(stock);
            }
        }

    }
    /**
     * Metodo que atribuye prestamos creados al bibliotecario para llevar registros
     * @param prestamo
     */
    public void realizarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);

    }
    /**
     * Metodo que contea la cantidad de prestamos atribuidos de un empleado 
     * @return
     */
    public int cantidadPrestamosEmpleado(){
        int cantidad=prestamos.size();
        return cantidad;
    }
    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", biblioteca=" + biblioteca + ", antiguedadEnAnios="
                + antiguedadEnAnios + "]";
    }
}
