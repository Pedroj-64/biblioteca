package co.edu.uniquindio.poo;

public class DetallePrestamo  {

    private double subtotal;
    private int cantidad;
    private Estudiante cliente;
    private Bibliotecario asesor;

    public DetallePrestamo(double subtotal,int cantidad,Estudiante cliente, Bibliotecario asesor){
        this.subtotal=subtotal;
        this.cantidad=cantidad;
        this.cliente=cliente;
        this.asesor=asesor;
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
    public Estudiante getCliente(){
        return cliente;
    }
    public Bibliotecario getBibliotecario(){
        return asesor;

    }
    public void setEstudiante(Estudiante cliente){
        this.cliente=cliente;
    }
    public void setBibliotecario(Bibliotecario asesor){
        this.asesor=asesor;
    }
    public void calcularSubtotal(){
        
    }




}
