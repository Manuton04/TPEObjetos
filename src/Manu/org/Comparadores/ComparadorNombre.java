package Manu.org.Comparadores;

import Manu.org.Pista;

public class ComparadorNombre implements Comparador{
    public int compare(Pista p1, Pista p2) {
        return p1.getTitulo().compareTo(p2.getTitulo());
    }
}
