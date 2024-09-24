package co.edu.uniquindio.poo;
import java.sql.Date;

public class Prestamo {


    private Date fechaEntrega;
    private Date fechaPrestamo;

    public Prestamo(Date fechaEntrega,Date fechaPrestamo){
        this.fechaPrestamo=fechaPrestamo;
        this.fechaEntrega=fechaEntrega;

    }



    public Date getFechaEntrega(){
        return fechaEntrega;
    }

    public Date getFechaPrestamo(){
        return fechaPrestamo;
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



    public void calcularTotal(){

    }

    

}
