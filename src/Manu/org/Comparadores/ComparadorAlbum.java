package Manu.org.Comparadores;

import Manu.org.Pista;

public class ComparadorAlbum implements Comparador{
    public int compare(Pista p1, Pista p2) {
        return p1.getAlbum().compareTo(p2.getAlbum());
    }
}
