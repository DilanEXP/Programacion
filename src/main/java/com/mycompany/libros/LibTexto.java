
package com.mycompany.libros;

public class LibTexto extends Libros{
    private final String curso;

    public LibTexto(String titulo, String autor, double precio, String curso){
        super(titulo, autor, precio);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

}
    
    

