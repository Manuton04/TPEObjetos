package Manu.org.Comparadores;

import Manu.org.Pista;

public class ComparadorCompuesto implements Comparador{
    Comparador c1, c2;

    public int compare(Pista p1, Pista p2) {
        int res = c1.compare(p1, p2);
        if (res == 0) {
            return c2.compare(p1, p2);
        }
        return res;
    }
}
