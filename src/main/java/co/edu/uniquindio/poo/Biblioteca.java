package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Biblioteca {
    private String nombre;
    private Collection<Libro> listaLibros;
    private Collection<Prestamo> listaPrestamos;
    private Collection<Bibliotecario> listaEmpleados;
    private Collection<Estudiante> listaClientes;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaClientes = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Collection<Estudiante> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Collection<Estudiante> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    /**
     * Metodo que busca libro dentro de la lista de existente y arroja el libro que
     * se quiere consultar por medio de ISBN
     * 
     * @param isbn
     */
    public void consultarLibro(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                System.out.println(libro);
            }
        }
    }

    /**
     * Metodo de verificacion de existencia de libro libro a partir de la lista
     * 
     * @param libro
     * @return
     */
    public boolean existeLibro(String codigo) {
        boolean banderilla = false;
        for (Libro libro2 : listaLibros) {
            if (libro2.getCodigo().equals(codigo)) {
                banderilla = true;

            }
        }
        return banderilla;
    }

    /**
     * Metodo que agrega libro despues de verificar que no exista en caso de que
     * exista solo se suma el stock nuevo
     * 
     * @param libro
     * @param stock
     */
    public void agregarLibro(Libro libro, int stock) {
        if (!existeLibro(libro.getCodigo())) {
            listaLibros.add(libro);
            libro.setStock(stock);
        } else {
            libro.setStock(libro.getStock() + stock);
        }

    }

    /**
     * Metodo que elimina libro de la lista solo si existe por medio del codigo del
     * libro
     * 
     * @param codigo
     */
    public void eliminarLibro(String codigo) {
        if (existeLibro(codigo) == true) {
            for (Libro libro : listaLibros) {
                if (libro.getCodigo().equals(codigo)) {
                    listaLibros.remove(libro);
                    break;
                }
            }
        }
    }

    public void calcularLibrosPrestamo() {

    }

    public void recibirEntregaPrestamo() {

    }

    public void consultarPrestamo() {

    }

    public void mostrarPrestamosEmpleado() {

    }

    public void mostrarPrestamosEstudiantes() {

    }

    public void mostrarPrestamosEstudiante() {

    }

    public void calcularTotalRecaudo() {

    }

    public void totalPrestamos() {

    }

    public void calcularAntiguedad() {

    }

    public void calcularSalarioEmpleado() {

    }
}
