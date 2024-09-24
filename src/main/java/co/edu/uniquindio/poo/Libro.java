package co.edu.uniquindio.poo;

import java.sql.Date;

public class Libro {
    private String titulo;
    private String codigo;
    private String isbn;
    private String autor;
    private String editorial;
    private Date fechaDePublicacion;
    private int stock;

    public Libro(String titulo, String codigo, String isbn, String autor, String editorial, Date fechaDePublicacion,
            int stock) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaDePublicacion = fechaDePublicacion;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", editorial="
                + editorial + ", fechaDePublicacion=" + fechaDePublicacion + ", stock=" + stock + "]";
    }

}
