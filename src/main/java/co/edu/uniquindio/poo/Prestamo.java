package co.edu.uniquindio.poo;
import java.sql.Date;

public class Prestamo {

    private double costo;
    private Date fechaEntrega;
    private Date fechaPrestamo;

    public Prestamo(double costo,Date fechaEntrega,Date fechaPrestamo){
        this.costo=costo;
        this.fechaPrestamo=fechaPrestamo;
        this.fechaEntrega=fechaEntrega;

    }

    public double getCosto(){
        return costo;
    }

    public Date getFechaEntrega(){
        return fechaEntrega;
    }

    public Date getFechaPrestamo(){
        return fechaPrestamo;
    }

    public void setCosto(double costo){
        this.costo=costo;
    }

    public void setFechaPrestamo(Date fechaPrestamo){
        this.fechaPrestamo=fechaPrestamo;
    }

    public void setFechaEntrega(Date fechaEntrega){
        this.fechaEntrega=fechaEntrega;
    }

    public void agregarLibro(){

    }

    public void obtenerCantidadLibro(){

    }

    public void eliminarCantidadLibro(){

    }

    public void calcularCostoTotal(){

    }

    public void calcularDiferenciaFecha(){

    }

    

}
