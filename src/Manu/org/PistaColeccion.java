package Manu.org;

import Manu.org.Condiciones.Condicion;

import java.util.ArrayList;

public abstract class PistaColeccion {

    protected String titulo;

    public PistaColeccion(String nombre) {
        this.titulo = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract int getCantidad();

    public abstract int getDuracion();

    public abstract ArrayList<PistaColeccion> buscar(Condicion condicion);

    public abstract void imprimir();

}
