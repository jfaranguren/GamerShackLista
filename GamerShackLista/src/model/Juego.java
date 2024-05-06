package model;

import java.util.Calendar;

public class Juego extends Producto {

    private Genero genero;

    public Juego(String codigo, String nombre, double precio,Calendar fecha, int cantidadDisponible, Genero genero) {
        super(codigo, nombre, precio,fecha, cantidadDisponible);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Juego [genero=" + genero +
                ", getCodigo()=" + getCodigo() +
                ", getNombre()=" + getNombre() +
                ", getPrecio()=" + getPrecio() +
                ", getCantidadDisponible()=" + getCantidadDisponible() + "]";

    }

    @Override
    public double calcularImpuesto(double valor) {
       
        return valor*RETEFUENTE;

    }

}
