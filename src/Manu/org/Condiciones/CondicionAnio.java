package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionAnio extends Condicion{
    private int anio;

    public CondicionAnio(int anioMinimo){
        this.anio = anioMinimo;
    }

    public void setAnio(int anioMinimo){
        this.anio = anioMinimo;
    }

    public int getAnio(){
        return anio;
    }

    public boolean cumple(Pista ee){
        return ee.getAnio() >= anio;
    }
}
