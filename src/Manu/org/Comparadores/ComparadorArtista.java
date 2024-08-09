package Manu.org.Comparadores;

import Manu.org.Pista;

public class ComparadorArtista implements Comparador{
    public int compare(Pista p1, Pista p2) {
        return p1.getArtista().compareTo(p2.getArtista());
    }
}
