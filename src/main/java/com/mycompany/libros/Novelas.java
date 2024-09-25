package com.mycompany.libros;

public class Novelas extends Libros{

    private String tipo;

    public Novelas(String tipo, String titulo, String autor, double precio) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

   public Novelas(String Titulo, String Autor, double Precio, String Curso) {
        super(Titulo, Autor, Precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
