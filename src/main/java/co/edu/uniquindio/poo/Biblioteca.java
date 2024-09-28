package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase Biblioteca es el centro de control de todas las actividades de la
 * biblioteca
 */
public class Biblioteca {
    private String nombre;
    private Collection<Libro> listaLibros;
    private Collection<Prestamo> listaPrestamos;
    private Collection<Bibliotecario> listaEmpleados;
    private Collection<Estudiante> listaClientes;
    private double ganancia;
    private int cantidadLibros = listaLibros.size();

    /**
     * Metodo cosntructor de la biblioteca con inicializacion de listas pertinentes
     * 
     * @param nombre
     * @param ganancia
     * @param cantidadLibros
     */
    public Biblioteca(String nombre, double ganancia, int cantidadLibros) {
        this.nombre = nombre;
        this.ganancia = ganancia;
        this.cantidadLibros = cantidadLibros;
        listaLibros = new LinkedList<>();
        listaPrestamos = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
        listaClientes = new LinkedList<>();
    }

    /**
     * Metodos getters y setters de la clase
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
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

    /*
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
     * Metodo de verificacion de existencia de libro a partir de la lista
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
     * Metodo que elimina un libro de la lista solo si existe por medio del codigo
     * del
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

    /**
     * Metodo que verifica si existe bibliotecario con la misma informacion de
     * identificacion personal (id)
     * ya que si existe dicho empleado ya no tiene sentido registrarlo de nuevo
     * 
     * @param cedula
     * @return
     */
    public boolean existeBibliotecario(String cedula) {
        boolean banderilla = false;
        for (Bibliotecario bibliotecario : listaEmpleados) {
            if (bibliotecario.getCedula().equals(cedula)) {
                banderilla = true;
            }
        }

        return banderilla;

    }

