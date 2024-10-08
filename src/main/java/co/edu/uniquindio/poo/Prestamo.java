package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase prestamo la cual contiene los detalles de los prestamos
 */
public class Prestamo {

    private LocalDate fechaEntrega;
    private LocalDate fechaPrestamo;
    public double costoDia;
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private Collection<DetallePrestamo> detallePrestamo;
    private double total;

    /**
     * Metodo cosntructor de la clase
     * 
     * @param fechaEntrega
     * @param fechaPrestamo
     * @param costoDia
     * @param codigo
     * @param estudiante
     * @param bibliotecario
     */
    public Prestamo(LocalDate fechaEntrega, LocalDate fechaPrestamo, double costoDia, String codigo,
            Estudiante estudiante,
            Bibliotecario bibliotecario) {
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        this.costoDia = costoDia;
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        detallePrestamo = new LinkedList<>();
    }

    /**
     * Metodos getters y setters de la clase
     * 
     * @return
     */
    public double getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(double costoDia) {
        this.costoDia = costoDia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Collection<DetallePrestamo> getDetallePrestamo() {
        return detallePrestamo;
    }

    public void setDetallePrestamo(Collection<DetallePrestamo> detallePrestamo) {
        this.detallePrestamo = detallePrestamo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Metodo que calcula el total de la factura del prestamo
     */
    public double calculartotal() {
        total = 0;
        for (DetallePrestamo detallePrestamo : detallePrestamo) {
            total += detallePrestamo.getSubtotal();
        }
        return total;
    }
    /**
     * Metodo para agregar detalles a cada prestamo como tal
     * @param detalle
     */
    public void agregarDetallesPrestamo(DetallePrestamo detalle) {
        if (detalle.getCantidad() < detalle.getLibro().getStock()) {
            detallePrestamo.add(detalle);
            detalle.ajustesNecesario();
        }

    }

    @Override
    public String toString() {
        return "Prestamo [fechaEntrega=" + fechaEntrega + ", fechaPrestamo=" + fechaPrestamo + ", costoDia=" + costoDia
                + ", codigo=" + codigo + ", estudiante=" + estudiante + ", bibliotecario=" + bibliotecario
                + ", detallePrestamo=" + detallePrestamo + ", total=" + total + "]";
    }

}
