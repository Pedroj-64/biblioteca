package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {

    
    private double salario;
    private Biblioteca biblioteca;
    private int antiguedadEnAnios;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        super(nombre, cedula, telefono, correo);
        this.salario=salario;

    }


    public double getSalario(){
        return salario;
    }

    public void setSalarario(double salario){
        this.salario=salario;
    }

    public void actulizarCantidadLibro(String isbn,int stock){
        for(Libro libro:biblioteca.getListaLibros()){
            if(libro.getIsbn().equals(isbn)){
                libro.setStock(stock);
            }
        }

    }

    public void realizarPrestamo(){

    }
}
