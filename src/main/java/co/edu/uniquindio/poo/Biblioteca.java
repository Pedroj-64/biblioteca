package co.edu.uniquindio.poo;
import java.util.*;
import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private Collection<Libro> libros;
    private Collection<Libro> listaLibros;
    private Collection<Prestamo> listaPrestamos;
    private Collection<Bibliotecario> listaEmpleados;


    public Biblioteca(String nombre){
        this.nombre=nombre;
        listaLibros=new LinkedList<>();
        listaPrestamos=new LinkedList<>();
        listaEmpleados=new LinkedList<>();
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

    public Collection<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(Collection<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public Collection<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(Collection<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public Collection<Bibliotecario> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Collection<Bibliotecario> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void agregarLibro(Libro libro){
        if()


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
