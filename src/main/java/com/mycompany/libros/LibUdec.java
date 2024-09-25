package com.mycompany.libros;

public class LibUdec extends Libros{

    private String FacultadPublic;

    public LibUdec(String titulo, String autor, double precio, String facultad) {
        super(titulo, autor, precio);
        this.FacultadPublic = facultad;
    }

    public String getFacultadPublic() {
        return FacultadPublic;
    }

    public double calcularDescuento() {
        return precio * 0.25;
    
    }
}