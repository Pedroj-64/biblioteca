package co.edu.uniquindio.poo;

public class DetallePrestamo {

    private double subtotal;
    private int cantidad;
    private Libro libro;


    public DetallePrestamo(int cantidad, Libro libro) {
        this.libro=libro;
        this.cantidad = cantidad;
        this.subtotal=0;

    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void calcularSubtotal(){



    }



    @Override
    public String toString() {
        return "DetallePrestamo [subtotal=" + subtotal + ", cantidad=" + cantidad + ", libro=" + libro + "]";
    }

}
