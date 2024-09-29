package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase bibliotecario la se extiende de persona
 */
public class Bibliotecario extends Persona {

    private double salario;
    private Biblioteca biblioteca;
    private Collection<Prestamo> prestamos;
    private LocalDate fechaContrato;

    /**
     * Metodo constructor de la clase bibliotecario
     * 
     * @param nombre
     * @param cedula
     * @param telefono
     * @param correo
     * @param salario
     * @param fechaContrato
     */
    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario,
            LocalDate fechaContrato) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.fechaContrato = fechaContrato;
        prestamos = new LinkedList<>();

    }

    /**
     * Metodos setters y getters de la clase
     * 
     * @return
     */
    public double getSalario() {
        return salario;
    }  
    
    public void setSalarario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(LocalDate fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    /**
     * Metodo para obtener una lista de los prestamos de un empleado
     * 
     * @return
     */
    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Metodo que deja al bibliotecario actulizar la cantidad de un libro a partir
     * de un isbn y el nuevo stock que se quiera poner
     */
    public void actualizarCantidadLibro(String isbn, int stock) {
        for (Libro libro : biblioteca.getListaLibros()) {
            if (libro.getIsbn().equals(isbn)) {
                libro.setStock(stock);
            }
        }

    }

    /**
     * Metodo que atribuye prestamos creados al bibliotecario para llevar registros
     * 
     * @param prestamo
     */
    public void realizarPrestamo(Prestamo prestamo) {
        for (DetallePrestamo detalles : prestamo.getDetallePrestamo()) {
            Estado libroEstado = detalles.getLibro().getEstado();
            if (libroEstado == Estado.DISPONIBLE) {
                prestamos.add(prestamo);
                prestamo.getEstudiante().getListaPrestamos().add(prestamo);
            } else {
                System.out.println("Imposible realizar el prestamo debido a que el estado del libro no lo permite");
            }
        }
    }

    /**
     * Metodo que contea la cantidad de prestamos atribuidos de un empleado
     * 
     * @return
     */
    public int cantidadPrestamosEmpleado() {
        int cantidad = prestamos.size();
        return cantidad;
    }


    /**
     * Metodo toString de la clase
     */
     @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", biblioteca=" + biblioteca + ", prestamos=" + prestamos
                + ", fechaContrato=" + fechaContrato + "]";
    }
}
