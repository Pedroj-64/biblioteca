package co.edu.uniquindio.poo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingrese el código del libro: ");
            String codigo = scanner.nextLine();

            System.out.print("Ingrese el ISBN del libro: ");
            String isbn = scanner.nextLine();

            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();

            System.out.print("Ingrese la editorial del libro: ");
            String editorial = scanner.nextLine();

            System.out.print("Ingrese la fecha de publicación del libro (YYYY-MM-DD): ");
            String fechaPublicacion = scanner.nextLine();

            System.out.print("Ingrese el stock disponible del libro: ");
            int stock = scanner.nextInt();

            Libro libro = new Libro(titulo, codigo, isbn, autor, editorial, fechaPublicacion, stock);
            libros.add(libro);
            System.out.println("Libro agregado: " + libro);
        }
    }

    public void consultarLibro() {

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
