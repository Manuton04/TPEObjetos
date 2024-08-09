package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionNombre extends Condicion{

    private String nombre;

    public CondicionNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean cumple(Pista ee) {
        return ee.getTitulo().toUpperCase().contains(nombre.toUpperCase());
    }
}
