package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {

    
    private double salario;
    private Biblioteca biblioteca;
    private int antiguedadEnAnios;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario,int antiguedadEnAnios) {
        super(nombre, cedula, telefono, correo);
        this.salario=salario;
        this.antiguedadEnAnios=antiguedadEnAnios;

    }


    public double getSalario(){
        return salario;
    }

    public int getAntiguedadEnAnios() {
        return antiguedadEnAnios;
    }


    public void setAntiguedadEnAnios(int antiguedadEnAnios) {
        this.antiguedadEnAnios = antiguedadEnAnios;
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


    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", biblioteca=" + biblioteca + ", antiguedadEnAnios="
                + antiguedadEnAnios + "]";
    }
}
