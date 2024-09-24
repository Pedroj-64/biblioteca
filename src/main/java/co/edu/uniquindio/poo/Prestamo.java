package co.edu.uniquindio.poo;

import java.sql.Date;
import java.util.Collection;
import java.util.LinkedList;

public class Prestamo {

    private Date fechaEntrega;
    private Date fechaPrestamo;
    private double costoDia;
    private String codigo;
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private Collection<DetallePrestamo> detallePrestamos;

    public Prestamo(Date fechaEntrega, Date fechaPrestamo, double costoDia, String codigo, Estudiante estudiante,
            Bibliotecario bibliotecario) {
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        this.costoDia = costoDia;
        this.codigo = codigo;
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        detallePrestamos = new LinkedList<>();
    }

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

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void agregarLibro() {

    }

    public void obtenerCantidadLibro() {

    }

    public void eliminarCantidadLibro() {

    }

    public void calcularTotal() {

    }

}