    /**
     * Metodo que agregar Bibliotecario a partir de la confirmacion de otro metodo
     * 
     * @param bibliotecario
     */
    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (!existeBibliotecario(bibliotecario.getCedula())) {
            listaEmpleados.add(bibliotecario);

        }
    }

    /**
     * Metodo que elimina bibliotecarios desde la cedula
     * 
     * @param cedula
     */
    public void eliminarBibliotecario(String cedula) {
        for (Bibliotecario bibliotecario : listaEmpleados) {
            if (bibliotecario.getCedula().equals(cedula)) {
                listaEmpleados.remove(bibliotecario);
            }
        }
    }

    /**
     * Metodo que verifica la existencia de un estudiante dentro de la base de datos
     * de la biblioteca
     * 
     * @param cedula
     * @return
     */
    public boolean existeEstudiante(String cedula) {
        boolean banderilla = false;
        for (Estudiante estudiante : listaClientes) {
            if (estudiante.getCedula().equals(cedula)) {
                banderilla = true;
            }
        }

        return banderilla;

    }

    /**
     * Metodo que agrega estudiante despues de una verificacion con otros metodos
     * 
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante) {
        if (!existeEstudiante(estudiante.getCedula())) {
            listaClientes.add(estudiante);

        }
    }

    /**
     * Metodo que elimina estudiante a partir de la cedula
     * 
     * @param cedula
     */
    public void eliminarEstudiante(String cedula) {
        for (Estudiante estudiante : listaClientes) {
            if (estudiante.getCedula().equals(cedula)) {
                listaClientes.remove(estudiante);
            }
        }
    }

    /**
     * Metodo para calcular la cantidad de libros prestados para los estudiantes
     * 
     * @return
     */

    public int calcularLibrosPrestamo() {
        int totalPrestados = 0;
        for (Estudiante estudiante : listaClientes) {
            totalPrestados += estudiante.getListaPrestamos().size();
        }
        return totalPrestados;
    }

    /**
     * Metodo que calcula el total de dinero recaudado por la biblioteca como
     * ganancia
     * 
     * @return
     */

    public double totalDineroRecaudado() {
        double totalRecaudado = 0;
        for (Prestamo prestamo : listaPrestamos) {
            totalRecaudado += prestamo.calculartotal();
        }
        ganancia = totalRecaudado;
        return totalRecaudado;
    }

    /** */
    public void mostrarCantidadPrestamosPorEmpleado() {
        for (Bibliotecario bibliotecario : listaEmpleados) {
            System.out.println("Empleado: " + bibliotecario.getNombre() + ", Cantidad de préstamos: "
                    + bibliotecario.cantidadPrestamosEmpleado());
        }
    }

    /**
     * Metodo para mostrar datos estudiante con mas prestamos
     */

    public void mostrarDatosEstudianteConMasPrestamos() {
        Estudiante estudianteConMasPrestamos = null;
        int maxPrestamos = 0;

        for (Estudiante estudiante : listaClientes) {
            int cantidadPrestamos = estudiante.getListaPrestamos().size();
            if (cantidadPrestamos > maxPrestamos) {
                maxPrestamos = cantidadPrestamos;
                estudianteConMasPrestamos = estudiante;
            }
        }

        if (estudianteConMasPrestamos != null) {
            System.out.println("Estudiante con más préstamos:");
            System.out.println("Nombre: " + estudianteConMasPrestamos.getNombre());
            System.out.println("Cédula: " + estudianteConMasPrestamos.getCedula());
            System.out.println("Cantidad de préstamos: " + maxPrestamos);
        } else {
            System.out.println("No hay estudiantes registrados.");
        }
    }


    /**
     * 
     * Metodo para el calculo de ganancia por empleado
     */
    public void totalDineroRecaudadoPorEmpleado() {
        for (Bibliotecario bibliotecario : listaEmpleados) {
            double totalRecaudado = 0;
            for (Prestamo prestamo : bibliotecario.getPrestamos()) {
                totalRecaudado += prestamo.calculartotal();
            }
            System.out.println("Bibliotecario: " + bibliotecario.getNombre() + ", Total recaudado: " + totalRecaudado);
        }
    }

    /**
     * Metodo que ayuda a consultar un prestamo a partir del codigo del mismo
     * 
     * @param codigo
     */
    public void consultarPrestamo(String codigo) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                System.out.println(prestamo);
            }

        }

    }

    /**
     * Metodo que muestra la lista de Prestamos de un estudiante especifico por el
     * idEstudiante
     * 
     * @param idEstudiante
     */
    public void mostrarPrestamosEstudiante(int idEstudiante) {
        for (Estudiante estudiante : listaClientes) {
            if (estudiante.getIdEstudiante() == idEstudiante) {
                Collection<Prestamo> PrestamoEstudiante = estudiante.getListaPrestamos();
                System.out.println("Los prestamos del estudiante identificado con: " + idEstudiante + " son:"
                        + PrestamoEstudiante);
                break;
            }

        }
    }

    /**
     * Metodo para aumentar un 2% el salario del empleado por cada año que lleve de antiguedad
     * @param bibliotecario
     */
    public void calcularSalarioEmpleado(Bibliotecario bibliotecario) {
        // Obtener la fecha de contrato del bibliotecario
        LocalDate fechaContrato = bibliotecario.getFechaContrato();

        // Calcular la diferencia en años entre la fecha de contrato y la fecha actual porque me dio paja hacerlo en otro metodo
        long diferencia = ChronoUnit.YEARS.between(fechaContrato, LocalDate.now());

        // Obtener el salario actual del bibliotecario
        double salarioActual = bibliotecario.getSalario();

        // Usando el math.pow para que fuera mas practico y compacto se calcula de manera facil el 2% de mas que se debe reflejar en el
        // salario por cada año de antiguedad
        double nuevoSalario = salarioActual * Math.pow(1.02, diferencia);
        bibliotecario.setSalario(nuevoSalario);
    }

    /**
     * Metodo toString de la clase
     */
    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", listaLibros=" + listaLibros + ", listaPrestamos=" + listaPrestamos
                + ", listaEmpleados=" + listaEmpleados + ", listaClientes=" + listaClientes + ", ganancia=" + ganancia
                + ", cantidadLibros=" + cantidadLibros + "]";
    }

}
