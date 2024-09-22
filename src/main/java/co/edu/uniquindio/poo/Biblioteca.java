package co.edu.uniquindio.poo;
import java.util.*;
public class Biblioteca {
    private String nombre;
    private Collection<Libro> libros;

    public Biblioteca(String nombre){
        this.nombre=nombre;
        libros=new LinkedList<>();
    }

    public Collection<Libro> getLibros() {
        return libros;
    }

    public void setLibros(Collection<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void agregarLibro(Libro libro, int stock){
        libros.add(libro);
        libro.setStock(stock);
    }

    public void consultarLibro(String isbn){
        for(Libro libro:libros){
            if(libro.getIsbn().equals(isbn)){
                System.out.println(libro);
            }
        }
    }
    public void calcularLibrosPrestamo(){

    }

    public void recibirEntregaPrestamo(){

    }

    public void consultarPrestamo(){

    }

    public void mostrarPrestamosEmpleado(){

    }

    public void mostrarPrestamosEstudiantes(){

    }

    public void mostrarPrestamosEstudiante(){

    }

    public void calcularTotalRecaudo(){

    }

    public void totalPrestamos(){

    }

    public void calcularAntiguedad(){

    }

    public void calcularSalarioEmpleado(){
        
    }
}
