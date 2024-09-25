package com.mycompany.libros;

public abstract class Libros {

    protected String titulo;
    protected String autor;
    protected double precio;

    public Libros(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }
    
}
