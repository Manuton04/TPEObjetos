package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionNot extends Condicion{
    private Condicion c1;

    public CondicionNot (Condicion c1){
        this.c1 = c1;
    }

    public boolean cumple(Pista ee) {
        return !c1.cumple(ee);
    }
}
