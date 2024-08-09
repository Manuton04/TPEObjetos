package Manu.org.Condiciones;

import Manu.org.Pista;

import java.util.ArrayList;

public class CondicionGenero extends Condicion{
    private String genero;

    public CondicionGenero(String genero){
        this.genero = genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    public boolean cumple(Pista ee){
        ArrayList<String> aux = ee.getGeneros();
        for (String s : aux){
            if (s.toUpperCase().contains(genero.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
