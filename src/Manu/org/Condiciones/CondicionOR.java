package Manu.org.Condiciones;

import Manu.org.Pista;

public class CondicionOR extends Condicion{
    private Condicion c1;
    private Condicion c2;

    public CondicionOR(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Pista ee) {
        return c1.cumple(ee) || c2.cumple(ee);
    }
}
