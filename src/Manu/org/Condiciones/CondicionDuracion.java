package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionDuracion extends Condicion{

    private double duracion;

    public CondicionDuracion(double duracionMinima){
        this.duracion = duracionMinima;
    }

    public void setDuracion(double duracionMinima){
        this.duracion = duracionMinima;
    }

    public double getDuracion(){
        return duracion;
    }

    public boolean cumple(Pista ee){
        return ee.getDuracion() >= duracion;
    }
}
